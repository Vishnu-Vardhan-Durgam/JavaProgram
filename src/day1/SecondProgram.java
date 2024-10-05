package day1;

public class SecondProgram {

	public static void main(String[] args) {
		String str = "vishnu";
		String rev_str="";
		
		for(int i=str.length()-1; i>=0; i--) {
			rev_str=rev_str+str.charAt(i);
		}
		System.out.println("Reversed String is : "+rev_str);

	}

}
