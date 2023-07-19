class SnacksTester{

  public static void main(String snack[]){
   
	  System.out.println("Creating first copy of snacks");
	  Snacks snacks1 = new Snacks("kurkure", "masala munch", 5, "30 g");
	  /*snacks1.brand = "kurkure";
	  snacks1.flavour = "masala munch";
	  snacks1.price = 5;
	  snacks1.itemWeight = "30 g";*/
	  snacks1.eatSnacks();
	  System.out.println(snacks1.brand + " " + snacks1.flavour + " " + snacks1.price + " " + snacks1.itemWeight);
	  
	  System.out.println("Creating second copy of snacks");
	  Snacks snacks2 = new Snacks("lays", "american  cream and onion", 20, "80 g");
	  /*snacks2.brand = "lays";
	  snacks2.flavour = "american cream and onion";
	  snacks2.price = 20;
	  snacks2.itemWeight = "80 g";*/
	  snacks2.eatSnacks();
	  System.out.println(snacks2.brand + " " + snacks2.flavour + " " + snacks2.price + " " + snacks2.itemWeight);
	  
	  System.out.println("Creating third copy of snacks");
	  Snacks snacks3 = new Snacks("bingo", "salt", 10, "45 g");
	  /*snacks3.brand = "bingo";
	  snacks3.flavour = "salt";
	  snacks3.price = 10;
	  snacks3.itemWeight = "45 g";*/
	  snacks3.eatSnacks();
	  System.out.println(snacks3.brand + " " + snacks3.flavour + " " + snacks3.price + " " + snacks3.itemWeight);
	  
	  System.out.println("Creating fourth copy of snacks");
	  Snacks snacks4 = new Snacks("jim jam", "strawberry", 40, "100 g");
	  /*snacks4.brand = "jim jam";
	  snacks4.flavour = "strawberry";
	  snacks4.price = 40;
	  snacks4.itemWeight = "100 g";*/
	  snacks4.eatSnacks();
	  System.out.println(snacks4.brand + " " + snacks4.flavour + " " + snacks4.price + " " + snacks4.itemWeight);
	  
	  System.out.println("Creating fifth copy of snacks");
	  Snacks snacks5 = new Snacks("fulltoss", "tomato", 50, "150 g");
	  /*snacks5.brand = "fulltoss";
	  snacks5.flavour = "tomato";
	  snacks5.price = 50;
	  snacks5.itemWeight = "150 g";*/
	  snacks5.eatSnacks();
	  System.out.println(snacks5.brand + " " + snacks5.flavour + " " + snacks5.price + " " + snacks5.itemWeight);
	  
	  System.out.println("Creating sixth copy of snacks");
	  Snacks snacks6 = new Snacks("taali", "hing jeera", 218, "600 g");
	  /*snacks6.brand = "taali";
	  snacks6.flavour = "hing jeera";
	  snacks6.price = 218;
	  snacks6.itemWeight = "600 g";*/
	  snacks6.eatSnacks();
	  System.out.println(snacks6.brand + " " + snacks6.flavour + " " + snacks6.price + " " + snacks6.itemWeight);
	  
	  System.out.println("Creating seventh copy of snacks");
	  Snacks snacks7 = new Snacks("britania", "orange", 5, "45 g");
	  /*snacks7.brand = "britania";
	  snacks7.flavour = "orange";
	  snacks7.price = 5;
	  snacks7.itemWeight = "45 g";*/
	  snacks7.eatSnacks();
	  System.out.println(snacks7.brand + " " + snacks7.flavour + " " + snacks7.price + " " + snacks7.itemWeight);
	  
	  System.out.println("Creating eighth copy of snacks");
	  Snacks snacks8 = new Snacks("tooyumm", "roasted garlic", 60, "150 g");
	  /*snacks8.brand = "tooyumm";
	  snacks8.flavour = "roasted garlic";
	  snacks8.price = 60;
	  snacks8.itemWeight = "150 g";*/
	  snacks8.eatSnacks();
	  System.out.println(snacks8.brand + " " + snacks8.flavour + " " + snacks8.price + " " + snacks8.itemWeight);
	  
	  System.out.println("Creating ninth copy of snacks");
	  Snacks snacks9 = new Snacks("dairymilk", "bubbly", 100, "90 g");
	  /*snacks9.brand = "dairymilk";
	  snacks9.flavour = "bubbly";
	  snacks9.price = 100;
	  snacks9.itemWeight = "90 g";*/
	  snacks9.eatSnacks();
	  System.out.println(snacks9.brand + " " + snacks9.flavour + " " + snacks9.price + " " + snacks9.itemWeight);
	  
	  System.out.println("Creating tenth copy of snacks");
	  Snacks snacks10 = new Snacks("googly", "jeera and sugar", 50, "100 g");
	  /*snacks10.brand = "googly";
	  snacks10.flavour = "jeera and sugar";
	  snacks10.price = 50;
	  snacks10.itemWeight = "100 g";*/
	  snacks10.eatSnacks();
	  System.out.println(snacks10.brand + " " + snacks10.flavour + " " + snacks10.price + " " + snacks10.itemWeight);
	  
}

}