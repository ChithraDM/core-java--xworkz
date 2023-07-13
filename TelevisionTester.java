class TelevisionTester{
//Class contain only Invocation of the logic
 public static void main(String test[]){
	 System.out.println("Main started");
	 
	 //click on button for the 1st time
     boolean connected = Television.onOrOff();
	 System.out.println("Is Television connected " + connected);
	 Television.increaseVolume();
	 Television.increaseVolume();
	 Television.increaseVolume();
	 Television.increaseVolume();
	 Television.increaseVolume();
	 
	 Television.decreaseVolume();
	 Television.decreaseVolume();
	 Television.decreaseVolume();
	 Television.decreaseVolume();
	 Television.decreaseVolume();
	 
	 //click on button for the 2nd time
	 boolean connected1 = Television.onOrOff();
	 System.out.println("Is Television connected " + connected1);
     Television.increaseVolume();
	 Television.increaseVolume();
	 Television.increaseVolume();
	 Television.increaseVolume();
	 Television.increaseVolume();
	 
	 Television.decreaseVolume();
	 Television.decreaseVolume();
	 Television.decreaseVolume();
	 Television.decreaseVolume();
	 Television.decreaseVolume();
	 
	 System.out.println("Main ended");
 }
}