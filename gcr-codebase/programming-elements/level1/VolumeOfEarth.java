public class VolumeOfEarth{
       public static void main(String args[]){
       int radius = 6378;
       double VolKiloCubic = (4/3)*Math.PI*radius*radius*radius;
       double VolMilesCubic = (4/3)*Math.PI*radius*radius*radius*1.6;
 
       System.out.println("The volume of earth in cubic kilometers is "+VolKiloCubic);
       System.out.println("The volume of earth in cubic Miles is "+VolMilesCubic);
   }}
       