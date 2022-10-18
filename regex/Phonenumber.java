package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phonenumber {
    public static void main(String[] args) {


       // public void whenmatchestendigitnumbr () {
            Pattern pattern = Pattern.compile("^\\d{10}$");
            Matcher matcher = pattern.matcher("8052433323");
        Matcher match = pattern.matcher("80524333");
            boolean check= matcher.find();
            System.out.println("check-" +check);
        boolean checking= matcher.find();
        System.out.println("check-" +checking);
        }
    }



