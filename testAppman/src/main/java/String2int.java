import java.util.ArrayList;
import java.util.List;

public class String2int {

    public static void main(String[] args) {
       System.out.println(Str2Int("abc573"));
       System.out.println(Str2Int("a5b7c3"));

    }

    public static Integer Str2Int(String str) {
        List<Integer> listInt = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            Boolean checkIsNumber = Character.isDigit(str.charAt(i));
            if (checkIsNumber) {
                char c = str.charAt(i);
                listInt.add(charToInt(c));
            }
        }
        int result = 0;
        for (int i = 0; i < listInt.size(); i++) {
            int digitResult = listInt.get(i) * (int) Math.pow(10, listInt.size() - i - 1);
            result += digitResult;

        }
        return result;


    }

    public static int charToInt(char c) {
        int result = 0;
        switch (c) {
            case '0':
                result = 0;
                break;
            case '1':
                result = 1;
                break;
            case '2':
                result = 2;
                break;

            case '3':
                result = 3;
                break;

            case '4':
                result = 4;
                break;
            case '5':
                result = 5;
                break;
            case '6':
                result = 6;
                break;
            case '7':
                result = 7;
                break;
            case '8':
                result = 8;
                break;

            case '9':
                result = 9;
                break;

        }
        return result;
    }


}
