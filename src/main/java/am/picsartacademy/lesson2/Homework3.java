package am.picsartacademy.lesson2;

//Task 7
//Given an integer, 0< N < 21 , print its
//first 10 multiples.
//Each multiple  N x i (where 0<i<11)
//should be printed on a new line in
//the form: N x i = result.

public class Homework3 {

    public static void main(String[] args) {
        int N = 2;
        int startN = 0;
        int endN = 21;
        if (N > 0 && N < 21) {
            for (int i = 1; i < 11; i++) {
                int myResult = N * i;
                System.out.println(N + " x " + i + " = " + myResult);
            }
        } else {System.out.println(N + " is out of range");}

    }
}
