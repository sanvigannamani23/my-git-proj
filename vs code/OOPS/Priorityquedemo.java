import java.util.*;

public class Priorityquedemo {


public static void main(String[] args) {

// TODO Auto-generated method stub

PriorityQueue<Integer> numbers = new PriorityQueue<>();

numbers.add(4);

numbers.add(2);

numbers.add(1);

numbers.add(9);

numbers.add(3);

System.out.println("PriorityQueue: " + numbers);


// Using the peek() method

int number = numbers.peek();

System.out.println("Accessed Element: " + number);

// Using the remove() method

boolean result = numbers.remove(2);

System.out.println("Is the element 2 removed? " + result);


// Using the poll() method

int n = numbers.poll();


System.out.println("Removed Element Using poll(): " + n);

System.out.println("PriorityQueue: " + numbers);
}
}