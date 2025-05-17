package am.picsartacademy.lesson4;

import java.util.Scanner;

public class lesson4 {
    //public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("day: ");
//        int day = scanner.nextInt();
//        //int day = 3;
//        switch (day) {
//            case 1:
//                System.out.print("Monday");
//                break;
//            case 2:
//                System.out.print("Tuesday");
//                break;
//            default:
//                System.out.print("Tuesday");
//
//        }
        public static void maxValue(int[] arr){
            int max = arr[0];
            for (int i = 1; i< arr.length; i++){
                if (arr[i]>max) {
                max = arr[i];}
            }
        }



    }
