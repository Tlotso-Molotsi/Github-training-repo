/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ice2group2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author emeris
 */
public class ICE2GROUP2 {

    public static void main(String[] args) {

//Declaration
        ArrayList<Customer> myCustomer = new ArrayList<Customer>();

    }

    public static void registerNewCustonmer(ArrayList<Customer> myCustomer) {
        String CustomerID;
        String firstname;
        String Surname;
        int Customerno;
        CustomerType type;
        Scanner input = new Scanner(System.in);

        System.out.println("-------------------Register the new customer----------------------------");
        System.out.println(" Enter Customer's ID:");
        CustomerID = input.nextLine();

        System.out.println(" Enter First Name:");
        firstname = input.nextLine();
        System.out.println(" Enter Surname:");
        Surname = input.nextLine();
        System.out.println(" Enter Customer's Number: ");
        Customerno = Integer.parseInt(input.nextLine());
        System.out.println("Select the Customer Type : ");
        System.out.println("1.Student");
        System.out.println("2.Regular");
        System.out.println("3.Business");

        int choice = Integer.parseInt(input.nextLine());

        if (choice == 1) {
            type = CustomerType.Student;

        } else if (choice == 2) {
            type = CustomerType.Regular;
        } else if (choice == 3) {
            type = CustomerType.Business;
        } else {
            type = CustomerType.Regular;
        }

    }

}
