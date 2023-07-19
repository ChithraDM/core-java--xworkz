class Rocket{
	
	/*public Rocket(){
		System.out.println("Rocket constructor is invoked");
	}*/
	
  String name;
  String propellants;
  int speedInMph;
  
  public Rocket(String name , String propellants , int speedInMph){   
	   this.name = name ;
	   this.propellants = propellants;
	   this.speedInMph = speedInMph;
	   System.out.println("Parameterized Rocket constructor is invoked");
   }
  
  public void toLaunchRockets(){
  System.out.println("Rockets are launched into space");
  }
}