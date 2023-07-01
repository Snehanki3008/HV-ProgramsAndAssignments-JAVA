public class Employee {
    private int employeeId;
    private String name;
    private String position;

    public Employee(int employeeId, String name, String position) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Snehanki", "Manager");
        Employee employee2 = new Employee(2, "Seema", "Developer");

        System.out.println(employee1.getEmployeeId()); 
        System.out.println(employee1.getName()); 
        System.out.println(employee1.getPosition()); 

        System.out.println(employee2.getEmployeeId()); 
        System.out.println(employee2.getName()); 
        System.out.println(employee2.getPosition()); 
    }
}
