package Test;
//NO
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class reverseStringKeepSpecialTest {

	public static void main(String[] args) {
		String toReverse = "abcd%ef";
	    char[] chArray = toReverse.toCharArray();
	 
	    int i = 0, j = chArray.length - 1;
	    while (i < j) {
	        if (!Character.isAlphabetic(chArray[i])) {
	            ++i;
	        }
	        if (!Character.isAlphabetic(chArray[j])) {
	            --j;
	        }
	        char temp = chArray[i];
	        chArray[i] = chArray[j];
	        chArray[j] = temp;
	        ++i;
	        --j;
	    }
	    
	    String reversed = String.valueOf(chArray);
	    System.out.println(reversed);   // fedc%ba

	    for (int n = 0, m = chArray.length - 1; n < chArray.length; n++, m--) {
	        if (!Character.isAlphabetic(chArray[n])) {
	            ++n;
	        }
	        if (!Character.isAlphabetic(chArray[m])) {
	            --m;
	        }
	        assertEquals(toReverse.toCharArray()[n], chArray[m]);
	    }
	    assertTrue(!Character.isAlphabetic(toReverse.toCharArray()[4]));
	    System.out.println(reversed);   // fedc%ba
	}

}
