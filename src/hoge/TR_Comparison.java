package hoge;

public class TR_Comparison {
	public static void main(String[] args) {
        double exValue1 = 23.52;
        double exValue2 = 53.38;
        //20.43と50.12のうち、大きな値を返す
        System.out.println(Math.max(exValue1, exValue2));
        //20.43と50.12のうち、小さな値を返す。
        System.out.println(Math.min(exValue1, exValue2));
        //実行結果
        //53.38
        //23.52

    }
}
