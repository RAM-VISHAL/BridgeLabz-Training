package javaOopsScenarioBased.UniversityCourse;

//Faculty class
class Faculty {
 String facultyName;

 Faculty(String facultyName) {
     this.facultyName = facultyName;
 }

 void gradeStudent(Graded student, double marks) {
     student.assignGrade(marks);   // Polymorphism
 }
}
