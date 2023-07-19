class TubeLight{
	
	/*public TubeLight() {
		System.out.println("TubeLight Constructor is invoked");
	}*/

  String brand;
  String lightType;
  double price;
  String wattage;
  
  public TubeLight(String brand , String lightType , double price , String wattage){   
	   this.brand = brand ;
	   this.lightType = lightType;
	   this.price = price;
	   this.wattage = wattage;
	   System.out.println("Parameterized TubeLight constructor is invoked");
   }
  
  public void toGlow(){
  System.out.println("Tubelights glow more");
  }
}