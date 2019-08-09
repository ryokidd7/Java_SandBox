package jp.ac.hal;

public class TR_break {
	public static void main(String[] args) {
		int[][] lottery = {{ 4, 35, 63, 16, 50 },{ 59, 89, 12, 32, 9 }};
	    int award = 50;
	    boolean judge = false;

	    kuji:
	    	for (int i = 0; i < lottery.length; i++) {
	    		for (int j = 0; j < lottery[i].length; j++) {
	    			if (lottery[i][j] == award ) {
	                    judge = true;
	                    break kuji;
	                }
	            }
	        }
	    if (judge) {
            System.out.println("当たり");
        } else {
            System.out.println("ハズレ");
        }
    }
}
