package com.springapp.mvc.repository;

import com.springapp.mvc.domain.Employee;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class EmployeeRepository {

    @Autowired
    private SessionFactory sessionFactory;

    /**
     * Retrieves all persons
     *
     * @return a list of persons
     */
//    public List<Book> listAll(){
//        return this.sessionFactory.getCurrentSession().createQuery("from Book").list();
//    }

    public List<Employee> listAll() {

        // Retrieve session from Hibernate
        Session session = sessionFactory.getCurrentSession();

        // Create a Hibernate query (HQL)
        Query query = session.createQuery("from Employee");

        // Retrieve all
        return  query.list();
    }

    /**
     * Retrieves a single person
     */
    public Employee list( String id ) {
        // Retrieve session from Hibernate
        Session session = sessionFactory.getCurrentSession();

        // Retrieve existing person
        // Create a Hibernate query (HQL)
        Query query = session.createQuery("from Employee");

        return (Employee) query.uniqueResult();
    }

    /**
     * Adds a new person
     */
    public void addEmployee(Employee employee) {

        // Retrieve session from Hibernate
        Session session = sessionFactory.getCurrentSession();

        // Persists to db
        session.save(employee);
    }

    public void removeEmployee(String iD){
        Employee contact = (Employee)this.sessionFactory.getCurrentSession().load(Employee.class, iD);
        if (null!=contact){
            this.sessionFactory.getCurrentSession().delete(contact);
        }
    }

    /**
     * Edits an existing person
     */
    public void editBook(Employee employee) {

        // Retrieve session from Hibernate
        Session session = sessionFactory.getCurrentSession();

        // Retrieve existing person via id
        Employee existingEmployee = (Employee) session.get(Employee.class, employee.getEmployeeID());

        // Assign updated values to this person
        existingEmployee.setEmployeeID(employee.getEmployeeID());
        existingEmployee.setEmployeeName(employee.getEmployeeName());
        existingEmployee.setEmployeeSurname(employee.getEmployeeSurname());
        existingEmployee.setEmployeeFullname(employee.getEmployeeFullname());
        existingEmployee.setEmployeeNationality(employee.getEmployeeNationality());
        existingEmployee.setEmployeeEducation(employee.getEmployeeEducation());

        // Save updates
        session.save(existingEmployee);
    }



}

