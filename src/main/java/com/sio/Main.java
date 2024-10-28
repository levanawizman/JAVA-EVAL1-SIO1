package com.sio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String GREEN = "\u001B[32m";
    private static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(GREEN);
        System.out.println("#############################################");
        System.out.println("            JAVA EVAL 1 SIO 1 ALT            ");
        System.out.println("#############################################");

        while(true){
            System.out.println("#############################################");
            System.out.println("1. Exercice 1");
            System.out.println("2. Exercice 2");
            System.out.println("3. Exercice 3");
            System.out.println("4. Exercice 4");
            System.out.println("0. Quitter le programme");
            System.out.println("#############################################");
            System.out.print("Entrer votre choix: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 1");
                    System.out.println("---------------------------------------------");
                    System.out.println("Entrer un nombre :");
                    double nombre = scanner.nextDouble();
                    System.out.println("Entrer la puissance :");
                    int puissance = scanner.nextInt();
                    if (puissance < 0) {
                        System.out.println("La puissance doit être supérieure ou égale à 0. Entrer la puissance :");
                        puissance = scanner.nextInt();
                    }

                    double resultat = Math.pow(nombre, puissance);
                    System.out.println("Le résultat de " + nombre + " puissance " + puissance + " est " + resultat);
                    System.out.println("---------------------------------------------");
                    break;
                case 2:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 2");
                    System.out.println("---------------------------------------------");
                    int kilometres = 0;
                    do {
                        System.out.print("Entrez le nombre de kilomètres parcourus :");
                        kilometres = scanner.nextInt();

                        if (kilometres <= 0) {;
                        }
                    } while (kilometres <= 0);

                    double frais = 0.0;

                    if (kilometres < 100) {
                        frais = kilometres * 0.20;
                    } else if (kilometres <= 500) {
                        frais = kilometres * 0.50;
                    } else {
                        frais = kilometres * 0.80;
                    }

                    System.out.println("Le montant à payer par le client est : " + frais + " €");
                case 3:

                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 3");
                    System.out.println("---------------------------------------------");
                    int largeur = 0;
                    int hauteur = 0;
                    do {
                        System.out.print("Entrez la largeur du rectangle : ");
                        largeur = scanner.nextInt();
                        if (largeur <= 0) {
                            System.out.println("La largeur doit être supérieure à 0.Entrez la largeur du rectangle : ");
                        }
                    } while (largeur <= 0);
                    do {
                        System.out.print("Entrez la hauteur du rectangle: ");
                        hauteur = scanner.nextInt();
                        if (hauteur <= 0) {
                            System.out.println("La hauteur doit être supérieure à 0.Entrez la largeur du rectangle.");
                        }
                    } while (hauteur <= 0);

                    for (int i = 0; i < hauteur; i++) {
                        for (int j = 0; j < largeur; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("---------------------------------------------");
                    break;
                case 4 :

                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 4");
                    System.out.println("---------------------------------------------");
                    int unnombre;
                    do {
                        System.out.print("Entrez un nombre : ");
                        unnombre = scanner.nextInt();

                        if (unnombre <= 0) {
                            System.out.println("Le nombre doit être supérieur à 0. Entrer un nombre :");
                        }
                    } while (unnombre <= 0);

                    long factorielle = 1;
                    for (int i = 1; i <= unnombre; i++) {
                        factorielle *= i;
                    }

                    System.out.println("La factorielle de " + unnombre + " est : " + factorielle);
                    System.out.println("---------------------------------------------");
                    break;
                case 0:

                    System.out.println(RESET);
                    System.exit(0);
                    break;
            }
        }
    }
}