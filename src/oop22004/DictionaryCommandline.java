package oop22004;
import java.io.IOException;
import java.util.*;
public class DictionaryCommandline {
    DictionaryManagement dm = new DictionaryManagement();
    public void showAllWord() {
        System.out.println(dm.dictionary.words.size());
    }

    public static void main(String[] args)  {

        Dictionary dictionary = new Dictionary();
        DictionaryManagement dm = new DictionaryManagement();
        DictionaryCommandline dc = new DictionaryCommandline();
        dm.insertFromCommandline();
        dc.showAllWord();



    }
}
