package hoge;

public class TR_Assertion {
	void calNum(int x, int y) {
        int z = 0;
        assert x > 0 && y > 0:"xまたはyが0以下です。";
    }
}
