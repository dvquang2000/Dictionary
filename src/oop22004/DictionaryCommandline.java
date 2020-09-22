package oop22004;

public class DictionaryCommandline {
    DictionaryManagement dm = new DictionaryManagement();
    public void showAllWord() {
        System.out.println("No" + "/t" + "English" + "/t" + "Vietnamses");
        for ( int i = 0; i <= dm.dictionary.words.length; i++ ) {
            System.out.print(i + "/t" + dm.dictionary.words[i].getWordTarget()
             + "/t" + dm.dictionary.words[i].getWordExplain());
        }
    }

    public static void main(String[] args) {

        Word [] words;
        Dictionary dictionary = new Dictionary();
        DictionaryManagement dm = new DictionaryManagement();
        DictionaryCommandline dc = new DictionaryCommandline();
        dm.insertFromCommandline();
        dc.showAllWord();



    }
}
