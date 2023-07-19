class Door{
	
	/*public Door() {
		System.out.println("Door Constructor is invoked");
	}*/

  String type;
  String warranty;
  int price;
  String color;
  
  public Door(String type , String warranty , int price , String color){   
	   this.type = type ;
	   this.warranty = warranty;
	   this.price = price;
	   this.color = color;
	   System.out.println("Parameterized Door constructor is invoked");
   }
  
  public void comeInsideTheDoor(){
  System.out.println("Home has many doors");
  }
}