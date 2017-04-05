package com.endava.main;

import com.endava.entity.*;
import com.endava.utilities.Utilities;

/**
 * Created by vcerbu on 3/20/2017.
 */
public class Main {
    public static void main(String[] args) {

        //information about person
        System.out.println("01. Personal information");
        Person firstPerson = new Person();
        firstPerson.inputPersonInformation();
        System.out.println(firstPerson.printPersonalInformation());
        System.out.println("--------------------------------------------------------------------------------");

        //books
        System.out.println("02. Books");
        Book firstBook = new Book("Lev Tolstoy", "Anna Carenina", 100, 360, 1970);
        Author firstAuthor = new Author("Ion Creanga", 40, "romanian");
        Publisher firstPublisher = new Publisher("ThomsonReutersGroup", "Woodbridge", "Canada");
        System.out.println(firstBook);
        System.out.println(firstAuthor);
        System.out.println(firstPublisher);
        System.out.println("--------------------------------------------------------------------------------");

        //figures with polymorphism
        System.out.println("03. Figures");
        Figure square1 = new Square(3);
        Figure circle1 = new Circle(5);
        Figure triangle1 = new Triangle(2, 3, 4);

        //figures without polymorphism
        Square square2 = new Square(2);
        Circle circle2 = new Circle(5);
        Triangle triangle2 = new Triangle(1, 2, 3);

        System.out.println(square1);
        System.out.println(circle1);
        System.out.println(triangle1);
        System.out.println("--------------------------------------------------------------------------------");



    }
}
