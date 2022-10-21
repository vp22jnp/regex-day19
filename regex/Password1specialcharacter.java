package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password1specialcharacter {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*\\d)[a-zA-Z0-9]{8,}$");
        Pattern pattern1 = Pattern.compile("^(?=.*[A-Z])(?=.*\\d)(?=.*?[#?!@$%^&*-])[a-zA-Z0-9]{8,}$");
        Matcher m = pattern.matcher("V@ibhav%");
        Matcher p = pattern1.matcher("P1thak2@");
        boolean found= m.find();
        System.out.println("check-" +found);
        boolean verify= p.find();
       System.out.println("check2-" +verify);
    }
}



