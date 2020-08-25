package oops_class;


class CarChild extends VehicleParent{
	
	int getdetail() {
		return 101;
	}
	
	public static void main(String[] args) {
		
		CarChild obj=new CarChild();
		System.out.println(obj.getdetail());
	}
}
