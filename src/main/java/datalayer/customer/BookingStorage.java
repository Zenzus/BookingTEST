package datalayer.customer;

import dto.Booking;
import dto.Customer;
import dto.CustomerCreation;

import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

public interface BookingStorage {

    public int createBooking(Booking booking)throws SQLException;
    public Collection<Booking> getBookingsForCustomer(int customerId) throws SQLException;
    public Collection<Booking> getBookingsForEmployee(int employeeId)throws SQLException;

}
