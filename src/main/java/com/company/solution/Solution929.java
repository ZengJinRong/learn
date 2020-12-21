package com.company.solution;

import java.util.HashSet;
import java.util.Set;

/**
 * 929. 独特的电子邮件地址
 */
public class Solution929 {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            String[] split = email.split("@");
            int index = split[0].indexOf("+");
            if (index > 0) {
                split[0] = split[0].substring(0, index);
            }
            split[0] = split[0].replaceAll("\\.", "");
            set.add(String.join("@", split));
        }
        return set.size();
    }

    public int numUniqueEmails2(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            int i = email.indexOf("@");
            String prefix = email.substring(0, i);
            String suffix = email.substring(i);
            StringBuilder stringBuilder = new StringBuilder();
            for (char c : prefix.toCharArray()) {
                if (c == '.') {
                    continue;
                }
                if (c == '+') {
                    break;
                }
                stringBuilder.append(c);
            }
            stringBuilder.append(suffix);
            set.add(stringBuilder.toString());
        }
        return set.size();
    }
}
