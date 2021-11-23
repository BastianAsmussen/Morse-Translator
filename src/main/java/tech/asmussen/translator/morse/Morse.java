package tech.asmussen.translator.morse;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections4.MapUtils;

public class Morse {

    public static HashMap<String, String> generateTable(String dot, String dash) {

        // Morse kode bordet bliver lavet i et hashmap siden de har O(1).
        HashMap<String, String> morseTable = new HashMap<>();

        // Generer bugstaver, tal og andre tegn med tilsvarende morse kode.

        // Bugstaver:
        morseTable.put("A", dot + dash);
        morseTable.put("B", dash + dot + dot + dot);
        morseTable.put("C", dash + dot + dash + dot);
        morseTable.put("D", dash + dot + dot);
        morseTable.put("E", dot);
        morseTable.put("F", dot + dot + dash + dot);
        morseTable.put("G", dash + dash + dot);
        morseTable.put("H", dot + dot + dot + dot);
        morseTable.put("I", dot + dot);
        morseTable.put("J", dot + dash + dash + dash);
        morseTable.put("K", dash + dot + dash);
        morseTable.put("L", dot + dash + dot + dot);
        morseTable.put("M", dash + dash);
        morseTable.put("N", dash + dot);
        morseTable.put("O", dash + dash + dash);
        morseTable.put("P", dot + dash + dash + dot);
        morseTable.put("Q", dash + dash + dot + dash);
        morseTable.put("R", dot + dash + dot);
        morseTable.put("S", dot + dot + dot);
        morseTable.put("T", dash);
        morseTable.put("U", dot + dot + dash);
        morseTable.put("V", dot + dot + dot + dash);
        morseTable.put("W", dot + dash + dash);
        morseTable.put("X", dash + dot + dot + dash);
        morseTable.put("Y", dash + dot + dash + dash);
        morseTable.put("Z", dash + dash + dot + dot);

        // Tal:
        morseTable.put("0", dash + dash + dash + dash + dash);
        morseTable.put("1", dot + dash + dash + dash + dash);
        morseTable.put("2", dot + dot + dash + dash + dash);
        morseTable.put("3", dot + dot + dot + dash + dash);
        morseTable.put("4", dot + dot + dot + dot + dash);
        morseTable.put("5", dot + dot + dot + dot + dot);
        morseTable.put("6", dash + dot + dot + dot + dot);
        morseTable.put("7", dash + dash + dot + dot + dot);
        morseTable.put("8", dash + dash + dash + dot + dot);
        morseTable.put("9", dash + dash + dash + dash + dot);

        // Andre tegn:
        morseTable.put(".", dot + dash + dot + dash + dot + dash);
        morseTable.put(",", dash + dash + dot + dot + dash + dash);
        morseTable.put("?", dot + dot + dash + dash + dot + dot);
        morseTable.put("'", dot + dash + dash + dash + dash + dot);
        morseTable.put("!", dash + dot + dash + dot + dash + dash);
        morseTable.put("/", dash + dot + dot + dash + dot);
        morseTable.put("(", dash + dot + dash + dash + dot);
        morseTable.put(")", dash + dot + dash + dash + dot + dash);
        morseTable.put("&", dot + dash + dot + dot + dot);
        morseTable.put(":", dash + dash + dash + dot + dot + dot);
        morseTable.put(";", dash + dot + dash + dot + dash + dot);
        morseTable.put("=", dash + dot + dot + dot + dash);
        morseTable.put("+", dot + dash + dot + dash + dot);
        morseTable.put("-", dash + dot + dot + dot + dot + dash);
        morseTable.put("_", dot + dot + dash + dash + dot + dash);
        morseTable.put("\"", dot + dash + dot + dot + dash + dot);
        morseTable.put("$", dot + dot + dot + dash + dot + dot + dash);
        morseTable.put("@", dot + dash + dash + dot + dash + dot);
        morseTable.put("¿", dot + dot + dash + dot + dash);
        morseTable.put("¡", dash + dash + dot + dot + dot + dash);

        return morseTable;
    }

    public static String toMorse(String input, HashMap<String, String> morseTable) {

        char[] inputSplit = input.toCharArray();
        StringBuilder output = new StringBuilder();

        for(char c : inputSplit) {

            if(c != ' ') {

                String currentValue = String.valueOf(Character.toUpperCase(c));
                output.append(morseTable.get(currentValue)).append(" ");
            }
        }

        output.deleteCharAt(output.length() - 1);

        return output.toString().replaceAll("null", "?");
    }

    public static String fromMorse(String input, HashMap<String, String> morseTable) {

        String[] inputSplit = input.split(" ");
        StringBuilder output = new StringBuilder();

        Map<String, String> reversedMorseTable = MapUtils.invertMap(morseTable);

        for(String currentValue : inputSplit) {

            output.append(reversedMorseTable.get(currentValue));
        }

        return output.toString().replaceAll("null", "?").toLowerCase();
    }
}
