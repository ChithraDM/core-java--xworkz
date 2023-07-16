class ChairTester{

   public static void main(String s[]){
   //Object creation in java
   //syntax of object : ClassName referenceVariable = new ClassName();
   System.out.println("Creating first copy of a chair");
   Chair chair = new Chair();
   chair.name = "Nirmala";
   chair.type = "plastic";
   chair.color = "cream";
   chair.price = 300.00;
   chair.toSit();
   System.out.println(chair.name + " " + chair.type + " " + chair.color + " " + chair.price);
   
   System.out.println("Creating second copy of a chair");
   Chair chair1 = new Chair();
   chair1.name = "Nirmala";
   chair1.type = "steel";
   chair1.color = "black";
   chair1.price = 670.00;
   chair1.toSit();       //We use reference variable or object to access instance variables.
   System.out.println(chair1.name + " " + chair1.type + " " + chair1.color + " " + chair1.price);
   
   System.out.println("Creating third copy of a chair");
   Chair chair2 = new Chair();
   chair2.name = "Kamala";
   chair2.type = "wooden";
   chair2.color = "blue";
   chair2.price = 390.00;
   chair.toSit();
   System.out.println(chair2.name + " " + chair2.type + " " + chair2.color + " " + chair2.price);
   }
}