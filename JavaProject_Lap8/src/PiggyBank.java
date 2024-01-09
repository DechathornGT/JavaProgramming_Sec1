
public class PiggyBank {
	
	public int One; 
	public int Two; 
	public int Five; 
	public int Ten; 
	public int Size; 
	
	public void setPiggyBank(int s) {
		clear();
		Size = s;
	}
	
	public int getPiggyBank() {
		return Size;
	}
	
	public void clear() {
		One = 0;
		Two = 0;
		Five = 0;
		Ten = 0;
		// one = two = five = ten = 0;
	}
	public int getTotal() {
		return One + (2* Two) + (5*Five) + (10*Ten);
	}
	public void addOne(int c) {
		if(getTotal() + c <= Size) {
			One = One + c;
		}else {
			System.out.println("Piggy Bank Full");
		}
	}
	public void addTwo(int c) {
		if(getTotal() + (2*c) <= Size) {
			Two = Two + c;
		}else {
			System.out.println("Piggy Bank Full");
		}
	}
	public void addFive(int c) {
		if(getTotal() + (5*c) <= Size) {
			Five = Five + c;
		}else {
			System.out.println("Piggy Bank Full");
		}
	}
	public void addTen(int c) {
		if(getTotal() + (10*c) <= Size) {
			Ten = Ten + c;
		}else {
			System.out.println("Piggy Bank Full");
		}
	}

}
