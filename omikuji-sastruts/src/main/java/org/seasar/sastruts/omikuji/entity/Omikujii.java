package org.seasar.sastruts.omikuji.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;



@Entity
public class Omikujii implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(length = 20)
	public String omikujicode;
	
	@Column(length = 20)
	public String unseicode;
	
	@Column(length = 20)
	public String negaigoto;
	
	@Column(length = 20)
	public String akinai;
	
	@Column(length = 20)
	public String gakumon;
	
	@Column(length = 20)
	public String renewalwriter;
	
	@Column(length = 20)
	public String renewaldate;
	
	@Column(length = 20)
	public String unseiwriter;
	
	@Column(length = 20)
	public String unseiwritedate;
	
}