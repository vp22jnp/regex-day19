package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserEntry {
    public static void main(String[] args) {


        // public boolean getuserentry(String userentry) {
        String nameRegex = "^[A-Z]{1}[a-z]{2,10}$";
        String lastnameRegex = "^[A-Z]{1}[a-z]{2,10}$";
        String emailRegex = "^[a-zA-Z]+@+[a-zA-Z]+[.][a-zA-Z]*$";
        String phonenumberRegex = "^\\d{10}$";
        Pattern patternobj = Pattern.compile(nameRegex);
        Pattern patternobj1 = Pattern.compile(lastnameRegex);
        Pattern patternobj2 = Pattern.compile(emailRegex);
        Pattern patternobj3 = Pattern.compile(phonenumberRegex);

        Matcher matcherobj = patternobj.matcher("Vaibhav");
        boolean result = matcherobj.matches();
        Matcher matcherobj1 = patternobj1.matcher("Pathak");
        boolean result1 = matcherobj1.matches();
        Matcher matcherobj2 = patternobj2.matcher("vpjnp@gmail.com");
        boolean result2 = matcherobj2.matches();
        Matcher matcherobj3 = patternobj3.matcher("8052433323");
        boolean result3 = matcherobj3.matches();

        System.out.println("check-"+result);
        System.out.println("check1-"+result1);
        System.out.println("check2-"+result2);
        System.out.println("check3-"+result3);


    }
}



