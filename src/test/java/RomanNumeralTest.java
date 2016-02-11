import org.junit.Test;
import static org.junit.Assert.*;

public class RomanNumeralTest {

  @Test
  public void givenIreturns1(){
    //Arrange
    RomanNumeral rom = new RomanNumeral();

    //Act
    int result = rom.convertNumeralToInt("I");

    //Assert
    assertEquals(1, result);
  }

  @Test
  public void givenIIreturns2(){
    //Arrange
    RomanNumeral rom = new RomanNumeral();

    //Act
    int result = rom.convertNumeralToInt("II");

    //Assert
    assertEquals(2, result);
  }

  @Test
  public void givenIIIreturns3(){
    //Arrange
    RomanNumeral rom = new RomanNumeral();

    //Act
    int result = rom.convertNumeralToInt("III");

    //Assert
    assertEquals(3, result);
  }

  @Test
  public void givenIVreturns4(){
    //Arrange
    RomanNumeral rom = new RomanNumeral();

    //Act
    int result = rom.convertNumeralToInt("IV");

    //Assert
    assertEquals(4, result);
  }

  @Test
  public void givenVreturns5(){
    //Arrange
    RomanNumeral rom = new RomanNumeral();

    //Act
    int result = rom.convertNumeralToInt("V");

    //Assert
    assertEquals(5, result);
  }

  @Test
  public void givenVIreturns6(){
    //Arrange
    RomanNumeral rom = new RomanNumeral();

    //Act
    int result = rom.convertNumeralToInt("VI");

    //Assert
    assertEquals(6, result);
  }

  @Test
  public void givenVIIreturns7(){
    //Arrange
    RomanNumeral rom = new RomanNumeral();

    //Act
    int result = rom.convertNumeralToInt("VII");

    //Assert
    assertEquals(7, result);
  }

}
