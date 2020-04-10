package Java_Practice;

import java.util.ArrayList;

public class DynamicArrayList {

    public static void main(String[] args) {

        ArrayList emp = new ArrayList();
        emp.add("Dhwani");
        emp.add(23);
        emp.add(443244088);
        emp.add("QA engineer");

        System.out.println(emp.size());

        emp.add("fulltime");
        System.out.println(emp.size());

        emp.remove(4);

        for(int i =0; i<emp.size(); i++){
            System.out.println(emp.get(i));
        }

        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(100);
        ar.add(200);
        ar.add(300);

        ArrayList<Object> obj = new ArrayList<Object>();
        obj.add("Kahaan");
        obj.add(9);
        obj.add(5.5);
        obj.add("Niles");

        for(int j =0; j<obj.size(); j++){
            System.out.println(obj.get(j));
        }


    }
}
