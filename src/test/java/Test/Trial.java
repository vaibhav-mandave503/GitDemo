package Test;

import java.util.*;
import java.util.Map.Entry;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectReader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.*;
//import java.util.LinkedHashMap;
//import java.util.HashMap;
//import java.io.BufferedReader;
//import java.util.Arrays;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Map.Entry;

public class Trial {

	public static void main(String[] args) throws IOException {
		int a=4;		// TODO Auto-generated method stub
		System.out.println(++a);
		a = 4;
		System.out.println(a++);
		///////////////////////////////////////////////////////////////////////////////////////////
		// reverse string using string
		String str = "jhadsgjfwjcwgb";
		String revStr = "";
		char ch;
		
		for (int i=0; i<str.length(); i++)
		{
			ch = str.charAt(i);
			revStr=ch+revStr;
		}
		System.out.println("Reverse String:"+revStr);
		///////////////////////////////////////////////////////////////////////////////////////////
		// reverse string using string builder
	    StringBuilder strbldr = new StringBuilder("jhadsgjfwjcwgb");
	    System.out.println(strbldr.toString());
	    strbldr.reverse();
	    System.out.println(strbldr.toString());
		///////////////////////////////////////////////////////////////////////////////////////////	
		// reverse string using string buffer
        String s = "jhadsgjfwjcwgb";

        // Conversion from String object To StringBuffer
        StringBuffer sbf = new StringBuffer(s);
          // Reverse String
        sbf.reverse();
        System.out.println(sbf);
        /////////////////////////////////////////////////////////////////////////////////////////
        // Text File to Key Value Pair
        // D:\OneDrive - Coforge Limited\Miscellaneous\Info\prof\santander\Resume\2025\Ayan_HSBC\Info\TextFile_Key_Value_Pairs.txt
        
        final String filePath = "C://Java_Programs_Imp//TextFile_Key_Value_Pairs.txt";
        Map<String, String> infoMap = new LinkedHashMap<String, String>(); 
        BufferedReader br = null; 
        
        try 
        {
        	File file = new File(filePath);
            // create BufferedReader object from the File 
            br = new BufferedReader(new FileReader(file)); 
  
            String line = null; 
  
            // read file line by line 
            while ((line = br.readLine()) != null) { 
                // split the line by : 
                String[] parts = line.split(":"); 
  
                // first part is name, second is number 
                String name = parts[0].trim(); 
                String number = parts[1].trim(); 
  
                // put name, number in HashMap if they are not empty 
                if (!name.equals("") && !number.equals("")) 
                	infoMap.put(name, number);
        }
            //Iterating LinkedHashMap and printing key - value pairs
            Iterator<Entry<String, String>> itr = infoMap.entrySet().iterator();
            
            if (infoMap.isEmpty()){
                System.out.println("\nMap is Empty.");
            } else if (!infoMap.isEmpty()){
                System.out.println("\nMap Key - Value Pairs:");
                while (itr.hasNext())
                {
                    Entry<String, String> entry = itr.next();
                    System.out.println("key: "+entry.getKey()+", Value: "+entry.getValue());
                }
            }
        }
        catch (Exception e) { 
            e.printStackTrace(); 
        } 
        finally {
            // Always close the BufferedReader 
            if (br != null) { 
                try { 
                    br.close(); 
                } 
                catch (Exception e) {
                	e.printStackTrace();
                }; 
            } 
        } 
        /////////////////////////////////////////////////////////////////////////////////////////
        // Occurrence of the character in string
        HashMap <Character, Integer> charCountMap = new LinkedHashMap <Character, Integer> ();
        String str1 = "abracadabra";
        
        char[] charArray = str1.toCharArray();
        
        for (char c:charArray)
        {
        	if (charCountMap.containsKey(c)) {
        		charCountMap.put(c, charCountMap.get(c)+1);        		        		
        	} else {
        		charCountMap.put(c, 1);
        	}
        }
        System.out.println("Print the character and it's occurances");
        for (Map.Entry entry: charCountMap.entrySet())
        {
        	System.out.println(entry.getKey()+" character occured "+entry.getValue()+ " times" );
        }
        /////////////////////////////////////////////////////////////////////////////////////////
        // [1789, 2035, 1899, 1456] fetch number 1899 from array
        Integer[] intArr = {1789, 2035, 1898, 1456};
        Boolean foundInterger = false;
        for (int i=0; i< intArr.length; i++)
        {
        	if (intArr[i] == 1899)
        	{
        		foundInterger = true;
        		System.out.println("\nFound 1899 in the Integer Array");
        	}
        }
        System.out.println("\nfoundInterger="+foundInterger);
        if (foundInterger == false)
        {
        	System.out.println("\nNumber 1899 is not found in the Integer Array");
        }
        	
        /////////////////////////////////////////////////////////////////////////////////////////        
        String c= "test";
        String d= new String("test");
        System.out.println(c.equals(d));
        System.out.println(c==d);
        /////////////////////////////////////////////////////////////////////////////////////////
        String s1="dipak";
        String s2 = "dipak";
        if (s1==s2) {
        	System.out.println("s1 and s2 are same string");
        }
        /////////////////////////////////////////////////////////////////////////////////////////
        //Remove Duplicate Characters from a String - Using LinkedHashSet
        String dupCharString = "abracadabra";
        String noDupCharString = "";
        System.out.println("Original String:\n"+dupCharString);
        LinkedHashSet<Character> set = new  LinkedHashSet<Character>();
        
        for (int i=0; i<dupCharString.length(); i++)
        	set.add(dupCharString.charAt(i));

        System.out.println("Unique Characters in String: ");
        for (Character chr:set) {
        	System.out.println(chr);
        	noDupCharString = noDupCharString + chr;
        }
        System.out.println("String without Duplicate Characters:\n"+noDupCharString);
        /////////////////////////////////////////////////////////////////////////////////////////
        //Jackson to compare two Json Files
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode actualObj1 = objectMapper.readTree(new File("C:\\Users\\Vaibhav.Mandave\\JSON\\json1.json.txt"));
        JsonNode actualObj2 = objectMapper.readTree(new File("C:\\Users\\Vaibhav.Mandave\\JSON\\json2.json.txt"));
        System.out.println("Checking Two Jsons");
        assertNotEquals(actualObj1, actualObj2);
//        assertEquals(actualObj1, actualObj2);
        /////////////////////////////////////////////////////////////////////////////////////////
        //Jackson to compare two Json Strings
        @SuppressWarnings("unused")
		String jsonStr1 = "{\r\n"
        		+ "    \"employee\":\r\n"
        		+ "    {\r\n"
        		+ "        \"id\": \"1212\",\r\n"
        		+ "        \"fullName\": \"John Miles\",\r\n"
        		+ "        \"age\": 34,\r\n"
        		+ "        \"skills\": [\"Java\", \"C++\", \"Python\"]\r\n"
        		+ "    }\r\n"
        		+ "}";
        String jsonStr2 = "{\r\n"
        		+ "    \"employee\":\r\n"
        		+ "    {\r\n"
        		+ "        \"id\": \"1212\",\r\n"
        		+ "        \"age\": 34,\r\n"
        		+ "        \"fullName\": \"John Miles\",\r\n"
        		+ "        \"skills\": [\"Java\", \"C++\", \"Python\"] \r\n"
        		+ "    } \r\n"
        		+ "}";
        
        JsonNode actualObject1 = objectMapper.readTree(jsonStr1);
        JsonNode actualObject2 = objectMapper.readTree(jsonStr2);
        
        assertEquals(actualObject1, actualObject2);
        /////////////////////////////////////////////////////////////////////////////////////////
        // Occurances of a character in a string
        String str3= "geeksforgeeks";
        char[] str3CharArray = str3.toCharArray();
        char chr = 'e';
        int times = 0;
        System.out.println(Collections.frequency(Arrays.asList(str3.split("")),
                String.valueOf(chr)));
        /////////////////////////////////////////////////////////////////////////////////////////
        String p="test";
        String q= new String("test");
        System.out.println(p.equals(q));
        System.out.println(p==q);
        /////////////////////////////////////////////////////////////////////////////////////////
        int var1=5;
        int var2=6;

        		var1++;
        		if((var1=1)==var2)
        		{
        		System.out.println("equal");
        		} else {
        		System.out.println(++var1); //1++ = 2
        		}
        /////////////////////////////////////////////////////////////////////////////////////////
        		int cout =1;
        		String result = cout>=15?"++++++":"------";  //------
        		System.out.println(result);
        /////////////////////////////////////////////////////////////////////////////////////////
        		List<String> al = new ArrayList<String>();

        		al.add("A");
        		al.add("B");
        		al.add("C");

        		al.add(1,"D");
        		System.out.println(al);  // [A, D, B, C]
        /////////////////////////////////////////////////////////////////////////////////////////
        		Set<Integer> sInt= new TreeSet<Integer>();
        		
        		sInt.add(1);
        		sInt.add(2);
        		sInt.add(3);
        		sInt.add(4);
        		sInt.add(1);
        		
        		System.out.println(sInt);  // [1, 2, 3, 4]
        ////////////////////////////////////////////////////////////////////////////////////////        		
       	// Interger Array Sort - sort() method 
        int[] arr = new int[] { -2, 0, 1, 3, -1, 2 };
        Arrays.sort(arr);
        System.out.println("Ascending Array using sort() method:\n"+Arrays.toString(arr));
       	// Interger Array Sort - Bubble sort method
        int t=0;
        int l = arr.length;
        
        for (int i=0; i<l; i++) {
        	for (int j=i+1; j<l; j++) {
        		if (arr[i]>arr[j]) {
        			t = arr[i];
        			arr[i] = arr[j];
        			arr[j] = t;
        		}
        	}
        }
        System.out.println("Ascending Array using bubble sort method:\n");
        for (int i = 0; i < l; i++) {
            System.out.print(arr[i] + " ");
        }
        ////////////////////////////////////////////////////////////////////////////////////////
        // Java program to swap 2 numbers without using 3rd variable
        int m = 2, n = 3;
        System.out.println("\nUsing Arithmetic Operators");
        System.out.println("m = " + m + " n = " + n);
      
        m = m + n;
        n = m - n;
        m = m - n;
      
        System.out.println("m = " + m + " n = " + n);      
        
        System.out.println("\nUsing Bitwise XOR");
        System.out.println("m = " + m + " n = " + n);
        
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;
      
        System.out.println("m = " + m + " n = " + n); 
        ////////////////////////////////////////////////////////////////////////////////////////
        String st1="Hemantraj";
        String st2="Hemantraj";
        String st3=new String("Hemantraj");
        if (st1==st3) {
        	System.out.println("\nst1 and st3 share same location");
        }else {
        	System.out.println("\nst1 and st3 do not share same location"); // new used for st3 so different location 
        }
        ////////////////////////////////////////////////////////////////////////////////////////
        Set<Integer> array= new TreeSet<Integer>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(1);
        System.out.println(array);  // 1  2  3
        ////////////////////////////////////////////////////////////////////////////////////////
        // Find second largest number from integer array
        int b[]={44,66,99,77,33,22,55};    
        int temp;
        int total = b.length;
        for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (b[i] > b[j])   
                {  
                    temp = b[i];  
                    b[i] = b[j];  
                    b[j] = temp;  
                }  
            }  
        }  
        System.out.println("\nSecond largest number: "+b[total-2]);
        ////////////////////////////////////////////////////////////////////////////////////////
        // Find second largest number from integer array
        int e[]={1,2,5,6,3,2,14,11};
        total = e.length;
        Arrays.sort(e);
        System.out.println("\nSecond largest number: "+e[total-2]);
        ////////////////////////////////////////////////////////////////////////////////////////
        String baseStr = "Sandip works for cfg and Sandip is Test Engineer";
