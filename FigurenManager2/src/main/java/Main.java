import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int eingabe;

        double length;
        double width;
        double hauptAchse;
        double  nebenAchse;


        System.out.println("1- Erstelle ein Quadrat");
        System.out.println("2- Erstelle ein Rechteck");
        System.out.println("3- Erstelle eine Ellipse");
        System.out.println("4- Gib die gesamte Liste aus");
        eingabe = scanner.nextInt();

        switch (eingabe) {
            case 1: eingabe = 1;
                System.out.println("Gib die Länge  ein: ");
                length = scanner.nextDouble();

                break;
            case 2: eingabe = 2;
                System.out.println("Gib die Länge  ein: ");
                length = scanner.nextDouble();
                System.out.println("Gib die Breite ein: ");
                width = scanner.nextDouble();
                break;
            case 3: eingabe = 3;
                System.out.println("Gib die Hauptachse ein: ");
                hauptAchse = scanner.nextDouble();
                System.out.println("Gib die Nebenachse ein: ");
                nebenAchse = scanner.nextDouble();
                break;

        }

        Rechteck rechteck = new Rechteck(3,4);
        Quadrat quadrat = new Quadrat(3);
        Ellipse ellipse = new Ellipse(3,5);


        ArrayList<Figur> list = new ArrayList<>();

        list.add(rechteck);
        list.add(quadrat);
        list.add(ellipse);


        /*for (int i = 0; i < list.size(); i++) {
            Figur figure = (Figur) list.get(i);
            figure.output();
        }*/

        for (Figur figure : list){
            figure.output();
        }


    }
}
