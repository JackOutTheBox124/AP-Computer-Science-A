package UnitFive.FRQs.HiddenWord;

public class HiddenWord {

  private String word;

  public HiddenWord(String word) {
    this.word = word;
  }

  public String getHint(String guess) {
    String hint = "";
    for(int i = 0; i < guess.length(); i++) {
      if(guess.charAt(i) == this.word.charAt(i)) {
        hint = hint.concat(String.valueOf(guess.charAt(i)));
      }
      else if(this.word.indexOf(guess.charAt(i)) >= 0) {
        hint = hint.concat("+");
      }
      else {
        hint = hint.concat("*");
      }
    }
    return hint;
  }
}
