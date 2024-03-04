class product{
	String pcode,pname;
	float price;
	
	public product(String pcode,String pname,float price){
		this.pcode=pcode;
		this.pname=pname;
		this.price=price;	
	}
}

public class pgm4{
	public static void main(String[] args){
		product p1 = new product("01","IceCream",100);
		product p2 = new product("02","Biscuit",150);
		product p3 = new product("03","Cake",200);
		
		product lowp = p1;

		if(p2.price < lowp.price){
			lowp = p2;	
		}

		if(p3.price < lowp.price){
			lowp = p3;	
		}
		System.out.println("The Product with the lowest price:");
		System.out.println("Product Code: "+lowp.pcode);
		System.out.println("Product Name: "+lowp.pname);		
		System.out.println("Product Price: "+lowp.price);
}
}
