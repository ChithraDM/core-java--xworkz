class RocketTester{

public static void main(String rocket[]){
   
	  System.out.println("Creating 1st copy of rocket");
	  Rocket rocket1 = new Rocket("Space Launch System","liquid hydrogen" , 11000);
	  /*rocket1.name = "Space Launch System";
	  rocket1.propellants = "liquid hydrogen";
	  rocket1.speedInMph = 11000;*/
	  rocket1.toLaunchRockets();
	  System.out.println(rocket1.name + " " + rocket1.propellants + " " + rocket1.speedInMph);
	  
	  System.out.println("Creating 2nd copy of rocket");
	  Rocket rocket2 = new Rocket("Electron","liquid oxygen",10500);
	  /*rocket2.name = "Electron";
	  rocket2.propellants = "liquid oxygen";
	  rocket2.speedInMph = 10500;*/
	  rocket2.toLaunchRockets();
	  System.out.println(rocket2.name + " " + rocket2.propellants + " " + rocket2.speedInMph);
	  
	  System.out.println("Creating 3rd copy of rocket");
	  Rocket rocket3 = new Rocket("Long March 5","hydrazine",11500);
	  /*rocket3.name = "Long March 5";
	  rocket3.propellants = "hydrazine";
	  rocket3.speedInMph = 11500;*/
	  rocket3.toLaunchRockets();
	  System.out.println(rocket3.name + " " + rocket3.propellants + " " + rocket3.speedInMph);
	  
	  System.out.println("Creating 4th copy of rocket");
	  Rocket rocket4 = new Rocket("Vega","RP-1",15000);
	  /*rocket4.name = "Vega";
	  rocket4.propellants = "RP-1";
	  rocket4.speedInMph = 15000;*/
	  rocket4.toLaunchRockets();
	  System.out.println(rocket4.name + " " + rocket4.propellants + " " + rocket4.speedInMph);
	  
	  System.out.println("Creating 5th copy of rocket");
	  Rocket rocket5 = new Rocket("Antares", "nitric acid", 11100);
	  /*rocket5.name = "Antares";
	  rocket5.propellants = "nitric acid";
	  rocket5.speedInMph = 11100;*/
	  rocket5.toLaunchRockets();
	  System.out.println(rocket5.name + " " + rocket5.propellants + " " + rocket5.speedInMph);
	  
	  System.out.println("Creating 6th copy of rocket");
	  Rocket rocket6 = new Rocket("Rokot", "fluorine", 12000);
	  /*rocket6.name = "Rokot";
	  rocket6.propellants = "fluorine";
	  rocket6.speedInMph = 12000;*/
	  rocket6.toLaunchRockets();
	  System.out.println(rocket6.name + " " + rocket6.propellants + " " + rocket6.speedInMph);
	  
	  System.out.println("Creating 7th copy of rocket");
	  Rocket rocket7 = new Rocket("Simorgh", "aerozine 50", 10300);
	  /*rocket7.name = "Simorgh";
	  rocket7.propellants = "aerozine 50";
	  rocket7.speedInMph = 10300;*/
	  rocket7.toLaunchRockets();
	  System.out.println(rocket7.name + " " + rocket7.propellants + " " + rocket7.speedInMph);
	  
	  System.out.println("Creating 8th copy of rocket");
	  Rocket rocket8 = new Rocket("Diamant", "kerosene", 13100);
	  /*rocket8.name = "Diamant";
	  rocket8.propellants = "kerosene";
	  rocket8.speedInMph = 13100;*/
	  rocket8.toLaunchRockets();
	  System.out.println(rocket8.name + " " + rocket8.propellants + " " + rocket8.speedInMph);
	  
	  System.out.println("Creating 9th copy of rocket");
	  Rocket rocket9 = new Rocket("Juno II", "ethanol", 11400);
	  /*rocket9.name = "Juno II";
	  rocket9.propellants = "ethanol";
	  rocket9.speedInMph = 11400;*/
	  rocket9.toLaunchRockets();
	  System.out.println(rocket9.name + " " + rocket9.propellants + " " + rocket9.speedInMph);
	  
	  System.out.println("Creating 10th copy of rocket");
	  Rocket rocket10 = new Rocket("VLS-1", "syntin", 10100);
	  /*rocket10.name = "VLS-1";
	  rocket10.propellants = "syntin";
	  rocket10.speedInMph = 10100;*/
	  rocket10.toLaunchRockets();
	  System.out.println(rocket10.name + " " + rocket10.propellants + " " + rocket10.speedInMph);
}

}