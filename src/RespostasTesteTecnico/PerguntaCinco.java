package RespostasTesteTecnico;

import java.util.Scanner;

public class PerguntaCinco {

    static String originalString;
    static String reversedString = "";

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("\n \u001B[34m Digite uma palavra ou frase: \u001B[0m");
        originalString = scan.nextLine();

        revertString(originalString);

    }

    public static void revertString(String stringToReverse) {

        for(int i = 0; i < stringToReverse.length(); i++) {

            reversedString = stringToReverse.charAt(i) + reversedString;

        }

        System.out.println("\u001B[32mPalavra ou frase invertida: \u001B[0m" + reversedString);

    }
}
