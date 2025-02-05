package com.campusdual.classroom;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exercise29 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("noexisto.txt");
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
}
