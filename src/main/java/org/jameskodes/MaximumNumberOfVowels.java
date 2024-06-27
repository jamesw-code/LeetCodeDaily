package org.jameskodes;

public class MaximumNumberOfVowels {

    public int maxVowels(String s, int k) {

        char[] stringToChars = s.toCharArray();
        int n = stringToChars.length;
        int totalChars = 0;

        // Create first window
        for(int x = 0; x < k; x++) {
            if(isVowel(stringToChars[x])) {
                totalChars += 1;
            }
        }
        // Set first max for first window
        int maxVowel = totalChars;

        // Start After Window
        for(int i = k; i < n; i++) {
            // New index to window add if needed
            if(isVowel(stringToChars[i])) {
                totalChars += 1;
            }
            // Old index in window, remove if needed
            if(isVowel(stringToChars[i-k])) {
                totalChars -= 1;
            }
            // check if new window is larger
            if(totalChars > maxVowel) {
                maxVowel = totalChars;
            }

        }

        return maxVowel;
    }

    public boolean isVowel(char letter) {

        switch (letter) {
            case 'a', 'e', 'i','o','u':
                return true;
            default:
                return false;
        }

    }

}
