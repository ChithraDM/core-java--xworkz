class BarTester{

public static void main(String bar[]){
   
	  System.out.println("Creating 1st copy of bar");
	  Bar bar1 = new Bar("bacardi", "whiskey", 5000);
	  /*bar1.brand = "bacardi";
	  bar1.typeOfDrink = "whiskey";
	  bar1.price = 5000;*/
	  bar1.toDrink();
	  System.out.println(bar1.brand + " " + bar1.typeOfDrink + " " + bar1.price);
	  
	  System.out.println("Creating 2nd copy of bar");
	  Bar bar2 = new Bar("smirnoff", "brandi", 9000);
	  /*bar2.brand = "smirnoff";
	  bar2.typeOfDrink = "brandi";
	  bar2.price = 9000;*/
	  bar2.toDrink();
	  System.out.println(bar2.brand + " " + bar2.typeOfDrink + " " + bar2.price);
	  
	  System.out.println("Creating 3rd copy of bar");
	  Bar bar3 = new Bar("johnnie walker", "rum", 4000);
	  /*bar3.brand = "johnnie walker";
	  bar3.typeOfDrink = "rum";
	  bar3.price = 4000;*/
	  bar3.toDrink();
	  System.out.println(bar3.brand + " " + bar3.typeOfDrink + " " + bar3.price);
	  
	  System.out.println("Creating 4th copy of bar");
	  Bar bar4 = new Bar("sprite", "soft drinks", 50);
	  /*bar4.brand = "sprite";
	  bar4.typeOfDrink = "soft drinks";
	  bar4.price = 50;*/
	  bar4.toDrink();
	  System.out.println(bar4.brand + " " + bar4.typeOfDrink + " " + bar4.price);
	  
	  System.out.println("Creating 5th copy of bar");
	  Bar bar5 = new Bar("absolut", "vodka", 7000);
	  /*bar5.brand = "absolut";
	  bar5.typeOfDrink = "vodka";
	  bar5.price = 7000;*/
	  bar5.toDrink();
	  System.out.println(bar5.brand + " " + bar5.typeOfDrink + " " + bar5.price);
	  
	  System.out.println("Creating 6th copy of bar");
	  Bar bar6 = new Bar("captain morgan", "wine", 6000);
	  /*bar6.brand = "captain morgan";
	  bar6.typeOfDrink = "wine";
	  bar6.price = 6000;*/
	  bar6.toDrink();
	  System.out.println(bar6.brand + " " + bar6.typeOfDrink + " " + bar6.price);
	  
	  System.out.println("Creating 7th copy of bar");
	  Bar bar7 = new Bar("tequilla", "shots", 1500);
	  /*bar7.brand = "tequilla";
	  bar7.typeOfDrink = "shots";
	  bar7.price = 1500;*/
	  bar7.toDrink();
	  System.out.println(bar7.brand + " " + bar7.typeOfDrink + " " + bar7.price);
	  
	  System.out.println("Creating 8th copy of bar");
	  Bar bar8 = new Bar("tuborgg", "soda", 500);
	  /*bar8.brand = "tuborgg";
	  bar8.typeOfDrink = "soda";
	  bar8.price = 500;*/
	  bar8.toDrink();
	  System.out.println(bar8.brand + " " + bar8.typeOfDrink + " " + bar8.price);
	  
	  System.out.println("Creating 9th copy of bar");
	  Bar bar9 = new Bar("red bull", "energy drink", 700);
	  /*bar9.brand = "red bull";
	  bar9.typeOfDrink = "energy drink";
	  bar9.price = 700;*/
	  bar9.toDrink();
	  System.out.println(bar9.brand + " " + bar9.typeOfDrink + " " + bar9.price);
	  
	  System.out.println("Creating 10th copy of bar");
	  Bar bar10 = new Bar("Sting", "energy drink", 20);
	  /*bar10.brand = "Sting";
	  bar10.typeOfDrink = "energy drink";
	  bar10.price = 20;*/
	  bar10.toDrink();
	  System.out.println(bar10.brand + " " + bar10.typeOfDrink + " " + bar10.price);
}

}