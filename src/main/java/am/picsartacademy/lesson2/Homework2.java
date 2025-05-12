package am.picsartacademy.lesson2;

public class Homework2 {
    public static void main(String[] args) {

        //Task 4 - Create an array and fill it.
        // Print all elements which can be divided by 5.

//        double[] myArray4 = {4, 20, 3, 80, 60};
//        for (int i = 0; i < myArray4.length; i++)
//            if (myArray4[i] % 2 == 0 ) {
//                System.out.println("number:" + myArray4[i]);
//            }


        //Task 5 - Create an array and fill it.
        // Print all elements which are between 24.12 and 467.23.

//        double[] myArray4 = {4, 25.5, 3, 80, 500, 456.78};
//        double start_elem = 24.12;
//        double end_elem = 467.23;
//        for (int i = 0; i < myArray4.length; i++)
//            if ((myArray4[i]>=start_elem) && (myArray4[i] <= end_elem)) {
//                System.out.println("Elements within range:" + myArray4[i]);
//            }

          //Task 6
          //Create an array and fill it. Print count of elements which can be divided by 2
//
        double[] myArray5 = {4, 25, 3, 80, 500, 456, 8};
        int count_elem = 0;
        for (int i = 0; i < myArray5.length; i++){
            if (myArray5[i] % 2==0){

                count_elem = count_elem + 1;
                System.out.println("Elements count is:" + myArray5[i]);
            }}
        System.out.println("Elements count is:" + count_elem);


    }}





