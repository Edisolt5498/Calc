import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input ");

        String test = in.nextLine();

        String[] corrected = test.split(" ");   //разбить на 3 строки
        //String[] corrected = test.split("[+-/*]");


        char operator;
        int num1 = 0;
        int num2 = 0;
        int sum = 10000;
        String[] Book = {"A", "B", "C"};    //temp. Тут будет словарь римских чисел


        if (corrected.length > 3){
            System.out.println("неверный формат... длина"); // проверка на количество введенных данных
            System.exit(-4);
        }


        operator = corrected[1].charAt(0);  // оператор стоит вторым, считываем его


        if (checker(corrected, "неверноый формат...")) {    // проверка на введенные данные числа и знаки и определение формата чисел. Если арабские, то считаем
            num1 = Integer.parseInt(corrected[0]);
            num2 = Integer.parseInt(corrected[2]);
            switch (operator) {
                case '+' -> sum = num1 + num2;
                case '-' -> sum = num1 - num2;
                case '*' -> sum = num1 * num2;
                case '/' -> sum = num1 / num2;
            }
        } else if (!checker(corrected, "неверноый формат...")) {    // если римсиие, то считаем в классе
            System.out.println(RomanCalc(corrected, Book, operator));   //передаем инпут, словарь, и оператор и получаем стринг ответа в римских числах
        }


        /*System.out.println(num1);
        System.out.println(num2);
        System.out.println(sum);*/


    }


    public static boolean checker (String[] Food, String massage) {

        boolean Arab = false;
        byte check = 0;

        for (int i = 0; i < 3; i++) {

                if ((Objects.equals(Food[i], "1") || Objects.equals(Food[i], "2") || Objects.equals(Food[i], "3") || Objects.equals(Food[i], "4")
                        || Objects.equals(Food[i], "5") || Objects.equals(Food[i], "6") || Objects.equals(Food[i], "7")
                        || Objects.equals(Food[i], "8") || Objects.equals(Food[i], "9") || Objects.equals(Food[i], "10")) && i != 1)
                {
//                    System.out.println("1");
                    if (check == 2)
                    {
                        System.out.println(massage);
                        System.exit(-1);
                    }
                    check = 1;
                }

                else if ((Objects.equals(Food[i], "I") || Objects.equals(Food[i], "II") || Objects.equals(Food[i], "III")
                        || Objects.equals(Food[i], "IV") || Objects.equals(Food[i], "V") || Objects.equals(Food[i], "VI") || Objects.equals(Food[i], "VII")
                        || Objects.equals(Food[i], "VIII") || Objects.equals(Food[i], "IX") || Objects.equals(Food[i], "X"))  && i != 1)
                {
//                    System.out.println("2");
                    if (check == 1)
                    {
                        System.out.println(massage);
                        System.exit(-2);
                    }
                    check = 2;
                }

                else if (/*(Objects.equals(Food[i], "+") || Objects.equals(Food[i], "-") || Objects.equals(Food[i], "*")
                        || Objects.equals(Food[i], "/")) && */i == 1)
                {
//                  System.out.println("3");
                }

                else
                {
                    System.out.println(massage);
                    System.exit(-3);
                }

            }

        if (check == 1){
            Arab = true;
        }

        return Arab;
    }


    public static String RomanCalc (String[] Food, String[] Book, char operator){

        int sum = 0;
        int num1 = 2;
        int num2 = 1;


        // тут сравнить и найти из словаря перевод


        switch (operator) {
            case '+' -> sum = num1 + num2;
            case '-' -> sum = num1 - num2;
            case '*' -> sum = num1 * num2;
            case '/' -> sum = num1 / num2;
        }


        // тут сравнить и найти из словаря перевод


        return "String";
    }









}

