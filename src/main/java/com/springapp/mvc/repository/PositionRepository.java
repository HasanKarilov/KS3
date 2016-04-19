package com.springapp.mvc.repository;

import com.springapp.mvc.domain.Positions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * Created by hanaria on 4/17/16.
 */

@Repository
@Transactional
public class PositionRepository {
    @Autowired
    private SessionFactory sessionFactory;

    /**
     * Retrieves all persons
     *
     * @return a list of positions
     */

    public List<Positions> listPosition() {

        // Retrieve session from Hibernate
        Session session = sessionFactory.getCurrentSession();

        // Create a Hibernate query (HQL)
        Query query = session.createQuery("from Positions");

        // Retrieve all
        return  query.list();
    }



    /**
     * Adds a new person
     * @param position
     */
    public void addPosition(Positions position) {

        // Retrieve session from Hibernate
        Session session = sessionFactory.getCurrentSession();

        // Persists to db
        session.save(position);
    }

    public void removePosition(String iD){
        Positions contact = (Positions)this.sessionFactory.getCurrentSession().load(Positions.class, iD);
        if (null!=contact){
            this.sessionFactory.getCurrentSession().delete(contact);
        }
    }


}
