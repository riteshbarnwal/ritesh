package program;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String s1,String s2)
    {
    	String s3=s1.replaceAll("\\s", "");   // eliminate space
    	String s4=s2.replaceAll("\\s", "");   // eliminate space
    	s3=s3.toLowerCase();
    	s4=s4.toLowerCase();
    	char[] ch1=s3.toCharArray();
    	char[] ch2=s4.toCharArray();
    	Arrays.sort(ch1);
    	Arrays.sort(ch2);
    	boolean result = Arrays.equals(ch1, ch2);
    	if(result==true)
    		return true;
    	else
    		return false;
    }
    public static void main(String[] args) {
		boolean rs = isAnagram("Listen act", "Silent cat");
		if(rs)
			System.out.println("anagram");
		else
			System.out.println("not anagram");
	}
}
