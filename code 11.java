//Md Aftab Raza Ansari 12005279 jfs 3
//code 11
//How to create threads in java 





class worker extends Thread{
    public void run(){
        System.out.println("Hi! I am Thread....");
    
    }
    
}
public class Test0 {
    public static void main(String args[]) {
     worker w1 = new worker();
     w1.start();

      
    }
}
