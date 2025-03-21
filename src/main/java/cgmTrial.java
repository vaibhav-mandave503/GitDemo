import java.util.List;
import java.util.HashSet;

public class cgmTrial {

	public static void main(String[] args) {

		int[] LInt = {10,15,20,25,10};
		
		HashSet<Integer> hs = new HashSet<Integer>();
		for (Integer in: LInt)
		{
			hs.add(in);
		}
		
		System.out.println(hs);
		
		//Prog 2
		String str = "Vai@bh@!#av";
		char[] strChrArr = str.toCharArray();
		String revStr= "";
		int len = str.length();
		System.out.println(len);
		
		for (int i=len-1, j=0; i>0; i--)
		{
//			char ch = str.charAt(i);
//			int asciiValue = int(strChrArr[i]);
			int asciiValue = Integer.parseInt(strChrArr[i]);
			if ((65 <= asciiValue <=90) && (97<= asciiValue <=122))
			{
				Character temp;
				temp = strChrArr[i];
				strChrArr[i] = strChrArr[j];
				strChrArr[j] = temp;
				j++;
			}
			
		}
		
		
	}

}
