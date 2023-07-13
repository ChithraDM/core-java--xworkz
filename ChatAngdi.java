class ChatAngdi{

   public static void main(String chats[]){
	    String chatNames[]={"Pani Puri", "Samosa Masala", "Bhel Puri"};
   //invoke logic(methods)
   //argument
   getChatNames(chatNames);
   
   }
   
   public static void getChatNames(String chatNames[]){
	   System.out.println("Inside getChatNames");
	   for(String chatName:chatNames){
		   System.out.println(chatName);
	   }
   }
}