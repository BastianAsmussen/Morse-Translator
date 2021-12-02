package tech.asmussen.translator.morse;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String dot = ".";
        String dash = "-";
        String split = "/";

        if(args.length == 3) {

            dot = args[0];
            dash = args[1];
            split = args[2];
        }

        HashMap<String, String> morseTable = Morse.generateTable(dot, dash);

        Scanner userReader = new Scanner(System.in);
        String input = "";

        while(!input.equalsIgnoreCase("til") && !input.equalsIgnoreCase("fra")) {

            System.out.print("Vil du oversætte fra eller til morse? (til/fra): ");
            input = userReader.nextLine();
        }

        long startTime = 0;

        if(input.equalsIgnoreCase("til")) {

            System.out.print("Indsæt hvad du vil oversætte til morse: ");
            input = userReader.nextLine();

            startTime = System.nanoTime();

            System.out.println(Morse.toMorse(input, split, morseTable));

        } else if(input.equalsIgnoreCase("fra")) {

            System.out.print("Indsæt hvad du vil oversætte fra morse: ");
            input = userReader.nextLine();

            startTime = System.nanoTime();

            System.out.println(Morse.fromMorse(input, split, morseTable));
        }
    }
}
