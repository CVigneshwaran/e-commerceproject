package controoler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Sampleproject.system.CartDAO;
import Sampleproject.system.Payment;
import Sampleproject.system.PaymentDAO;

@Controller
public class PaymentController {

	@Autowired
	PaymentDAO paymentDAO;
	@Autowired
	CartDAO cartDAO;
	@ModelAttribute("addpayment")
	public Payment getPayment()
	{
	return new Payment();
	}
	@RequestMapping(value="add", method=RequestMethod.POST)
	public String getPayment(Payment payment,HttpSession session)
	{
		String username=(String)session.getAttribute("username");
		java.util.Date dt=new java.util.Date();
		String cartid=dt.getDate()+":"+dt.getYear()+":"+dt.getMonth()+username+"/";
		payment.setCartid(cartid);
		paymentDAO.addPayment(payment);
	
		return "redirect:paymentdetails";
	}
	
	@RequestMapping("/paymentdetails")
	public String getPayment(Model model,HttpServletRequest request,HttpSession session)
	{
		String username=(String)session.getAttribute("username");
		java.util.Date dt=new java.util.Date();
		String cartid=dt.getDate()+":"+dt.getYear()+":"+dt.getMonth()+username+"/";
		java.util.List<Payment> productlist=paymentDAO.getAllPayments(cartid);
		model.addAttribute("productlist", productlist);
		String id=request.getParameter("id");
		java.util.List<Payment> supplierlist=paymentDAO.getAllPayments(cartid);
		model.addAttribute("Paymentlist", supplierlist);
		if(id!=null)
		{
			int pid=Integer.parseInt(id);
			
			Payment p=paymentDAO.findPayment(pid);
			model.addAttribute("currproduct", p);
			return "editpayment";
		}
		
		return "paymentdetails";
	}
	@RequestMapping(value="addpayment",method=RequestMethod.POST)
	public String addPayment(Payment payment,HttpSession session)
	{
		String username=(String)session.getAttribute("username");
		java.util.Date dt=new java.util.Date();
		String cartid=dt.getDate()+":"+dt.getYear()+":"+dt.getMonth()+username+"/";
		payment.setCartid(cartid);
	paymentDAO.addPayment(payment);
	return "redirect:Invoice";
	}

}
