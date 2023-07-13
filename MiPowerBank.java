class MiPowerBank {
 static String connectorType ;
  static String brand;
  static String batteryCapacity ;
  static int price ;
  static String color;
   
   
   public static void main(String powerbank[]) {
 String connectorType = "USB,Micro USB";
   String brand = "Mi";
   String batteryCapacity = "1000 Milliamp Hours";
   int price = 1600;
   String color = "Black";
     System.out.println("The connector type of the power bank is  " + connectorType);
     System.out.println("The brand of the power bank is  " + brand);
     System.out.println("The battery capacity is  " + batteryCapacity);
     System.out.println("The price of the power bank is  " + price);
     System.out.println("Color  of the power bank is  " + color);
   }
}