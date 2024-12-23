public class Student {
    private int id;
    private String name;
    private int grade;
    private double feesPaid;
    private double feesTotal;

    public Student(int id, String name, int grade, double feesTotal) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid =0;
        this.feesTotal =feesTotal;
    }
    public void enrollInCourse(Course course) {

    }
    public void payFees(double amount){
        feesPaid += amount;
    }
    public double getRemainingFees(){
        return feesTotal-feesPaid;
    }
    public String getDetails() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", remainingFees=" + getRemainingFees() +
                '}';
    }
}
