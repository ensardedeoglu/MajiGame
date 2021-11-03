import java.util.*;
import java.util.Scanner; // Imports the scanner

public class Main { // main class

  public static void main(String[] args) {
    BoundedStack boundedStack = new BoundedStack();
    boundedStack.load(); //runs the load method
    boundedStack.pop(); //runs the pop method
    boundedStack.unload(); //runs the unload method
  }
}

class BoundedStack { // BoundedStack class contains methods

  private ArrayDeque<Double> doubleEndedQueue = new ArrayDeque<Double>(); //Creates new double Ended Queue

private int limit = 50; //We have a limit for input
  public void load() { //Load Method
    System.out.println("To exit the loop please enter 0.");//Exit command for user
    Scanner scanner = new Scanner(System.in);// get input from user
    while (true) { // while loop for getting input from user continually
      double input = scanner.nextDouble();
      if (input == 0.0) { // if the double Ended Queue is 0.0 the loop should end
        break;
      }
      if(doubleEndedQueue.size() >= limit){
        doubleEndedQueue.remove(); //removes the double Ended Queue most recently added value
      }
      doubleEndedQueue.add(input);
    }
    System.out.println("Loading completed");
  }

  public void pop(){ //Pop method
  if(doubleEndedQueue.isEmpty()){ //checking if the double Ended Queue is empty or not
   System.out.println("There is no such a thing to show");
  }else{//if it's not empty the method should remove the last value and display it
    double lastItem = doubleEndedQueue.removeLast();
   System.out.println(lastItem);
   System.out.println(doubleEndedQueue);
  }
   
  }

  public void unload(){ //Unload method
    while(doubleEndedQueue.size() > 0){
   System.out.println(doubleEndedQueue.removeLast());
      
    }
  }
}
 
//  output :
// To exit the loop please enter 0.
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 90
// 0
// Loading completed
// 90.0
// [1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0]
// 8.0
// 7.0
// 6.0
// 5.0
// 4.0
// 3.0
// 2.0
// 1.0
//  


