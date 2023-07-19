class Clock{
	
	/*public Clock() {
		System.out.println("Clock Constructor is invoked");
	}*/
	
  String type;
  String warranty;
  int price;
  String color;
  
  public Clock(String type , String warranty , int price , String color){   
	   this.type = type ;
	   this.warranty = warranty;
	   this.price = price;
	   this.color = color;
	   System.out.println("Parameterized Clock constructor is invoked");
   }
  
  public void knowTheTime(){
  System.out.println("Time is known by using clocks");
  }
}