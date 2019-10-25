package controoler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Sampleproject.system.Cart;
import Sampleproject.system.CartDAO;
import Sampleproject.system.Payment;
import Sampleproject.system.PaymentDAO;
import Sampleproject.system.ProductDAO;
import Sampleproject.system.SupplierDAO;

@Controller
public class InvoiceController {

	@Autowired
	CartDAO cartDAO;
	@Autowired
	ProductDAO productDAO;
	@Autowired
	SupplierDAO supplierDAO;
	@Autowired
	PaymentDAO paymentDAO;
	  @RequestMapping("/Invoice")
	  public String viewCart(HttpSession session,Model model,HttpServletRequest request)
	  {
	  String username=(String)session.getAttribute("username");
	  java.util.Date dt=new java.util.Date();
	  String cartid= dt.getDate()+":"+dt.getYear()+":"+dt.getMonth()+username+"/";
	  java.util.List<Cart> cartlist=cartDAO.getAllCarts(cartid);
	  float sum=0;
	  for(Cart c:cartlist)
	  {
	  sum=sum+c.getPrice();
	  }
	          model.addAttribute("cartlist",cartlist);
	    model.addAttribute("carttotal",sum);
	    
	    java.util.List<Payment> productlist=paymentDAO.getAllPayments(cartid);
	    model.addAttribute("productlist", productlist);
	    String id=request.getParameter("id");
	    java.util.List<Payment> supplierlist=paymentDAO.getAllPayments(cartid);
	    model.addAttribute("Paymentlist", supplierlist);
	    //model.addAttribute("cartsize",cartlist.size());
	  return "Invoice";
	  }

	
}
