class Toys{

/*public Toys() {
		System.out.println("Toys Constructor is invoked");
	}*/
	
  String name;
  String type;
  int price;
  String color;
  
  public Toys(String name , String type , int price , String color){   
	   this.name = name ;
	   this.type = type;
	   this.price = price;
	   this.color = color;
	   System.out.println("Parameterized Toys constructor is invoked");
   }
  
  public void play(){
  System.out.println("Kids can play using toys");
  }
}