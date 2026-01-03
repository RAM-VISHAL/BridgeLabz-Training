package javaOopsScenarioBased.UniversityCourse;

//Student base class (Encapsulation)
class Student {
 protected String name;
 protected int id;
 private double gpa;   // Encapsulated

 Student(String name, int id) {
     this.name = name;
     this.id = id;
 }

 protected void setGPA(double gpa) {
     this.gpa = gpa;
 }

 public double getTranscript() {
     return gpa;
 }
}
