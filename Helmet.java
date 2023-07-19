class Helmet{
	
	/*public Helmet() {
		System.out.println("Helmet Constructor is invoked");
	}*/

  String brand;
  String warranty;
  int price;
  String color;
  
  public Helmet(String brand , String warranty , int price , String color){   
	   this.brand = brand ;
	   this.warranty = warranty;
	   this.price = price;
	   this.color = color;
	   System.out.println("Parameterized Helmet constructor is invoked");
   }
  
  public void toSaveHead(){
  System.out.println("Wearing helmet can avoid accident injuries");
  }
}