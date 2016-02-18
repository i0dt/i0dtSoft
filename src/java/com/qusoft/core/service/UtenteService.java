package com.qusoft.core.service;

import java.util.List;

import com.qusoft.core.model.Utente;

public interface UtenteService {
	void saveUtente(Utente utente);
    
    List<Utente> findAllUtente();
     
    void deleteUtenteByCodice(Utente utente);
     
    Utente findByCodice(Utente utente);
     
    void updateUtente(Utente utente);
}