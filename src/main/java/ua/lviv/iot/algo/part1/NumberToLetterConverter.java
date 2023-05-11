package ua.lviv.iot.algo.part1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.System; // доданий імпорт

public class NumberToLetterConverter {

    public static String convertNumbersToLetters(String text) {
        String result = text;

        Pattern pattern = Pattern.compile("\\b[1-9]\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String number = matcher.group();
            char letter = (char) ('A' + Integer.parseInt(number) - 1);
            result = result.replace(number, String.valueOf(letter));
        }

        return result;
    }

    public static void main(String[] args) {
        String text = "student number 1 with student number 2 go to 4";
        String result = NumberToLetterConverter.convertNumbersToLetters(text);
        System.out.println(result);
    }
}

