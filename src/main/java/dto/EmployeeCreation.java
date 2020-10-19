package dto;

public class EmployeeCreation {
    public String getEFirstname() {
        return eFirstname;
    }

    public String getELastname() {
        return eLastname;
    }

    public final String eFirstname, eLastname;

    public EmployeeCreation(String eFirstname, String eLastname) {
        this.eFirstname = eFirstname;
        this.eLastname = eLastname;
    }
}
