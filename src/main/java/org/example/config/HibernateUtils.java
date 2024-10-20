package org.example.config;


import org.hibernate.SessionFactory;
import org.hibernate.boot.model.naming.CamelCaseToUnderscoresNamingStrategy;
import org.hibernate.cfg.Configuration;

import java.util.Objects;

public class HibernateUtils {
    private SessionFactory sessionFactory;


    public SessionFactory getSessionFactory() {
        if (Objects.isNull(sessionFactory)) {

            Configuration configuration = new Configuration();
            configuration.setPhysicalNamingStrategy(new CamelCaseToUnderscoresNamingStrategy());
            sessionFactory = configuration.buildSessionFactory();
        }
        return sessionFactory;
    }
}

