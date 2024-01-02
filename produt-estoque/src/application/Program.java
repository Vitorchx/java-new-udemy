package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");

        sc.close();
    }
}
