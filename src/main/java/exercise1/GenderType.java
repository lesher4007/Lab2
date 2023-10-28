package exercise1;

public enum GenderType{
    M("He","His"),F("She","Her");

    GenderType(String pronoun, String pronoun2) {
        this.pronoun = pronoun;
        this.pronoun2 = pronoun2;
    }

    public String getPronoun() {
        return pronoun;
    }

    public String getPronoun2() {
        return pronoun2;
    }

     private String pronoun;
     private String pronoun2;

}