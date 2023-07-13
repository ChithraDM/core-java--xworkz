class Speaker1Tester{
//Class contain only Invocation of the logic
 public static void main(String test[]){
	 System.out.println("Main started");
	 
	 //click on button for the 1st time
     boolean connected = Speaker1.onOrOff();
	 System.out.println("Is speaker connected " + connected);
	 Speaker1.increaseVolume();
	 Speaker1.increaseVolume();
	 Speaker1.increaseVolume();
	 Speaker1.increaseVolume();
	 Speaker1.increaseVolume();
	 
	 Speaker1.decreaseVolume();
	 Speaker1.decreaseVolume();
	 Speaker1.decreaseVolume();
	 Speaker1.decreaseVolume();
	 Speaker1.decreaseVolume();
	 
	 //click on button for the 2nd time
	 boolean connected1 = Speaker1.onOrOff();
	 System.out.println("Is speaker connected " + connected1);
     Speaker1.increaseVolume();
	 Speaker1.increaseVolume();
	 Speaker1.increaseVolume();
	 Speaker1.increaseVolume();
	 Speaker1.increaseVolume();
	 
	 Speaker1.decreaseVolume();
	 Speaker1.decreaseVolume();
	 Speaker1.decreaseVolume();
	 Speaker1.decreaseVolume();
	 Speaker1.decreaseVolume();
	 System.out.println("Main ended");
 }
}