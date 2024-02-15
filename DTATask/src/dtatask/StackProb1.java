import java.util.Scanner;
import java.util.Stack;

public class StackProb1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.println("Is the stack empty? " + stack.isEmpty());

        System.out.print("Input some elements on the stack (space-separated): ");
        String input = scan.nextLine();
        Scanner elementScanner = new Scanner(input);

        while (elementScanner.hasNext()) {
            if (elementScanner.hasNextInt()) {
                int value = elementScanner.nextInt();
                stack.push(value);
            } else {
                elementScanner.next();
            }
        }

        elementScanner.close();

        System.out.println("Stack elements: " + stack);
        System.out.println("Top element of the stackS: " + stack.peek());

        System.out.print("Remove elements from the stack (space-separated): ");
        String removeInput = scan.nextLine();
        Scanner removeElement = new Scanner(removeInput);
        
        while (removeElement.hasNext()) {
            if (removeElement.hasNextInt()) {
                int valueToRemove = removeElement.nextInt();
                if (stack.contains(valueToRemove)) {
                    stack.removeElement(valueToRemove);
                    System.out.print("Removed " + valueToRemove + " from the stack.");
                } else {
                    System.out.println(valueToRemove + " not found in the stack.");
                }
            } else {
                removeElement.next();
            }
        }

        removeElement.close();

        System.out.println("Stack elements after removal: " + stack);

        // Pop two elements from the stack
        for (int i = 0; i < 2; i++) {
            if (!stack.isEmpty()) {
                stack.pop();
            }
        }

        System.out.println("Stack elements after popping: " + stack);

        System.out.println("Is the stack empty? " + stack.isEmpty());

        // Close the scanner
        scan.close();
    }
}
