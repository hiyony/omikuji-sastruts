package org.seasar.sastruts.omikuji.form;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;

@Component(instance=InstanceType.SESSION)
public class OutputForm implements Serializable{
	
	@SuppressWarnings("unused")
	private static final long serialVerisionUID = 1L;
	
	protected static String unsei;
	protected static String negaigoto;
	protected static String akinai;
	protected static String gakumon;
	protected String omikujicode;
	
	public void setUnsei() {
		
	}
	
	public static String getUnsei() {
		return unsei;
	}
	
	public void setUnsei(String unsei) {
		OutputForm.unsei = unsei;
	}
	
	public static String getNegaigoto() {
		return negaigoto;
	}
	
	public void setNegaigoto(String negaigoto) {
		OutputForm.negaigoto = negaigoto;
	}
	
	public static String getAkinai() {
		return akinai;
	}
	
	public void setAkinai(String akinai) {
		OutputForm.akinai = akinai;
	}
	
	public static String getGakumon() {
		return gakumon;
	}
	
	public void setGakumon(String gakumon) {
		OutputForm.gakumon = gakumon;
	}
}
