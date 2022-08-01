package RomArabCalc;

import java.util.Scanner;

// TODO когда пишешь программу не забывай про код-стайл. В идее можно нажать ctrl+alt+L и она сама тебе поправит. Код-стайл помогает улучшить читабельность кода
// TODO и еще нюанс... Название переменных. Старайся называть переменные и методы, чтобы сразу можно было понять что это и зачем

public class Start {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите выражение: ");
        Scanner sc = new Scanner(System.in);
        String boom = sc.nextLine();
        String[] arr = boom.toUpperCase().split(" ");
        if (arr.length == 3) {
            String prv1 = arr[0];
            String symbol = arr[1];
            String prv2 = arr[2];
//            TODO Зачем переменная х? можно сразу выражение засунуть в скобки
            boolean x = NumRom.flag(boom);
            if (x) {
                int[] arr1 = NumRom.numRinA(prv1);
                int[] arr2 = NumRom.numRinA(prv2);
                int num1 = Operation.trueNum(arr1);
                int num2 = Operation.trueNum(arr2);
                int sum = Operation.rezOperation(symbol, num1, num2);
                System.out.println("Результат вычислений: " + sum);
                String s = NumRom.reverseRome(sum);
            } else {
                int numAr1 = Operation.numArab(prv1);
                int numAr2 = Operation.numArab(prv2);
                int sum = Operation.rezOperation(symbol, numAr1, numAr2);
                System.out.println("Результат вычислений: " + sum);
            }
        }
    }
}
