package oop22004;

public class Word {
    private String wordTarget;
    private String wordExplain;

    Word(String wordTarget, String wordExplain) {
            this.wordTarget = wordTarget;
             this.wordExplain = wordExplain;
    }
    // getter, setter method
    public void setWordTarget(String wordTarget) {
        this.wordTarget = wordTarget;
    }

    public String getWordTarget() {
        return wordTarget;
    }

    public void setWordExplain(String wordExplain) {
        this.wordExplain = wordExplain;
    }

    public String getWordExplain() {
        return wordExplain;
    }


}
