class Beverages{
	
	/*public Beverages() {
		System.out.println("Beverages Constructor is invoked");
	}*/

  String brand;
  String flavour;
  int price;
  String itemWeight;
  
  public Beverages(String brand , String flavour , int price , String itemWeight){   
	   this.brand = brand ;
	   this.flavour = flavour;
	   this.price = price;
	   this.itemWeight = itemWeight;
	   System.out.println("Parameterized Beverages constructor is invoked");
   }
  
  public void drinkBeverages(){
  System.out.println("People drink beverages");
  }
}