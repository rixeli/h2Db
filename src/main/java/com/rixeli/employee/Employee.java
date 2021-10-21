package com.rixeli.employee;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    public Integer id;
    public String name;

    public Employee(){}

    public Employee(int id, String name){
        this.id=id;
        this.name=name;
    }

}
