import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

  Map<Character, Integer> intToNumeral = new HashMap<Character, Integer>();

  public RomanNumeral(){
    intToNumeral.put('I', 1);
    intToNumeral.put('V', 5);
    intToNumeral.put('X', 10);
    intToNumeral.put('L', 30);
  }


  public int convertNumeralToInt(String numeral) {
    char[] numeralArray = convertStringToReversedCharArray(numeral);

    int result = 0;

    int index = 0;
    for (char singleChar : numeralArray ) {

        if (singleChar == 'I') {
            result -= subtractForMinus1Results(index, numeralArray);
            result += 1;
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

  public int subtractForMinus1Results(int index, char[] numeralArray) {
    if (index > 0 &&
        (numeralArray[index - 1] == 'V' ||
        numeralArray[index -1] == 'X')) {
        return 2;
    } else {
        return 0;
    }
  }

}
