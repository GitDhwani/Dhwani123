package Java_Practice;

public class loop_Practice {

    public static void main(String[] args) {
        // while loop
        int i=0;
        while(i<5){
            System.out.println("Value of i is: "+ i);
            i = i+1;
        }
        System.out.println("....................................");

        // for loop
        for(int j = 0; j<5; j++){
            System.out.println("Value of j is: "+ j);
        }

        //switch statement

        String browser = "safa";

        switch(browser){
            case "chrome":
                System.out.println("Browser is chrome");
                break;
            case "firefox":
                System.out.println("Browser is firefox");
                break;
            case "safari":
                System.out.println("Browser is Safari");
                break;
            default:
                System.out.printf("Please enter valid browser name");
                break;

        }


    }
}