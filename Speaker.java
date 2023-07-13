class Speaker {
	static String brand ;
  static  int price ;
  static  int modelYear ;
  static  String model ;
  static  String color ;

   public static void main(String speaker[]) {
	   
    String brand = "Sony";
    int price = 15000;
    int modelYear = 2020;
    String model = "HTS-20R" ;
    String color = "black" ;
     
	 System.out.println("Main started");
     System.out.println("The brand of the speaker is  " + brand);
     System.out.println("The price of the speaker is  " + price);
     System.out.println("Model year of the speaker is  " + modelYear);
     System.out.println("Model of the speaker is  " + model);
	 System.out.println("The color of the speaker is  " + color);
	 System.out.println("Main ended");
   }
}