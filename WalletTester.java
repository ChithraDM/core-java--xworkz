class WalletTester{

public static void main(String wallet[]){
   
	  System.out.println("Creating 1st copy of wallet");
	  Wallet wallet1 = new Wallet();
	  wallet1.materialType = "leather";
	  wallet1.warranty = "2 years";
	  wallet1.price = 500;
	  wallet1.noOfCompartments = 2;
	  wallet1.toStoreMoney();
	  System.out.println(wallet1.materialType + " " + wallet1.warranty + " " + wallet1.price + " " + wallet1.noOfCompartments);
	  
	  System.out.println("Creating 2nd copy of wallet");
	  Wallet wallet2 = new Wallet();
	  wallet2.materialType = "fabric";
	  wallet2.warranty = "3 years";
	  wallet2.price = 800;
	  wallet2.noOfCompartments = 4;
	  wallet2.toStoreMoney();
	  System.out.println(wallet2.materialType + " " + wallet2.warranty + " " + wallet2.price + " " + wallet2.noOfCompartments);
	  
	  System.out.println("Creating 3rd copy of wallet");
	  Wallet wallet3 = new Wallet();
	  wallet3.materialType = "cotton";
	  wallet3.warranty = "4 years";
	  wallet3.price = 700;
	  wallet3.noOfCompartments = 3;
	  wallet3.toStoreMoney();
	  System.out.println(wallet3.materialType + " " + wallet3.warranty + " " + wallet3.price + " " + wallet3.noOfCompartments);
	  
	  System.out.println("Creating 4th copy of wallet");
	  Wallet wallet4 = new Wallet();
	  wallet4.materialType = "nylon";
	  wallet4.warranty = "5 years";
	  wallet4.price = 845;
	  wallet4.noOfCompartments = 5;
	  wallet4.toStoreMoney();
	  System.out.println(wallet4.materialType + " " + wallet4.warranty + " " + wallet4.price + " " + wallet4.noOfCompartments);
	  
	  System.out.println("Creating 5th copy of wallet");
	  Wallet wallet5 = new Wallet();
	  wallet5.materialType = "rayon";
	  wallet5.warranty = "2 years";
	  wallet5.price = 900;
	  wallet5.noOfCompartments = 3;
	  wallet5.toStoreMoney();
	  System.out.println(wallet5.materialType + " " + wallet5.warranty + " " + wallet5.price + " " + wallet5.noOfCompartments);
	  
	  System.out.println("Creating 6th copy of wallet");
	  Wallet wallet6 = new Wallet();
	  wallet6.materialType = "leather";
	  wallet6.warranty = "4 years";
	  wallet6.price = 450;
	  wallet6.noOfCompartments = 2;
	  wallet6.toStoreMoney();
	  System.out.println(wallet6.materialType + " " + wallet6.warranty + " " + wallet6.price + " " + wallet6.noOfCompartments);
	  
	  System.out.println("Creating 7th copy of wallet");
	  Wallet wallet7 = new Wallet();
	  wallet7.materialType = "fabric";
	  wallet7.warranty = "5 years";
	  wallet7.price = 1500;
	  wallet7.noOfCompartments = 3;
	  wallet7.toStoreMoney();
	  System.out.println(wallet7.materialType + " " + wallet7.warranty + " " + wallet7.price + " " + wallet7.noOfCompartments);
	  
	  System.out.println("Creating 8th copy of wallet");
	  Wallet wallet8 = new Wallet();
	  wallet8.materialType = "leather";
	  wallet8.warranty = "6 years";
	  wallet8.price = 350;
	  wallet8.noOfCompartments = 4;
	  wallet8.toStoreMoney();
	  System.out.println(wallet8.materialType + " " + wallet8.warranty + " " + wallet8.price + " " + wallet8.noOfCompartments);
	  
	  System.out.println("Creating 9th copy of wallet");
	  Wallet wallet9 = new Wallet();
	  wallet9.materialType = "fabric";
	  wallet9.warranty = "4 years";
	  wallet9.price = 1800;
	  wallet9.noOfCompartments = 5;
	  wallet9.toStoreMoney();
	  System.out.println(wallet9.materialType + " " + wallet9.warranty + " " + wallet9.price + " " + wallet9.noOfCompartments);
	  
	  System.out.println("Creating 10th copy of wallet");
	  Wallet wallet10 = new Wallet();
	  wallet10.materialType = "leather";
	  wallet10.warranty = "5 years";
	  wallet10.price = 1570;
	  wallet10.noOfCompartments = 6;
	  wallet10.toStoreMoney();
	  System.out.println(wallet10.materialType + " " + wallet10.warranty + " " + wallet10.price + " " + wallet10.noOfCompartments);
}

}