package leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class Text_Justification {

    public static void main(String[] args) {

        String text = "  hello";
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};

        System.out.println(fullJustify(words, 16));
    }

    public static List<String> fullJustify(String[] words, int maxWidth) {

        List<String> firstDistributionOfWords = new ArrayList<>();
        String fitinIndex = "";

        for (int i = 0; i < words.length; i++) {
            int lengthofCurrentandupcomingword = fitinIndex.length() + words[i].length();

            if (lengthofCurrentandupcomingword < maxWidth) {
                fitinIndex += words[i];
                fitinIndex += " ";
                if (words.length - 1 == i) {
                    firstDistributionOfWords.add(fitinIndex.trim());
                }

            } else if (fitinIndex.length() > maxWidth) {
                fitinIndex = "";

            } else {
                firstDistributionOfWords.add(fitinIndex.trim());
                i--;
                fitinIndex = "";
            }
        }

        for (int i = 0; i < firstDistributionOfWords.size(); i++) {

            int noOfwords = firstDistributionOfWords.get(i).split(" ").length;

            /*int dividentOfSpace = 0;
            int remainder = 0;
            if((noOfwords.length == 1)){
                dividentOfSpace = numnerOfspace;
                remainder = numnerOfspace;
            }
            else{
                dividentOfSpace = numnerOfspace / (noOfwords.length - 1);
                remainder = numnerOfspace % (noOfwords.length - 1);
            }
*/

        }
        return firstDistributionOfWords;
    }

}
