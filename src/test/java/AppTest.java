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
  @Test
  public void scrabbleScore_returnsAScrabbleScoreForALetter_4() {
    App appTest = new App();
    Integer score = 4;
    assertEquals(score, appTest.scrabbleScore("v"));
  }
  @Test
  public void scrabbleScore_returnsAScrabbleScoreForALetter_5() {
    App appTest = new App();
    Integer score = 5;
    assertEquals(score, appTest.scrabbleScore("k"));
  }

  @Test
  public void scrabbleScore_returnsAScrabbleScoreForALetter_8() {
    App appTest = new App();
    Integer score = 8;
    assertEquals(score, appTest.scrabbleScore("x"));
  }

  @Test
  public void scrabbleScore_returnsAScrabbleScoreForALetter_10() {
    App appTest = new App();
    Integer score = 10;
    assertEquals(score, appTest.scrabbleScore("q"));
  }

  @Test
  public void scrabbleScore_returnsAScrabbleScoreForAWord_24() {
    App appTest = new App();
    Integer score = 24;
    assertEquals(score, appTest.scrabbleScore("xylophone"));
  }
}
