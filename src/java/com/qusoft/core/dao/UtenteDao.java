package com.qusoft.core.dao;
import java.util.List;

import com.qusoft.core.model.Utente;

public interface UtenteDao {
    void saveUtente(Utente utente);
     
    List<Utente> findAllUtente();
     
    void deleteUtenteByCodice(Utente utente);
     
    Utente findByCodice(Utente utente);
     
    void updateUtente(Utente utente);
}