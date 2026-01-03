package javaOopsScenarioBased.UniversityCourse;

//Enrollment class (Association)
class Enrollment {
 Student student;
 Course course;

 Enrollment(Student student, Course course) {
     this.student = student;
     this.course = course;
 }

 void showEnrollment() {
     System.out.println(student.name + " enrolled in " + course.courseName);
 }
}
