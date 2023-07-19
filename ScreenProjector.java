class ScreenProjector{
	
	/*public ScreenProjector() {
		System.out.println("ScreenProjector Constructor is invoked");
	}*/

  String brand;
  String warranty;
  int price;
  String color;
  
  public ScreenProjector(String brand , String warranty , int price , String color){   
	   this.brand = brand ;
	   this.warranty = warranty;
	   this.price = price;
	   this.color = color;
	   System.out.println("Parameterized ScreenProjector constructor is invoked");
   }
  
  public void toDisplayOnScreen(){
  System.out.println("Projector displays everything on screen");
  }
}