package Java_Practice;

import java.util.ArrayList;

public class Function_Concepts {

    public static void main(String[] args) {

        Function_Concepts obj = new Function_Concepts();
        obj.func1();
        int a = obj.test(10,20);
        obj.dynamicArray();
        obj.strarray();
        obj.getCapital("India");

        String[] printname = obj.strarray();
        System.out.println(printname.length);
        for(int i=0; i<printname.length; i++){
            System.out.println(printname[i]);
        }


        ArrayList<Integer> printempNum = obj.EmpNumber();
        System.out.println(printempNum.size());

        for(int j=0; j<printempNum.size(); j++){
            System.out.println(printempNum.get(j));
        }



    }

    public void func1(){
        System.out.println("This is func1");
    }

    public int test (int val1, int val2){
        int sum = (val1+val2);
        return sum;
    }

    public boolean isUScitizen(String Name){
        if(Name.equals("Dhwani")){
            return false;
        }
        else if(Name.equals("Lisa")){
            return true;
        }
        else{
            return false;
        }
    }

    public String getCapital(String CountryName){
        if(CountryName.equals("India")){
            return "New Delhi";
        }
        else if(CountryName.equals("USA")){
            return "Washington DC";
        }
        else
            return "Invalid country name";
    }

    public String[] strarray(){
        String[]  stundentNames= new String[5];
        stundentNames[0] = "Kahaan";
        stundentNames[1] = "Theo";
        stundentNames[2] = "Oscar";
        stundentNames[3] = "Neel";
        stundentNames[4] = "Aarohi";

        return stundentNames;
    }

    public ArrayList<Integer> dynamicArray(){
        ArrayList<Integer> salary = new ArrayList<Integer>();

        salary.add(10000);
        salary.add(20000);
        salary.add(30000);
        salary.add(40000);

        return salary;
    }

    public ArrayList<Integer> EmpNumber(){
        ArrayList<Integer> emp = new ArrayList<Integer>();
        emp.add(12);
        emp.add(25);
        emp.add(9);
        emp.add(54);
        emp.add(58);

        return emp;

    }



}
