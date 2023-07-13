class Ac1Tester{
//Class contain only Invocation of the logic
 public static void main(String test[]){
	 System.out.println("Main started");
	 
	 //click on button for the 1st time
     boolean connected = Ac1.onOrOff();
	 System.out.println("Is AC connected " + connected);
	 Ac1.increaseTemp();
	 Ac1.increaseTemp();
	 Ac1.increaseTemp();
	 Ac1.increaseTemp();
	 Ac1.increaseTemp();
	 
	 Ac1.decreaseTemp();
	 Ac1.decreaseTemp();
	 Ac1.decreaseTemp();
	 Ac1.decreaseTemp();
	 Ac1.decreaseTemp();
	 
	 //click on button for the 2nd time
	 boolean connected1 = Ac1.onOrOff();
	 System.out.println("Is AC connected " + connected1);
     Ac1.increaseTemp();
	 Ac1.increaseTemp();
	 Ac1.increaseTemp();
	 Ac1.increaseTemp();
	 Ac1.increaseTemp();
	 
	 Ac1.decreaseTemp();
	 Ac1.decreaseTemp();
	 Ac1.decreaseTemp();
	 Ac1.decreaseTemp();
	 Ac1.decreaseTemp();
	 System.out.println("Main ended");
 }
}