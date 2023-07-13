class WashingMachine1 {
   static String name = "Bosch";
     static int minSpeed;
	 static int currentSpeed;
	 static int maxSpeed=5;
	 static boolean isConnected;
	 //method
	 public static boolean onOrOff(){
		 System.out.println("Invoking onOrOff()");
		 System.out.println("Parameter" + 0);
		 //false==false
		 if(isConnected == false){
			 isConnected = true;
			 System.out.println("Washing Machine is Turned Onnn....");
			 //true==true
		 }else if(isConnected == true){
			 isConnected = false;
			 System.out.println("Washing Machine is Turned Off....");
		 }
		 return isConnected;
	 }
	 
	 //increaseSpeed
	 public static void increaseSpeed(){
		 System.out.println("Invoking increaseSpeed() ");
		 System.out.println("List of parameters " + 2);
		 if(isConnected == true){                            //Nested if
		 if(currentSpeed < maxSpeed){
			 currentSpeed = currentSpeed + 1;
			 System.out.println("The Current Speed is " +currentSpeed);
		 }else{
			 System.out.println("Max Speed reached");
		 }
	 }else{
		 System.out.println("Gubee...Washing Machine On Maadu firstu");
	 }
	 System.out.println("End of increaseSpeed() ");
	 } 
	 
	 //decreaseSpeed
	 
	 public static void decreaseSpeed(){
		 System.out.println("Invoking decreaseSpeed() ");
	     System.out.println("List of parameters " + 0);
		 //logic
		 if(isConnected == true){
		 if(currentSpeed > minSpeed){
			 currentSpeed = currentSpeed - 1;
			 System.out.println("The Current Speed is " + currentSpeed);
		 }else{
			 System.out.println("Minimum Speed reached");
		 }
	 }else{
		 System.out.println("Washing Machine is turned off.....can't decrease Speed");   
	 }
	 System.out.println("End of decreaseSpeed() "); 
	} 
		
	 }
