class ChaiPoint1{
 
 static String chaiAvailable[] = {null,null,null,null};
 static int index;
 //adds tea into chaiAvailable
 
 //method 1
 public static boolean addChai(String chai){
  boolean isAdded = false;
  //"Masala tea" != null
  if(chai != null){
    //chaiAvailable[0] = "Masala tea";
	//chaiAvailable[1] = "Lemon tea";
	//chaiAvailable[2] = "Ginger tea";
	//chaiAvailable[3] = "Elaichi tea";
	chaiAvailable[index] = chai;
	index++;
	isAdded = true;
	
  }else{
      System.out.println("Cannot add chai, as it is a null value");
  }
  return isAdded;
 }
 
 //method 2
 public static void getAllChaiAvailable(){
 
  System.out.println("Invoking getAllChaiAvailable");
	  
  for(int chai=0; chai<chaiAvailable.length; chai++){
		  String reference = chaiAvailable[chai];
		  System.out.println("Accessing chai " + reference + " at " + chai);
	   }
	   System.out.println("end of getAllChaiAvailable");
	   
 }   
 }
