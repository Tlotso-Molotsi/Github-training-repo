/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ice2group2;

/**
 *
 * @author emeris
 */
public class Customer {
    private String CustomerID;
    private String firstname;
    private String Surname;
    private int Customerno;
    private CustomerType type;//enum acts as data type

    public Customer() {
    }

    
    public Customer(String CustomerID, String firstname, String Surname, int Customerno, CustomerType type) {
        this.CustomerID = CustomerID;
        this.firstname = firstname;
        this.Surname = Surname;
        this.Customerno = Customerno;
        this.type = type;
    }
//dont need the setters ,only the getters
//    public String getCustomerID() {
//        return CustomerID;
//    }
//
//    public void setCustomerID(String CustomerID) {
//        this.CustomerID = CustomerID;
//    }
//
//    public String getFirstname() {
//        return firstname;
//    }
//
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//
//    public String getSurname() {
//        return Surname;
//    }
//
//    public void setSurname(String Surname) {
//        this.Surname = Surname;
//    }
//
//    public int getCustomerno() {
//        return Customerno;
//    }
//
//    public void setCustomerno(int Customerno) {
//        this.Customerno = Customerno;
//    }
//
//    public CustomerType getType() {
//        return type;
//    }
//
//    public void setType(CustomerType type) {
//        this.type = type;
//    }
//    
    

 // Use only getter(sudy the function and the imporatnce again

    public String getCustomerID() {
        return CustomerID;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return Surname;
    }

    public int getCustomerno() {
        return Customerno;
    }

    public CustomerType getType() {
        return type;
    }
    

    
    
            
            
            
            
            }
