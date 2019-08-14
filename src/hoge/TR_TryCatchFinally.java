package hoge;

public class TR_TryCatchFinally {
	public static void main (String[] args) {
        try {  //(1)try節
            int x = Integer.parseInt(args[0]);
            System.out.println("答えは" + (100/x));
        } catch(ArithmeticException e) {  //(2)catch節
            System.err.println("エラー" + e.getMessage());
        } finally {  //(3)finally節
            System.out.println("This program was finished.");
        }
        //This program was finished.
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
    	//at hoge.TR_TryCatchFinally.main(TR_TryCatchFinally.java:6)
        //と出た
    }
}
