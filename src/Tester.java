import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        String[] BookRoman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV",
                "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX",
                "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII",
                "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII",
                "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII",
                "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI",
                "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };

        Scanner in = new Scanner(System.in);
        System.out.print("Input ");

        String InputUser = in.nextLine().replaceAll(" ", "").trim();    // строка без пробелов


        for (int i = 0; i < InputUser.length(); i++) {

            if ((InputUser.charAt(i)) == '+' || (InputUser.charAt(i)) == '-' || (InputUser.charAt(i)) == '*' || (InputUser.charAt(i)) == '/') {
                char operator = InputUser.charAt(i);                                                // проверка на наличие знака и сохранение знака и потенциальных чисел
                String num1 = InputUser.substring(0, i);
                String num2 = InputUser.substring(i + 1, InputUser.length());

                if (checker(new String[]{num1, num2}, BookRoman, "неверноый формат...")) {   // проверка на арабские и на ошибки (метод не даст ввести числа разных систем)
                    System.out.println(num1 + " " + operator + " " +num2 + " = " + ArabCalc(new String[]{num1, num2}, operator));               // калькулятор для арабских чисел
                } else {
                    System.out.println(num1 + " " + operator + " " +num2 + " = " + RomanCalc(new String[]{num1, num2}, BookRoman, operator));   // калькулятор для римских чисел
                }

            }

        }

        System.out.println("Где знак?...");                                                 //ГДЕ ОН?
        System.exit(-4);

    }

    public static boolean checker (String[] numbs, String[] Book, String massage) {

        byte check = 0;
        //boolean Arab = false;

        for (int i = 0; i < 2; i++) {
            if (numbs[i].contentEquals("0") || numbs[i].contentEquals("1") || numbs[i].contentEquals("2")
                    || numbs[i].contentEquals("3") || numbs[i].contentEquals("4") || numbs[i].contentEquals("5")
                    || numbs[i].contentEquals("6") || numbs[i].contentEquals("7") || numbs[i].contentEquals("8")
                    || numbs[i].contentEquals("9") || numbs[i].contentEquals("10")) {
                if (check == 2) {
                    System.out.println(massage);
                    System.exit(-2);
                }
                check = 1;
            }
            else if (numbs[i].contentEquals(Book[0]) || numbs[i].contentEquals(Book[1]) || numbs[i].contentEquals(Book[2])
                    || numbs[i].contentEquals(Book[3]) || numbs[i].contentEquals(Book[4]) || numbs[i].contentEquals(Book[5])
                    || numbs[i].contentEquals(Book[6]) || numbs[i].contentEquals(Book[7]) || numbs[i].contentEquals(Book[8])
                    || numbs[i].contentEquals(Book[9]) || numbs[i].contentEquals(Book[10])) {
                if (check == 1) {
                    System.out.println(massage);
                    System.exit(-2);
                }
                check = 2;
            }
            else {
                System.out.println(massage);
                System.exit(-3);
            }
        }

        if (check == 1) {
            return true;
        } else {
            return false;
        }

    }

    public static int RomanCalc (String[] numbs, String[] Book, char operator) {

        int sum = 0;
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <= 10; j++) {
                if (numbs[i].contentEquals(Book[j])){
                    switch (i){
                        case 0:
                            num1 = j;
                        case 1:
                            num2 = j;
                    }
                }
            }
        }

        switch (operator) {
            case '+' -> sum = num1 + num2;
            case '-' -> sum = num1 - num2;
            case '*' -> sum = num1 * num2;
            case '/' -> sum = num1 / num2;
        }

        return sum;
    }

    public static int ArabCalc (String[] numbs, char operator) {

        int num1 = Integer.parseInt(numbs[0]);
        int num2 = Integer.parseInt(numbs[1]);
        int sum = 0;
        switch (operator) {
            case '+' -> sum = num1 + num2;
            case '-' -> sum = num1 - num2;
            case '*' -> sum = num1 * num2;
            case '/' -> sum = num1 / num2;
        }

        return sum;

    }

}
