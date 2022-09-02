import java.util.*;

class Main {
  public static void main(String[] args) {
    ArrayDeque<String> stack = new ArrayDeque<>();
    stack.push("Apple");
    stack.push("Banana");
    stack.push("Cherry");
      
    System.out.println(stack.peek()); //returns cherry

    ArrayDeque<Integer> stack1 = new ArrayDeque<>(); //create stack1
    for (int i = 0; i <=10; i ++){
    stack1.push(i);
    }while (!stack1.isEmpty()){
    System.out.println(stack1.pop());
}    
}
}