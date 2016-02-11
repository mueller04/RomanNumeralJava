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

  @Test
  public void givenLVIreturns56(){
    //Arrange

    //Act
    int result = rom.convertNumeralToInt("LVI");

    //Assert
    assertEquals(56, result);
  }

  @Test
  public void givenXCreturns90(){
    //Arrange

    //Act
    int result = rom.convertNumeralToInt("XC");

    //Assert
    assertEquals(90, result);
  }

  @Test
  public void givenXCIVCreturns94(){
    //Arrange

    //Act
    int result = rom.convertNumeralToInt("XCIV");

    //Assert
    assertEquals(94, result);
  }

  @Test
  public void givenCreturns100(){
    //Arrange

    //Act
    int result = rom.convertNumeralToInt("C");

    //Assert
    assertEquals(100, result);
  }

  @Test
  public void givenCDLXXXIVreturns484(){
    //Arrange

    //Act
    int result = rom.convertNumeralToInt("CDLXXXIV");

    //Assert
    assertEquals(484, result);
  }

  @Test
  public void givenCMXCIXreturns999(){
    //Arrange

    //Act
    int result = rom.convertNumeralToInt("CMXCIX");

    //Assert
    assertEquals(999, result);
  }

  @Test
  public void givenMreturns1000(){
    //Arrange

    //Act
    int result = rom.convertNumeralToInt("M");

    //Assert
    assertEquals(1000, result);
  }


}
