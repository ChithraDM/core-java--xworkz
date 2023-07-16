class DoorTester{

   public static void main(String door[]){
   
	  System.out.println("Creating first copy of door");
	  Door door1 = new Door();
	  door1.type = "Wooden";
	  door1.warranty = "10 years";
	  door1.price = 10000;
	  door1.color = "black";
	  door1.comeInsideTheDoor();
	  System.out.println(door1.type + " " + door1.warranty + " " + door1.price + " " + door1.color);
	  
	  System.out.println("Creating second copy of door");
	  Door door2 = new Door();
	  door2.type = "Glass";
	  door2.warranty = "2 years";
	  door2.price = 3000;
	  door2.color = "brown";
	  door2.comeInsideTheDoor();
	  System.out.println(door2.type + " " + door2.warranty + " " + door2.price + " " + door2.color);
	  
	  System.out.println("Creating third copy of door");
	  Door door3 = new Door();
	  door3.type = "Iron";
	  door3.warranty = "12 years";
	  door3.price = 9000;
	  door3.color = "reddish black";
	  door3.comeInsideTheDoor();
	  System.out.println(door3.type + " " + door3.warranty + " " + door3.price + " " + door3.color);
	  
	  System.out.println("Creating fourth copy of door");
	  Door door4 = new Door();
	  door4.type = "Teak wood";
	  door4.warranty = "5 years";
	  door4.price = 8000;
	  door4.color = "dark blue";
	  door4.comeInsideTheDoor();
	  System.out.println(door4.type + " " + door4.warranty + " " + door4.price + " " + door4.color);
	  
	  System.out.println("Creating fifth copy of door");
	  Door door5 = new Door();
	  door5.type = "Fibre";
	  door5.warranty = "8 years";
	  door5.price = 7000;
	  door5.color = "brownish orange";
	  door5.comeInsideTheDoor();
	  System.out.println(door5.type + " " + door5.warranty + " " + door5.price + " " + door5.color);
	  
	  System.out.println("Creating sixth copy of door");
	  Door door6 = new Door();
	  door6.type = "Plastic";
	  door6.warranty = "4 years";
	  door6.price = 6000;
	  door6.color = "black";
	  door6.comeInsideTheDoor();
	  System.out.println(door6.type + " " + door6.warranty + " " + door6.price + " " + door6.color);
	  
	  System.out.println("Creating seventh copy of door");
	  Door door7 = new Door();
	  door7.type = "Silver";
	  door7.warranty = "30 years";
	  door7.price = 100000;
	  door7.color = "white";
	  door7.comeInsideTheDoor();
	  System.out.println(door7.type + " " + door7.warranty + " " + door7.price + " " + door7.color);
	  
	  System.out.println("Creating eighth copy of door");
	  Door door8 = new Door();
	  door8.type = "Golden";
	  door8.warranty = "50 years";
	  door8.price = 2500000;
	  door8.color = "gold";
	  door8.comeInsideTheDoor();
	  System.out.println(door8.type + " " + door8.warranty + " " + door8.price + " " + door8.color);
	  
	  System.out.println("Creating ninth copy of door");
	  Door door9 = new Door();
	  door9.type = "Plywood";
	  door9.warranty = "11 years";
	  door9.price = 11000;
	  door9.color = "dark purple";
	  door9.comeInsideTheDoor();
	  System.out.println(door9.type + " " + door9.warranty + " " + door9.price + " " + door9.color);
	  
	  System.out.println("Creating tenth copy of door");
	  Door door10 = new Door();
	  door10.type = "Copper";
	  door10.warranty = "40 years";
	  door10.price = 30000;
	  door10.color = "reddish brown";
	  door10.comeInsideTheDoor();
	  System.out.println(door10.type + " " + door10.warranty + " " + door10.price + " " + door10.color);
}
}