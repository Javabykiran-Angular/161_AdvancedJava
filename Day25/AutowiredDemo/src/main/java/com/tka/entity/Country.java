package com.tka.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Country {
	
	int cid;
	String cname;
	
	public Country() {
		
	}
	
	@Autowired
	public Country(@Value("8") int cid, @Value("US") String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	
	
	public void setCname(@Value("India") String cname) {
		this.cname = cname;
	}
	
//	@Autowired
//	public void setCname(@Value("India") String cname) {
//		this.cname = cname;
//	}
	@Override
	public String toString() {
		return "Country [cid=" + cid + ", cname=" + cname + "]";
	}
	
	

}
