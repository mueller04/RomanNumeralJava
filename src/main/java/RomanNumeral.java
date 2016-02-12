import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeral {

  Map<Character, Integer> numeralToInt = new HashMap<Character, Integer>();
  Map<Integer, String> intToNumeral = new LinkedHashMap<Integer, String>();

  public RomanNumeral(){
    numeralToInt.put('I', 1);
    numeralToInt.put('V', 5);
    numeralToInt.put('X', 10);
    numeralToInt.put('L', 50);
    numeralToInt.put('C', 100);
    numeralToInt.put('D', 500);
    numeralToInt.put('M', 1000);

    intToNumeral.put(5, "V");
    intToNumeral.put(1, "I");
  }

  public int convertNumeralToInt(String numeral) {
    char[] numeralArray = convertStringToReversedCharArray(numeral);
    int result = 0;
    int index = 0;
    for (char singleChar : numeralArray ) {

        if (index > 0 && numeralToInt.get(singleChar) < numeralToInt.get((numeralArray[index - 1]))) {
            result -= numeralToInt.get(singleChar);
        } else {
            result += numeralToInt.get(singleChar);
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

    while (number > 0 ) {
        for (Map.Entry<Integer, String> entry : intToNumeral.entrySet()) {
            Integer hashNum = entry.getKey();
            if (number >= hashNum) {
                numeral = numeral.concat(intToNumeral.get(hashNum));
                number -= hashNum;
            }
        }
      }
      return numeral;
    }
  }
