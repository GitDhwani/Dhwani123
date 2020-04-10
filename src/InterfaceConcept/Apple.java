package InterfaceConcept;

import java.sql.SQLOutput;

public class Apple implements AustraliaOffice,IndiaOffice,USAOffice {
    @Override
    public void PayByCard() {
        System.out.println("Australia --PayByCard method ");

    }

    @Override
    public void PayByAustralianDollar() {
        System.out.println("Australia -- PayByAustralianDollar");

    }

    @Override
    public void payByCashOnDelivery() {

        System.out.println("India -- payByCashOnDelivery");

    }

    @Override
    public void payByOTP() {
        System.out.println("India -- payByOTP");

    }

    @Override
    public void payByApplePay() {
        System.out.println("USA -- payByApplePay");

    }

    @Override
    public void payByPaypal() {
        System.out.println("USA -- payByPaypal");

    }

    public void appleSecurityPolicy(){
        System.out.println("This is appleSecurityPolicy method, which all country must be follow");
    }

    public void appleWarrentyPolicy(){
        System.out.println("This is appleWarrentyPolicy, which all country must be offer ");
    }


}
