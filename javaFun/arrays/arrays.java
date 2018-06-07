import java.util.ArrayList;
public class arrays{
  public static void main(String[] args){
   ArrayList<String> dynamicArray = new ArrayList<String>();
   dynamicArray.add("r");
   dynamicArray.add("o");
   dynamicArray.add("y");

  //  for (int i=0; i< dynamicArray.size(); i++){
  //    String name = dynamicArray.get(i);
  //    System.out.println("hello " + name);
  //  }

  for (String name: dynamicArray){
    System.out.println("hello " + name);
  }

  }
  
}