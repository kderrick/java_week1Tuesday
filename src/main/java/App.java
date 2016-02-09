import static spark.Spark.*;
import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";
    get("/", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      String userInput = request.queryParams("userInput");
      Integer results = App.scrabbleScore(userInput);
      HashMap model = new HashMap();
      model.put("template", "templates/results.vtl" );
      model.put("results", results);
      return new ModelAndView(model, layout);
      }, new VelocityTemplateEngine());
    }


    public static Integer scrabbleScore(String userInput)  {
      Integer score = 0;
      char[] splitPhrase = userInput.toCharArray();
      for (int i = 0; i < splitPhrase.length; i++) {
        if ((splitPhrase[i] == 'd') || (splitPhrase[i] == 'g')) {
          score += 2;
        } else if ((splitPhrase[i] == 'b') || (splitPhrase[i] == 'c') || (splitPhrase[i] == 'm') || (splitPhrase[i] == 'p')) {
          score += 3;
        } else if ((splitPhrase[i] == 'f') || (splitPhrase[i] == 'h') || (splitPhrase[i] == 'v') || (splitPhrase[i] == 'w') || (splitPhrase[i] == 'y')) {
          score += 4;
        } else if (splitPhrase[i] == 'k') {
          score += 5;
        } else if ((splitPhrase[i] == 'j') || (splitPhrase[i] == 'x')) {
          score += 8;
        } else if ((splitPhrase[i] == 'q') || (splitPhrase[i] == 'z')) {
          score += 10;
        } else {
          score +=1;
        }

      }
      return score;

    }
}
