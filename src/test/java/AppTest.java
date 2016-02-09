import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void scrabbleScore_returnsAScrabbleScoreForALetter_1() {
    App appTest = new App();
    Integer score = 1;
    assertEquals(score, appTest.scrabbleScore("a"));
  }

  @Test
  public void scrabbleScore_returnsAScrabbleScoreForALetter_2() {
    App appTest = new App();
    Integer score = 2;
    assertEquals(score, appTest.scrabbleScore("d"));
  }

  @Test
  public void scrabbleScore_returnsAScrabbleScoreForALetter_3() {
    App appTest = new App();
    Integer score = 3;
    assertEquals(score, appTest.scrabbleScore("b"));
  }


}
