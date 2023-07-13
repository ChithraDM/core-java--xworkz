class WashingMachine1Tester{
//Class contain only Invocation of the logic
 public static void main(String test[]){
	 System.out.println("Main started");
	 
	 //click on button for the 1st time
     boolean connected = WashingMachine1.onOrOff();
	 System.out.println("Is Washing Machine connected " + connected);
	 WashingMachine1.increaseSpeed();
	 WashingMachine1.increaseSpeed();
	 WashingMachine1.increaseSpeed();
	 WashingMachine1.increaseSpeed();
	 WashingMachine1.increaseSpeed();
	 
	 WashingMachine1.decreaseSpeed();
	 WashingMachine1.decreaseSpeed();
	 WashingMachine1.decreaseSpeed();
	 WashingMachine1.decreaseSpeed();
	 WashingMachine1.decreaseSpeed();
	 
	 //click on button for the 2nd time
	 boolean connected1 = WashingMachine1.onOrOff();
	 System.out.println("Is Washing Machine connected " + connected1);
	 WashingMachine1.increaseSpeed();
	 WashingMachine1.increaseSpeed();
	 WashingMachine1.increaseSpeed();
	 WashingMachine1.increaseSpeed();
	 WashingMachine1.increaseSpeed();
	 
	 WashingMachine1.decreaseSpeed();
	 WashingMachine1.decreaseSpeed();
	 WashingMachine1.decreaseSpeed();
	 WashingMachine1.decreaseSpeed();
	 WashingMachine1.decreaseSpeed();
     
	 System.out.println("Main ended");
 }
}