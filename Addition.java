class Addition 
{
 //method
 public static void main(String addition[]){
 //invoke logic(addition)
 add(56,78);
 add(112,456);
 add(89,67);
 add(678,890);
 add(780,234);
 add(690,900);
 add(800,980);
 add(1000,90);
 add(908,809);
 add(756,863);
 //method overloading
 
 add(56,78,34);
 add(112,456,67);
 add(89,67,78);
 add(678,890,90);
 add(780,234,800);
 add(690,900,89);
 add(800,980,901);
 add(1000,90,78);
 add(908,809,863);
 add(756,863,72);
 }
 
 //method
 public static void add(int z , int u) {     //outside the main another method we created
 System.out.println(z+u);
 }
 public static void add(int z , int u , int y) {     //outside the main another method we created
 System.out.println(z+u+y);
 }
}