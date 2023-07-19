class Snacks{
	
	/*public Snacks() {
		System.out.println("Snacks Constructor is invoked");
	}*/

  String brand;
  String flavour;
  int price;
  String itemWeight;
  
  public Snacks(String brand , String flavour , int price , String itemWeight){   
	   this.brand = brand ;
	   this.flavour = flavour;
	   this.price = price;
	   this.itemWeight = itemWeight;
	   System.out.println("Parameterized Snacks constructor is invoked");
   }
  
  public void eatSnacks(){
  System.out.println("Eating snacks in evening refreshes our mood");
  }
}