class WaterFilter {
	static String brand ;
    static int price;
    static String color ;
    static String capacity ;
    static String material;
    static String origin ;
    static String itemWeight;
    static String purificationMethod ;

  public static void main(String filter[]) {
	   
     String brand = "V-Guard";
     int price = 20000;
     String color = "Black";
     String capacity = "6.5l";
     String material = "glass";
     String origin = "India";
     String itemWeight = "8kg";
     String purificationMethod = "Ultraviolet";
     
	 System.out.println("Main started");
     System.out.println("The brand of the filter is  " + brand);
     System.out.println("The price of the filter is  " + price);
     System.out.println("Color of the filter is  " + color);
	 System.out.println("The capacity is " +capacity);
	 System.out.println("The material is  " + material);
     System.out.println("The origin is  " + origin);
	 System.out.println("The itemWeight is  " + itemWeight);
	 System.out.println("The purification method is  " + purificationMethod);
	 System.out.println("Main ended");
   }
}