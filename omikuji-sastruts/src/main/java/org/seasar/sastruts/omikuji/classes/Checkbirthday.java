package org.seasar.sastruts.omikuji.classes;

import java.text.SimpleDateFormat;

public class Checkbirthday {
	public static Boolean checkbday(String bday) {
		while(true) {
			SimpleDateFormat datefp;
			
			try {
				datefp = new SimpleDateFormat("yyyyMMdd");
				datefp.setLenient(false);
				datefp.parse(bday);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
	}
}
