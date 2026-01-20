//Md Aftab Raza Ansari 12005279
//code 10
//Stream processig in JAVA
//the map method





import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.collectors;
pubic class Test4{
    
    public static void main(String[] args) {
        List<Integer>numbers = Arrays.asList(12,-44,19,21,-55,77);
        //creteria : num <0
        //List<Integer> result = numbers.stream().filter(e-> e<0).collect(Collectors.toList());
        //System.out.println(result);
        List<Object>mylist = Arrays.asList(true,100,"hello",200,flase,"welcome",300,true,false);
        List<Object>result = mylist.stream().filter(e->e.getClass().getSimpleName()equals("Integer")).
             collect(Collectors.toList());
              System.out.println(result);
              mylist.forEach(m->{
                  System.out.println(m+" -> "+.getClass().get());
                  
              });
              int totalIntegers = List<Object>result = mylist.stream().filter(e->e.getClass().getSimpleName()equals("Integer")).count();
              System.out.println("Total Integer"+totalIntegers);
              List<String>colors  = Arrays.asList("red","green","orange","green","red");
              List<String>result2 = colors.stream().map(e->.toUpperCase()).distinct().collect(Collectors.toList());
              System.out.println(result2); 
    }
    
    
}
 
