package oop22004;

import java.util.Scanner;
import java.io.*;
import java.io.FileWriter;

import java.util.*;


public class DictionaryManagement {
    LinkedList <Word> words = new LinkedList <Word> ();
    Dictionary dictionary = new Dictionary();
    Scanner scanner = new Scanner(System.in);
   private final File fileDictionary = new File("dictionary.txt");
    public int size = 0;

    DictionaryManagement() {
        LinkedList <Word> words = new LinkedList <Word> ();
    }

     public void  insertFromCommandline () {
         System.out.println("Enter the number of word that you want to add:");
         int numberOfWord = scanner.nextInt();
         scanner.nextLine();
         System.out.println("Fomat : English-Vietnameese");

         for (int i = 0; i < numberOfWord; i++) {
             String wordTarget = scanner.nextLine();
             String wordExplain = scanner.nextLine();
             dictionary.words.add(new Word(wordTarget, wordExplain)) ;
         }
     }

     public void insertFromFile() {
         try {
             Scanner data = new Scanner(fileDictionary);

             while (data.hasNextLine()) {
                 String[] lineData = data.nextLine().split("\t");

                 // add new word to arrayList
                 if (!"".equals(lineData[0]) && !"".equals(lineData[1])) {
                     dictionary.words.add(new Word(lineData[0], lineData[1]));
                     size++;
                 }
             }
             data.close();
         }
         catch (FileNotFoundException e) {
             System.out.println("Opps!");
         }
     }

     public void dictionaryLookup() {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Enter word:");
         String word = scanner.nextLine();
         boolean result = false;

         for(Word w : dictionary.words ) {
             if(w.getWordTarget().equals(word)) {
                 result = true;
                 System.out.printf("%-15s%s \n",w.getWordTarget(),w.getWordExplain());
                 break;
             }
         }
         if(!result) {
             System.out.println("Can't find this word !");

         }
     }

     public void addtoList() {

         System.out.println("Enter new word and it's mean:");
         String wordTarget = scanner.nextLine();
         String wordExplain= scanner.nextLine();

        boolean result = true;
        for (Word w : dictionary.words) {
            if (w.getWordTarget().equals(wordTarget)) {
                result = false;
                break;
            }
        }
        if(result) {
            dictionary.words.add(new Word(wordTarget, wordExplain));
       }
        if (!result) {
            System.out.println("This word was exist!");
        }

     }
     public boolean remove() {
         System.out.println("Enter word that you want to remove:");
         String s = scanner.nextLine();
            int count = 0;

        for (Word w : dictionary.words) {
            if ( w.getWordTarget().equals(s)) {
                count++;
                dictionary.words.remove(w);
                return true;
            }
        }
        if (count == 0) {
            return false;
        }
        return false;
     }
     public boolean replace() {
         System.out.println("Replace what:");
         String wordTarget = scanner.nextLine();
         String wordExplain= scanner.nextLine();

         for (Word w : dictionary.words) {
             if (w.getWordTarget().trim().equals(wordTarget)) {
                 dictionary.words.remove(w);
                 dictionary.words.add(new Word(wordTarget, wordExplain));
                return true;
             }
         }
         return false;
     }
      public void dictionarySearcher() {
          System.out.println("Enter word:");
          String s = scanner.nextLine();
        boolean result = true;
        for (Word w : dictionary.words) {
            if ( w.getWordTarget().contains(s)) {
                System.out.println(w.getWordTarget());

            }
        }
      }

    public void dictionaryExportToFile() {
        FileOutputStream fop = null;
        try {
            File file = new File("newfile.txt");
              fop = new FileOutputStream(file);
            if (!file.exists()) {
                file.createNewFile();
            }
            byte []  b ;
            String content;
            for (Word w : dictionary.words) {
                content = w.getWordTarget() + "\t" +w.getWordExplain() + "\n";
                b = content.getBytes();
                fop.write(b);
                fop.flush();
            }
            fop.close();

        } catch (IOException e) {
            System.out.println("Nope!");
        }

    }

}
