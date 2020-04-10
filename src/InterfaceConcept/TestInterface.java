package InterfaceConcept;

public class TestInterface {

    public static void main(String[] args) {
        Apple ap = new Apple();
        ap.appleSecurityPolicy();
        ap.appleWarrentyPolicy();
        ap.payByApplePay();
        ap.PayByAustralianDollar();
        ap.PayByCard();
        ap.payByCashOnDelivery();
        ap.payByOTP();
        ap.payByPaypal();

        USAOffice us = new Apple();
        System.out.println("Created USA refrence object and i am able to excess only USA country method");
        us.payByApplePay();
        us.payByPaypal();

        IndiaOffice in = new Apple();
        System.out.println("Created india refrence object and i am able to excess only India country method");
        in.payByCashOnDelivery();
        in.payByOTP();

    }
}
