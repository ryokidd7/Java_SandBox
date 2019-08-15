package hoge;

public class TR_Catch {
	public static void main (String[] args) {
        try {
            int x = Integer.parseInt(args[0]);
            System.out.println("答えは" + (100/x));
        //ArithmeticExceptionの例外ハンドラ
        }
    }
}
