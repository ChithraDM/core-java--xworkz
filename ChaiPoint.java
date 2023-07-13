class ChaiPoint {

  static String location = "kormangala";
  static String tea = "Masala tea";
  static String tea1 = "Ginger tea";
  static String tea2 = "Lemon tea";
  static String tea3 = "Kesar Elaichi chai";
  static String tea4 = "Irani chai";
  static String tea5 = "Green tea";
  static String tea6 = "Ayurvedic chai";
  static String tea7 = "Filter Coffee";
  static String tea8 = "Kokum Iced chai";
  static String tea9 = "Lemon Iced chai";
  static String tea10 = "Belgian Hot chocolate";
  static String chaiAvailable[] = {tea, tea1, tea2, tea3, tea4, tea5, tea6, tea7, tea8, tea9, tea10};
 
 //method  
   public static void getAllChaiAvailable(){
	   System.out.println("Invoking getAllChaiAvailable");
	  
	  /* for(String individualChai : chaiAvailable){
		   System.out.println(individualChai);
	   }*/
	   
	   for(int chai=0; chai<chaiAvailable.length; chai++){
		  String reference = chaiAvailable[chai];
		  System.out.println(reference);
	   }
	   System.out.println("end of getAllChaiAvailable");
	   
	   
   }
}