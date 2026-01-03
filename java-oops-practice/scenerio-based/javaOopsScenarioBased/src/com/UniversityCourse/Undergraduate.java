package javaOopsScenarioBased.UniversityCourse;

//Undergraduate Student (Inheritance)
class Undergraduate extends Student implements Graded {

 Undergraduate(String name, int id) {
     super(name, id);
 }

 // Polymorphic grading (Letter-based)
 @Override
 public void assignGrade(double marks) {
     double gpa;
     if (marks >= 90)
         gpa = 4.0;
     else if (marks >= 75)
         gpa = 3.0;
     else if (marks >= 60)
         gpa = 2.0;
     else
         gpa = 1.0;

     setGPA(gpa);
 }
}
