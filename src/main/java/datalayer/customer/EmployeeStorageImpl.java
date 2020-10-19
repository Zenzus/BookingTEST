package datalayer.customer;

import dto.Employee;
import dto.EmployeeCreation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

public class EmployeeStorageImpl implements EmployeeStorage {
    private String connectionString;
    private String username, password;

    public EmployeeStorageImpl(String conStr, String user, String pass) {
        connectionString = conStr;
        username = user;
        password = pass;
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(connectionString, username, password);
    }

    @Override
    public Collection<Employee> getEmployeeWithId(int employeeId) throws SQLException {
        return null;
    }



    public int createEmployee(EmployeeCreation employeeToCreate) throws SQLException {
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
}

