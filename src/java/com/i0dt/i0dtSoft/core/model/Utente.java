package com.i0dt.i0dtSoft.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UTENTE")
public class Utente {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_P")
	private int id;

	@Id
	@Column(name = "CODICE", unique = true, nullable = false)
	private String codice;
	
	@Column(name = "PASS", nullable = false)
	private String password;
	
	@Column(name = "NOME", nullable = true)
	private String nome;
	
	@Column(name = "COGNOME", nullable = true)
	private String cognome;

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
	
	@Override
	public String toString(){
		final StringBuilder sb=new StringBuilder();
		sb.append("[" +this.getClass().getCanonicalName());
		sb.append("nome:"+nome);
		sb.append("]");
		return sb.toString();
	}
}
