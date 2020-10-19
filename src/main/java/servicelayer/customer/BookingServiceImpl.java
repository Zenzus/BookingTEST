package servicelayer.customer;

import datalayer.customer.BookingStorage;
import datalayer.customer.CustomerStorage;
import dto.Booking;
import dto.CustomerCreation;

import java.sql.SQLException;
import java.util.Collection;


public class BookingServiceImpl implements BookingService{
    private BookingStorage bookingStorage;

    public BookingServiceImpl(BookingStorage bookingStorage) {
        this.bookingStorage = bookingStorage;
    }


    public int createBooking(int customerId, int employeeId, String date, String start, String end) throws CustomerServiceException {
        return 1;
    }
    /*
    @Override
    public int createBooking(int customerId, int employeeId, String date, String start, String end) throws CustomerServiceException {
      try {
            return createBooking(customerId,employeeId,date,start,end);
        } catch (SQLException throwables) {
            throw new CustomerServiceException(throwables.getMessage());
        }
    }*/

    @Override
    public Collection<Booking> getBookingsForCustomer(int customerId) throws CustomerServiceException {
        return null;
    }

    @Override
    public Collection<Booking> getBookingsForEmployee(int employeeId) throws CustomerServiceException {
        return null;
    }
}
