package com.example.hibernate.model.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.example.hibernate.model.Ciclo;

public class CicloDAOHibernateImpl implements ICicloDAO {

    private final SessionFactory sessionFactory;

    public CicloDAOHibernateImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

  

    @Override
    public List<Ciclo> findAll() {
        try (Session session = sessionFactory.openSession()) {
            Query<Ciclo> query = session.createQuery("from Cicloformativo", Ciclo.class);
            return query.list();
        }
    }

    

}
