package datalayer.customer;

import dto.Booking;
import dto.EmployeeCreation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.List;

public class BookingStorageImpl implements BookingStorage{

    private String connectionString;
    private String username, password;

    public BookingStorageImpl(String conStr, String user, String pass){
        connectionString = conStr;
        username = user;
        password = pass;
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(connectionString, username, password);
    }
    public int createBooking(Booking booking) throws SQLException {
        return  1;

    }
/*
    @Override
    public int createBooking(Booking booking) throws SQLException {
            var sql = "insert into Employees(firstname, lastname) values (?, ?)";
            try (var con = getConnection();
                 var stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                stmt.setString(1, employeeToCreate.getEFirstname());
                stmt.setString(2, employeeToCreate.getELastname());

                stmt.executeUpdate();

                // get the newly created id
                try (var resultSet = stmt.getGeneratedKeys()) {
                    resultSet.next();
                    int newId = resultSet.getInt(1);
                    return newId;
                }
            }
        }
    }*/

    @Override
    public Collection<Booking> getBookingsForCustomer(int customerId) throws SQLException {
        return null;
    }


}
