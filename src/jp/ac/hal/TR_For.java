package jp.ac.hal;

public class TR_For {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0){
                System.out.println(i);
                sum += i;
            }
        }
	}

}
