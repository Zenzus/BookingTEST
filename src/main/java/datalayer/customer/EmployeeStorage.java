package datalayer.customer;

import dto.Customer;
import dto.CustomerCreation;
import dto.Employee;
import dto.EmployeeCreation;

import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

public interface EmployeeStorage {
    public Collection<Employee> getEmployeeWithId(int employeeId) throws SQLException;
    public int  createEmployee(EmployeeCreation employeeCreation) throws SQLException;
}
