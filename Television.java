class Television {
   static String name = "Samsung";
     static int minVolume;
	 static int currentVolume;
	 static int maxVolume=5;
	 static boolean isConnected;
	 //method
	 public static boolean onOrOff(){
		 System.out.println("Invoking onOrOff()");
		 System.out.println("Parameter" + 0);
		 //false==false
		 if (isConnected == false){
			 isConnected = true;
			 System.out.println("Television is Turned Onnn.....Enjoyyy");
			 //true==true
		 }else if(isConnected == true){
			 isConnected = false;
			 System.out.println("Television is Turned Off....");
		 }
		 return isConnected;
	 }
	 
	 //increaseVolume
	 public static void increaseVolume(){
		 System.out.println("Invoking increaseVolume() ");
		 System.out.println("List of parameters " + 2);
		 if(isConnected == true){                            //Nested if
		 if(currentVolume < maxVolume){
			 currentVolume = currentVolume + 1;
			 System.out.println("The Current Volume is " +currentVolume);
		 }else{
			 System.out.println("Max Volume reached");
		 }
	 }else{
		 System.out.println("Gubee..Television On Maadu firstu");
	 }
	 System.out.println("End of increaseVolume() ");
	 } 
	 
	 //decreaseVolume
	 
	 public static void decreaseVolume(){
		 System.out.println("Invoking decreaseVolume() ");
	     System.out.println("List of parameters " + 0);
		 //logic
		 if(isConnected == true){
		 if(currentVolume > minVolume){
			 currentVolume = currentVolume - 1;
			 System.out.println("The Current Volume is " + currentVolume);
		 }else{
			 System.out.println("Minimum Volume reached");
		 }
	 }else{
		 System.out.println("Television is turned off.....can't decrease volume");   //if Television is not connected
	 }
	 System.out.println("End of decreaseVolume() "); 
	} 
		
	 }
