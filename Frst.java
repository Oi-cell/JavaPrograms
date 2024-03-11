import java.util.HashSet;

public class Frst {
    public static void main(String[] args) {
        System.out.println("hello world");
        HashSet<Character> set = new HashSet<Character>();
        String str = "Sandeep";
        String tr1 = " ";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!set.contains(c)) {
                set.add(c);
                tr1 += c;
            }
        }

        System.out.println(tr1);
    }
}