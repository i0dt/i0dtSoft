package com.qusoft.core.service;

import java.util.List;

import com.qusoft.core.model.Utente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("utenteService")
@Transactional
public class UtenteServiceImpl implements UtenteService {
	 @Autowired
	private UtenteService dao;
	
	@Override
	public void saveUtente(Utente utente) {
		dao.saveUtente(utente);
	}

	@Override
	public List<Utente> findAllUtente() {
		return dao.findAllUtente();
	}

	@Override
	public void deleteUtenteByCodice(Utente utente) {
		dao.deleteUtenteByCodice(utente);
	}

	@Override
	public Utente findByCodice(Utente utente) {
		return dao.findByCodice(utente);
	}

	@Override
	public void updateUtente(Utente utente) {
		dao.updateUtente(utente);
	}
}
