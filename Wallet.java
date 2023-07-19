class Wallet{
	
	/*public Wallet() {
		System.out.println("Wallet Constructor is invoked");
	}*/

  String materialType;
  String warranty;
  int price;
  int noOfCompartments;
  
  public Wallet(String materialType , String warranty , int price , int noOfCompartments){   
	   this.materialType = materialType ;
	   this.warranty = warranty;
	   this.price = price;
	   this.noOfCompartments = noOfCompartments;
	   System.out.println("Parameterized Wallet constructor is invoked");
   }
  
  public void toStoreMoney(){
  System.out.println("Keeping money inside wallet is safe");
  }
}
