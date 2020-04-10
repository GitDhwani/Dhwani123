package Java_Practice;

public class Constructor_Concept {

    String name;
    String lastname;
    long phone;
    boolean agelimit;

    // Constructor with no parameter
    public Constructor_Concept(){
        System.out.println("This is constructor with no argument");

    }

    //Constructor with patameter
    public Constructor_Concept(String name, String lastname, long phone, boolean agelimit){
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.agelimit = agelimit;

        System.out.println("Constructor with four argument");


    }

    //Constructor with some parameter
    public Constructor_Concept(String name, String lastname){
        this.name = name;
        this.lastname = lastname;

        System.out.println("Constructor with two arguments");

    }

    public void conwithSome(){
        System.out.println("Your name is coming from constructor value "+ name);
    }

    public void conwithallParameter(){
        System.out.println("All parameter: "+ name + " "+ lastname + " "+ phone + " "+ agelimit);
    }

    public static void main(String[] args) {

        Constructor_Concept c1 = new Constructor_Concept();

        Constructor_Concept c2 = new Constructor_Concept("dhwani","shah",443244088,true);
        c2.conwithSome();
        Constructor_Concept c3 = new Constructor_Concept("Kahaan","shah");
        c3.conwithSome();



    }
}
