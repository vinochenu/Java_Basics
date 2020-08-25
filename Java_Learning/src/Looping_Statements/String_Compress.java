package Looping_Statements;

public class String_Compress {
	
	/*String name="AAABBCCCDEEFFF";
	
	public void compress(String name) {
		
		int count=0;
		
		char temp=name.charAt(0);
		
		for(int i=0;i<name.length();i++) {
			if(temp==name.charAt(i)) {
				count++;
			}
			else {
				System.out.print(count+""+temp);
				count=1;
				temp=name.charAt(i);
				}
			}
		System.out.print(count+""+temp);
		
		
	}*/
	
	
	
	String name="EERRRRTTTDD";
	
	public void compress() {
		
		
		int count=0;
		char temp=name.charAt(0);
		for(int i=0;i<name.length();i++) {
			if(temp==name.charAt(i))
			{
				count++;
			}
			else {
				System.out.print(count+""+temp);
				count=1;
				temp=name.charAt(i);
			}
		}
			
			System.out.print(count+""+temp);
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		String_Compress Object=new String_Compress();
		//Object.compress(Object.name);
		Object.compress();
		
	}
	
	

}
