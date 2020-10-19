package servicelayer.customer;

import dto.Booking;

import java.util.Collection;
import java.util.Date;

public class BookingServiceImpl implements BookingService{

    @Override
    public int createBooking(int customerId, int employeeId, Date date, double start, double end) throws CustomerServiceException {
        return 0;
    }

    @Override
    public Collection<Booking> getBookingsForCustomer(int customerId) throws CustomerServiceException {
        return null;
    }

    @Override
    public Collection<Booking> getBookingsForEmployee(int employeeId) throws CustomerServiceException {
        return null;
    }
}
