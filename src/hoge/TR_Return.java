package hoge;

public class TR_Return {
	static float taxCal(int p) {
        float taxPrice = 0.05F * p;
        return taxPrice;
    }
	public static void main(String[] args) {
        int price = 100;
        int tax = (int)taxCal(price);
    }
}
