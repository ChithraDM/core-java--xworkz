class HelmetTester{

public static void main(String helmet[]){
   
	  System.out.println("Creating first copy of helmet");
	  Helmet helmet1 = new Helmet("Vega", "10 years", 1500, "black");
	  /*helmet1.brand = "Vega";
	  helmet1.warranty = "10 years";
	  helmet1.price = 1500;
	  helmet1.color = "black";*/
	  helmet1.toSaveHead();
	  System.out.println(helmet1.brand + " " + helmet1.warranty + " " + helmet1.price + " " + helmet1.color);
	  
	  System.out.println("Creating second copy of helmet");
	  Helmet helmet2 = new Helmet("Steelbird", "9 years", 2000, "red with white");
	  /*helmet2.brand = "Steelbird";
	  helmet2.warranty = "9 years";
	  helmet2.price = 2000;
	  helmet2.color = "red with white";*/
	  helmet2.toSaveHead();
	  System.out.println(helmet2.brand + " " + helmet2.warranty + " " + helmet2.price + " " + helmet2.color);
	  
	  System.out.println("Creating third copy of helmet");
	  Helmet helmet3 = new Helmet("Vega Crux", "8 years", 1000, "dark blue");
	  /*helmet3.brand = "Vega Crux";
	  helmet3.warranty = "8 years";
	  helmet3.price = 1000;
	  helmet3.color = "dark blue";*/
	  helmet3.toSaveHead();
	  System.out.println(helmet3.brand + " " + helmet3.warranty + " " + helmet3.price + " " + helmet3.color);
	  
	  System.out.println("Creating fourth copy of helmet");
	  Helmet helmet4 = new Helmet("Vega Bolt", "12 years", 1800, "yellow");
	  /*helmet4.brand = "Vega Bolt";
	  helmet4.warranty = "12 years";
	  helmet4.price = 1800;
	  helmet4.color = "yellow";*/
	  helmet4.toSaveHead();
	  System.out.println(helmet4.brand + " " + helmet4.warranty + " " + helmet4.price + " " + helmet4.color);
	  
	  System.out.println("Creating fifth copy of helmet");
	  Helmet helmet5 = new Helmet("Steelbird SBA", "8 years", 1870, "red");
	  /*helmet5.brand = "Steelbird SBA";
	  helmet5.warranty = "8 years";
	  helmet5.price = 1870;
	  helmet5.color = "red";*/
	  helmet5.toSaveHead();
	  System.out.println(helmet5.brand + " " + helmet5.warranty + " " + helmet5.price + " " + helmet5.color);
	  
	  System.out.println("Creating sixth copy of helmet");
	  Helmet helmet6 = new Helmet("Vega City", "19 years", 3000, "black");
	  /*helmet6.brand = "Vega City";
	  helmet6.warranty = "19 years";
	  helmet6.price = 3000;
	  helmet6.color = "black";*/
	  helmet6.toSaveHead();
	  System.out.println(helmet6.brand + " " + helmet6.warranty + " " + helmet6.price + " " + helmet6.color);
	  
	  System.out.println("Creating seventh copy of helmet");
	  Helmet helmet7 = new Helmet("Studds", "18 years", 4000, "brown");
	  /*helmet7.brand = "Studds";
	  helmet7.warranty = "18 years";
	  helmet7.price = 4000;
	  helmet7.color = "brown";*/
	  helmet7.toSaveHead();
	  System.out.println(helmet7.brand + " " + helmet7.warranty + " " + helmet7.price + " " + helmet7.color);
	  
	  System.out.println("Creating eighth copy of helmet");
	  Helmet helmet8 = new Helmet("Ray", "11 years", 1890, "cherry red");
	  /*helmet8.brand = "Ray";
	  helmet8.warranty = "11 years";
	  helmet8.price = 1890;
	  helmet8.color = "cherry red";*/
	  helmet8.toSaveHead();
	  System.out.println(helmet8.brand + " " + helmet8.warranty + " " + helmet8.price + " " + helmet8.color);
	  
	  System.out.println("Creating ninth copy of helmet");
	  Helmet helmet9 = new Helmet("Vega Atom", "14 years", 2100, "orchid blue");
	  /*helmet9.brand = "Vega Atom";
	  helmet9.warranty = "14 years";
	  helmet9.price = 2100;
	  helmet9.color = "orchid blue";*/
	  helmet9.toSaveHead();
	  System.out.println(helmet9.brand + " " + helmet9.warranty + " " + helmet9.price + " " + helmet9.color);
	  
	  System.out.println("Creating tenth copy of helmet");
	  Helmet helmet10 = new Helmet("Steelbird SBH", "10 years", 767, "violet");
	  /*helmet10.brand = "Steelbird SBH";
	  helmet10.warranty = "10 years";
	  helmet10.price = 767;
	  helmet10.color = "violet";*/
	  helmet10.toSaveHead();
	  System.out.println(helmet10.brand + " " + helmet10.warranty + " " + helmet10.price + " " + helmet10.color);
	  
}

}