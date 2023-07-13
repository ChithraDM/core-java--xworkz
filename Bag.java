class Bag {
	static String brand ;
  static int price;
  static String color ;
  static String material;
  static String model ;
  static String packer ;
  static String itemWeight ;
  static String genericName ;

   public static void main(String bag[]) {
	   
   String brand = "Fastrack";
   int price = 2000;
   String color = "Red";
   String material = "polyester";
   String model = "Core Backpack";
   String packer = "Puma Sports India pvt ltd";
   String itemWeight = "200g";
   String genericName = "Backpack";
     
	 System.out.println("Main started");
     System.out.println("The brand of the bag is  " + brand);
     System.out.println("The price of the bag is  " + price);
     System.out.println("Colour of the bag is  " + color);
	 System.out.println("The material is " + material);
	 System.out.println("The model is  " + model);
     System.out.println("The packer is  " + packer);
	 System.out.println("The itemWeight is  " + itemWeight);
	 System.out.println("The generic name is  " + genericName);
	 System.out.println("Main ended");
   }
}