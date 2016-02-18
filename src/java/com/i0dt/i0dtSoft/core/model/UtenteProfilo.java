package com.i0dt.i0dtSoft.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UTENTE_PROFILO")
public class UtenteProfilo{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_P")
	private int id;
	
	@Column(name = "CODICE_UTENTE", nullable = false)
	private String codiceUtente;
	
	@Column(name = "CODICE_PROFILO", nullable = false)
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
