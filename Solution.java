import java.io.*;

// Superclass
class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}

// Subclass
class Adder extends Arithmetic {
    // Inherits add() method
}

// Main class
public class Solution {
    public static void main(String[] args) {
        Adder a = new Adder();
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
        System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
    }
}
