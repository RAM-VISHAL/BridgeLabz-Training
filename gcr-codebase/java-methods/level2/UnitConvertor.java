public class UnitConvertor{
    public static double convertKmToMiles(double km ){
        double km2miles = 0.621371;
        return km2miles*km;
    }
    public static double convertMilestoKm(double miles ){
        double miles2Km = 1.60934;
        return miles*miles2Km;
    }
    public static double convertMeterToFeet(double meter ){
        double meter2Feet = 3.28084;
        return meter2Feet*meter;
    }
    public static double convertFeetToMeter(double feet ){
        double feet2Meters = 0.3048;
        return feet2Meters*feet;
    }



   public static void main(String args[]){
       double km = 5;
       double miles = 5;
       double meter = 100;
       double feet = 60;

       System.out.println(km + " km = " + convertKmToMiles(km) + " miles");
       System.out.println(miles+ " miles = " + convertMilestoKm(miles) + " km");
       System.out.println(meter+ " meter = " + convertMeterToFeet(meter) + " feet");
        System.out.println(feet+ " feet = " + convertFeetToMeter(feet) + " meter");
       
       
       
       }
   }