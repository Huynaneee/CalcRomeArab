package RomArabCalc;

public class Operation {
    public static int trueNum(int[] arr){
        int a = 0;
        if (arr.length>1 && arr.length<=3) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]<arr[i+1]){
                a += (arr[i+1]-arr[i]);
            } else if (arr[i]>=arr[i+1]) {
                a += arr[i];
             if (i == arr.length -2){
                    a += arr[i+1];}
            }
        }
        System.out.println(a);
        return a;}

        //для одной цифры.
        else if (arr.length==1) {
            for (int i = 0; i < arr.length; i++) {
                a = arr[i];
            }
            System.out.println(a);
            return a;
        }

        // для 5 цифр
        else if (arr.length>3 && arr.length <=5){
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i]>=arr[i+1]){
                    a += arr[i];
                    if (i == arr.length -2){
                        a += arr[i+1];
                        System.out.println("");
                        System.out.println("doqqq");
                    }
                }
                else if (arr[i] < arr[i+1]){
                    a += (arr[i+1]-arr[i]);
                    System.out.println("doshli");

                }
            }
            System.out.println(a);
            return a;
        }
        return 0;
    }
     public static int rezOperation(String znak, int a, int b){
         return switch (znak) {
             case ("+") -> a + b;
             case ("-") -> a - b;
             case ("*") -> a * b;
             case ("/") -> a / b;
             default -> 0;
         };
     }
     public static int numArab (String s){
        return Integer.parseInt(s);
     }

}
