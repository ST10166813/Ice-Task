/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;



class Animal {
    protected int IDtag;
    protected String species;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter IDtag: ");
        IDtag = scanner.nextInt();
        scanner.nextLine();  // Consume the newline
        System.out.print("Enter species: ");
        species = scanner.nextLine();
    }

    public void output() {
        System.out.println("IDtag: " + IDtag);
        System.out.println("Species: " + species);
    }
}

class Bird extends Animal {
    private int featherColor;

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter feather color (1=grey, 2=white, 3=black): ");
        featherColor = scanner.nextInt();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Feather Color: " + featherColor);
    }
}

class Reptile extends Animal {
    private double bloodTemp;

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter blood temperature: ");
        bloodTemp = scanner.nextDouble();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Blood Temperature: " + bloodTemp);
    }
}

public class Main {
    public static void main(String[] args) {
        Bird brd = new Bird();
        Reptile rept = new Reptile();

        System.out.println("Enter details for the bird:");
        brd.input();
        System.out.println("\nEnter details for the reptile:");
        rept.input();

        System.out.println("\nBird details:");
        brd.output();
        System.out.println("\nReptile details:");
        rept.output();
    }
}
