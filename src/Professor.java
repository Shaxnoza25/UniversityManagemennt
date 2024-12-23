public class Professor {
    private int id;
    private String name;
    private String department;
    private double salary;
    private double salaryEarned;

    public Professor(int id, String name, String department,double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void receiveSalary(){

        salaryEarned+=salary;}

    public String getDetails() {
        return "Professor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salaryEarned=" + salaryEarned +
                '}';
    }
}
