package Sampleproject.system;

import java.util.List;

public interface CartDAO {
	boolean addCart(Cart co);
	boolean deleteCart(Cart co);
	Cart findCart(int id);
	Cart updateCart(Cart co);
	//java.util.List<Cart> getAllCarts();
	//List<Cart> getAllProducts(String cartid);
	int totalelements(String cartid);
	List<Cart> getAllCarts(String cartid);


}
