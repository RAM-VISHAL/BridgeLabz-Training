public class UnitConvertor2{
    public static double convertYardToFeet(double yard ){
        double  yards2Feet = 3; 
        return  yards2Feet * yard;
    }
    public static double convertFeetToYard(double feet){
        double  feet2Yards =0.333333; 
        return  feet * feet2Yards;
    }
    // Convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }
     // Convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }
     // Convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }



     public static void main(String args[]){
       double feet = 5;
       double yard = 5;
       double inches = 100;
       double meter = 60;
       

        System.out.println(yard + " yards = " + convertYardToFeet(yard) + " feet");
        System.out.println(feet + " feet = " + convertFeetToYard(feet) + " yards");
        System.out.println(meter + " meters = " + convertMetersToInches(meter) + " inches");
        System.out.println(inches + " inches = " + convertInchesToMeters(inches) + " meters");
        System.out.println(inches + " inches = " + convertInchesToCentimeters(inches) + " centimeters");

       
       
       
       }
   
}