class WashingMachine {
	static String brand ;
  static int price;
  static String typeOfLoad ;
  static String color;
  static String model ;
  static String material ;
  static boolean batteriesRequired;
  static String countryOfOrigin ;
  static String partNo ;
  static String capacity;

   public static void main(String WashingMachine[]) {
	   
   String brand = "IFB";
   int price = 26000;
   String typeOfLoad = "Front load";
   String color = "white";
   String model = "NEO DIVA BXS 7010";
   String material = "stainless steel";
   boolean batteriesRequired = false;
   String countryOfOrigin = "India";
   String partNo = "IFBST18";
   String capacity = "7kg";
     
	 System.out.println("Main started");
     System.out.println("The brand is  " + brand);
     System.out.println("The price is  " + price);
     System.out.println("Type of load is  " + typeOfLoad);
	 System.out.println("color is " + color);
	 System.out.println("model is " + model);
     System.out.println("The material is  " + material);
     System.out.println("batteriesRequired  " + batteriesRequired);
     System.out.println("countryOfOrigin" + countryOfOrigin);
	 System.out.println("partNo is " + partNo);
	 System.out.println("The capacity is  " + capacity);
     System.out.println("Main ended");
	 
   }
}