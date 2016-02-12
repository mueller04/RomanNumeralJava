import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class IntToNumeralTest {

  RomanNumeral rom;

  @Before
  public void setup() {
      rom = new RomanNumeral();
  }

  @Test
  public void given1returnsI(){
    //Arrange

    //Act
    String result = rom.convertIntToNumeral(1);

    //Assert
    assertEquals("I", result);
  }

  @Test
  public void given2returnsII(){
    //Arrange

    //Act
    String result = rom.convertIntToNumeral(2);

    //Assert
    assertEquals("II", result);
  }

  @Test
  public void given3returnsIII(){
    //Arrange

    //Act
    String result = rom.convertIntToNumeral(3);

    //Assert
    assertEquals("III", result);
  }

  @Test
  public void given4returnsIV(){
    //Arrange

    //Act
    //String result = rom.convertIntToNumeral(4);

    //Assert
    //assertEquals("IV", result);
  }

  @Test
  public void given5returnsV(){
    //Arrange

    //Act
    String result = rom.convertIntToNumeral(5);

    //Assert
    assertEquals("V", result);
  }



}
