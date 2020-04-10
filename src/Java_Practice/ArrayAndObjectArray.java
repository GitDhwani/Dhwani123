package Java_Practice;



public class ArrayAndObjectArray {

    public static void main(String[] args) {

        //int array and loop for index base

        int[] i = new int[5];
        i[0] = 10;
        i[1] = 20;
        i[2] = 30;
        i[3] = 40;
        i[4] = 50;
        int sum = 0;

        for (int k = 0; k < i.length; k++) {
            System.out.println(i[k]);
        }

        for (int k = 0; k < i.length; k++) {
            sum = sum + i[k];

        }
        System.out.println("Total value of sum is: " + sum);

        // Object array can store dynamic value
        Object[] emp = new Object[5];

        emp[0] = "dhwani";
        emp[1] = 27;
        emp[2] = 443244088;
        emp[3] = "india";
        emp[4] = true;


    }



}
