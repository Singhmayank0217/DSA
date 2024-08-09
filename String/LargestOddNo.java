package String;

public class LargestOddNo {

    public String largestOddNumber(String num) {
        String res = "";
        int dig = 0;
        for (int i = num.length() - 1; i >= 0; i--) {
            dig = (int) num.charAt(i);
            if (dig % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
