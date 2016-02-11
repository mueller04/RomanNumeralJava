public class RomanNumeral {

public int convertNumeralToInt(String numeral) {

  StringBuffer strBuffer = new StringBuffer(numeral);
  numeral = strBuffer.reverse().toString();
  char[] numeralArray = numeral.toCharArray();

  int result = 0;

  int index = 0;
  for (char singleChar : numeralArray ) {
      if (singleChar == 'I') {
          if (index > 0 && numeralArray[index - 1] == 'V') {
              result -= 2;
          }
          result += 1;
      }

      if (singleChar == 'V') {

        result += 5;
      }
    index++;
  }


    return result;
}


}
