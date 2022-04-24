public class HiddenWord extends Runner {
    static String word;
    public HiddenWord(String w) {
        word = w;
    }

    public static String getHint(String guess) {
        String result = "";
        for (int n = 0; n < guess.length(); n++) {
            String a = guess.substring(n, n+1);
            String b = word.substring(n, n+1);
            if (a.equals(b)) {
                result = result + a;
            } else if ( word.indexOf(a) != -1 ) {
                result = result + "+";
            } else {
                result = result + "*";
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }

    @Override
    public void run() {
        HiddenWord h1 = new HiddenWord("HARPS");
        System.out.println(h1.getHint("AAAAA"));
        System.out.println(h1.getHint("HARPK"));
        System.out.println(h1.getHint("HARPH"));
        System.out.println(h1.getHint("HARPS"));
    }

    @Override
    public String desc() {
        return null;
    }
}
