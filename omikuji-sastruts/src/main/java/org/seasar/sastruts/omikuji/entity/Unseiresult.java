package org.seasar.sastruts.omikuji.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;



@Entity
public class Unseiresult implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(length = 20)
	public String uranaidate;
	
	@Column(length = 20)
	public String birthday;
	
	@Column(length = 20)
	public String omikujicode;
	
	@Column(length = 20)
	public String renewalwriter;
	
	@Column(length = 20)
	public String renewaldate;
	
	@Column(length = 20)
	public String unseiwriter;
	
	@Column(length = 20)
	public String unseiwritedate;

}