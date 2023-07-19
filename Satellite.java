class Satellite{
	
	/*public Satellite() {
		System.out.println("Satellite Constructor is invoked");
	}*/

  String name;
  String type;
  int communicationCost;
  
  public Satellite(String name , String type , int communicationCost){   
	   this.name = name ;
	   this.type = type;
	   this.communicationCost = communicationCost;
	   System.out.println("Parameterized Satellite constructor is invoked");
   }
  
  public void launchSatellites(){
  System.out.println("Many Satellites are launched in India");
  }
}