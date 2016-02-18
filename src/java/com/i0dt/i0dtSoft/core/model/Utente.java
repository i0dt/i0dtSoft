package com.i0dt.i0dtSoft.core.model;

import java.io.Serializable;

public class Utente implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String codice;
	private String password;
	private String nome;
	private String cognome;

	public Utente() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
}
