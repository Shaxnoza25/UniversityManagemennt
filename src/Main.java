public class Main {
    public static void main(String[] args) {
        // Create the university object
        University university = new University();

        // Create professors
        Professor professor1 = new Professor(1, "Dr. Smith", "Computer Science", 5000);
        Professor professor2 = new Professor(2, "Dr. Johnson", "Mathematics", 4500);

        // Create students
        Student student1 = new Student(1, "Alice", 1, 10000);
        Student student2 = new Student(2, "Bob", 2, 12000);

        // Create courses
        Course course1 = new Course(1, "Data Structures", 4);
        Course course2 = new Course(2, "Calculus", 3);

        // Add professors, students, and courses to the university
        university.addProfessor(professor1);
        university.addProfessor(professor2);
        university.addStudent(student1);
        university.addStudent(student2);
        university.addCourse(course1);
        university.addCourse(course2);

        // Assign professors to courses
        course1.assignProfessor(professor1);
        course2.assignProfessor(professor2);

        // Enroll students in courses
        student1.enrollInCourse(course1);
        student2.enrollInCourse(course2);

        // Students pay fees
        student1.payFees(5000);
        university.collectFees(5000);

        student2.payFees(8000);
        university.collectFees(8000);

        // Pay salaries to professors
        university.paySalary(professor1);
        university.paySalary(professor2);

        // Display the university's financial summary
        System.out.println("Total fees collected: $" + university.getTotalFeesCollected());
        System.out.println("Total salaries paid: $" + university.getTotalSalariesPaid());

        // Display details of professors, students, and courses
        System.out.println("\n--- Professors ---");
        for (Professor professor : university.getProfessors()) {
            if (professor != null) {
                System.out.println(professor.getDetails());
            }
        }

        System.out.println("\n--- Students ---");
        for (Student student : university.getStudents()) {
            if (student != null) {
                System.out.println(student.getDetails());
            }
        }

        System.out.println("\n--- Courses ---");
        for (Course course : university.getCourses()) {
            if (course != null) {
                System.out.println(course.getCourseDetails());
            }
        }
    }
}