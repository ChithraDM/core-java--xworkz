class Multiplication 
{
 
 public static void main(String multiplication[]){
 //invoke multiplication
 mul(98,34);
 mul(112,478);
 mul(45,60);
 mul(500,500);
 mul(700,230);
 mul(567,900);
 mul(800,1000);
 mul(190,6);
 mul(80,60);
 mul(788,899);
 
 mul(98,34,89);
 mul(112,478,78);
 mul(45,60,340);
 mul(500,500,500);
 mul(700,230,99);
 mul(567,900,87);
 mul(800,1000,88);
 mul(190,6,9);
 mul(80,60,87);
 mul(788,899,66);
 }
 public static void mul(int a , int b) {
 System.out.println(a*b);
 }
 
 public static void mul(int a , int b, int c) {
 System.out.println(a*b*c);
 }
 
}