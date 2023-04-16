class main {

    public static int countChanges(String str) {
        int n = str.length();
        int count = 0;

        // loop through the first half of the string
        for (int i = 0; i < n / 2; i++) {
            // get the characters from the two ends of the string
            char c1 = str.charAt(i);
            char c2 = str.charAt(n - i - 1);

            // count the number of changes needed
            int diff = Math.abs(c1 - c2);
            count += Math.min(diff, 26 - diff);
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "lol";
        int count = countChanges(str);
        System.out.println("The minimum number of changes needed to make the string palindrome is: " + count);
    }
}