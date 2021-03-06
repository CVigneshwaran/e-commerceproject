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
import org.springframework.web.multipart.MultipartFile;

import Sampleproject.system.Product;
import Sampleproject.system.ProductDAO;
import Sampleproject.system.Supplier;
import Sampleproject.system.SupplierDAO;

@Controller
public class ProductController {

	@Autowired
	ProductDAO productDAO;
	@Autowired
	SupplierDAO supplierDAO;
	@ModelAttribute("addproduct")
	public Product getProduct()
	{
		return new Product();
	}
	@RequestMapping("/ProductDetails")
	public String getProductDetails(Model model,HttpServletRequest request)
	{
		java.util.List<Product> productlist=productDAO.getAllProducts();
     	 model.addAttribute("productlist", productlist);
		String id=request.getParameter("id");
		java.util.List<Supplier> supplierlist=supplierDAO.getAllSuppliers();
		model.addAttribute("supplierlist",supplierlist);
		if(id!=null)
			
		{
			int pid=Integer.parseInt(id);
			Product p=productDAO.findProduct(pid);
           model.addAttribute("currproduct",p);   
           return "EditProduct";
           
		}
		 
		 return "ProductDetails";
	}
	@RequestMapping(value="addproduct",method=RequestMethod.POST)
	public String addProduct(@Valid @ModelAttribute("addproduct")Product product,Errors errors,Model model,HttpServletRequest request)
	{
		java.util.List<Product> productlist=productDAO.getAllProducts();
    	 model.addAttribute("productlist", productlist);
		String id=request.getParameter("id");
		java.util.List<Supplier> supplierlist=supplierDAO.getAllSuppliers();
		model.addAttribute("supplierlist",supplierlist);
		productDAO.addProduct(product);
				
		try {
		//byte[ bt=image.getBytes();
		//	productDAO.addProduct(product);
			MultipartFile image=(MultipartFile)product.getImage();
			byte[] bt=new byte[(int)image.getSize()];
			try {
				InputStream i=image.getInputStream();
				i.read(bt);
				FileOutputStream f=new FileOutputStream("C:\\Users\\Vigneshwaran\\eclipse-workspace\\controoler\\src\\main\\webapp\\resources\\images\\"+product.getProductid()+".jpg");
				f.write(bt);
				f.flush();
			}
			catch(Exception e) {
			      System.out.println(e);
			}
		System.out.println(bt);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return "redirect:ProductDetails";	
	}
	@RequestMapping(value="updateproduct",method=RequestMethod.POST)
	public String updateProduct(Product product)
	{
		int id=product.getProductid();
	   Product p=productDAO.findProduct(id);
	   p.setCategoryid(product.getCategoryid());
	   p.setSupplierid(product.getSupplierid());
	   p.setPrice(product.getPrice());
	   p.setDescription(product.getDescription());
   p.setQuantity(product.getQuantity());
   p.setProductname(p.getProductname());
   
	   productDAO.updateProduct(p);
				
		try {
		//byte[ bt=image.getBytes();
		//	productDAO.addProduct(product);
			MultipartFile image=(MultipartFile)product.getImage();
			byte[] bt=new byte[(int)image.getSize()];
			try {
				InputStream i=image.getInputStream();
				i.read(bt);
				FileOutputStream f=new FileOutputStream("C:\\Users\\Vigneshwaran\\eclipse-workspace\\controoler\\src\\main\\webapp\\resources\\images\\"+product.getProductid()+".jpg");
				f.write(bt);
				f.flush();
			}
			catch(Exception e) {
			      System.out.println(e);
			}
		System.out.println(bt);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return "redirect:ProductDetails";	
	}

 @RequestMapping("/deleteproduct")
 public String deleteproduct(HttpServletRequest request)
 {
	 int id=Integer.parseInt(request.getParameter("id"));
    Product pr=productDAO.findProduct(id);
    productDAO.deleteProduct(pr);
    return "redirect:ProductDetails";
 }
}
