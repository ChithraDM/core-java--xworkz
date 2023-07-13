class Desktop {
 static String brand ;
 static  int price;
  static String color ;
  static String specialFeature ;
  static String cpuSpeed ;
  static String displayType;
  static int modelYear ;
  static String cellularTechnology;
   
   public static void main(String desktop[]) {
	 String brand = "Acer Aspire";
   int price = 50451;
   String color = "Black";
   String specialFeature = "Webcam";
   String cpuSpeed = "1GHz";
   String displayType = "LED";
   int modelYear = 2022;
   String cellularTechnology= "2G";
     
	 System.out.println("Main started");
     System.out.println("The brand is  " + brand);
     System.out.println("The price is  " + price);
     System.out.println("Color is  " + color);
	 System.out.println("The specialFeature is " + specialFeature);
	 System.out.println("The cpuSpeed is  " + cpuSpeed);
     System.out.println("The displayType is  " + displayType);
	 System.out.println("The modelYear is  " + modelYear);
	 System.out.println("The cellularTechnology is  " + cellularTechnology);
	 System.out.println("Main ended");
   }
}