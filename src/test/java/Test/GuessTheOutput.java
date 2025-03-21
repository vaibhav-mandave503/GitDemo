package Test;

import java.util.HashSet;

public class GuessTheOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";
		String s2 = "abc";

		System.out.println("s1 == s2 is:" + s1 == s2); // false as location is different
		//////////////////////////////////////////////////////////////////////////////////////
		String s3 = "JournalDev";
		int start = 1;
		char end = 5;

		System.out.println(s3.substring(start, end)); // ourn
		//////////////////////////////////////////////////////////////////////////////////////
		HashSet shortSet = new HashSet();

		for (short i = 0; i < 100; i++) {
	    shortSet.add(i);
	    shortSet.remove(i - 1);
		}

		System.out.println(shortSet.size()); //100
	    //////////////////////////////////////////////////////////////////////////////////////
//		try {
//			boolean flag=false;
//			if (flag) {
//		  		while (true) {
//		   		}
//		   	} else {
//		   		System.exit(1);
//		   	}
//		} finally {
//		   	System.out.println("In Finally");  // flag = true / false in both cases this stmt will not get printed
//		}
	    //////////////////////////////////////////////////////////////////////////////////////		
		String x = "abc";
		String y = "abc";

		x.concat(y);

		System.out.print(x); //abc
		//////////////////////////////////////////////////////////////////////////////////////
		
		String p = "abc";
		String q = "abc";

		p.concat(q);

		System.out.print(p); //abc
		//////////////////////////////////////////////////////////////////////////////////////
		
	}

}
