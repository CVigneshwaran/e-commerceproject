package controoler;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Sampleproject.system.CartDAO;
import Sampleproject.system.Product;
import Sampleproject.system.ProductDAO;

@Controller
public class HomeController {

	@Autowired 
	ProductDAO productDAO;
	@Autowired
	CartDAO cartDAO;
	@RequestMapping("/")
	public String getIndex()
	{
		return "index";
	}
	@RequestMapping("/home")
	public String getHome(HttpSession session,Model model)
	{
		String username=SecurityContextHolder.getContext().getAuthentication().getName();
		session.setAttribute("username",username);
		java.util.List<Product> productlist=productDAO.getAllProducts();
    	 model.addAttribute("productlist", productlist);
    	 java.util.Date dt=new java.util.Date();
    	 String cartid = dt.getDate()+":"+dt.getYear()+":"+dt.getMonth()+username+"/";
    	 int size= cartDAO.totalelements(cartid);
    	 System.out.println(size);
    	 model.addAttribute("cartsize", size);
    	 
		return "home";
	}
	@RequestMapping("/login")
	public String getLogin()
	{
		return "login";
	}
	
	@RequestMapping("/admin")
	public String getAdmin()
	{
		return "admin";
	}
	
	
	@RequestMapping("/logout")
	public String getLogout(HttpSession session,Model m)
	{
		m.addAttribute("logoutstatus", true);
		m.addAttribute("logoutmessage", "logged out successfully");
		session.invalidate();
		return "login";
	}
}
