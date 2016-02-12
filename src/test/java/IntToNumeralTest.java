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



}