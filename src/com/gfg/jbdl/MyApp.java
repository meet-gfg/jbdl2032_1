package com.gfg.jbdl;

import com.gfg.jbdl.domain.*;

import java.util.ArrayList;
import java.util.List;



public class MyApp {
    public static void main(String[] args) {
        // Java will search the above signature of the main method to start the application


//
       /* Employee employee=new Employee();
            we use new keyword with constructor to create an instance of a class.It is responsible to allocate a memory in head for the object

       employee.setEmployeeId("123");

           -> getter/setter are used access the private members of the class. There are public method which will access the attributes of the class

        employee.setEmployeeId("345");

        employee.setEmployeeName("John");
        employee.setAge(35);
          ->here we hid the internal logic of updating the valid employee status in the setter method of age.
          -> anytime when setter of age is called it will update the isValid attribute of the object.
        System.out.println("11 "+employee.isValid());
        employee.setAge(16);
        System.out.println("11 "+employee.isValid());*/

         // Carcl cl=new Carcl();  // object cannot be created because of Carcl is declared abstract




       /* for overloading method name is same .. 3 things makes it different
       1. type
       2. sequence of params
       3. number of params
       sample code of all add methods on line 85

        System.out.println("adding numbers"+ add(5,10));
        System.out.println("adding numbers"+ add(5,10.0));*/

        /*
        BaseClass baseClass=new BaseClass(); --> valid

        ChildClass childClass=new ChildClass(); --> valid

        ChildClass childClass1= new BaseClass(); --> inValid Since no memory of the attribute of child class is alloacted because of parent constructor being called

        BaseClass baseClass1=new ChildClass(); --> valid

        */
/*

        List<Integer> list=new ArrayList<>(); -> We call it with List interface to access only the allocated function in the interface

        ArrayList<Integer> list2=new ArrayList<>(); -> valid but open to call all methods of arraylist implementation

         list -> 5 standard method

         array-> 5 standard + 2 extra internal

         */


      /*  Test.add(5,10);  --> if add in Test class is static. It will be directly called with class name

        Math.max(10,20);  --> All the methods in the Math class are static so called directly with class name
        */








    }

// -> types of overloaded methods.
    public static int add(int a, int b){
        System.out.println("calling 1st");
        return a+b;
    }
    public static int add(int a, int b,int c){
        System.out.println("calling 4th");
        return a+b;
    }
    public static double add(int a, double b){
        System.out.println("calling 2nd");
        return a+b;
    }

    public static double add(double a, int b){
        System.out.println("calling 3rd");
        return a+b;
    }


    //alt+insert


    public MyApp() {
    }


}
