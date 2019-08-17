package hoge;

public class TR_Assertion {
	public static void main(String[] args) {
        TR_Assertion object1 = new TR_Assertion();
        object1.calNum(5, 10);
    }
	void calNum(int x, int y) {
        int z = 0;
        assert x > 0 && y > 0:"xまたはyが0以下です。";

        for (int i = 0; i < y; i++) {
            z = z + x;
        }
        assert z >= x && z >= y:"zがxまたはyより小さい値です。";

        System.out.println(z);
    }
}
