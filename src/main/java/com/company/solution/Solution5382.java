package com.company.solution;

/**
 * 5382. HTML 实体解析器
 */
public class Solution5382 {
    public String entityParser(String text) {
        StringBuilder stringBuffer = new StringBuilder();

        while (true) {
            int andIndex = text.indexOf('&');
            if (andIndex < 0) {
                stringBuffer.append(text);
                break;
            }

            stringBuffer.append(text, 0, andIndex);
            text = text.substring(andIndex);

            int SemicolonIndex = text.indexOf(';');

            if (SemicolonIndex > 0) {
                String temp = text.substring(0, SemicolonIndex + 1);

                switch (temp) {
                    case "&quot;":
                        stringBuffer.append('"');
                        break;
                    case "&apos;":
                        stringBuffer.append('\'');
                        break;
                    case "&amp;":
                        stringBuffer.append('&');
                        break;
                    case "&gt;":
                        stringBuffer.append('>');
                        break;
                    case "&lt;":
                        stringBuffer.append('<');
                        break;
                    case "&frasl;":
                        stringBuffer.append('/');
                        break;
                    default:
                        stringBuffer.append(temp);
                }
                if (SemicolonIndex == text.length() - 1) {
                    break;
                } else {
                    text = text.substring(SemicolonIndex + 1);
                }
            }
        }
        return stringBuffer.toString();
    }
}
