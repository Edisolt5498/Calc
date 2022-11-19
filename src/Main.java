import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input ");
        String [] Input = (in.nextLine()).split(" ");


        boolean checkerArab = false;
        char operator = '?';
        int num1;
        int num2;


        if (Input[1].equals("+")){
            operator = '+';
        }
        if (Input[1].equals("-")){
            operator = '-';
        }
        if (Input[1].equals("*")){
            operator = '*';
        }
        if (Input[1].equals("/")){
            operator = '/';
        }// looking for operator


        num1 = correctingToNum(Input[0]);
        num2 = correctingToNum(Input[2]);


        int sum = calculating(num1, num2, operator);


        System.out.println(sum);


    }

    private static int correctingToNum (String StupidNum){

        if (StupidNum.equals("I")){
            return 1;
        }
        if (StupidNum.equals("II")){
            return 2;
        }
        if (StupidNum.equals("III")){
            return 3;
        }
        if (StupidNum.equals("IV")){
            return 4;
        }
        if (StupidNum.equals("V")){
            return 5;
        }
        if (StupidNum.equals("VI")){
            return 6;
        }
        if (StupidNum.equals("VII")){
            return 7;
        }
        if (StupidNum.equals("VIII")){
            return 8;
        }
        if (StupidNum.equals("IX")){
            return 9;
        }
        if (StupidNum.equals("X")){
            return 10;
        }
        if (StupidNum.equals("0")){
            return 0;
        }
        if (StupidNum.equals("1")){
            return 1;
        }
        if (StupidNum.equals("2")){
            return 2;
        }
        if (StupidNum.equals("3")){
            return 3;
        }
        if (StupidNum.equals("4")){
            return 4;
        }
        if (StupidNum.equals("5")){
            return 5;
        }
        if (StupidNum.equals("6")){
            return 6;
        }
        if (StupidNum.equals("7")){
            return 7;
        }
        if (StupidNum.equals("8")){
            return 8;
        }
        if (StupidNum.equals("9")){
            return 9;
        }
        if (StupidNum.equals("10")){
            return 10;
        }
        else {
            System.out.println("0-10 or 0-X");
            return 0;
        }
    }

    private static int calculating (int firstRomanNum, int secontRomanNum, char Operator){
        switch (Operator){
            case '+' :
                return firstRomanNum + secontRomanNum;
            case '-' :
                return firstRomanNum - secontRomanNum;
            case '*' :
                return firstRomanNum * secontRomanNum;
            case '/' :
                return firstRomanNum / secontRomanNum;
            default:
                System.out.println("incorrect input");
                return 0;

        }

    }




}