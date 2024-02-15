package dtatask;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author chupa
 */
public class StackProb2 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        
        System.out.print("Input some element on the stack: ");
        String input = scan.nextLine();
        Scanner elementScanner = new Scanner(input);
        
        while(elementScanner.hasNext()){
            if (elementScanner.hasNextInt()){
                int value = elementScanner.nextInt();
                stack.push(value); 
            } else {
                elementScanner.next();
            }
        }
        elementScanner.close();
        
        System.out.println("Stack Elements: " + stack);
        
        Stack<Integer> sortedStack = sortStack(stack);
        System.out.println("Sorted Stack in Ascending order: " + sortedStack);
    }

    public static Stack<Integer> sortStack(Stack<Integer> stack) {
        Stack<Integer> sortedStack = new Stack<>();
        
        while(!stack.isEmpty()){
            int temp = stack.pop();
            
            while (!sortedStack.isEmpty() && sortedStack.peek() > temp){
                stack.push(sortedStack.pop());
            }
            sortedStack.push(temp);
        }
        return sortedStack;
    }
}
