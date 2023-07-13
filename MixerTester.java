class MixerTester{
//Class contain only Invocation of the logic
 public static void main(String test[]){
	 System.out.println("Main started");
	 
	 //click on button for the 1st time
     boolean connected = Mixer.onOrOff();
	 System.out.println("Is Mixer connected " + connected);
	 Mixer.increaseSpeed();
	 Mixer.increaseSpeed();
	 Mixer.increaseSpeed();
	 Mixer.increaseSpeed();
	 Mixer.increaseSpeed();
	 
	 Mixer.decreaseSpeed();
	 Mixer.decreaseSpeed();
	 Mixer.decreaseSpeed();
	 Mixer.decreaseSpeed();
	 Mixer.decreaseSpeed();
	 
	 //click on button for the 2nd time
	 boolean connected1 = Mixer.onOrOff();
	 System.out.println("Is Mixer connected " + connected1);
	 Mixer.increaseSpeed();
	 Mixer.increaseSpeed();
	 Mixer.increaseSpeed();
	 Mixer.increaseSpeed();
	 Mixer.increaseSpeed();
	 
	 Mixer.decreaseSpeed();
	 Mixer.decreaseSpeed();
	 Mixer.decreaseSpeed();
	 Mixer.decreaseSpeed();
	 Mixer.decreaseSpeed();
     
	 System.out.println("Main ended");
 }
}