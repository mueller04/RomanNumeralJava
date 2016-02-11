import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class RomanNumeralTest {

  RomanNumeral rom;

  @Before
  public void setup() {
      rom = new RomanNumeral();
  }

  @Test
  public void givenIreturns1(){
    //Arrange

    //Act
    int result = rom.convertNumeralToInt("I");

    //Assert
    assertEquals(1, result);
  }

  @Test
  public void givenIIreturns2(){
    //Arrange

    //Act
    int result = rom.convertNumeralToInt("II");

    //Assert
    assertEquals(2, result);
  }

  @Test
  public void givenIIIreturns3(){
    //Arrange

    //Act
    int result = rom.convertNumeralToInt("III");

    //Assert
    assertEquals(3, result);
  }

  @Test
  public void givenIVreturns4(){
    //Arrange

    //Act
    int result = rom.convertNumeralToInt("IV");

    //Assert
    assertEquals(4, result);
  }

  @Test
  public void givenVreturns5(){
    //Arrange

    //Act
    int result = rom.convertNumeralToInt("V");

    //Assert
    assertEquals(5, result);
  }

  @Test
  public void givenVIreturns6(){
    //Arrange

    //Act
    int result = rom.convertNumeralToInt("VI");

    //Assert
    assertEquals(6, result);
  }

  @Test
  public void givenVIIreturns7(){
    //Arrange

    //Act
    int result = rom.convertNumeralToInt("VII");

    //Assert
    assertEquals(7, result);
  }

  @Test
  public void givenIXreturns9(){
    //Arrange

    //Act
    int result = rom.convertNumeralToInt("IX");

    //Assert
    assertEquals(9, result);
  }

  @Test
  public void givenXreturns10(){
    //Arrange

    //Act
    int result = rom.convertNumeralToInt("X");

    //Assert
    assertEquals(10, result);
  }

  @Test
  public void givenXIVreturns14(){
    //Arrange

    //Act
    int result = rom.convertNumeralToInt("XIV");

    //Assert
    assertEquals(14, result);
  }

  @Test
  public void givenXVreturns15(){
    //Arrange

    //Act
    int result = rom.convertNumeralToInt("XV");

    //Assert
    assertEquals(15, result);
  }

  @Test
  public void givenXIXreturns19(){
    //Arrange

    //Act
    int result = rom.convertNumeralToInt("XIX");

    //Assert
    assertEquals(19, result);
  }

  @Test
  public void givenXXreturns20(){
    //Arrange

    //Act
    int result = rom.convertNumeralToInt("XX");

    //Assert
    assertEquals(20, result);
  }

  @Test
  public void givenXXXIXreturns39(){
    //Arrange

    //Act
    int result = rom.convertNumeralToInt("XXXIX");

    //Assert
    assertEquals(39, result);
  }

  @Test
  public void givenXLreturns40(){
    //Arrange

    //Act
    int result = rom.convertNumeralToInt("XL");

    //Assert
    assertEquals(40, result);
  }

  @Test
  public void givenXLIVreturns44(){
    //Arrange

    //Act
    int result = rom.convertNumeralToInt("XLIV");

    //Assert
    assertEquals(44, result);
  }

  @Test
  public void givenLreturns50(){
    //Arrange

    //Act
    int result = rom.convertNumeralToInt("L");

    //Assert
    assertEquals(50, result);
  }


}
