package Com.CC.Lab2;
import java.util.regex.Matcher; //there are four classes Matcher /Pattern / .. / ..
import java.util.regex.Pattern;
public class lab02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("t.","to"));//return true //first argument is RE //Match T followed by one character. 
		
		System.out.println(Pattern.matches("t.","too")); //return false
		
		System.out.println(Pattern.matches("t..","too")); //returns true
		
		System.out.println(Pattern.matches("(.)*"," ")); //return true
		
		String text = "16102019";
		String pattern= "\\d+"; //its not yet an RE
		
		//d represent a single digit
		//D represent Non-digits
		//b represent the boundary 	
		Pattern re = Pattern.compile(pattern); // I have made an RE with Pattern Class
		//compile function is needed when we are dealing with file (input) 
		//Now taking Matcher class
		
		Matcher m = re.matcher(text); // re is an object of Pattern class   
		
		System.out.println(m.matches());
		
		//w is alphanumeric
		
		System.out.println("Now checking Alpha Numeric");
		
		String AlphaNumeric = "A13IO8";
		String AlphaPattern = "(.)*\\d+(.)*";
		
		Pattern re1 = Pattern.compile(AlphaPattern);
		Matcher m1 = re1.matcher(AlphaNumeric);
		System.out.println(m1.matches());
		
		
		
		String text2 = "15 89 45";
		String patt1 = "\\d+";
		
		Pattern re2 = Pattern.compile(patt1);
		Matcher m2 = re2.matcher(text2);
		
		System.out.println("1. Occurence:" +  m2.find()); //15 -> true
		System.out.println("2. Occurence:" +  m2.find()); //89 -> true
		System.out.println("3. Occurence:" +  m2.find()); //45 -> true
		System.out.println("4. Occurence:" +  m2.find()); //NOVALUE -> false
		
		
		String text3 = "00 7867 123124 1000000000000  1 01 111 ";
		String patt3 = "\\d+";
		Pattern re3 = Pattern.compile(patt3);
		Matcher m3 = re3.matcher(text3);
		
		while(m3.find()) {
			System.out.println("Found Value:" + m3.group());
			System.out.println("Found Value:" + m3.start() + "to" + (m3.end()-1));
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
