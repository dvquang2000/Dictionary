package oop22004;

import java.util.Scanner;
import java.io.*;
import java.lang.String;
import java.util.*;


public class DictionaryManagement {

    Dictionary dictionary = new Dictionary();
    File fileDictionary = new File("dictionary.txt");
    public int size = 0;


    DictionaryManagement() {

    }

     public void  insertFromCommandline () {
        try {
            Scanner data = new Scanner(fileDictionary);

            while (data.hasNextLine()) {
                String lineData = data.nextLine();


                // analyse data

                String[] tempArray = new String[2];
                tempArray = lineData.split("\t");



                // add new word to arrayList
                Word w = new Word(tempArray[0], tempArray[1]);
                dictionary.words.add(w);
                size++;
                }
            data.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Opps!");
        }



     }


}
