package com.company;

import com.company.notebook.Notebook;

import java.util.Date;
import java.util.Scanner;

public class Main {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        try {
            System.out.println("Result = " + findSmallestElement());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            functionValue();
        } catch (Exception e) {
            e.printStackTrace();
        }
        testNotebook();
    }

    private static void testNotebook() {
        Notebook notebook = new Notebook();
        System.out.println("Add notes");
        notebook.addNote("Oleg", "Hello", new Date());
        notebook.addNote("Masha", "Hello", new Date());
        notebook.addNote("Ivan", "Hello", new Date());
        notebook.addNote("Yan", "Hello", new Date());
        notebook.addNote("Greg", "Hello", new Date());
        notebook.addNote("Miha", "Hello", new Date());
        System.out.println(notebook.readAllNotes());
        System.out.println("update note");
        notebook.updateNote(2,null,"Hello World");
        System.out.println(notebook.readAllNotes());
        System.out.println("add note");
        notebook.addNote("Bill","I hate it",new Date());
        System.out.println(notebook.readAllNotes());
        System.out.println("remove note");
        notebook.removeFromNotes("Ivan");
        System.out.println(notebook.readAllNotes());
    }

    /**
     * task 2
     */
    private static double findSmallestElement() throws Exception {
        int n = 0;
        float e = 0;
        System.out.println("Write the number for which it will be necessary to perform a calculation");
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        }
        System.out.println("n = " + n);
        System.out.println("Enter precision");
        if (scanner.hasNextFloat()) {
            e = scanner.nextFloat();
        }
        System.out.println("e = " + e);
        double result = 0;
        while (result <= e) {
            result = 1 / Math.pow(n + 1, 2);
        }
        return result;
    }

    /**
     * task 3
     *
     * @throws Exception
     */
    private static void functionValue() throws Exception {
        float max = 0;
        float min = 0;
        float step = 0;
        System.out.println("Enter max value");
        if (scanner.hasNextFloat()) {
            max = scanner.nextInt();
        }
        System.out.println("max = " + max);
        System.out.println("Enter min value");
        if (scanner.hasNextFloat()) {
            min = scanner.nextFloat();
        }
        System.out.println("step = " + min);
        System.out.println("Enter step value");
        if (scanner.hasNextFloat()) {
            step = scanner.nextFloat();
        }
        System.out.println("step = " + step);

        for (float i = min; i < max; i += step) {
            System.out.println(i + " --> " + Math.tan(2 * i - 3));
        }
    }
}
