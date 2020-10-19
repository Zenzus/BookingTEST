package dto;

import java.util.Date;

public class Booking {
    private final int id;
    private final Date date;
    private final double start;
    private final double end;
    private final int customerId, employeeId;



    public Booking(int id, Date date, double start, double end, int customerId, int employeeId) {
        this.id = id;
        this.date = date;
        this.start = start;
        this.end = end;
        this.customerId = customerId;
        this.employeeId = employeeId;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public double getStart() {
        return start;
    }

    public double getEnd() {
        return end;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}

