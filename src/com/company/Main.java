package com.company;

import java.util.*;

public class Main {

    static RandomChar randomChar = new RandomChar();

    public static void main(String[] args) {


        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < 10; i++) {
            stringBuilder.append(randomChar.randomChar(randomChar.randomInteger(33,126)));
        }

        System.out.println(stringBuilder.toString());
    }
}
