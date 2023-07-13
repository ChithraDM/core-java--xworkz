class Ac1 {
   static String name = "LG";
     static int minTemp;
	 static int currentTemp;
	 static int maxTemp=7;
	 static boolean isConnected;
	 //method
	 public static boolean onOrOff(){
		 System.out.println("Invoking onOrOff()");
		 System.out.println("Parameter" + 0);
		 //false==false
		 if (isConnected == false){
			 isConnected = true;
			 System.out.println("AC is Turned Onnn.....Enjoyyy");
			 //true==true
		 }else if(isConnected == true){
			 isConnected = false;
			 System.out.println("AC is Turned Off....");
		 }
		 return isConnected;
	 }
	 
	 //increaseTemp
	 public static void increaseTemp(){
		 System.out.println("Invoking increaseTemp() ");
		 System.out.println("List of parameters " + 2);
		 if(isConnected == true){                            //Nested if
		 if(currentTemp < maxTemp){
			 currentTemp = currentTemp + 1;
			 System.out.println("The Current Temperature is " +currentTemp);
		 }else{
			 System.out.println("Max Temperature reached");
		 }
	 }else{
		 System.out.println("Gubee..AC Connect Maadu firstu");
	 }
	 System.out.println("End of increaseTemp() ");
	 } 
	 
	 //decreaseTemp
	 
	 public static void decreaseTemp(){
		 System.out.println("Invoking decreaseTemp() ");
	     System.out.println("List of parameters " + 0);
		 //logic
		 if(isConnected == true){
		 if(currentTemp > minTemp){
			 currentTemp = currentTemp - 1;
			 System.out.println("The Current Temperature is " + currentTemp);
		 }else{
			 System.out.println("Minimum Temperature reached");
		 }
	 }else{
		 System.out.println("AC is turned off.....can't decrease Temperature");   
	 }
	 System.out.println("End of decreaseTemp() "); 
	} 
		
	 }
