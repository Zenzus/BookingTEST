package datalayer.customer;

import dto.Booking;
import dto.BookingCreation;
import dto.Customer;
import dto.EmployeeCreation;

import java.sql.*;
import java.util.ArrayList;
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


    public int createBooking(BookingCreation bookingToCreate) throws SQLException {
            var sql = "insert into Bookings(customerId,employeeId,date,start,end) values (?,?,?,?,?)";
            try (var con = getConnection();
                 var stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                stmt.setInt(1, bookingToCreate.getCustomerId());
                stmt.setInt(2, bookingToCreate.getEmployeeId());
                stmt.setString(3, bookingToCreate.getDate());
                stmt.setString(4, bookingToCreate.getStart());
                stmt.setString(5, bookingToCreate.getEnd());

                stmt.executeUpdate();

                // get the newly created id
                try (var resultSet = stmt.getGeneratedKeys()) {
                    resultSet.next();
                    int newId = resultSet.getInt(1);
                    return newId;
                }
            }
        }


    @Override
    public Collection<Booking> getBookingsForCustomer(int customerId) throws SQLException {
        var sql = "select ID, customerId, employeeId,date,start,end from Bookings where customerId= ?";
        try (var con = getConnection();
             var stmt = con.prepareStatement(sql)){
            stmt.setInt(1, customerId);
            var results = new ArrayList<Booking>();


            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {

                int id = resultSet.getInt("ID");
                int employeeId = resultSet.getInt("employeeId");
                String date = resultSet.getString("date");
                String start = resultSet.getString("start");
                String end = resultSet.getString("end");

                Booking c = new Booking(id, customerId, employeeId, date, start, end);
                results.add(c);
            }

            return results;
        }

    }
}
