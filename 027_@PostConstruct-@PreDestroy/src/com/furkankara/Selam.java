package com.furkankara;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Selam {

	private String mesaj;

	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}
	
	public void goster() {
		System.out.println(getMesaj());
		
	}
	
	
	@PostConstruct
	public void init() {
		System.out.println("Bean baslatiliyor.");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Bean sonlandiriliyor.");
	}
	
	
	
}
