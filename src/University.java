public class University {
    private Professor[] professors;
    private Student[] students;
    private Course[] courses;
    private int professorCount;
    private int studentCount;
    private int courseCount;
    private double totalFeesCollected;
    private double totalSalariesPaid;
    public University() {
        professors = new Professor[10];
        students = new Student[100];
        courses = new Course[10];
        professorCount=0;
        studentCount=0;
        courseCount=0;
        totalFeesCollected = 0;
        totalSalariesPaid = 0;
    }
    public void addProfessor(Professor professor) {
        if (professorCount<professors.length) {
            professors[professorCount++] = professor;
        }

    }
    public void addStudent(Student student) {
        if (studentCount<students.length) {
            students[studentCount++] = student;
        }

    }
    public void addCourse(Course course) {
        if (courseCount<courses.length) {
            courses[courseCount++] = course;
}
    }

    public Professor[] getProfessors() {
        return professors;
    }

    public Student[] getStudents() {
        return students;
    }

    public Course[] getCourses() {
        return courses;
    }
    public double getTotalFeesCollected() {
        return totalFeesCollected;
    }
    public double getTotalSalariesPaid() {
        return totalSalariesPaid;
    }
    public void collectFees(double amount){
        totalFeesCollected+=amount;

    }
    public void paySalary(Professor professor) {
        totalSalariesPaid+=professor.getSalary();
        professor.receiveSalary();
    }





}
