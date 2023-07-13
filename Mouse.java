class Mouse {
   static String brand ;
   static int price ;
   static String color;
   static String connectorType;
   static int noOfButtons ;
   static String specialFeature;
   static String style ;
   static String batteryLife ;
     
    
   
   public static void main(String mouse[]) {
	   String brand = "Dell";
    int price = 250;
    String color = "Black";
    String connectorType = "USB";
    int noOfButtons = 3;
    String specialFeature = "Wireless";
    String style = "MS116";
    String batteryLife = "12 months";
     
	 System.out.println("Main started");
     System.out.println("The brand of the mouse is  " + brand);
     System.out.println("The price of the mouse is  " + price);
     System.out.println("Color of the mouse is  " + color);
	 System.out.println("The connectorType is " + connectorType);
	 System.out.println("The noOfButtons is  " + noOfButtons);
     System.out.println("The specialFeature is  " + specialFeature);
	 System.out.println("The style is  " + style);
	 System.out.println("The batteryLife is  " + batteryLife);
	 System.out.println("Main ended");
   }
}