class Division 
{
 
 public static void main(String division[]){
 
 div(56,3);
 div(90,10);
 div(900,70);
 div(678,78);
 div(1000,1);
 div(869,90);
 div(789,88);
 div(1890,89);
 div(65,9);
 div(800,8);
 
 div(56,3,1);
 div(90,10,2);
 div(900,70,5);
 div(678,78,7);
 div(1000,100,9);
 div(869,90,7);
 div(789,88,5);
 div(1890,89,7);
 div(658,89,6);
 div(800,98,8);
 
 }
 public static void div(int c , int d) {
 System.out.println(c/d);
 }
 public static void div(int c , int d , int e) {
 System.out.println(c/d/e);
 }
 
}