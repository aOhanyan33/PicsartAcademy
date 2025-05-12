package am.picsartacademy.lesson2;

public class Homework1 {
    public static void main(String[] args) {

        //--Task1--
//        int[] myArray1 = new int[2];
//        myArray1[0] = 10;
//        myArray1[1] = 20;
//        System.out.println(myArray1[0]);
//        System.out.println(myArray1[1]);

        //--Task2--
//        int[] myArray2 = new int[1000];
//        for (int i = 0; i < myArray2.length; i++){
//            myArray2[i] = i + 1;
//            System.out.println(myArray2[i]);
//        }

        // --Task3--
        int[] myArray3 = new int[41];
        for (int i = 0; i < myArray3.length; i++) {
            myArray3[i] = i-20;
        }
        for (int j = 0; j < myArray3.length; j++) {
            if (myArray3[j] % 2 != 0)
                System.out.println("Odd number:" + myArray3[j]);
        }
    }
}

