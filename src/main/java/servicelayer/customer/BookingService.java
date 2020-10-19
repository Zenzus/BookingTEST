package servicelayer.customer;

import dto.Booking;
import dto.Customer;
import dto.Employee;
import dto.EmployeeCreation;
import dto.CustomerCreation;

import java.util.Collection;
import java.util.Date;


public interface BookingService {

     int createBooking(int customerId, int employeeId, String date, String start, String end) throws CustomerServiceException;
     Collection<Booking> getBookingsForCustomer(int customerId)throws CustomerServiceException;
     Collection<Booking> getBookingsForEmployee(int employeeId)throws CustomerServiceException;
}
