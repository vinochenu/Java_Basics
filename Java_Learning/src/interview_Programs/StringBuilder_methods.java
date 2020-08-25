package interview_Programs;

public class StringBuilder_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder name=new StringBuilder("vinod");
		
		//to reverse the string
				System.out.println(name.reverse());
				
				//to add the text in existing String
				System.out.println(name.append("kumar"));
				
				//StringBuffer is mutable
				System.out.println(name);
				
				/*//replace
				System.out.println(name.replace(0,5,"vinod"));
				
				//delete
				System.out.println(name.delete(0, 5));
				
				//insert
				System.out.println(name.insert(0, "vinod"));
				
				//capacity
				System.out.println(name.capacity());*/
	}
	

}
