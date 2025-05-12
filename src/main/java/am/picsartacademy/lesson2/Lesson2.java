package am.picsartacademy.lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        //int[] myArray;
//        int[] myArray = new int[10];
//        for (int i = 0; i < myArray.length; i++) {
//            myArray[i] = i + 1;
//            System.out.println(myArray[i]);
//            //System.out.println("Setting" + 1 + (i+1))


//        }

        int[] myArray1 = new int[10];
        for (int i = 0; i < myArray1.length; i++) {
            myArray1[i] = i;
        }
        for (int j = 0; j < myArray1.length; j++) {
                if (myArray1[j] % 2 == 0)
                    System.out.println("Even number:" + myArray1[j]);

        }

    }
}

  //int[] array2 = {1, 2, 3, 4}
