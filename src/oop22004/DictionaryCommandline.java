package oop22004;
import java.io.IOException;
import java.util.*;
public class DictionaryCommandline extends DictionaryManagement {
    DictionaryManagement dm = new DictionaryManagement();
    DictionaryCommandline() {

    }

    public void  showAllWords(){
        int i = 0;
        System.out.printf("%-5s%-20s%s \n", "No","|English","|Vietnamese");
        for ( Word w : dm.dictionary.words) {
            i++;
            System.out.printf("%-5s%-20s%s \n", i, w.getWordTarget(),w.getWordExplain());
        }
    }
    public void dictionaryBasic() {
        dm.insertFromCommandline();
        showAllWords();
    }
    public void dictionaryAdvanced() {
        dm.insertFromFile();
        dm.dictionaryLookup();
        showAllWords();
    }
     public void dictionaryNew () {
        dm.dictionarySearcher();
     }

    public static void main(String[] args)  {

        Dictionary dictionary = new Dictionary();
        DictionaryManagement dm = new DictionaryManagement();
        DictionaryCommandline dc = new DictionaryCommandline();
        dc.dictionaryAdvanced();
       dc.dictionaryNew();
        dc.showAllWords();









    }
}
