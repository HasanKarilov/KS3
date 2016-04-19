package com.springapp.mvc.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name = "employeeId")
    @Size(min = 14, max = 14, message = "номер соцфонда, длинна не менее 14 символов")
    private String employeeID;

    @Column(name = "employeeName")
    @Size(min = 2, message = "обязательное поле")
    private String employeeName;

    @Column(name = "employeeSurname")
    @Size(min = 2, message = "обязательное поле")
    private String employeeSurname;

    @Column(name = "employeeFullname")
    private String employeeFullname;

    @Column(name = "employeeEducation")
    private String employeeEducation;

    @Column(name = "employeeNationality")
    private String employeeNationality;

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeSurname() {
        return employeeSurname;
    }

    public void setEmployeeSurname(String employeeSurname) {
        this.employeeSurname = employeeSurname;
    }

    public String getEmployeeFullname() {
        return employeeFullname;
    }

    public void setEmployeeFullname(String employeeFullname) {
        this.employeeFullname = employeeFullname;
    }

    public String getEmployeeEducation() {
        return employeeEducation;
    }

    public void setEmployeeEducation(String employeeEducation) {
        this.employeeEducation = employeeEducation;
    }

    public String getEmployeeNationality() {
        return employeeNationality;
    }

    public void setEmployeeNationality(String employeeNationality) {
        this.employeeNationality = employeeNationality;
    }
}