package com.i0dt.i0dtSoft.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PROFILO")
public class Profilo {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_P")
	private int id;
	
	@Id
	@Column(name = "CODICE", unique = true, nullable = true)
	private String codice;
	
	@Column(name = "DESC", nullable = true)
	private String descrizione;
	
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
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
}
