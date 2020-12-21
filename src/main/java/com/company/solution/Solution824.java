package com.company.solution;

/**
 * 824. 山羊拉丁文
 */
public class Solution824 {
    public String toGoatLatin(String S) {
        String[] words = S.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder stringBuilder = new StringBuilder(word.length() + i + 3);
            char prefix = word.charAt(0);
            switch (prefix) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    stringBuilder.append(word)
                            .append("ma");
                    break;
                default:
                    stringBuilder.append(word.substring(1))
                            .append(prefix)
                            .append("ma");
            }
            for (int j = 0; j <= i; j++) {
                stringBuilder.append('a');
            }
            words[i] = stringBuilder.toString();
        }
        return String.join(" ", words);
    }
}
