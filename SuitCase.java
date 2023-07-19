class SuitCase{

/*public SuitCase() {
		System.out.println("SuitCase Constructor is invoked");
	}*/
	
  String brandName;
  String weight;
  int price;
  int noOfPockets;
  
  public SuitCase(String brandName , String weight , int price , int noOfPockets){   
	   this.brandName = brandName ;
	   this.weight = weight;
	   this.price = price;
	   this.noOfPockets = noOfPockets;
	   System.out.println("Parameterized SuitCase constructor is invoked");
   }

  public void forLuggage(){
  System.out.println("While travelling, we should always carry a suit case");

}

}