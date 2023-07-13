class Shampoo {
  static String brand ;
  static  int price ;
  static String hairType;
  static String materialType ;
   static String scent ;
   static String origin;
   static String itemWeight ;
   
   
   public static void main(String shampoo[]) {
	   String brand = "Dove";
    int price = 337;
   String hairType = "All";
   String materialType = "Paraben free";
    String scent = "Floral";
    String origin = "India";
    String itemWeight = "380ml";
     
	 System.out.println("Main started");
     System.out.println("The brand is  " + brand);
     System.out.println("The price is  " + price);
	 System.out.println("The hairType is  " + hairType);
     System.out.println("materialType is  " + materialType);
	 System.out.println("The scent is " + scent);
     System.out.println("The origin is  " + origin);
	 System.out.println("The itemWeight is  " + itemWeight);
	 System.out.println("Main ended");
   }
}