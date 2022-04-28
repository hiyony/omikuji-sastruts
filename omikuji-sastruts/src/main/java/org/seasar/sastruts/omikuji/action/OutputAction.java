package org.seasar.sastruts.omikuji.action;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.seasar.sastruts.omikuji.classes.Cyuukichi;
import org.seasar.sastruts.omikuji.classes.DBUtil;
import org.seasar.sastruts.omikuji.classes.Daikichi;
import org.seasar.sastruts.omikuji.classes.Kichi;
import org.seasar.sastruts.omikuji.classes.Kyou;
import org.seasar.sastruts.omikuji.classes.Sueyosi;
import org.seasar.sastruts.omikuji.classes.Syoukichi;
import org.seasar.sastruts.omikuji.classes.Unsei;
import org.seasar.sastruts.omikuji.form.OutputForm;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Required;

public class OutputAction {
	
	@Required
	@ActionForm
	protected OutputForm outputform;
	
	@Resource
	protected HttpServletRequest request;
	
	@Resource
	protected HttpSession session = request.getSession();
	
	@Resource
	private static final String path = "/omikuji-sastruts/csvomkj.csv";
	
	@Execute(validator = false)
	public String output() throws ServletException, IOException, ParseException{
		
		String birthday = (String) session.getAttribute("birthday");
		
		DateFormat df = new SimpleDateFormat("yyyyMMdd");
		Calendar today = Calendar.getInstance();
		String todayString = df.format(today);
		
		Connection conn;
		BufferedReader br = null;
		
		try {
			
			conn = DBUtil.getConnection();
			
			String fortunemaster_selectsql = "SELECT unseicode, unseiname FROM public.fortunemaster";
            PreparedStatement pstmt1 = conn.prepareStatement(fortunemaster_selectsql);
            ResultSet rs1 = pstmt1.executeQuery();
            
            Map<String, String> unseiMap = new HashMap<>();
            while (rs1.next()) {
                unseiMap.put(rs1.getString("unseiname"), rs1.getString("unseicode"));
            }
            if (unseiMap.isEmpty()){
                String line;
                br = new BufferedReader(new FileReader(path));

                br.readLine();

                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");

                    if (!unseiMap.keySet().contains(values[1])) {
                        unseiMap.put(values[1], values[0]);
                    }
                }

                String fortunemaster_sql = "INSERT INTO public.fortunemaster(unseiname, unseicode, renewalwriter, renewaldate, "
                        + "unseiwriter, unseiwritedate)"
                        + "VALUES(?, ?, ?, ?, ?, ?)";
                for (Map.Entry<String, String> entry : unseiMap.entrySet()) {
                    PreparedStatement pstmt2 = conn.prepareStatement(fortunemaster_sql);
                    pstmt2.setString(1, entry.getKey());
                    pstmt2.setString(2, entry.getValue());
                    pstmt2.setString(3, "ヒヨ");
                    pstmt2.setString(4, todayString);
                    pstmt2.setString(5, "ヒヨ");
                    pstmt2.setString(6, todayString);
                    pstmt2.executeUpdate();
                }
            }
            
            String count_sql = "SELECT COUNT(*) AS CNT FROM public.omikujii";
            PreparedStatement pstmt3 = conn.prepareStatement(count_sql);
            ResultSet rs3 = pstmt3.executeQuery();
            rs3.next();
            int cnt = rs3.getInt("CNT");
            if (cnt == 0 ) {
                String line;
                
                br = new BufferedReader(new FileReader(path));
                br.readLine();

                String omikuji_sql = "INSERT INTO public.omikujii(omikujicode, unseicode, negaigoto, akinai, gakumon, " +
                        "renewalwriter, renewaldate, unseiwriter, unseiwritedate) " +
                        "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";

                while ((line = br.readLine()) != null) {
                    PreparedStatement pstmt4 = conn.prepareStatement(omikuji_sql);
                    
                    pstmt4.setString(1, Integer.toString(cnt + 1));
                    String[] values = line.split(",");
                    pstmt4.setString(2, unseiMap.get(values[1]));
                    pstmt4.setString(3, values[2]);
                    pstmt4.setString(4, values[3]);
                    pstmt4.setString(5, values[4]);
                    pstmt4.setString(6, "ヒヨ");
                    pstmt4.setString(7, todayString);
                    pstmt4.setString(8, "ヒヨ");
                    pstmt4.setString(9, todayString);
                    cnt++;

                    pstmt4.executeUpdate();
                }
            }
            
            String compare_sql = "SELECT omikujicode, uranaidate, birthday " +
                    "FROM public.unseiresult " +
                    "WHERE uranaidate = ? AND birthday = ?";
            PreparedStatement pstmt5 = conn.prepareStatement(compare_sql);
            pstmt5.setString(1, todayString); //uranaidate = ?
            pstmt5.setString(2, birthday); //birthday = ?
            ResultSet rs5 = pstmt5.executeQuery();

            String omikujiID = "";
            if (rs5.next()) {
                omikujiID = rs5.getString("omikujicode");
            }
            
            if(omikujiID.isEmpty()){
                int rannum = new Random().nextInt(cnt) + 1; //アドバイスのこと
                omikujiID = String.valueOf(rannum);
            }
            
            String result_sql  = "SELECT f.unseiname as unseiname, " +
                    "o.negaigoto as negaigoto, " +
                    "o.akinai as akinai, " +
                    "o.gakumon as gakumon " +
                    "FROM public.omikujii o " +
                    "JOIN public.fortunemaster f " +
                    "ON f.unseicode = o.unseicode " +
                    "WHERE o.omikujicode = ?";
            PreparedStatement pstmt6 = conn.prepareStatement(result_sql);
            pstmt6.setString(1, omikujiID); //o.omikujicode = ?
            ResultSet rs6 = pstmt6.executeQuery();

            Unsei unsei = null;
            while(rs6.next()) {
                unsei = selectUnsei(rs6.getString("unseiname"));
                unsei.setOmikujicode(omikujiID);
                unsei.setUnsei();
                unsei.setNegaigoto(rs6.getString("negaigoto"));
                unsei.setAkinai(rs6.getString("akinai"));
                unsei.setGakumon(rs6.getString("gakumon"));

                String insertresult_sql = "INSERT INTO public.unseiresult(uranaidate, birthday, omikujicode, renewalwriter, " +
                        "renewaldate, unseiwriter, unseiwritedate) " +
                        "VALUES(?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pstmt7 = conn.prepareStatement(insertresult_sql);

                pstmt7.setString(1, todayString);
                pstmt7.setString(2, birthday);
                pstmt7.setString(3, omikujiID);
                pstmt7.setString(4, "ヒヨ");
                pstmt7.setString(5, todayString);
                pstmt7.setString(6, "ヒヨ");
                pstmt7.setString(7, todayString);

                pstmt7.executeUpdate();

            }
            
            outputform.setUnsei(unsei.getUnsei());
            outputform.setNegaigoto(unsei.getNegaigoto());
            outputform.setAkinai(unsei.getAkinai());
            outputform.setGakumon(unsei.getGakumon());
            
            
		} catch (SQLException e){
            e.printStackTrace();
        } finally {
            //해제 解除
            if(br!=null) {
                br.close();
            }
        }
		
		return "output.jsp";
		
	}

    public static Unsei selectUnsei(String unseistr) {
        Unsei fortune = null;

        switch (unseistr) {
            case "大吉":
                fortune = new Daikichi();
                break;
            case "中吉":
                fortune = new Cyuukichi();
                break;
            case "小吉":
                fortune = new Syoukichi();
                break;
            case "吉":
                fortune = new Kichi();
                break;
            case "末吉":
                fortune = new Sueyosi();
                break;
            case "凶":
                fortune = new Kyou();
                break;
            default:
                break;
        }
        return fortune;
    }
}

	
	

