package Test;
//NO
public class revStrSpecial {
    public static void maxLength(String str) {
        String s = " ";
        s = str.replaceAll("[^a-z]+", " ");
        String rev = " ";
        char ch[] = s.toCharArray();
        for(int i =ch.length-1; i>=0 ; i--){
            rev = rev + ch[i];
        }
        System.out.println(rev);
    }

	public static void main(String[] args) {
        String str = "a@utom!at$ion@";
        maxLength(str);

	}

}
