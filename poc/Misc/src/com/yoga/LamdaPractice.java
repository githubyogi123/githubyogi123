package com.yoga;

 interface MyFunctional{
	
	 double addBill(int food , int tax);
}
 

  class InheritFunctional {
  
  public static double addBill(int food, int tax) { // TODO Auto-generated
  System.out.println("Total Bill -->> "+(food+tax));
  return 1000;
  
  }
  
  }
 

public class LamdaPractice {
	static double total=-1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyFunctional myfun=InheritFunctional::addBill;
		myfun.addBill(800, 200);
		
		/*MyFunctional myfun= new MyFunctional() {
			
			@Override
			public void addBill(int food, int tax) {
				System.out.println("Total Bill -->> "+(food+tax));
				
			}
		};*/
		
		
		/*MyFunctional myfun=(food,tax)->{ 			
			 total=food+tax;
			return total;
		};
		
		double totalBill=myfun.addBill(800, 200);
		System.out.println("Total Bill -->> "+totalBill);*/
	}
	MyFunctional myfun1=(food,tax)->{ 			
		 total=food+tax;
		return total;
	};

}
