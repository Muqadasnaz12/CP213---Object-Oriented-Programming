package cp213;

/**
 * @author Muqadas Nazif, 169061218
 * @version 2025-01-05
 */
public class Strings {
    // Constants
    public static final String VOWELS = "aeiouAEIOU";

    /**
     * Determines if string is a "palindrome": a word, verse, or sentence (such as
     * "Able was I ere I saw Elba") that reads the same backward or forward. Ignores
     * case, spaces, digits, and punctuation in the string parameter s.
     *
     * @param string a string
     * @return true if string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(final String string) {
    	int left = 0;
    	int right = string.length() -1 ;
    	while (left < right) {
    		char leftChar = string.charAt(left);
    		char rightChar = string.charAt(right);
    		if (!Character.isLetter(leftChar)) {
    			left++;
    		} else if (!Character.isLetter(rightChar)) {
    			right --;
    		} else {
    			if (Character.toLowerCase(leftChar)!= Character.toLowerCase(rightChar)) {
    				return false;
    			}
    			left ++;
    			right --;
    		}
    	}
	return true;
    }

    /**
     * Determines if name is a valid Java variable name. Variables names must start
     * with a letter or an underscore, but cannot be an underscore alone. The rest
     * of the variable name may consist of letters, numbers and underscores.
     *
     * @param name a string to test as a Java variable name
     * @return true if name is a valid Java variable name, false otherwise
     */
    public static boolean isValid(final String name) {
    	if (name == null|| name.length() ==0|| name.equals("-")) {
    		return false;
    	}
    	char first = name.charAt(0);
    	if (!Character.isLetter(first) && first != '_') {
    		return false;
    	}
    	for (int i =1; i < name.length(); i++) {
    		char curr = name.charAt(i);
    		if (!Character.isLetterOrDigit(curr) && curr != '_') {
    			return false;
    		}
    	}
	return true;
    }

    /**
     * Converts a word to Pig Latin. The conversion is:
     * <ul>
     * <li>if a word begins with a vowel, add "way" to the end of the word.</li>
     * <li>if the word begins with consonants, move the leading consonants to the
     * end of the word and add "ay" to the end of that. "y" is treated as a
     * consonant if it is the first character in the word, and as a vowel for
     * anywhere else in the word.</li>
     * </ul>
     * Preserve the case of the word - i.e. if the first character of word is
     * upper-case, then the new first character should also be upper case.
     *
     * @param word The string to convert to Pig Latin
     * @return the Pig Latin version of word
     */
    public static String pigLatin(String word) {
    	if(word == null|| word.isEmpty()) {
    		return word;
    	}
    	String lower = word.toLowerCase();
    	if (VOWELS.indexOf(lower.charAt(0))!= -1) {
    		return lower +"way";
    	} else {
    		char replace = lower.charAt(0);
    		lower = lower.substring(1);
    		lower = lower+"ay";
    		return lower+"ay";
    	}
    }
}
