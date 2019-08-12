package jp.ac.hal;

public class TR_Continue {
	public static void main(String[] args) {
		StringBuffer word = new StringBuffer("jeve");
        int numWord = word.length();
        int count = 0;

        for (int i = 0; i < numWord; i++) {
        	if( word.charAt(i) != 'e') {
                continue;
            }
        	count++;
            word.setCharAt(i, 'a');
        }
        System.out.println("変更は" + count + "個です。");
        System.out.println("jeveではなく" + word + "です。");
    }
}
