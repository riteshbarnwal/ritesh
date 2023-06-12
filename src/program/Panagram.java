package program;

public class Panagram {
	public static void main(String[] args) {
		String s="The quick brown fox jumps over the lazy dog";
		boolean rs = isPanagram(s.toLowerCase());
		if(rs==true)
			System.out.println("panagram");
		else
			System.out.println("not a panagram");
	}
     public static boolean isPanagram(String s)
     {
    	 if(s.length()<26)
    		 return false;
    	 for(char ch='a';ch<='z';ch++)
    	 {
    		 if(s.indexOf(ch)<0)
    			 return false;
    	 }
    	 return true;
     }
}
