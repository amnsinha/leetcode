package leetcode.array;

public class rearrage_space {

    public static void main(String[] args) {

        String text = "  hello";
        String[] fitinarray1;

        System.out.println(reorderSpaces(text));
    }

    public static String reorderSpaces(String text) {

        if(text.trim().length() < 1){
            return text;
        }

        int numnerOfspace = text.length() - text.replace(" ", "").length();
        String finals = "";
        String texttoread = text.trim().replace(" ", ".");

        String lastharacter = "";
        for (int i = 0; i < texttoread.length(); i++) {
            if (!("" + texttoread.charAt(i)).equals(".")) {
                finals += texttoread.charAt(i) + "";
                lastharacter = texttoread.charAt(i) + "";
            } else if (lastharacter.equals(texttoread.charAt(i) + "")) {
            } else {
                lastharacter = texttoread.charAt(i) + "";
                finals += " ";
            }
        }

        String[] noOfwords = finals.split(" ");
        int dividentOfSpace = 0;
        int remainder = 0;
        if((noOfwords.length == 1)){
            dividentOfSpace = numnerOfspace;
            remainder = numnerOfspace;
        }
        else{
            dividentOfSpace = numnerOfspace / (noOfwords.length - 1);
            remainder = numnerOfspace % (noOfwords.length - 1);
        }
        //int remainder = numnerOfspace % (noOfwords.length - 1);
        String putSpace = "";
        String putReamainderSpace = "";
        for (int j = 0; j < dividentOfSpace; j++) {
            putSpace += " ";
        }

        for (int j = 0; j < remainder; j++) {
            putReamainderSpace += " ";
        }

        String superFinals = "";
        for (int j = 0; j < noOfwords.length; j++) {
            superFinals += noOfwords[j];
            superFinals += putSpace;
        }

        superFinals = superFinals.trim();
        if (remainder != 0) {
            superFinals = superFinals + putReamainderSpace;
        }


        return superFinals;
    }

}
