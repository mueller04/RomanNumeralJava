import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

  Map<Integer, Character> intToNumeral = new HashMap<Integer, Character>();

  public RomanNumeral(){
    intToNumeral.put(1, 'I');
    intToNumeral.put(5, 'V');
    intToNumeral.put(10, 'X');
  }



  public int convertNumeralToInt(String numeral) {
    char[] numeralArray = convertStringToReversedCharArray(numeral);

    int result = 0;

    int index = 0;
    for (char singleChar : numeralArray ) {

        if (singleChar == intToNumeral.get(1)) {
            result -= subtractForMinus1Results(index, numeralArray);
            result += 1;
        }

        if (singleChar == intToNumeral.get(5)) {
            result += 5;
        }

        if (singleChar == intToNumeral.get(10)){
            result += 10;
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
        (numeralArray[index - 1] == intToNumeral.get(5) ||
        numeralArray[index -1] == intToNumeral.get(10))) {
        return 2;
    } else {
        return 0;
    }
  }

}
