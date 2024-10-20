package org.example.daos;

import org.hibernate.SessionFactory;

public class RequestDao {
    private SessionFactory sessionFactory ;
    public RequestDao(SessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}