//      Sandip - 2
//		He works for cf and he is Test Engineer
        String strArray[] = baseStr.split(" ");
        for (int i = 1; i < strArray.length; i++) {
        	int count = 1;
        	if (strArray[i].equals("Sandip")) {
        		count++;
        	}
        	
        	if (count>1) {
        		System.out.println("Sandip - "+count);
        	}
        }
        String op = baseStr.replace("Sandip", "He");
        System.out.println(op);
        ////////////////////////////////////////////////////////////////////////////////////////
        String[] geeks = {"Rahul", "Utkarsh",
                "Shubham", "Neelam"};

        List<String> alList = new ArrayList<String>();

        // Array to ArrayList Conversion
        for (String geek : geeks)
        	alList.add(geek);

        System.out.println(alList);
        alList.add("Vaibhav");
        alList.add("Shyam");
        System.out.println(alList);
  		//////////////////////////////////////////////////////////////////////////////////////
        // HashSet Iterator
        LinkedHashSet<String> hs = new LinkedHashSet<String>();
        
        hs.add("Welcome");
        hs.add("To");
        hs.add("Coforge");
        hs.add("Santander");
//        System.out.println("HashSet:\n"+hs);
        
        System.out.println("\nHashSet:");
        Iterator hsItr1 = hs.iterator();
        while (hsItr1.hasNext()) {
        	System.out.println(hsItr1.next());
        }
        
        hs.add("Coforge");
        hs.add("Santander");
        hs.add("Pune");
        hs.add("India");
//        System.out.println("HashSet:\n"+hs);
        
        System.out.println("\nHashSet:");
        Iterator hsItr2 = hs.iterator();
        while (hsItr2.hasNext()) {
        	System.out.println(hsItr2.next());
        }
  		//////////////////////////////////////////////////////////////////////////////////////         
        // Sum of all elements of an Integer Array
        int[] intArr1 = { 1, 2, 3, 4, 5, 6 };
        int sum = 0;
        int mul = 1;
        
        for (int i:intArr1)
        {
        	sum += i;
        	mul *= i;
        }
        
        System.out.println("Sum of all Integer Array Elements: "+sum);
        System.out.println("Multiplication of all Integer Array Elements: "+mul);
  		//////////////////////////////////////////////////////////////////////////////////////
        // Removing a from a string
        String strng1 = "abcdABCDabcdABCD";
		
        strng1 = strng1.replace("a", ""); 

        System.out.println(strng1); 
  		//////////////////////////////////////////////////////////////////////////////////////
        
	}
}
