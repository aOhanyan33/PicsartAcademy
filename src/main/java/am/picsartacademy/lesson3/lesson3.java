package am.picsartacademy.lesson3;

public class lesson3 {
    public static void main(String[] args) {
//        int[] myArray1 = {8, 1, 6, 4};
//        int max = myArray1[0];
//        for (int i=1; i<myArray1.length; i++){
//            if (myArray1[i]> max);
//            max = myarray1[i];
//
//        }
        int[] myArray2 = {8, 1, 6, 4};   // bubble sorting
        for (int i = 0; i < myArray2.length - 1; i++) {
            //System.out.println("Even number:" + myArray2[i]);
            for (int j = 0; j < myArray2.length - 1; j++)
                if (myArray2[j] > myArray2[j + 1]) {
                    int temp = myArray2[j];
                    myArray2[j] = myArray2[j + 1];
                    myArray2[j + 1] = temp;
                    //System.out.println("other:" + myArray2[j]);

                }
        }
        for (int num : myArray2) {
                System.out.print(num + " ");

        }}}


