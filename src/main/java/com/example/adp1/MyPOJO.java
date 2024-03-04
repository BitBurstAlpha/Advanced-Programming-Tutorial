package com.example.adp1;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class MyPOJO {
    private String firstName;
    private String lastName;
    @Id
    @GeneratedValue
    private long idNumber;

    public MyPOJO() {}
    public MyPOJO(final String firstName,
                  final String lastName,
                  final long idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public long getIdNumber() {
        return this.idNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }
}
