class OvenTester{
//Class contain only Invocation of the logic
 public static void main(String test[]){
	 System.out.println("Main started");
	 
	 //click on button for the 1st time
     boolean connected = Oven.onOrOff();
	 System.out.println("Is Oven connected " + connected);
	 Oven.increaseTemp();
	 Oven.increaseTemp();
	 Oven.increaseTemp();
	 Oven.increaseTemp();
	 Oven.increaseTemp();
	 
	 Oven.decreaseTemp();
	 Oven.decreaseTemp();
	 Oven.decreaseTemp();
	 Oven.decreaseTemp();
	 Oven.decreaseTemp();
	 
	 //click on button for the 2nd time
	 boolean connected1 = Oven.onOrOff();
	 System.out.println("Is Oven connected " + connected1);
	 Oven.increaseTemp();
	 Oven.increaseTemp();
	 Oven.increaseTemp();
	 Oven.increaseTemp();
	 Oven.increaseTemp();
	 
	 Oven.decreaseTemp();
	 Oven.decreaseTemp();
	 Oven.decreaseTemp();
	 Oven.decreaseTemp();
	 Oven.decreaseTemp();
	 System.out.println("Main ended");
 }
}