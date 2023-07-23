class Binacular{

 String typeOfLens;
 String brandName; 
 double price;

   //default constructor - user defined constructor
   public Binacular(){
	   System.out.println("Binacular Constructor is invoked - no arg constructor");
   }
   //Constructor overloading //Constructor chaining
   public Binacular(String typeOfLens, String brandName){
	   /*this method*/ this(10000.00);
	   System.out.println("Binacular Constructor is invoked - 2 arg constructor");
	   this.typeOfLens = typeOfLens;
	   this.brandName = brandName;
	   //System.out.println("Binacular Constructor is invoked");
   }
   
	   public Binacular(double price){
		   this();
		   System.out.println("Binacular Constructor is invoked - 1 arg constructor");
		   this.price = price;
	   }
   
 }

