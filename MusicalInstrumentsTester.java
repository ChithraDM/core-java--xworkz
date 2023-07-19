class MusicalInstrumentsTester {
	
	public static void main(String music[]){
   
	  System.out.println("Creating first copy of musical instruments");
	  MusicalInstruments musicalInstruments1 = new MusicalInstruments("flute", "mouth", 200, "brown");
	  /*musicalInstruments1.name = "flute";
	  musicalInstruments1.music_played_using = "mouth";
	  musicalInstruments1.price = 200;
	  musicalInstruments1.color = "brown";*/
	  musicalInstruments1.playMusic();
	  System.out.println(musicalInstruments1.name + " " + musicalInstruments1.music_played_using + " " + musicalInstruments1.price + " " 
	  + musicalInstruments1.color);
	  
	  System.out.println("Creating second copy of musical instruments");
	  MusicalInstruments musicalInstruments2 = new MusicalInstruments("violin", "hands", 5000, "maroon");
	  /*musicalInstruments2.name = "violin";
	  musicalInstruments2.music_played_using = "hands";
	  musicalInstruments2.price = 5000;
	  musicalInstruments2.color = "maroon";*/
	  musicalInstruments2.playMusic();
	  System.out.println(musicalInstruments2.name + " " + musicalInstruments2.music_played_using + " " + musicalInstruments2.price + " " 
	  + musicalInstruments2.color);
	  
	  System.out.println("Creating third copy of musical instruments");
	  MusicalInstruments musicalInstruments3 = new MusicalInstruments("piano", "fingers", 50000, "white and black");
	  /*musicalInstruments3.name = "piano";
	  musicalInstruments3.music_played_using = "fingers";
	  musicalInstruments3.price = 50000;
	  musicalInstruments3.color = "white and black";*/
	  musicalInstruments3.playMusic();
	  System.out.println(musicalInstruments3.name + " " + musicalInstruments3.music_played_using + " " + musicalInstruments3.price + " " 
	  + musicalInstruments3.color);
	  
	  System.out.println("Creating fourth copy of musical instruments");
	  MusicalInstruments musicalInstruments4 = new MusicalInstruments("guitar", "hands", 6000, "gray");
	  /*musicalInstruments4.name = "guitar";
	  musicalInstruments4.music_played_using = "hands";
	  musicalInstruments4.price = 6000;
	  musicalInstruments4.color = "gray";*/
	  musicalInstruments4.playMusic();
	  System.out.println(musicalInstruments4.name + " " + musicalInstruments4.music_played_using + " " + musicalInstruments4.price + " " 
	  + musicalInstruments4.color);
	  
	  System.out.println("Creating fifth copy of musical instruments");
	  MusicalInstruments musicalInstruments5 = new MusicalInstruments("saxophone", "mouth", 12000, "gold");
	  /*musicalInstruments5.name = "saxophone";
	  musicalInstruments5.music_played_using = "mouth";
	  musicalInstruments5.price = 12000;
	  musicalInstruments5.color = "gold";*/
	  musicalInstruments1.playMusic();
	  System.out.println(musicalInstruments5.name + " " + musicalInstruments5.music_played_using + " " + musicalInstruments5.price + " " 
	  + musicalInstruments5.color);
	  
	  System.out.println("Creating sixth copy of musical instruments");
	  MusicalInstruments musicalInstruments6 = new MusicalInstruments("drum", "drum sticks", 5800, "red");
	  /*musicalInstruments6.name = "drum";
	  musicalInstruments6.music_played_using = "drum sticks";
	  musicalInstruments6.price = 5800;
	  musicalInstruments6.color = "red";*/
	  musicalInstruments6.playMusic();
	  System.out.println(musicalInstruments6.name + " " + musicalInstruments6.music_played_using + " " + musicalInstruments6.price + " " 
	  + musicalInstruments6.color);
	  
	  System.out.println("Creating seventh copy of musical instruments");
	  MusicalInstruments musicalInstruments7 = new MusicalInstruments("xylophone", "hands", 2000, "multi color");
	  /*musicalInstruments7.name = "xylophone";
	  musicalInstruments7.music_played_using = "hands";
	  musicalInstruments7.price = 2000;
	  musicalInstruments7.color = "multi color";*/
	  musicalInstruments7.playMusic();
	  System.out.println(musicalInstruments7.name + " " + musicalInstruments7.music_played_using + " " + musicalInstruments7.price + " " 
	  + musicalInstruments7.color);
	  
	  System.out.println("Creating eighth copy of musical instruments");
	  MusicalInstruments musicalInstruments8 = new MusicalInstruments("clarinet", "mouth", 8000, "black");
	  /*musicalInstruments8.name = "clarinet";
	  musicalInstruments8.music_played_using = "mouth";
	  musicalInstruments8.price = 8000;
	  musicalInstruments8.color = "black";*/
	  musicalInstruments8.playMusic();
	  System.out.println(musicalInstruments8.name + " " + musicalInstruments8.music_played_using + " " + musicalInstruments8.price + " " 
	  + musicalInstruments8.color);
	  
	  System.out.println("Creating ninth copy of musical instruments");
	  MusicalInstruments musicalInstruments9 = new MusicalInstruments("sitar", "hands", 23000, "lite brown");
	  /*musicalInstruments9.name = "sitar";
	  musicalInstruments9.music_played_using = "hands";
	  musicalInstruments9.price = 23000;
	  musicalInstruments9.color = "lite brown";*/
	  musicalInstruments9.playMusic();
	  System.out.println(musicalInstruments9.name + " " + musicalInstruments9.music_played_using + " " + musicalInstruments9.price + " " 
	  + musicalInstruments9.color);
	  
	  System.out.println("Creating tenth copy of musical instruments");
	  MusicalInstruments musicalInstruments10 = new MusicalInstruments("maracas", "two hands", 1000, "yellow");
	  /*musicalInstruments10.name = "maracas";
	  musicalInstruments10.music_played_using = "two hands";
	  musicalInstruments10.price = 1000;
	  musicalInstruments10.color = "yellow";*/
	  musicalInstruments10.playMusic();
	  System.out.println(musicalInstruments10.name + " " + musicalInstruments10.music_played_using + " " + musicalInstruments10.price + " " 
	  + musicalInstruments10.color);
}
}