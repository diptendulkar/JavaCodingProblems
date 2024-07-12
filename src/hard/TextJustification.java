package hard;

import java.util.ArrayList;
import java.util.List;

/*
* Given an array of strings words and a width maxWidth, format the text such that each line has
* exactly maxWidth characters and is fully (left and right) justified.
* You should pack your words in a greedy approach; that is, pack as many words as you can in each line. Pad extra spaces ' ' when necessary so that each line has exactly maxWidth characters.

Extra spaces between words should be distributed as evenly as possible. If the number of spaces on a line does not divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right.

For the last line of text, it should be left-justified, and no extra space is inserted between words
* Example 1:

Input: words = ["This", "is", "an", "example", "of", "text", "justification."], maxWidth = 16
Output:
[
   "This    is    an",
   "example  of text",
   "justification.  "
]
* */
public class TextJustification {

    public static void main(String[] args) {
       String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
       int maxWidth = 16;
        List<String>  result = fullJustify(words,maxWidth);
        result.forEach(System.out::println);


    }

    public static List<String> fullJustify(String[] words, int maxWidth) {

        List<String> result = new ArrayList<>();
        int n = words.length;
        int index = 0;
        while (index < n) {
            int totalChars = words[index].length();
            int last = index + 1;

            while (last < n) {
                if (totalChars + 1 + words[last].length() > maxWidth) break;
                totalChars += 1 + words[last].length();
                last++;
            }

            StringBuilder line = new StringBuilder();
            int gaps = last - index - 1;

            if (last == n || gaps == 0) {
                for (int i = index; i < last; i++) {
                    line.append(words[i]);
                    if (i < last - 1) {
                        line.append(" ");
                    }
                }
                while (line.length() < maxWidth) {
                    line.append(" ");
                }
            } else {
                int spaces = (maxWidth - totalChars) / gaps;
                int extraSpaces = (maxWidth - totalChars) % gaps;

                for (int i = index; i < last; i++) {
                    line.append(words[i]);
                    if (i < last - 1) {
                        for (int j = 0; j <= (spaces + (i - index < extraSpaces ? 1 : 0)); j++) {
                            line.append(" ");
                        }
                    }
                }
            }

            result.add(line.toString());
            index = last;
        }

        return result;
    }
}
