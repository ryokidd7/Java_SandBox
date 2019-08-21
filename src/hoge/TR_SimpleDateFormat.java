import java.util.*;
import java.text.*;

package hoge;

public class TR_SimpleDateFormat {
	public static void main(String[] args) {
	    Date date1 = new Date();

	    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy'年'MM'月'dd'日'");
	    System.out.println(sdf1.format(date1));

	    sdf1.applyPattern("yyyy/MM/dd");
	  }

}
