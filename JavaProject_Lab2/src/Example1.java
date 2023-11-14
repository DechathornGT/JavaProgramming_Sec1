
public class Example1 {

	public static void main(String[] args) {
		String isbn = "IB-6325-85-4-1", title = "Basic Java Programming";
		int unit = 5;
		double price = 225.75;
		System.out.println("Book ISBN  : "+isbn);
		System.out.println("Book Title : "+title);
		System.out.println("Book Unit  : "+unit);
		System.out.println("Book Price : "+price);
		System.out.println("-------------------------------------");
		double totalPrice = unit * price , Vat = totalPrice+(totalPrice*7/100); //calculate vat in baht.
		System.out.println("Total Price is "+totalPrice);
		System.out.println("Add VAT 7%  is "+Vat);
		
		
	}

}
