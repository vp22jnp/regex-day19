package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public static void main(String[] args) {

        //public static boolean isvalidemailofuser (String name){
            String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher("vp22jnp@gmail.com");
            Matcher match = pattern.matcher("vp22--jnpgmail.com");
            boolean found = matcher.find();
        boolean check = match.find();
            System.out.println("found-" + found);
        System.out.println("check-" + check);
            //return found;
        }
    }


