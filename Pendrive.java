class Pendrive {
	static String brand ;
  static int price ;
  static String storage ;
  static String color ;
  static String model ;
  static String hardwareInterface ;
  static boolean batteriesIncluded ;
  static String connectorType;

   public static void main(String pendrive[]) {
	   
   String brand = "Hp";
   int price = 800;
   String storage = "32GB";
   String color = "grey";
   String model = "HPFD222W-64";
   String hardwareInterface = "USB 2.0";
   boolean batteriesIncluded = false;
   String connectorType = "USB";
     
	 System.out.println("Main started");
     System.out.println("The brand of the pendrive is  " + brand);
     System.out.println("The price of the pendrive is  " + price);
     System.out.println("Storage in the pendrive is  " + storage);
	 System.out.println("The color is  " + color);
	 System.out.println("The model is  " + model);
	 System.out.println("The hardware interface is  " + hardwareInterface);
     System.out.println("battery is included  " + batteriesIncluded);
     System.out.println("The connector type is" + connectorType);
	 System.out.println("Main ended");
   }
}