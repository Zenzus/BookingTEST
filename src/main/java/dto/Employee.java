package dto;

public class Employee {
    private final int employeeid;
    private final String eFirstname, eLastname;




    public Employee(int employeeid, String eFirstname, String eLastname) {
        this.employeeid = employeeid;
        this.eFirstname = eFirstname;
        this.eLastname = eLastname;
    }

    public int getEmployeeid() {
        return employeeid;
    }
    public String geteFirstname() {
        return eFirstname;
    }

    public String geteLastname() {
        return eLastname;
    }
}
