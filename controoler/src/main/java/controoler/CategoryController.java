package controoler;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Sampleproject.system.Category;
import Sampleproject.system.CategoryDAO;
import Sampleproject.system.Supplier;
import Sampleproject.system.SupplierDAO;

@Controller
public class CategoryController {

	@Autowired
	CategoryDAO categoryDAO;
	@ModelAttribute("addcategory")
	public Category getCategory()
	{
		return new Category();
	}

	@RequestMapping("/CategoryDetails")
	public String getCategoryDetails(Model model,HttpServletRequest request)
	{
		java.util.List<Category> categorylist=categoryDAO.getAllCategories();
     	 model.addAttribute("categorylist", categorylist);
		String id=request.getParameter("id");
		if(id!=null)
			
		{
			int pid=Integer.parseInt(id);
			Category p=categoryDAO.findCategory(pid);
           model.addAttribute("currcategory",p);   
           return "EditCategory";
           
		}
		 
		 return "CategoryDetails";
	}
	@RequestMapping(value="addcategory",method=RequestMethod.POST)
	public String addCategory(@Valid @ModelAttribute("addcategory")Category category,Model model,HttpServletRequest request)
	{
		java.util.List<Category> categorylist=categoryDAO.getAllCategories();
    	 model.addAttribute("categorylist", categorylist);
		String id=request.getParameter("id");
		categoryDAO.addCategory(category);
			
		return "redirect:CategoryDetails";	
	}
	@RequestMapping(value="updatecategory",method=RequestMethod.POST)
	public String updateCategory(Category category)
	{
		int id=category.getId();
	   Category p=categoryDAO.findCategory(id);
	   p.setId(category.getId());
	   p.setCategoryname(category.getCategoryname());
	   
	   categoryDAO.updateCategory(p);		
		
		return "redirect:CategoryDetails";	
	}
	@RequestMapping("/deletecategory")
	 public String deleteCategory(HttpServletRequest request)
	 {
		 int id=Integer.parseInt(request.getParameter("id"));
	    Category pr=categoryDAO.findCategory(id);
	    categoryDAO.deleteCategory(pr);
	    return "redirect:CategoryDetails";
	 }	
}
