package javaOopsScenarioBased.UniversityCourse;

//Postgraduate Student (Inheritance)
class Postgraduate extends Student implements Graded {

 Postgraduate(String name, int id) {
     super(name, id);
 }

 // Polymorphic grading (Pass/Fail)
 @Override
 public void assignGrade(double marks) {
     double gpa = (marks >= 50) ? 4.0 : 0.0;
     setGPA(gpa);
 }
}
