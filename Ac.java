class Ac{
	static String brand ;
  static int price;
  static String coolingCapacity ;
  static String color ;
  static String filter ;
  static String noiseLevel ;
  static boolean batteryisRequired ;
  static String wattage ;
 
   public static void main(String Ac[]) {
	   
   String brand = "LG";
   int price = 44000;
   String coolingCapacity = "1.5 tons";
   String color = "white";
   String filter = "HD Filter";
   String noiseLevel = "31 decibels";
   boolean batteryisRequired = true;
   String wattage = "1130 watts";
     
	 System.out.println("Main started");
     System.out.println("The brand of the Ac is  " + brand);
     System.out.println("The price of the Ac is  " + price);
     System.out.println("Cooling capacity of the Ac is  " + coolingCapacity);
	 System.out.println("The color of the Ac is  " + color);
	 System.out.println("The filter is  " + filter);
	 System.out.println("The noise level of the Ac is  " + noiseLevel);
     System.out.println("batteryisRequired  " + batteryisRequired);
     System.out.println("The wattage is" + wattage);
	 System.out.println("Main ended");
   }
}