package day2;

public class UseDemo {
	public static void main(String[] args) {
		Demo1 d=new Demo1();
		d.brand="iphone";
		d.color="white";
		d.isworks=true;
		d.Price=98;
		d.taxPercentage=10;
		d.taxAmount=d.Price*d.taxPercentage/100;
		d.discountPercentage=20;
		d.discountAmount=d.Price*d.discountPercentage/100 ;
		d.netPrice=	d.Price+d.taxAmount-d.discountAmount;
		
		System.out.println(d.Price+" "+d.taxAmount+" "+d.discountAmount+" "+d.netPrice);
		
		//convert string into array and find the length
		String d1="program";
		char[] f=d1.toCharArray();
		int g1=f.length;
		System.out.println(g1);
		
		
		
	}
	

}
