package com.qusoft.core.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.qusoft.core.model.Utente;

@Repository("utenteDao")
public class UtenteDaoImpl extends AbstractDao implements UtenteDao{
	@Override
    public void saveUtente(Utente utente) {
        persist(utente);
    }
 
    @Override
    public List<Utente> findAllUtente() {
        Criteria criteria = getSession().createCriteria(Utente.class);
        return (List<Utente>) criteria.list();
    }
 
    @Override
    public void updateUtente(Utente utente){
        getSession().update(utente);
    }

	@Override
	public void deleteUtenteByCodice(Utente utente) {
		//Query query = getSession().createSQLQuery("delete from Employee where ssn = :ssn");
        //query.setString("ssn", ssn);
        //query.executeUpdate();
	}

	@Override
	public Utente findByCodice(Utente utente) {
		Criteria criteria = getSession().createCriteria(Utente.class);
        criteria.add(Restrictions.eq("codice",utente.getCodice()));
        return (Utente) criteria.uniqueResult();
	}
     
}