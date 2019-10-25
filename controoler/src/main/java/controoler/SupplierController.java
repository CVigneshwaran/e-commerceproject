package controoler;

import java.io.FileOutputStream;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import Sampleproject.system.Supplier;
import Sampleproject.system.SupplierDAO;
import Sampleproject.system.User;

@Controller
public class SupplierController {
	@Autowired
	SupplierDAO supplierDAO;
	@ModelAttribute("addsupplier")
	public Supplier getSupplier()
	{
		return new Supplier();
	}

	@RequestMapping("/SupplierDetails")
	public String getSupplierDetails(Model model,HttpServletRequest request)
	{
		java.util.List<Supplier> supplierlist=supplierDAO.getAllSuppliers();
     	 model.addAttribute("supplierlist", supplierlist);
		String id=request.getParameter("id");
		if(id!=null)
			
		{
			int pid=Integer.parseInt(id);
			Supplier p=supplierDAO.findSupplier(pid);
           model.addAttribute("currsupplier",p);   
           return "EditSupplier";
           
		}
		 
		 return "SupplierDetails";
	}
	@RequestMapping(value="addsupplier",method=RequestMethod.POST)
	public String addSupplier(Supplier supplier)
	{
		
		supplierDAO.addSupplier(supplier);
		return "redirect:SupplierDetails";	
	}
	@RequestMapping(value="updatesupplier",method=RequestMethod.POST)
	public String updateSupplier(Supplier supplier)
	{
		int id=supplier.getId();
	   Supplier p=supplierDAO.findSupplier(id);
	   p.setId(supplier.getId());
	   p.setSupplierAddress(p.getSupplierAddress());
	   p.setSuppliername(supplier.getSuppliername());
	   supplierDAO.updateSupplier(p);
		return "redirect:SupplierDetails";	
	}
	@RequestMapping("/deletesupplier")
	 public String deletesupplier(HttpServletRequest request)
	 {
		 int id=Integer.parseInt(request.getParameter("id"));
	    Supplier pr=supplierDAO.findSupplier(id);
	    supplierDAO.deleteSupplier(pr);
	    return "redirect:SupplierDetails";
	 }
}