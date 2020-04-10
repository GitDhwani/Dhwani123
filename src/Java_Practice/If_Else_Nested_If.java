package Java_Practice;

public class If_Else_Nested_If {

    static int val1 = 35;


    public static void main(String[] args) {

        if(val1>20){
            if(val1 > 25){
                System.out.println("Value of val1 is: 1 "+ val1);
            }
            if(val1>= 30){
                System.out.println("Value of val1 is: 2 "+ val1);
            }
        }
        else if(val1>40){
            System.out.println("Value of val1 is: 3 "+ val1);
        }
        else if(val1>50){
            if(val1>= 60){
                System.out.println("Value of val is: 4 "+val1);
            }
        }
        else{
            System.out.println("Value is bigger then 61");
        }


    }
}
