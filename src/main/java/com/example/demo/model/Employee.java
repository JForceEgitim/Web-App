package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "tckn")
	private String tckn;

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "eposta")
	private String eposta;

	@Column(name = "tel")
	private String tel;

	@Column(name = "dep")
	private String dep;

	@Column(name = "idari")
	private String idari;

	@Column(name = "pozisyon")
	private String pozisyon;

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	@Column(name = "egitim")
	private String egitim;

	@Column(name = "okul")
	private String okul;

	@Column(name = "bolum")
	private String bolum;

	@Column(name = "mezuniyet")
	private String mezuniyet;

	@Column(name = "dogumtarih")
	private String dogumtarih;

	@Column(name = "cinsiyet")
	private String cinsiyet;

	@Column(name = "adres")
	private String adres;

	@Column(name = "giris")
	private String giris;

	@Column(name = "cikis")
	private String cikis;

	@Column(name = "cikistip")
	private String cikistip;

	public String getTckn() {
		return tckn;
	}

	public void setTckn(String tckn) {
		this.tckn = tckn;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getIdari() {
		return idari;
	}

	public void setIdari(String idari) {
		this.idari = idari;
	}

	public String getPozisyon() {
		return pozisyon;
	}

	public void setPozisyon(String pozisyon) {
		this.pozisyon = pozisyon;
	}

	public String getEgitim() {
		return egitim;
	}

	public void setEgitim(String egitim) {
		this.egitim = egitim;
	}

	public String getOkul() {
		return okul;
	}

	public void setOkul(String okul) {
		this.okul = okul;
	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public String getMezuniyet() {
		return mezuniyet;
	}

	public void setMezuniyet(String mezuniyet) {
		this.mezuniyet = mezuniyet;
	}

	public String getDogumtarih() {
		return dogumtarih;
	}

	public void setDogumtarih(String dogumtarih) {
		this.dogumtarih = dogumtarih;
	}

	public String getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getGiris() {
		return giris;
	}

	public void setGiris(String giris) {
		this.giris = giris;
	}

	public String getCikis() {
		return cikis;
	}

	public void setCikis(String cikis) {
		this.cikis = cikis;
	}

	public String getCikistip() {
		return cikistip;
	}

	public void setCikistip(String cikistip) {
		this.cikistip = cikistip;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getEposta() {
		return eposta;
	}

	public void setEposta(String eposta) {
		this.eposta = eposta;
	}

}