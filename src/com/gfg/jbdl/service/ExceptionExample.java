package com.gfg.jbdl.service;

import com.gfg.jbdl.exception.InValidPinException;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class ExceptionExample {


    public static void main(String[] args){

     /*   int a=10;
        Integer ab=null;
        int b=0;
        try {
            System.out.println(a / b);
            System.out.println(ab/b);
        }catch(ArithmeticException e){
            System.out.println("arth exception :"+a);
            try {
                int m = 5 / 0;  /// catch logic faced exception here
            }catch(Exception internalEx){
                System.out.println("exception while handling exception");
            }
        }catch(NullPointerException en){
            System.out.println("null exception :"+ab);
            en.printStackTrace(); // not
            en.getMessage(); // adviseble
        }catch(Exception ex){
            System.out.println("ex here");
        }finally {

        }*/

//        try {
//            double x=divide(10,0);
//        } catch (SQLException e) {
//            /// logger.error("error for the user while car number +userid+:+number+");
//        }catch(FileNotFoundException ef){
//
//        }catch (Exception ex){
//            ex.printStackTrace();
//        }
//
        try {
            validateCardDetails("123214234","123");
        } catch (InValidPinException e) {
            System.out.println("invalid pin");
        }catch (Exception ex){
            ex.getMessage();
        }
        finally {

        }
        System.out.println("done");





    }


    public static double divide(int a,int b) throws SQLException, FileNotFoundException,NullPointerException,ArithmeticException {
        // some logic to connect sql

        return a/b;
    }


    public static void validateCardDetails(String number,String pin) throws InValidPinException {
        // validation logic

        try{
           //internal
        }catch (NullPointerException e){
            System.out.println("print here");
        }catch (Exception ex){
            System.out.println();
        }
        if(pin.length()<4) {

            throw new InValidPinException();

        }
    }

}
