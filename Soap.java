class Soap {
 
 //static variables
 
 static String type = "Body Wash";
 static int price = 30;
 static String mfgDate = "Jan-26";
 static String expDate = "Dec-21";
 //The type is Body Wash
  
  public static void main(String soap[]) {
     //local variable - declared and initialized inside method (eg: main)
	 String soapName = "Santoor";
	 
	 System.out.println("Main started");
	 System.out.println("The Soap Name is  " + soapName );
	 System.out.println("The Soap type is  " + type);
	 System.out.println("The Soap price is  " + price);
	 System.out.println("The Soap is manufactured in  " + mfgDate);
	 System.out.println("The Soap expires in  " + expDate);
	 System.out.println("Main ended");
  }
}