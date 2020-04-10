package Assignment;


public class DataTypeAndConditionalStatement {

    public static void main(String[] args) {

        dataType("Hello","Dhwani");
        sumOfTwoNumbers(74,36);
        devision(50,3);
        mathOperation();
        floatNum();
        conditionlOperator(25,78,87,98);

    }

    /*

    Data Types:
    1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
    Expected Output :
    Hello
    Naveen K
     */

    public static void dataType(String a, String b){
        System.out.println(a + "\n" +b);

    }

    /*
    2. Write a Java program to print the sum of two numbers.
    Test Data:
    74 + 36
    Expected Output :
    110
     */

    public static void sumOfTwoNumbers(int a, int b){
        int c = a+b;
        System.out.println(c);
    }

    /*
    3. Write a Java program to divide two numbers and print on the screen.
    Test Data :
    50/3
    Expected Output :
    16
     */

    public static void devision(int a, int b){

        int c = a/b;
        System.out.println(c);

    }

    /*
    4. Write a Java program to print the result of the following operations. Change your test data accordingly.
    Test Data:
    a. -5 + 8 * 6
    b. (55+9) % 9
    c. 20 + -3*5 / 8
    d. 5 + 15 / 3 * 2 - 8 % 3
    Expected Output :
    43
    1
    19
    13
     */

    public static void mathOperation(){
        int a = -5+(8*6);
        int b = (55+9)%9;
        int c = 20 + (-3*5/8);
        int d = (5+15/3*2)-8%3;

        System.out.print(a + "\n"+b +"\n"+c + "\n"+d);
    }

    /*

5. Write a Java program to compute the specified expressions and print the output. Go to the editor
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output
2.138888888888889
     */

    public static void floatNum(){
        double d = (double) (25.5 * 3.5- (3.5 * 3.5)) / (40.5 - 4.5);
        System.out.println(d);
    }

    /*
    Conditonal Operators:

    1. Take four numbers and print the greatest number.

    Test Data
    Input the 1st number: 25
    Input the 2nd number: 78
    Input the 3rd number: 87
    Input the 4th number: 98
    Expected Output :
    The greatest: 98

     */

    public static void conditionlOperator(int a, int b, int c, int d){

        if(a>b && a>c && a>d ){
            System.out.println(a + " is largest nubmer");
        }
        else if(b>c && b>d){
            System.out.println(b + " is largest number");
        }
        else if(c>d){
            System.out.println(c + " is largest number");
        }
        else{
            System.out.println(d + " is largest number");
        }

    }

    /*
     2. Write a Java program to test a number is positive or negative.

    Test Data
    Input number: 35 -- positive number
    Input number: -11 -- negative number
     */
     

    public static void positiveOrNegativeNumberValidation(){

    }
}






