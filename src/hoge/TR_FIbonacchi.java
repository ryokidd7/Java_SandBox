package hoge;

public class TR_FIbonacchi {
	public static void main(String[] args) {
		int f0, f1, fn;
		f0 = 0;
		System.out.println( f0 );

		f1 = 1;
		System.out.println( f1 );
		for ( int i = 2; i <= 10; ++ i ) {
			fn = f0 + f1;
			System.out.println( fn );
			f0 = f1;
			f1 = fn;
			//実行結果
			//0
			//1
			//1
			//2
			//3
			//5
			//8
			//13
			//21
			//34
			//55
		}
	}
}
