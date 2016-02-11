public class RomanNumeral {

  public int convertNumeralToInt(String numeral) {
    char[] numeralArray = convertStringToReversedCharArray(numeral);

    int result = 0;

    int index = 0;
    for (char singleChar : numeralArray ) {

        if (singleChar == 'I') {
            result -= subtractForIV(index, numeralArray);
            result += 1;
        }

        if (singleChar == 'V') {
          result += 5;
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

  public int subtractForIV(int index, char[] numeralArray) {
    if (index > 0 && numeralArray[index - 1] == 'V') {
        return 2;
    } else {
        return 0;
    }
  }

}
