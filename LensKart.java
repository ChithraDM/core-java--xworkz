class LensKart{
 
 String color;
 String spectaclesBrandName; 
 int price;

   public LensKart(){
	   System.out.println("LensKart Constructor is invoked");
   }

   public LensKart(String color){
	   this.color = color;
	   System.out.println("LensKart Constructor is invoked");
   }
   
	   public LensKart(String spectaclesBrandName, int price){
		   this("black");
           this.spectaclesBrandName = spectaclesBrandName;		   
		   this.price = price;
	   }
}