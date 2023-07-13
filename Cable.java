class Cable {
 static String brand ;
  static int price ;
   static String color;
  static String connectorType ;
 static String cableType ;
  static  String compatibleDevices ;
  static  String specialFeature ;
   
   
   public static void main(String cable[]) {
     String brand = "MI";
  int price = 350;
    String color = "Red";
    String connectorType = "USB Type C";
  String cableType = "USB";
    String compatibleDevices = "Mi";
    String specialFeature = "Braided";
    String compatiblePhoneModels = "All type C enabled models";
	 System.out.println("Main started");
     System.out.println("The brand of the cable is  " + brand);
     System.out.println("The price of the cable is  " + price);
     System.out.println("Color of the cable is  " + color);
	 System.out.println("The connectorType is " + connectorType);
	 System.out.println("The cableType is  " + cableType);
	 System.out.println("The compatibleDevices are  " + compatibleDevices);
	 System.out.println("The specialFeature is  " + specialFeature);
	 System.out.println("The compatiblePhoneModels is  " + compatiblePhoneModels);
	 System.out.println("Main ended");
   }
}