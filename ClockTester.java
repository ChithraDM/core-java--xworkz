class ClockTester{

public static void main(String time[]){
   
	  System.out.println("Creating first copy of clock");
	  Clock clock1 = new Clock("Plastic", "1 year", 4000, "navy black");
	  /*clock1.type = "Plastic";
	  clock1.warranty = "1 year";
	  clock1.price = 4000;
	  clock1.color = "navy black";*/
	  clock1.knowTheTime();
	  System.out.println(clock1.type + " " + clock1.warranty + " " + clock1.price + " " + clock1.color);
	  
	  System.out.println("Creating second copy of clock");
	  Clock clock2 = new Clock("steel", "2 years", 5000, "navy blue");
	  /*clock2.type = "Steel";
	  clock2.warranty = "2 years";
	  clock2.price = 5000;
	  clock2.color = "navy blue";*/
	  clock2.knowTheTime();
	  System.out.println(clock2.type + " " + clock2.warranty + " " + clock2.price + " " + clock2.color);
	  
	  System.out.println("Creating third copy of clock");
	  Clock clock3 = new Clock("Copper", "5 years", 1200, "white");
	  /*clock3.type = "Copper";
	  clock3.warranty = "5 years";
	  clock3.price = 1200;
	  clock3.color = "white";*/
	  clock3.knowTheTime();
	  System.out.println(clock3.type + " " + clock3.warranty + " " + clock3.price + " " + clock3.color);
	  
	  System.out.println("Creating fourth copy of clock");
	  Clock clock4 = new Clock("Glass", "1 year", 6000, "sky blue");
	  /*clock4.type = "Glass";
	  clock4.warranty = "1 year";
	  clock4.price = 6000;
	  clock4.color = "sky blue";*/
	  clock4.knowTheTime();
	  System.out.println(clock4.type + " " + clock4.warranty + " " + clock4.price + " " + clock4.color);
	  
	  System.out.println("Creating fifth copy of clock");
	  Clock clock5 = new Clock("Bronze", "6 years", 10000, "brown");
	  /*clock5.type = "Bronze";
	  clock5.warranty = "6 years";
	  clock5.price = 10000;
	  clock5.color = "brown";*/
	  clock5.knowTheTime();
	  System.out.println(clock5.type + " " + clock5.warranty + " " + clock5.price + " " + clock5.color);
	  
	  System.out.println("Creating sixth copy of clock");
	  Clock clock6 = new Clock("Quartz", "3 years", 5000, "dark brown");
	  /*clock6.type = "Quartz";
	  clock6.warranty = "3 years";
	  clock6.price = 5000;
	  clock6.color = "dark brown";*/
	  clock6.knowTheTime();
	  System.out.println(clock6.type + " " + clock6.warranty + " " + clock6.price + " " + clock6.color);
	  
	  System.out.println("Creating seventh copy of clock");
	  Clock clock7 = new Clock("Plastic", "1 year", 1300, "green");
	  /*clock7.type = "Plastic";
	  clock7.warranty = "1 year";
	  clock7.price = 1300;
	  clock7.color = "green";*/
	  clock7.knowTheTime();
	  System.out.println(clock7.type + " " + clock7.warranty + " " + clock7.price + " " + clock7.color);
	  
	  System.out.println("Creating eighth copy of clock");
	  Clock clock8 = new Clock("silver", "10 years", 40000, "dense white");
	  /*clock8.type = "silver";
	  clock8.warranty = "10 years";
	  clock8.price = 40000;
	  clock8.color = "dense white";*/
	  clock8.knowTheTime();
	  System.out.println(clock8.type + " " + clock8.warranty + " " + clock8.price + " " + clock8.color);
	  
	  System.out.println("Creating ninth copy of clock");
	  Clock clock9 = new Clock("white metal", "9 years", 14000, "navy blue");
	  /*clock9.type = "white metal";
	  clock9.warranty = "9 years";
	  clock9.price = 14000;
	  clock9.color = "navy blue";*/
	  clock9.knowTheTime();
	  System.out.println(clock9.type + " " + clock9.warranty + " " + clock9.price + " " + clock9.color);
	  
	  System.out.println("Creating tenth copy of clock");
	  Clock clock10 = new Clock("steel", "9 years", 8000, "light black");
	  /*clock10.type = "steel";
	  clock10.warranty = "9 years";
	  clock10.price = 8000;
	  clock10.color = "light black";*/
	  clock10.knowTheTime();
	  System.out.println(clock10.type + " " + clock10.warranty + " " + clock10.price + " " + clock10.color);
}
}