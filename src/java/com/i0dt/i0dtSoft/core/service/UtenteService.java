package com.i0dt.i0dtSoft.core.service;

import java.util.List;

import com.i0dt.i0dtSoft.core.model.Utente;

public interface UtenteService {
	void saveUtente(Utente utente);

	List<Utente> findAllUtente();

	void deleteUtenteByCodice(Utente utente);

	Utente findByCodice(Utente utente);

	void updateUtente(Utente utente);
}