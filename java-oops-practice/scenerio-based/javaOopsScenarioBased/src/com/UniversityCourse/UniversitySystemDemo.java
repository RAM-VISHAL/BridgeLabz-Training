package javaOopsScenarioBased.UniversityCourse;

//Main class
public class UniversitySystemDemo {
 public static void main(String[] args) {

     // Courses
     Course java = new Course("Java Programming", 4);
     Course ai = new Course("Artificial Intelligence", 3);

     // Students
     Student ug = new Undergraduate("Ram", 101);
     Student pg = new Postgraduate("Sita", 201);

     // Enrollment
     Enrollment e1 = new Enrollment(ug, java);
     Enrollment e2 = new Enrollment(pg, ai);

     e1.showEnrollment();
     e2.showEnrollment();

     // Faculty
     Faculty prof = new Faculty("Dr. Sharma");

     // Assign grades
     prof.gradeStudent((Graded) ug, 82);
     prof.gradeStudent((Graded) pg, 45);

     // Transcript
     System.out.println("\nTranscript:");
     System.out.println("UG Student GPA: " + ug.getTranscript());
     System.out.println("PG Student GPA: " + pg.getTranscript());
 }
}
