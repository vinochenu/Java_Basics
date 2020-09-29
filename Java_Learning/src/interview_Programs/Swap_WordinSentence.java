package interview_Programs;

public class Swap_WordinSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Given="My name is vinoth";
				
				String wordswap="";
				
				String[] array=Given.split(" ");
				
				for (String string : array) {
					
					wordswap=" "+string+wordswap;
					
				}
				
				System.out.println("After swaping the word in sentence is "+wordswap);
		

	}

}
