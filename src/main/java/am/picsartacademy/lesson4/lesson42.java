package am.picsartacademy.lesson4;

public class lesson42 {
    public static void main(String[] args) {
        int a =5;
//        while (a<5) {
//
//            System.out.println(a);
//            a++;
//        }


        do {
            System.out.println(a);
        } while (a < 5);


        String[] weekDays = new String[7];
        weekDays[0] = "Sunday";
        weekDays[1] = "Monday";
        weekDays[2] = "Tusday";
        for (String weekDay : weekDays) {
            System.out.println(weekDays);
        }

    }
}
