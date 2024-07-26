public class SumItUp {
	
	int x;
	int y;
	
	public void setSum( int x, int y){
		x = x;
		y = y;
	}
	
	public void showSum(){
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("sum  = " + (x+y) );
	}

	public static void main(String[] args) {
		
		SumItUp sumMe = new SumItUp();
		sumMe.setSum(2, 4);
		sumMe.showSum();
	}

}