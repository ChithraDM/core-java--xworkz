class ToysTester{

public static void main(String play[]){
   
	  System.out.println("Creating first copy of toys");
	  Toys toys1 = new Toys();
	  toys1.name = "woody";
	  toys1.type = "wooden";
	  toys1.price = 400;
	  toys1.color = "brown";
	  toys1.play();
	  System.out.println(toys1.name + " " + toys1.type + " " + toys1.price + " " + toys1.color);
	  
	  System.out.println("Creating second copy of toys");
	  Toys toys2 = new Toys();
	  toys2.name = "barbie";
	  toys2.type = "plastic";
	  toys2.price = 430;
	  toys2.color = "pink";
	  toys2.play();
	  System.out.println(toys2.name + " " + toys2.type + " " + toys2.price + " " + toys2.color);
	  
	  System.out.println("Creating third copy of toys");
	  Toys toys3 = new Toys();
	  toys3.name = "slinky dog";
	  toys3.type = "plastic";
	  toys3.price = 4500;
	  toys3.color = "yellow";
	  toys3.play();
	  System.out.println(toys3.name + " " + toys3.type + " " + toys3.price + " " + toys3.color);
	  
	  System.out.println("Creating fourth copy of toys");
	  Toys toys4 = new Toys();
	  toys4.name = "doll";
	  toys4.type = "cloth";
	  toys4.price = 800;
	  toys4.color = "gray";
	  toys4.play();
	  System.out.println(toys4.name + " " + toys4.type + " " + toys4.price + " " + toys4.color);
	  
	  System.out.println("Creating fifth copy of toys");
	  Toys toys5 = new Toys();
	  toys5.name = "teddy bear";
	  toys5.type = "fabric";
	  toys5.price = 600;
	  toys5.color = "brown with red";
	  toys5.play();
	  System.out.println(toys5.name + " " + toys5.type + " " + toys5.price + " " + toys5.color);
	  
	  System.out.println("Creating sixth copy of toys");
	  Toys toys6 = new Toys();
	  toys6.name = "jessie";
	  toys6.type = "cotton";
	  toys6.price = 560;
	  toys6.color = "black";
	  toys6.play();
	  System.out.println(toys6.name + " " + toys6.type + " " + toys6.price + " " + toys6.color);
	  
	  System.out.println("Creating seventh copy of toys");
	  Toys toys7 = new Toys();
	  toys7.name = "ball";
	  toys7.type = "leather";
	  toys7.price = 659;
	  toys7.color = "blue";
	  toys7.play();
	  System.out.println(toys7.name + " " + toys7.type + " " + toys7.price + " " + toys7.color);
	  
	  System.out.println("Creating eighth copy of toys");
	  Toys toys8 = new Toys();
	  toys8.name = "yoyo";
	  toys8.type = "leather";
	  toys8.price = 40;
	  toys8.color = "green";
	  toys8.play();
	  System.out.println(toys8.name + " " + toys8.type + " " + toys8.price + " " + toys8.color);
	  
	  System.out.println("Creating ninth copy of toys");
	  Toys toys9 = new Toys();
	  toys9.name = "kite";
	  toys9.type = "paper";
	  toys9.price = 50;
	  toys9.color = "parrot green";
	  toys9.play();
	  System.out.println(toys9.name + " " + toys9.type + " " + toys9.price + " " + toys9.color);
	  
	  System.out.println("Creating tenth copy of toys");
	  Toys toys10 = new Toys();
	  toys10.name = "lotso";
	  toys10.type = "cotton";
	  toys10.price = 700;
	  toys10.color = "purple";
	  toys10.play();
	  System.out.println(toys10.name + " " + toys10.type + " " + toys10.price + " " + toys10.color);
  }
}