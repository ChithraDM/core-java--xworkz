class CricketMania {
//top10BatsMan
//top10IccTeamRankings {"India",""}
//iplTeamNames = {"Chennai Super Kings"}-10

 static String batsMans[] = { "Sachin Tendulkar", "Virat Kohli", "Sourav Ganguli", "Rahul Dravid", "David Warner", "Ishan Kishan" , "Chris Gayle" , "Mohammed Shami" , "Rashid khan" , "Mohit Sharma"};
 static String iccTeamRankings[] = {"Australia", "Pakistan", "India", "Newzealand", "England", "South Africa", "Bangladesh", "Afghanistan", "Sri Lanka", "West Indies"};
 static String iplTeamNames[] = {"Royal Challengers Bengaluru", "Chennai Super Kings","Kolkata Knight Riders", "Mumbai Indians", "Gujarat Titans", "Rajastan Royals", "Sunrisers Hyderabad", "Delhi Capitals", "Lucknow Super Giants", "Punjab kings" };
 
 public static void main(String Cricketmania[]) {
	  System.out.println("Main started");
	  System.out.println("==========================");
	  //foreach
	  for(String batsMan: batsMans) {
		  System.out.println(batsMan);
	  }
	  for(String iccTeamRanking: iccTeamRankings) {
		  System.out.println(iccTeamRanking);
	  }
	  for(String iplTeamName: iplTeamNames) {
		  System.out.println(iplTeamName);
	  }
	  
	  //System.out.println("List of top 10 batsMan are:");
	  //System.out.println(batsMan[0] + " " + batsMan[1] + " " + batsMan[2] + " " + batsMan[3] + " " + batsMan[4] + " " + batsMan[5] + " " + batsMan[6] + " " + batsMan[7] + " " + batsMan[8] + " " + batsMan[9] );
	  //System.out.println("==========================");
	  
	  //System.out.println("List of top 10 iccTeamRankings are:");
	  //System.out.println(iccTeamRankings[0] + " " + iccTeamRankings[1] + " " + iccTeamRankings[2] + " " + iccTeamRankings[3] + " " + iccTeamRankings[4] + " " + iccTeamRankings[5] + " " + iccTeamRankings[6] + " " + iccTeamRankings[7] + " " + iccTeamRankings[8] + " " + iccTeamRankings[9] );
	  //System.out.println("==========================");
	 
	  //System.out.println("List of top 10 iplTeamNames are:");
	  //System.out.println(iplTeamNames[0] + " " + iplTeamNames[1] + " " + iplTeamNames[2] + " " + iplTeamNames[3] + " " + iplTeamNames[4] + " " + iplTeamNames[5] + " " + iplTeamNames[6] + " " + iplTeamNames[7] + " " +iplTeamNames[8] + " " + iplTeamNames[9] );
	  //System.out.println("==========================");
 }
}
	  