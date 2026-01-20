//Md Aftab Raza Ansari 12005279 jfs 3
//code 12
//How to create threads in java 





class worker extends Thread{
    public void run(){
        for (int i = 1;i<=10;i++){
             System.out.println("Hi! I am Thread...."+ new java.util.Date());
             try{
                   Thread.sleep(1000);
             }catch (InterruptedException e) {
                 e.printStackTrace();
             }
          
        }
       
    
    }
    
}
public class Test0 {
    public static void main(String args[]) {
     worker w1 = new worker();
     w1.start();

      
    }
}
