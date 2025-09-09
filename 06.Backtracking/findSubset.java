public class findSubset {

    // Method to find all subsets of the given string
    public static void Findsubsets(String str, int i, String ans) {
        // Base case: if we've processed all characters in the string
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null"); // Print "null" for the empty subset
            } else {
                System.out.println(ans); // Print the current subset
            }
            return; // Exit the current recursive call
        }

        // Recursive case: include the current character in the subset  || Choice -- yes
        Findsubsets(str, i + 1, ans + str.charAt(i));

        // Recursive case: exclude the current character from the subset || Choice -- No
        Findsubsets(str, i + 1, ans);
    }

    public static void main(String[] args) {
        // Input string for which subsets are to be found
        String str = "abc";
        // Variable to store the current subset being built
        String ans = "";

        // Call the method to find subsets starting from the first character
        Findsubsets(str, 0, ans);
    }
}
