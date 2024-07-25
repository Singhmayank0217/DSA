public class ReverseWord {

    public String reverseWords(String s) {
        String[] word = s.trim().split("\\s+");
        String ans = "";
        for (int i = word.length - 1; i >= 0; i--) {
            if (i != word.length - 1) {
                ans = ans + " ";
            }
            ans = ans + word[i];
        }
        return ans;
    }
}
