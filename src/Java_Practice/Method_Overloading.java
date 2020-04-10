package Java_Practice;

public class Method_Overloading {

    public static void main(String[] args) {

        Method_Overloading mo = new Method_Overloading();
        mo.login();
        mo.login("Dhwani");
        mo.login("Dhwani","Kahaan@123");
        signup();
        Method_Overloading.signup();

    }

    //login with no parameter
    public void login(){
        System.out.println("Login with no parameter");
    }

    //login with one parameter

    public void login(String username){
        System.out.println("Login with one parameter "+ username);

    }

    //login with two parameter
    public void login(String username, String password ){
        System.out.println("Login with two parameter "+ username + " "+ password);

    }

    // static method
    public static void signup(){
        System.out.println("This is static method");

    }

}
