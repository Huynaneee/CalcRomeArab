package RomArabCalc;

import java.util.*;

public enum NumRom {
    I(1), IV(4), V(5), IX(9), X(10),
    XL(40), L(50), XC(90), C(100),
    CD(400), D(500), CM(900), M(1000);

    private int value;

    NumRom(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static boolean flag(String[] str) {

        int count = 0;

        String[] obrazArr = new String[]{"I", "V", "X", "L", "C", "D", "M"};
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < obrazArr.length; j++) {
                if (str[i].equals(obrazArr[j])) {
                    count++;
                }
            }
        }

        return (count > 0);
    }


    public static int[] numRinA(String str) {
        List<NumRom> numRomList = Arrays.asList(NumRom.values());

        String[] arrRomIn = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arrRomIn[i] = String.valueOf(str.charAt(i));
        }

        int[] ArNum = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            for (NumRom e : numRomList) {
                if (e.toString().equals(arrRomIn[i])) {
                    ArNum[i] = e.getValue();
                }

            }
        }
        return ArNum;
    }

    public static String reverseRome (int a) {
        StringBuilder s = new StringBuilder();
        List<NumRom> numRomList = Arrays.asList(NumRom.values());
        numRomList.sort((((o1, o2) -> o1.getValue() < o2.getValue() ? 1 : -1)));
        for (NumRom e: numRomList) {
            for (int i = 0; i<4; i++){
                if (e.getValue() <= a) {
                    a -= e.getValue();
                    s.append(e);
                }
            }
        }

        System.out.println("Ответ в Римских цифрах " + s.toString());
        return s.toString();
    }

}
