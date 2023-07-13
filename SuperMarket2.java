class SuperMarket2{
	
//array variable
//store 5 vegetables
  static String vegetables[] = {"Potato" , "Carrot" , "Beans" , "Brinjal","Onion"};
//biscuits-10
  static String biscuits[] = {"ParleG" , "Chaska maska" , "Tiger" , "Unibic" , "Goodday" , "Googly" , "Hide and seek" , "Britania Treat" , 
  "Marigold" , "Sunfeast"};
//perfumes-10
  static String perfumes[] = {"Lotus" , "Ajmal" , "Fogg" , "Eva" , "Axe" , "Tommy girl", "Shine" , "Engage" , "Mysore Sandal" , "Spinz"};
//groceries-10
  static String groceries[] = {"Rice" ,"Ragi" , "Moongdal" , "Green gram" , "Pepper" , "Sugar" , "Salt" , "Horse gram" , "Coffee powder" , 
  "Sunpure oil"};
//cosmetics-25
  static String cosmetics[] = {"Sun screen" , "Primer" , "Eyeliner" , "Lipstick" , "Foundation" , "Moisturizer" , "Mascara" , "Eye shadow" , 
  "Kajal" , "Concealer" , "Compact" , "Lip gloss" , "Nail polish" , "Blush" , "Lip Liner" , "Gel" , "Cream" , "Lotion" , "Lip balm" ,"Face powder" ,
  "Highlighter" , "Nail polish remover" , "Nail extension" , "perfume" , "Toner"};
  
  public static void main(String Market[]) {
	  System.out.println("Main started");
	  System.out.println("==========================");
	  System.out.println("List of Vegetables are:");
	  //for(String vegetable: vegetables) {
	  //  System.out.println(vegetable);
	  // }
	 getVegetables();
	  
		
	  //System.out.println(vegetables[0] + " " + vegetables[1] + " " + vegetables[2] + " " + vegetables[3] + " " + vegetables[4] );
	  System.out.println("==========================");
	  
	  System.out.println("List of biscuits are:");
	  //for(String biscuit: biscuits) {
		//  System.out.println(biscuit);
	 // }
	 getBiscuits();
		
	  //System.out.println(biscuits[0] + " " + biscuits[1] + " " + biscuits[2] + " " + biscuits[3] + " " + biscuits[4] + " " + biscuits[5] + " " + biscuits[6] + " " + biscuits[7] + " " + biscuits[8] + " " + biscuits[9] );
	  System.out.println("==========================");
	  
	  System.out.println("List of perfumes are:");
	  //for(String perfume: perfumes) {
		//  System.out.println(perfume);
	 // }
	 getPerfumes();
		
	  //System.out.println(perfumes[0] + " " + perfumes[1] + " " + perfumes[2] + " " + perfumes[3] + " " + perfumes[4] + " " + perfumes[5] + " " + perfumes[6] + " " + perfumes[7] + " " + perfumes[8] + " " + perfumes[9] );
	  System.out.println("==========================");
	 
	  System.out.println("List of groceries are:");
	  //for(String grocery: groceries) {
		//  System.out.println(grocery);
	 // }
	 getGroceries();
		
	  //System.out.println(groceries[0] + " " + groceries[1] + " " + groceries[2] + " " + groceries[3] + " " + groceries[4] + " " + groceries[5] + " " + groceries[6] + " " + groceries[7] + " " +groceries[8] + " " + groceries[9] );
	  System.out.println("==========================");
	  
	  System.out.println("List of Cosmetics are:");
	  //for(String cosmetic: cosmetics) {
		//  System.out.println(cosmetic);
	 // }
	 fetchCosmetics();
		
	  //System.out.println(cosmetics[0] + " " + cosmetics[1] + " " + cosmetics[2] + " " + cosmetics[3] + " " + cosmetics[4] + " " + cosmetics[5] + " " + cosmetics[6] + " " + cosmetics[7] + " " +cosmetics[8] + " " + cosmetics[9] + " " + cosmetics[10] + " " + cosmetics[11] + " " + cosmetics[12] + " " + cosmetics[13] + " " + cosmetics[14] + " " + cosmetics[15] + " " + cosmetics[16] + " " + cosmetics[17] + " " +cosmetics[18] + " " + cosmetics[19]+ " " + cosmetics[20] + " " + cosmetics[21] + " " + cosmetics[22] + " " + cosmetics[23] + " " + cosmetics[24] );

	  System.out.println("==========================");
	  
	  System.out.println("Main ended");
  
  }
  public static void getVegetables(){
	  System.out.println("Inside getVegetables");
	  for(String vegetable: vegetables) {
		  System.out.println(vegetable);
	  }
	  }
	  
	  public static void getBiscuits(){
	  System.out.println("Inside getBiscuits");
	  for(String biscuit: biscuits) {
		  System.out.println(biscuit);
	  }
	  }
	  
	  public static void getPerfumes(){
	  System.out.println("Inside getPerfumes");
	  for(String perfume: perfumes) {
		  System.out.println(perfume);
	  }
	  }
	  
	  public static void getGroceries(){
	  System.out.println("Inside getGroceries");
	  for(String grocery: groceries) {
		  System.out.println(grocery);
	  }
	  }
	  
	  public static void fetchCosmetics(){
	  System.out.println("Inside fetchCosmetics");
	  for(String cosmetic: cosmetics) {
		  System.out.println(cosmetic);
	  }
	  }
}
  