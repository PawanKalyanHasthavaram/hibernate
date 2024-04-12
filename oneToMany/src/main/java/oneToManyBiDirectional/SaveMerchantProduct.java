package oneToManyBiDirectional;

import java.util.ArrayList;
import java.util.List;

public class SaveMerchantProduct {

	public static void main(String[] args) {
		Merchant m=new Merchant();
		m.setGst_number("ABCDE12345");
		m.setName("ABC");
		m.setPhone(9998887771L);
		m.setPassword("abc123");
		
		Product p1=new Product();
		p1.setBrand("Electronics");
		p1.setCost(8888888888L);
		p1.setName("SmartPhone");
		p1.setMerchant(m);
		
		Product p2=new Product();
		p2.setBrand("Electronics");
		p2.setCost(7777777777L);
		p2.setName("LAptopPhone");
		p2.setMerchant(m);
		
		List<Product> products=new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		m.setProducts(products);
	}

}
