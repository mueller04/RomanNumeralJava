import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

  Map<Character, Integer> intToNumeral = new HashMap<Character, Integer>();

  public RomanNumeral(){
    intToNumeral.put('I', 1);
    intToNumeral.put('V', 5);
    intToNumeral.put('X', 10);
    intToNumeral.put('L', 50);
    intToNumeral.put('C', 100);
    intToNumeral.put('D', 500);
    intToNumeral.put('M', 1000);
  }

  public int convertNumeralToInt(String numeral) {
    char[] numeralArray = convertStringToReversedCharArray(numeral);
    int result = 0;
    int index = 0;
    for (char singleChar : numeralArray ) {

        if (index > 0 && intToNumeral.get(singleChar) < intToNumeral.get((numeralArray[index - 1]))) {
            result -= intToNumeral.get(singleChar);
        } else {
            result += intToNumeral.get(singleChar);
        }
      index++;
    }
      return result;
  }

  public char[] convertStringToReversedCharArray(String numeral) {
    StringBuffer strBuffer = new StringBuffer(numeral);
    numeral = strBuffer.reverse().toString();
    return numeral.toCharArray();
  }

  public String convertIntToNumeral(int number) {
    String numeral = "";

    for (int i = number; i > 0; i--) {
        numeral = numeral.concat("I");
    }
    return numeral;
  }



}
