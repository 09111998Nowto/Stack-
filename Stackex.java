import java.util.Stack;
import java.util.Scanner;

/**
 * Represents an integer evaluator of postfix expressions. Assumes the operands
 * are constants.
 */
public class Stackex {
    public static void main(String[] args) {
        Stack<String> birds = new Stack<>();
        // add element to stack
        birds.push("chim");
        birds.push("vet");
        birds.push("Dai Bang");
        birds.push("Dieu hau");
        System.out.println("Stack start: " + birds);
        // remove element stacks
        // remove an element from the top of the stack
        String element = birds.pop();
        System.out.println("Remove element:" + element);
        // The peek() method returns an object from the top of the stack5
        String element1 = birds.peek();
        System.out.println("element at top:" + element1);
        // To search an element in the stack, we use the search() method
        int position = birds.search("vet");
        System.out.println("position of vet is:" + position);
        // To check whether a stack is empty or not, we use the empty() method
        boolean result = birds.empty();
        System.out.println("is stack empty?: " + result);
        System.out.print("Stacks now:" + birds);
    }
}