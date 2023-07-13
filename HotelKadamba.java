class HotelKadamba {
 //50 items
 //static String foodMenus[] = {"Frenh fries", "Garlic bread", "Chiili cheese toast", "chilli garlic toast", "garlic bread", "garlic bread with cheese", "plain sandwich", "grilled sandwich", "club sandwich", "russian salad", "veg burger", "macrcroni hotpot", "veg augratin", "pasta spicy tomato", "pasta in twin sauce", "plain cheese pizza", "capsicum onion pizza", "tomato pizza", "mushroom pizza", "jain special pizza", "tandoori pizza", "super veggie pizza", "extra cheese toppings", "lasanana roll", "paneer salsa wrap", "lebenese fala fel", "hot and sour soup", "lemon soup", "veg noodle soup", "sweet corn soup", "veg munchow soup", "veg clear soup", "spring roll", "chilly paneer dry", "veg manchurian dry", "potatoes in honey", "fried veg in salt", "crispy spinach", "chilly mushroom dry", "veg chopsouey", "chilly paneer gravy", "manchurian gravy", "sweet and sour soup", "mix veg in hot garlic sauce", "shreded potato sauce", "veg hakka noodles", "chilli garlic noodles", "pan fried noodles", "gravy noodles", "veg fried rice", "chilly garlic rice" };
  
  public static void main(String hotel[]){
	  
	  String foodMenus[] = {"Frenh fries", "Garlic bread", "Chiili cheese toast", "chilli garlic toast", "garlic bread", "garlic bread with cheese", 
	  "plain sandwich", "grilled sandwich", "club sandwich", "russian salad", "veg burger", "macrcroni hotpot", "veg augratin", "pasta spicy tomato", 
	  "pasta in twin sauce", "plain cheese pizza", "capsicum onion pizza", "tomato pizza", "mushroom pizza", "jain special pizza", "tandoori pizza", 
	  "super veggie pizza", "extra cheese toppings", "lasanana roll", "paneer salsa wrap", "lebenese fala fel", "hot and sour soup", "lemon soup", 
	  "veg noodle soup", "sweet corn soup", "veg munchow soup", "veg clear soup", "spring roll", "chilly paneer dry", "veg manchurian dry", 
	  "potatoes in honey", "fried veg in salt", "crispy spinach", "chilly mushroom dry", "veg chopsouey", "chilly paneer gravy", "manchurian gravy", 
	  "sweet and sour soup", "mix veg in hot garlic sauce", "shreded potato sauce", "veg hakka noodles", "chilli garlic noodles", "pan fried noodles", 
	  "gravy noodles", "veg fried rice", "chilly garlic rice" };
	 
	 //foreach
	//  for(String foodMenu: foodMenus) {
	//	  System.out.println(foodMenu);
	//  }
	getFoodMenus(foodMenus);
	   
  //System.out.println(foodMenu[0] + " " + foodMenu[1] + " " + foodMenu[2] + " " + foodMenu[3] + " " + foodMenu[4] + " " + foodMenu[5] + " " + foodMenu[6] + " " + foodMenu[7] + " " + foodMenu[8] + " "+ foodMenu[9] + " " + foodMenu[10] + " " + 
  //  foodMenu[11] + " " + foodMenu[12] + " " + foodMenu[13] + " " + foodMenu[14] + " " + foodMenu[15] + " " + foodMenu[16] + " " + foodMenu[17] + " " + foodMenu[18] + " "+ foodMenu[19] + " " + foodMenu[20] + " " +   
  //  foodMenu[21] + " " + foodMenu[22] + " " + foodMenu[23] + " " + foodMenu[24] + " " + foodMenu[25] + " " + foodMenu[26] + " " + foodMenu[27] + " " + foodMenu[28] + " "+ foodMenu[29] + " " + foodMenu[30] + " " +   
   // foodMenu[31] + " " + foodMenu[32] + " " + foodMenu[33] + " " + foodMenu[34] + " " + foodMenu[35] + " " + foodMenu[36] + " " + foodMenu[37] + " " + foodMenu[38] + " "+ foodMenu[39] + " " + foodMenu[40] + " " +   
   // foodMenu[41] + " " + foodMenu[42] + " " + foodMenu[43] + " " + foodMenu[44] + " " + foodMenu[45] + " " + foodMenu[46] + " " + foodMenu[47] + " " + foodMenu[48] + " "+ foodMenu[49]);
 
 
 }
    public static void getFoodMenus(String foodMenus[]){
		for(String foodMenu: foodMenus) {
		  System.out.println(foodMenu);
	  }
	}

 }