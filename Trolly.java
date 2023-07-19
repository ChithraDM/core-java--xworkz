class Trolly{
	
	/*public Trolly() {
		System.out.println("Trolly Constructor is invoked");
	}*/
	
  String trollyColor;
  int price;
  int noOfPockets;
  String weight;
  
  public Trolly(String trollyColor , int price , int noOfPockets , String weight){   
	   this.trollyColor = trollyColor ;
	   this.price = price;
	   this.noOfPockets = noOfPockets;
	   this.weight = weight;
	   System.out.println("Parameterized Trolly constructor is invoked");
   }

  public void forTravel(){
  System.out.println("We can put many items inside a trolly");
  
  }

}