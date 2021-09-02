package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;
import java.util.UUID;

@Component
public class User {


    private UUID id=UUID.randomUUID();

    /**
     * reading values/streams or constants from application.properties
     * All is done using the @Value("${}") //Annotation
     */
    @Value( "${names}" )
    private List <String> names;

    /**
     * *
     * Field Injections
     * *
     */

    @Autowired
    private Address address;
    @Autowired
    private Salary salary;


//    Dependency injection via setters/mutators
//    @Autowired
//    public void setId( UUID id ) {
//        this.id = UUID.randomUUID();
//    }
//    @Autowired
//    public void setName( String name ) {
//        this.name = "name";
//    }

//    Dependency injection of objects through constructors
//    public User( Address address, Salary salary) {
//        this.id = UUID.randomUUID();
//        this.name = "Elijah";
//        this.address = address;
//        this.salary = salary;
//    }

//    public UUID getId() {
//        return id=UUID.randomUUID();
//    }
//
//    public String getName() {
//
//        return name=this.getClass().getName();
//    }
//
//    public Address getAddress() {
//        return address;
//    }
//
//    public Salary getSalary() {
//        return salary;
//    }

//
//    0800668539
//    credit no 138022


    public void printDetails(){

        System.out.println("\nID:"+id
                +"\nUserName:"+names.get((new Random().nextInt( names.size()-1 )+1) )
                +"\nAddress :\n\t\t:"+address.getHouseNo()
                +"\n\t\t:" +address.getStreet()
                +"\nSalary\t:\n\t\t:"+this.salary.getAmount());

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + names.get( 0 ) + '\'' +
                ", address=" + address.toString() +
                ", salary=" + salary.getAmount() +
                '}';
    }
}

