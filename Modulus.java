class Modulus 
{
 
 public static void main(String modulus[]){
 
 mod(800,80);
 mod(112,8);
 mod(893,60);
 mod(900,900);
 mod(780,234);
 mod(789,70);
 mod(8000,980);
 mod(1000,1);
 mod(75,5);
 mod(756,863);
 
 mod(800,80,9);
 mod(112,8,7);
 mod(893,60,6);
 mod(900,90,8);
 mod(780,23,7);
 mod(789,70,8);
 mod(800,98,75);
 mod(100,17,4);
 mod(756,58,4);
 mod(756,86,9);
 }
 public static void mod(int e , int f) {
 System.out.println(e%f);
 }
 
 public static void mod(int e , int f , int g) {
 System.out.println(e%f%g);
 }
 
}