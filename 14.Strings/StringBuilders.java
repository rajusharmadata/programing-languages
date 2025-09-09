public class StringBuilders {  // Ensure this class name matches your filename
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(" ");  // No need for an empty string here
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);  // This should work without any issue
        }
        System.out.println(sb);  // This prints the alphabet
    }
}
