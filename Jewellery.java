class Jewellery {
	
	/*public Jewellery() {
		System.out.println("Jewellery Constructor is invoked");
	}*/

  String shopName;
  String metalUsed;
  int price;
  String typeOfJewellery;
  
  public Jewellery(String shopName , String metalUsed , int price , String typeOfJewellery){   
	   this.shopName = shopName ;
	   this.metalUsed = metalUsed;
	   this.price = price;
	   this.typeOfJewellery = typeOfJewellery;
	   System.out.println("Parameterized Jewellery constructor is invoked");
   }
  
  public void toWear(){
  System.out.println("Wearing jewelleries during ocassions makes us glow");
  }
}