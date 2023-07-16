
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Java program to demonstrate the
// working of a List with ArrayList
// class

// Importing all utility classes
import java.util.*;

// Main class
public class Main {
    // Main driver method
    public static void main(String[] args)
    {
        ArrayList<String> al = new ArrayList<String>();

        al.add("Geeks");
        al.add("for");
        al.add("Geeks");

        // Print and display the elements of ArrayList

        al.add(1, "Hi");

        // Print and display the elements of ArrayList
        System.out.println(al);
    }
}