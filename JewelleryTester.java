class JewelleryTester{

public static void main(String jewellery[]){
   
	  System.out.println("Creating first copy of jewellery");
	  Jewellery jewellery1 = new Jewellery("navdeep", "gold", 55000, "necklace");
	  /*jewellery1.shopName = "navdeep";
	  jewellery1.metalUsed = "gold";
	  jewellery1.price = 55000;
	  jewellery1.typeOfJewellery = "necklace";*/
	  jewellery1.toWear();
	  System.out.println(jewellery1.shopName + " " + jewellery1.metalUsed + " " + jewellery1.price + " " + jewellery1.typeOfJewellery);
	  
	  System.out.println("Creating second copy of jewellery");
	  Jewellery jewellery2 = new Jewellery("malbaar gold", "gold", 155000, "bracelet");
	  /*jewellery2.shopName = "malbaar gold";
	  jewellery2.metalUsed = "gold";
	  jewellery2.price = 155000;
	  jewellery2.typeOfJewellery = "bracelet";*/
	  jewellery2.toWear();
	  System.out.println(jewellery2.shopName + " " + jewellery2.metalUsed + " " + jewellery2.price + " " + jewellery2.typeOfJewellery);
	  
	  System.out.println("Creating third copy of jewellery");
	  Jewellery jewellery3 = new Jewellery("kalyaan", "silver", 3000, "chain");
	  /*jewellery3.shopName = "kalyaan";
	  jewellery3.metalUsed = "silver";
	  jewellery3.price = 3000;
	  jewellery3.typeOfJewellery = "chain";*/
	  jewellery3.toWear();
	  System.out.println(jewellery3.shopName + " " + jewellery3.metalUsed + " " + jewellery3.price + " " + jewellery3.typeOfJewellery);
	  
	  System.out.println("Creating fourth copy of jewellery");
	  Jewellery jewellery4 = new Jewellery("khazaana", "diamond", 100000, "ring");
	  /*jewellery4.shopName = "khazaana";
	  jewellery4.metalUsed = "diamond";
	  jewellery4.price = 100000;
	  jewellery4.typeOfJewellery = "ring";*/
	  jewellery4.toWear();
	  System.out.println(jewellery4.shopName + " " + jewellery4.metalUsed + " " + jewellery4.price + " " + jewellery4.typeOfJewellery);
	  
	  System.out.println("Creating fifth copy of jewellery");
	  Jewellery jewellery5 = new Jewellery("raj kamal", "brass", 14500, "bangles");
	  /*jewellery5.shopName = "raj kamal";
	  jewellery5.metalUsed = "brass";
	  jewellery5.price = 14500;
	  jewellery5.typeOfJewellery = "bangles";*/
	  jewellery5.toWear();
	  System.out.println(jewellery5.shopName + " " + jewellery5.metalUsed + " " + jewellery5.price + " " + jewellery5.typeOfJewellery);
	  
	  System.out.println("Creating sixth copy of jewellery");
	  Jewellery jewellery6 = new Jewellery("raamdev", "copper", 6000, "chocker");
	  /*jewellery6.shopName = "raamdev";
	  jewellery6.metalUsed = "copper";
	  jewellery6.price = 6000;
	  jewellery6.typeOfJewellery = "chocker";*/
	  jewellery6.toWear();
	  System.out.println(jewellery6.shopName + " " + jewellery6.metalUsed + " " + jewellery6.price + " " + jewellery6.typeOfJewellery);
	  
	  System.out.println("Creating seventh copy of jewellery");
	  Jewellery jewellery7 = new Jewellery("pooja", "rhodium", 19000, "earrings");
	  /*jewellery7.shopName = "pooja";
	  jewellery7.metalUsed = "rhodium";
	  jewellery7.price = 19000;
	  jewellery7.typeOfJewellery = "earrings";*/
	  jewellery7.toWear();
	  System.out.println(jewellery7.shopName + " " + jewellery7.metalUsed + " " + jewellery7.price + " " + jewellery7.typeOfJewellery);
	  
	  System.out.println("Creating eighth copy of jewellery");
	  Jewellery jewellery8 = new Jewellery("rajkumar", "platinum", 1555000, "jhumka");
	  /*jewellery8.shopName = "rajkumar";
	  jewellery8.metalUsed = "platinum";
	  jewellery8.price = 1555000;
	  jewellery8.typeOfJewellery = "jhumka";*/
	  jewellery8.toWear();
	  System.out.println(jewellery8.shopName + " " + jewellery8.metalUsed + " " + jewellery8.price + " " + jewellery8.typeOfJewellery);
	  
	  System.out.println("Creating ninth copy of jewellery");
	  Jewellery jewellery9 = new Jewellery("chowdary", "aluminium", 80000, "anklet");
	  /*jewellery9.shopName = "chowdary";
	  jewellery9.metalUsed = "aluminium";
	  jewellery9.price = 80000;
	  jewellery9.typeOfJewellery = "anklet";*/
	  jewellery9.toWear();
	  System.out.println(jewellery9.shopName + " " + jewellery9.metalUsed + " " + jewellery9.price + " " + jewellery9.typeOfJewellery);
	  
	  System.out.println("Creating tenth copy of jewellery");
	  Jewellery jewellery10 = new Jewellery("pavan", "white metal", 18500, "pendent");
	  /*jewellery10.shopName = "pavan";
	  jewellery10.metalUsed = "white metal";
	  jewellery10.price = 18500;
	  jewellery10.typeOfJewellery = "pendent";*/
	  jewellery10.toWear();
	  System.out.println(jewellery10.shopName + " " + jewellery10.metalUsed + " " + jewellery10.price + " " + jewellery10.typeOfJewellery);
}
}