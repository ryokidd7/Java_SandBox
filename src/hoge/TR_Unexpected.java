package hoge;

public class TR_Unexpected {
	public static void main (String[] args) {
        try {
            int x = 10/0;
        //例外
        } catch (ArithmeticException e) {
            System.out.println("0では割れません");
        }
    }
}
