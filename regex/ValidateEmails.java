package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmails {
    private static boolean validateEmails(String regex, String email){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println("validating emails");
        System.out.println(validateEmails("^[a-zA-Z]+@+[a-zA-Z]+[.][a-zA-Z]*$","abc@yahoo.com"));
        System.out.println(validateEmails("^[a-zA-Z]+@+[a-zA-Z]+[.][a-zA-Z]*$","abc-100@yahoo.com,"));
        System.out.println(validateEmails("^[a-zA-Z]+@+[a-zA-Z]+[.][a-zA-Z]*$","abc.100@yahoo.com"));
        System.out.println(validateEmails("^[a-zA-Z]+@+[a-zA-Z]+[.][a-zA-Z]*$","abc111@abc.com,"));
        System.out.println(validateEmails("^[a-zA-Z]+@+[a-zA-Z]+[.][a-zA-Z]*$","abc-100@abc.net,"));
        System.out.println(validateEmails("^[a-zA-Z]+@+[a-zA-Z]+[.][a-zA-Z]*$"," abc.100@abc.com.au"));
        System.out.println(validateEmails("^[a-zA-Z]+@+[a-zA-Z]+[.][a-zA-Z]*$"," abc@1.com,"));
        System.out.println(validateEmails("^[a-zA-Z]+@+[a-zA-Z]+[.][a-zA-Z]*$","abc@gmail.com.com"));
        System.out.println(validateEmails("^[a-zA-Z]+@+[a-zA-Z]+[.][a-zA-Z]*$","abc+100@gmail.com"));
    }
}


