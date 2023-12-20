package ComparingElements;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Product implements Comparable{
	double price;
	String name;
	
	public Product(double price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Double p1 = this.price;
		Product prod = (Product) o;
		Double p2=prod.price;
		
		if(p1<p2)
			return +1;
		else if(p1>p2)
			return -1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return "Product [price=" + price + ", name=" + name + "]";
	}
}

class ProductComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {

		String pn1 = o1.name;
		String pn2 = o2.name;
		
		return pn1.compareTo(pn2);
	}
}


public class ComparableAndComparatorExercise03 {

	public static void main(String[] args) {

		Product p1=new Product(25,"TV");
		Product p2=new Product(24,"Ref");
		Product p3=new Product(22,"Wash");
		List<Product> list=new LinkedList();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		Collections.sort(list);
		
		for (Product p : list) {
			System.out.println(p);
		}	
		
		System.out.println("///////////////////////");
		Set<Product> set=new TreeSet<Product>(new ProductComparator());
		set.add(p1);
		set.add(p2);
		set.add(p3);
		
		for (Product product : set) {
			System.out.println(product);
		}
	}
}
