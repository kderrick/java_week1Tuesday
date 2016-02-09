import static spark.Spark.*;
import java.util.HashMap;

import spark.ModelAndView;
// import spark.template.velocity.VelocityTemplateEngine;

public class App {
  public static void main(String[] args) {}


    public static Integer scrabbleScore(String phrase)  {
      Integer score = 0;
      char[] splitPhrase = phrase.toCharArray();
      for (int i = 0; i < splitPhrase.length; i++) {
        if ((splitPhrase[i] == 'd') || (splitPhrase[i] == 'g')) {
          score += 2;
        } else if ((splitPhrase[i] == 'b') || (splitPhrase[i] == 'c') || (splitPhrase[i] == 'm') || (splitPhrase[i] == 'm')) {
          score += 3;
        } else {
          score += 1;
        }
      }
      return score;

    }
}
