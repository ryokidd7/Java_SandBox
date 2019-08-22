package hoge;

public class TR_Split {
	public static void main(String[] args) {
	    String str = new String("java,Java,JAVA");
	    String[] strAry = str.split(",");
	    for (int i=0; i < strAry.length; i++) {
	        System.out.println(strAry[i]);
	      }
	  }
}
