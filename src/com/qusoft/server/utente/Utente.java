package com.qusoft.server.utente;

import java.io.Serializable;

public class Utente implements Serializable {

	private final long id;
	private final String content;

	public Utente(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}