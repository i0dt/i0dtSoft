package com.qusoft.core.model;

import java.io.Serializable;

public class UtenteProfilo implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String codiceUtente;
	private String codiceProfilo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodiceUtente() {
		return codiceUtente;
	}

	public void setCodiceUtente(String codiceUtente) {
		this.codiceUtente = codiceUtente;
	}

	public String getCodiceProfilo() {
		return codiceProfilo;
	}

	public void setCodiceProfilo(String codiceProfilo) {
		this.codiceProfilo = codiceProfilo;
	}
}
