class Umbrella{
	
	/*public Umbrella() {
		System.out.println("Umbrella Constructor is invoked");
	}*/

  String brand;
  String pattern;
  String frameMaterial;
  int price;
  
  public Umbrella(String brand , String pattern , String frameMaterial , int price){   
	   this.brand = brand ;
	   this.pattern = pattern;
	   this.frameMaterial = frameMaterial;
	   this.price = price;
	   System.out.println("Parameterized Umbrella constructor is invoked");
   }
 
  public void forRain(){
  System.out.println("Umbrella is used during rainy season");
}
}