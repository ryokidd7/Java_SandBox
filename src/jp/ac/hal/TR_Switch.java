package jp.ac.hal;

public class TR_Switch {
	public static void main(String[] args) {
        int food = 10;
        switch (food) {
	        case 1: System.out.println("ハンバーグ"); break;
	        case 2: System.out.println("オムライス"); break;
	        case 3: System.out.println("寿司"); break;
	        case 4: System.out.println("パスタ"); break;
	        default: System.out.println("小籠包"); break;
	    }
        //実行結果"小籠包"
    }
}
