class Zomato{
 
   public static double search(String foodName){
	   
	   if("Pizza" == foodName){
		  System.out.println("Searched food name is " + foodName);
           return 99.00;		  
		   }
	   //20 food names
	   
	   if("Biryani" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 200.00;
	   }
	   
	   if("Burger" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 90.00;
	   }
   
       if("Pav Bhaji" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 50.00;
	   }
   
       if("Thandoori" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 256.00;
	   }
       
	   if("Fried rice" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 80.00;
	   }
	   
	   if("French fries" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 40.00;
	   }
	   
	   if("Noodles" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 60.00;
	   }
	   
	   if("Roll" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 79.00;
	   }
	   
	   if("Ice cream" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 45.00;
	   }
	   
	   if("Cake" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 350.00;
	   }
	   
	   if("Pani puri" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 56.00;
	   }
	   
	   if("Paneer manchuri" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 160.00;
	   }
	   
	   if("Butter naan" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 175.00;
	   }
	   
	   if("Kabab" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 300.00;
	   }
	   
	   if("Parota" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 165.00;
	   }
	   
	   if("Mushroom biryani" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 140.00;
	   }
	   
	   if("Pulav" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 88.00;
	   }
	   
	   if("Kesari bath" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 100.00;
	   }
	   
	   if("Butter masala" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 65.00;
	   }
	   
	   if("Roti curry" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 135.00;
	   }
   
       return 0.0;   //default value
   }
   
   //method Overloading
   public static double search(String foodName , int quantity){
	   
	   if("Pizza" == foodName){
		  System.out.println("Searched food name is " + foodName);
           return 99.00 * quantity;		  
		   }
	   //20 food names
	   
	   if("Biryani" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 200.00 * quantity;
	   }
	   
	   if("Burger" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 90.00 * quantity;
	   }
   
       if("Pav Bhaji" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 50.00 * quantity;
	   }
   
       if("Thandoori" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 256.00 * quantity;
	   }
       
	   if("Fried rice" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 80.00 * quantity;
	   }
	   
	   if("French fries" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 40.00 * quantity;
	   }
	   
	   if("Noodles" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 60.00 * quantity;
	   }
	   
	   if("Roll" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 79.00 * quantity;
	   }
	   
	   if("Ice cream" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 45.00 * quantity;
	   }
	   
	   if("Cake" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 350.00 * quantity;
	   }
	   
	   if("Pani puri" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 56.00 * quantity;
	   }
	   
	   if("Paneer manchuri" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 160.00 * quantity;
	   }
	   
	   if("Butter naan" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 175.00 * quantity;
	   }
	   
	   if("Kabab" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 300.00 * quantity;
	   }
	   
	   if("Parota" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 165.00 * quantity;
	   }
	   
	   if("Mushroom biryani" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 140.00 * quantity;
	   }
	   
	   if("Pulav" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 88.00 * quantity;
	   }
	   
	   if("Kesari bath" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 100.00 * quantity;
	   }
	   
	   if("Butter masala" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 65.00 * quantity;
	   }
	   
	   if("Roti curry" == foodName){
		   System.out.println("Searched food name is " + foodName);
		   return 135.00 * quantity;
	   }
   
       return 0.0;   //default value
   }

}