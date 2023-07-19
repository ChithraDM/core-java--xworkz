class BeveragesTester{
	
	public static void main(String beverages[]){
   
	  System.out.println("Creating first copy of beverages");
	  Beverages beverages1 = new Beverages("fanta", "orange", 95, "2 litres");
	  /*beverages1.brand = "fanta";
	  beverages1.flavour = "orange";
	  beverages1.price = 95;
	  beverages1.itemWeight = "2 litres";*/
	  beverages1.drinkBeverages();
	  System.out.println(beverages1.brand + " " + beverages1.flavour + " " + beverages1.price + " " + beverages1.itemWeight);

	  System.out.println("Creating second copy of beverages");
	  Beverages beverages2 = new Beverages("maaza", "mango", 85, "1 and half litres");
	  /*beverages2.brand = "maaza";
	  beverages2.flavour = "mango";
	  beverages2.price = 85;
	  beverages2.itemWeight = "1 and half litres";*/
	  beverages2.drinkBeverages();
	  System.out.println(beverages2.brand + " " + beverages2.flavour + " " + beverages2.price + " " + beverages2.itemWeight);
	  
	  System.out.println("Creating third copy of beverages");
	  Beverages beverages3 = new Beverages("tang", "mixed fruit", 80, "1 litre");
	  /*beverages3.brand = "tang";
	  beverages3.flavour = "mixed fruit";
	  beverages3.price = 80;
	  beverages3.itemWeight = "1 litre";*/
	  beverages3.drinkBeverages();
	  System.out.println(beverages3.brand + " " + beverages3.flavour + " " + beverages3.price + " " + beverages3.itemWeight);
	  
	  System.out.println("Creating fourth copy of beverages");
	  Beverages beverages4 = new Beverages("mountain dew", "apricot", 85, "half litres");
	  /*beverages4.brand = "mountain dew";
	  beverages4.flavour = "apricot";
	  beverages4.price = 85;
	  beverages4.itemWeight = "half litres";*/
	  beverages4.drinkBeverages();
	  System.out.println(beverages4.brand + " " + beverages4.flavour + " " + beverages4.price + " " + beverages4.itemWeight);
	  
	  System.out.println("Creating fifth copy of beverages");
	  Beverages beverages5 = new Beverages("minute maid", "lemon", 70, "2 litres");
	  /*beverages5.brand = "minute maid";
	  beverages5.flavour = "lemon";
	  beverages5.price = 70;
	  beverages5.itemWeight = "2 litres";*/
	  beverages5.drinkBeverages();
	  System.out.println(beverages5.brand + " " + beverages5.flavour + " " + beverages5.price + " " + beverages5.itemWeight);
	  
	  System.out.println("Creating sixth copy of beverages");
	  Beverages beverages6 = new Beverages("coca-cola", "vanilla", 65, "1 litre");
	  /*beverages6.brand = "coca-cola";
	  beverages6.flavour = "vanilla";
	  beverages6.price = 65;
	  beverages6.itemWeight = "1 litre";*/
	  beverages6.drinkBeverages();
	  System.out.println(beverages6.brand + " " + beverages6.flavour + " " + beverages6.price + " " + beverages6.itemWeight);
	  
	  System.out.println("Creating seventh copy of beverages");
	  Beverages beverages7 = new Beverages("limca", "lime", 95, "2 litres");
	  /*beverages7.brand = "limca";
	  beverages7.flavour = "lime";
	  beverages7.price = 95;
	  beverages7.itemWeight = "2 litres";*/
	  beverages7.drinkBeverages();
	  System.out.println(beverages7.brand + " " + beverages7.flavour + " " + beverages7.price + " " + beverages7.itemWeight);
	  
	  System.out.println("Creating eighth copy of beverages");
	  Beverages beverages8 = new Beverages("sprite", "soda", 95, "2 and half litres");
	  /*beverages8.brand = "sprite";
	  beverages8.flavour = "soda";
	  beverages8.price = 95;
	  beverages8.itemWeight = "2 and half litres";*/
	  beverages8.drinkBeverages();
	  System.out.println(beverages8.brand + " " + beverages8.flavour + " " + beverages8.price + " " + beverages8.itemWeight);
	  
	  System.out.println("Creating ninth copy of beverages");
	  Beverages beverages9 = new Beverages("mirinda", "orange", 95, "2 litres");
	  /*beverages9.brand = "mirinda";
	  beverages9.flavour = "orange";
	  beverages9.price = 95;
	  beverages9.itemWeight = "2 litres";*/
	  beverages9.drinkBeverages();
	  System.out.println(beverages9.brand + " " + beverages9.flavour + " " + beverages9.price + " " + beverages9.itemWeight);
	  
	  System.out.println("Creating tenth copy of beverages");
	  Beverages beverages10 = new Beverages("bindu", "jeera", 50, "1 litre");
	  /*beverages10.brand = "bindu";
	  beverages10.flavour = "jeera";
	  beverages10.price = 50;
	  beverages10.itemWeight = "1 litre";*/
	  beverages10.drinkBeverages();
	  System.out.println(beverages10.brand + " " + beverages10.flavour + " " + beverages10.price + " " + beverages10.itemWeight);
}

}