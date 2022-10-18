package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{8}$");
        Matcher m = pattern.matcher("V@ibhav8");
        Matcher p = pattern.matcher("Vaibhav1");
        boolean verify= m.find();
        System.out.println("check-" +verify);
        boolean verify1= p.find();
        System.out.println("check2-" +verify1);
    }
}

