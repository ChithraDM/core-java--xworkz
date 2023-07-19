class MusicalInstruments{
	
	/*public MusicalInstruments() {
		System.out.println("MusicalInstruments Constructor is invoked");
	}*/
	
  String name;
  String music_played_using;
  int price;
  String color;
  
  public MusicalInstruments(String name , String music_played_using , int price , String color){   
	   this.name = name ;
	   this.music_played_using = music_played_using;
	   this.price = price;
	   this.color = color;
	   System.out.println("Parameterized MusicalInstruments constructor is invoked");
   }
  
  public void playMusic(){
  System.out.println("We can play music using musical instruments");
  }
}