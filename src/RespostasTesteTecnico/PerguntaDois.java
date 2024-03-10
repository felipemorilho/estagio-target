package RespostasTesteTecnico;

import java.util.Scanner;

public class PerguntaDois {

    static boolean isInsideSequence = false;

    public static void main(String[] args) {

        int finalSequenceNumber;

        Scanner scan = new Scanner(System.in);

        System.out.print("\n \u001B[34m Digite o número limite da sequencia de Fibonacci: \u001B[0m");
        finalSequenceNumber = scan.nextInt();

        System.out.println("\n");

        fibonacciSequence(finalSequenceNumber);

        isNumberIncluded(isInsideSequence);

    }

    private static void isNumberIncluded(boolean isInsideSequence) {

        if(isInsideSequence) {

            System.out.println("\n\n \u001B[32m O número informado pertence a sequência de Fibonacci! \u001B[0m");

        } else {

            System.out.println("\n\n \u001B[31m O número informado não pertence a sequência de Fibonacci! \u001B[0m");
        }
    }

    public static void fibonacciSequence(int number) {

        int firstNumber = 0;
        int secondNumber = 1;
        int auxNumber;

        while(firstNumber <= number) {

            if(firstNumber == number) {

                isInsideSequence = true;

            }

            System.out.print(firstNumber + " ");

            auxNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = auxNumber;

        }

    }
 }
