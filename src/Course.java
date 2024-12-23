public class Course {
    private int id;
    private String name;
    private int credits;
    private Professor assignedProfessor;

    public Course(int id, String name, int credits) {
        this.id = id;
        this.name = name;
        this.credits = credits;

    }
    public void assignProfessor(Professor professor) {
        this.assignedProfessor =professor;
    }
    public String getCourseDetails() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", credits=" + credits +
                ", assignedProfessor = " + (assignedProfessor!=null?assignedProfessor.getName():"None") +
                '}';
    }
}
