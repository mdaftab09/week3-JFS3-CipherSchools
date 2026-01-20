//Md Aftab Raza Ansari 12005279
//code 6
//Stream processig in JAVA
//the map method



interface mathX{
    void add(int n1, int n2);
}
 
public class Test3{
      public static void main(String[] args) {
         
          // case 2
          mathX obj = (int x,int y)->{
              System.out.println(x+y);
          };
          obj.add(10,20);
          
         
     }
}
   

