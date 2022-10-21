package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password1Uppercase {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9]{8,}$");
        //Pattern pattern1 = Pattern.compile("^(?=.*[A-Z])[a-zA-Z0-9]{8,}$");
        Matcher m = pattern.matcher("Vaibhavp");
       // Matcher p = pattern1.matcher("P1thak23");
        boolean found= m.find();
        System.out.println("check-" +found);
     //   boolean verify3= p.find();
      //  System.out.println("check2-" +verify3);
    }
}


