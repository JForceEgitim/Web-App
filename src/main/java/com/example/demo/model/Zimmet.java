package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Zimmet")
public class Zimmet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

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

	@Column(name = "marka")
	private String marka;

	@Column(name = "serino")
	private String serino;

	@Column(name = "monitor")
	private String monitor;

	@Column(name = "mouse")
	private String mouse;

	@Column(name = "kart")
	private String kart;

	@Column(name = "veris")
	private String veris;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getSerino() {
		return serino;
	}

	public void setSerino(String serino) {
		this.serino = serino;
	}

	public String getMonitor() {
		return monitor;
	}

	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}

	public String getMouse() {
		return mouse;
	}

	public void setMouse(String mouse) {
		this.mouse = mouse;
	}

	public String getKart() {
		return kart;
	}

	public void setKart(String kart) {
		this.kart = kart;
	}

	public String getVeris() {
		return veris;
	}

	public void setVeris(String veris) {
		this.veris = veris;
	}

}
