package jp.ac.hal;

public class TR_If {
	public static void main(String[] args) {
		int score = 80;
        char rank;
        if (score >= 95) {
            rank='A';
        } else if (score >= 75) {
            rank='B';
        } else if (score >= 50) {
            rank='C';
        } else {
            rank='D';
        }
        System.out.println("あなたのランクは" + rank + "です。");
    }
}
