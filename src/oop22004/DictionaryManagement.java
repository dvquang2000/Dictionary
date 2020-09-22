package oop22004;

import java.util.Scanner;
public class DictionaryManagement {
    Word word = new Word();
    Dictionary dictionary = new Dictionary();
    public int size = 0;

    DictionaryManagement() {

    }
    //Insert method.
     public void  insertFromCommandline () {


         Scanner scanner = new Scanner(System.in);
         String wordTagert = scanner.nextLine();
         String wordExplain = scanner.nextLine();

         dictionary.words[size].setWordExplain(wordExplain);
         dictionary.words[size].setWordTarget(wordTagert);
         size++;


     }


}
