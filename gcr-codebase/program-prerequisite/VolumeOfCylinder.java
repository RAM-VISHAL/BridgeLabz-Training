import java.util.*;
public class VolumeOfCylinder{
          public static void main(String [] args){
           Scanner sc = new Scanner(System.in);
           float radius = sc.nextFloat();
           float height = sc.nextFloat();
           float Volume = (float) (Math.PI*radius*radius*height);
        
          System.out.println("Volume Of a Cylinder :"+Volume);
     }}
           