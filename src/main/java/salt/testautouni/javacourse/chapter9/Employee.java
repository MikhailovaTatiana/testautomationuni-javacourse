package salt.testautouni.javacourse.chapter9;

public class Employee extends Person {
    private String employeeId;
    private String title;

    public Employee() {
        super("Tanya");
        System.out.println("In Employee default constructor");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
