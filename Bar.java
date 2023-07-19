class Bar{
	
	/*public Bar() {
		System.out.println("Bar Constructor is invoked");
	}*/

  String brand;
  String typeOfDrink;
  int price;
  
  public Bar(String brand , String typeOfDrink , int price){   
	   this.brand = brand ;
	   this.typeOfDrink = typeOfDrink;
	   this.price = price;
	   System.out.println("Parameterized Bar constructor is invoked");
   }
  
  public void toDrink(){
  System.out.println("People go bar to drink and ruin their health");
  }
}