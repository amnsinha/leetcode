package leetcode.array;

public class rearrage_space {

    public static void main(String[] args) {

        String text = "  this   is  a sentence ";
        System.out.println(text.length());
        System.out.println(reorderSpaces(text));
    }

    public static String reorderSpaces(String text) {



        String htext = text.replace(" ", ".");
        System.out.println(htext);
       // System.out.println(text.replace(" ","").length());
    return "";
    }

}
