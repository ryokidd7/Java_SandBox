package hoge;

public class TR_TryCatchFinally {
	public static void main (String[] args) {
        try {  //(1)try節
            int x = Integer.parseInt(args[0]);
            System.out.println("答えは" + (100/x));
        } catch(ArithmeticException e) {  //(2)catch節
            System.err.println("エラー" + e.getMessage());
        }
    }
}
