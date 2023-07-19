class Chocolates{

/*public Chocolates() {
		System.out.println("Chocolates Constructor is invoked");
	}*/
	
  String name;
  String flavor;
  double price;
  int quantity;
  String expDate;
  String mfgDate;
  String color;
  
  public Chocolates(String name , String flavor , double price , int quantity , String expDate , String mfgDate , String color){   
	   this.name = name ;
	   this.flavor = flavor;
	   this.price = price;
	   this.quantity = quantity;
	   this.expDate = expDate;
	   this.mfgDate = mfgDate;
	   this.color = color;
	   System.out.println("Parameterized Chocolates constructor is invoked");
   }
  
  public void toGetCalories(){
    System.out.println("We can eat chocolates and feel happy");
  }
  
}