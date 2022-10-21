package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Passwordwith1Numeric {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])[a-zA-Z0-9]{8,}$");
        Pattern pattern1 = Pattern.compile("^(?=.*[A-Z])(?=.*\\d)[a-zA-Z0-9]{8,}$");
        Matcher m = pattern.matcher("Vaibhav3");
        Matcher p = pattern1.matcher("P1thak23");
        boolean found= m.find();
        System.out.println("check-" +found);
        boolean verify3= p.find();
        System.out.println("check2-" +verify3);
    }
}


