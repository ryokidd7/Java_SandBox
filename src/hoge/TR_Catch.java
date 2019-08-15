package hoge;

public class TR_Catch {
	public static void main (String[] args) {
        try {
            int x = Integer.parseInt(args[0]);
            System.out.println("答えは" + (100/x));
        //ArithmeticExceptionの例外ハンドラ
        }catch(ArithmeticException e) {
            System.err.println("ArithmeticExceptionをキャッチ");
        //NumberFormatExceptionの例外ハンドラ
        } catch(NumberFormatException e) {
            System.err.println("NumberFormatExceptionをキャッチ");
        } finally {
            System.out.println("This program was finished");
        }
        //Exception in thread "main" This program was finished
        //java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
    	//at hoge.TR_Catch.main(TR_Catch.java:6)

    }
}
