package leetcode.array;

public class alicegame {
    String colors = "ABBBBBBBAAA";

    public static void main(String[] args) {
        System.out.println(winnerOfGame("BBBAAAABB"));
    }

    public static boolean winnerOfGame(String colors) {

        if (colors.length() <= 2) {
            return false;
        }

        StringBuilder colorss = new StringBuilder(colors);

        int AliceCounteroWin = 0;
        int BobCOunterwin = 0;
        for (int i = 1; i < colorss.length() - 1; i++) {
            String previousColor = colorss.charAt(i - 1) + "";
            String middlecolor = colorss.charAt(i) + "";
            String NextColor = colorss.charAt(i + 1) + "";
            if (middlecolor.equals("A") && previousColor.equals(middlecolor) && middlecolor.equals(NextColor)) {
                AliceCounteroWin++;
                colorss.deleteCharAt(i);
                i--;
            }

        }

        for (int i = 1; i < colorss.length() - 1; i++) {
            String previousColor = colorss.charAt(i - 1) + "";
            String middlecolor = colorss.charAt(i) + "";
            String NextColor = colorss.charAt(i + 1) + "";
            if (middlecolor.equals("B") && previousColor.equals(middlecolor) && middlecolor.equals(NextColor)) {
                colorss.deleteCharAt(i);
                BobCOunterwin++;
                i--;
            }

        }
        if(BobCOunterwin >= AliceCounteroWin){
            return false;
        }
        return true;


    }
}
