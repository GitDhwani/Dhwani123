package Java_Practice;

public class page {

    static String logo = "hsbc";

    public static String login(String username){
        System.out.println("This is coming from page class");

        System.out.println("Login with username");
        return username;

    }

    public String login(String username,String password){

        System.out.println("This is not static method coming from page class");
        System.out.println("Login with username and password");
        return password;
    }
}
