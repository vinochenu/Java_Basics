package interview_Programs;

public class FindinElement_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array= {10,20,30,40};
		
		int numbercheck=10;
		
		boolean found=false;
		
		for ( int i : array) {
			if(i==numbercheck) {
				found=true;
				break;
				
			}
			
			}
		
		if(found)
			System.out.println("the given element is present in the array");
		else 
			System.out.println("the given element is not present in the array");
		
		
		
	}

}
