package main;

import com.github.javafaker.Faker;
import datalayer.customer.CustomerStorage;
import datalayer.customer.EmployeeStorageImpl;
import dto.Customer;
import datalayer.customer.CustomerStorageImpl;
import dto.CustomerCreation;
import dto.EmployeeCreation;

import java.sql.SQLException;

public class Main {

    private static final String conStr = "jdbc:mysql://localhost:3307/booking";
    private static final String user = "root";
    private static final String pass = "testuser123";

    public static void main(String[] args) throws SQLException {
        CustomerStorageImpl storage = new CustomerStorageImpl(conStr, user, pass);
        EmployeeStorageImpl eStorage = new EmployeeStorageImpl(conStr,user,pass);

        /* Makes 100 customers
        Faker faker = new Faker();
        for (int i = 0; i < 100; i++) {
            CustomerCreation c = new CustomerCreation(faker.name().firstName(), faker.name().lastName());
            storage.createCustomer(c);
        }
        makes 100 employees
        Faker faker = new Faker();
        for (int i = 0; i < 100; i++) {
            EmployeeCreation c = new EmployeeCreation(faker.name().firstName(), faker.name().lastName());
            eStorage.createEmployee(c);
        }
        */

        System.out.println("Got customers: ");

        for(Customer c : storage.getCustomers()) {
            System.out.println(toString(c));
        }
        System.out.println("The end.");
    }




    public static String toString(Customer c) {
        return "{" + c.getId() + ", " + c.getFirstname() + ", " + c.getLastname() + "}";
    }


}
