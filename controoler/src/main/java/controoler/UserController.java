package controoler;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Sampleproject.system.User;
import Sampleproject.system.UserDAO;

@Controller
public class UserController {


	@Autowired
	UserDAO userDAO;
	@ModelAttribute("adduser")
	public User getUser()
	{
		return new User();
	}

	@RequestMapping("/signup")
	public String getSignup(Model model,HttpServletRequest request)
	{
		java.util.List<User> userlist= userDAO.getAllUsers();
     	 model.addAttribute("userlist", userlist);
		String id=request.getParameter("id");
		if(id!=null)	
		{
			int pid=Integer.parseInt(id);
			User p=userDAO.findUser(pid);
           model.addAttribute("curruser",p);   
           return "signup";
		}
		 
		 return "signup";
	}
	@RequestMapping(value="adduser",method=RequestMethod.POST)
	public String addUser(@Valid @ModelAttribute("adduser")User user ,Errors errors,Model model,HttpServletRequest request)
	{  
		System.out.println(errors.hasErrors());
		if(errors.hasErrors()) {
			
			java.util.List<User> userlist= userDAO.getAllUsers();
		 model.addAttribute("userlist", userlist);
		String id=request.getParameter("id");
			return "signup";
		}
		userDAO.addUser(user);
		return "signup";	
	}
	@RequestMapping(value="updateuser",method=RequestMethod.POST)
	public String updateUser(User user)
	{
		int id=user.getId();
	  User p=userDAO.findUser(id);
	   p.setId(user.getId());
	   p.setEmail(user.getEmail());
	   p.setUsername(user.getUsername());
	   p.setUser_role(user.getUser_role());
	   p.setPassword(user.getPassword());
	   userDAO.updateUser(p);
				
		
		return "redirect:signup";	
	}
	@RequestMapping("/deleteuser")
	 public String deleteuser(HttpServletRequest request)
	 {
		 int id=Integer.parseInt(request.getParameter("id"));
	    User pr=userDAO.findUser(id);
	    userDAO.deleteUser(pr);
	    return "redirect:signup";
	 }
}
