package leetcode.concepts;

public class concepts {

    public static void main(String[] args) {
        String[] words = {"hello", "leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        System.out.print(isAlienSorted(words, order));
    }

    public static boolean isAlienSorted(String[] words, String order) {


        int[] array = new int[26];

        int i = 0;
        for(char ch : order.toCharArray()){
            array[i] = ch - 'a';
        }
        System.out.println(array[i]);



        return false;
    }
}
