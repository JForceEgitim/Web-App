package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Izin")
public class Izin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "tckn")
	private String tckn;

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "age")
	private String age;
	
	@Column(name = "pozizyon")
	private String pozisyon;
	
	@Column(name = "izinTuru")
	private String izinTuru;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTckn() {
		return tckn;
	}

	public void setTckn(String tckn) {
		this.tckn = tckn;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPozisyon() {
		return pozisyon;
	}

	public void setPozisyon(String pozisyon) {
		this.pozisyon = pozisyon;
	}

	public String getIzinTuru() {
		return izinTuru;
	}

	public void setIzinTuru(String izinTuru) {
		this.izinTuru = izinTuru;
	}

	public String getIzinSebebi() {
		return izinSebebi;
	}

	public void setIzinSebebi(String izinSebebi) {
		this.izinSebebi = izinSebebi;
	}

	public String getIzinBitis() {
		return izinBitis;
	}

	public void setIzinBitis(String izinBitis) {
		this.izinBitis = izinBitis;
	}

	public String getIzinBaslangic() {
		return izinBaslangic;
	}

	public void setIzinBaslangic(String izinBaslangic) {
		this.izinBaslangic = izinBaslangic;
	}

	@Column(name = "izinSebebi")
	private String izinSebebi;
	
	@Column(name = "izinBitis")
	private String izinBitis;
	
	@Column(name = "izinBaslangic")
	private String izinBaslangic;
	
}