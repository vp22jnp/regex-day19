package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastName {
    public static boolean isvalidlastnameofuser(String name){
        String regex="^[A-Z]{1}[a-z]{2,10}$";
        Pattern p= Pattern .compile(regex);
        if(name==null){
            return false;
        }
        Matcher m= p.matcher(name);
        return m.matches();
    }


    public static void main(String[] args) {
        String str1="Pathak";
        System.out.println(isvalidlastnameofuser(str1));
        String str2="P-a_thak";
        System.out.println(isvalidlastnameofuser(str2));

    }
}


