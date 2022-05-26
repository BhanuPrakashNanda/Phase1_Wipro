package com.phase3.project.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import com.phase3.project.model.AdminLogin;
import com.phase3.project.model.PasswordChange;
import com.phase3.project.model.Products;
import com.phase3.project.model.PurchaseReport;
import com.phase3.project.model.Purchased_List;
import com.phase3.project.model.UserList;
import com.phase3.project.service.LoginService;
import com.phase3.project.service.ProductServices;
import com.phase3.project.service.PurchaseService;
import com.phase3.project.service.UserListService;
@CrossOrigin 
@RestController
@RequestMapping(value="/sportyshoes")
public class AdminLoginController {
@Autowired
private LoginService loginService;
@Autowired
private ProductServices productservices;
@Autowired
private UserListService userListService;
@Autowired
private PurchaseService purchaseService;


public PurchaseService getPurchaseService() {
	return purchaseService;
}

public void setPurchaseService(PurchaseService purchaseService) {
	this.purchaseService = purchaseService;
}

public UserListService getUserListService() {
	return userListService;
}

public void setUserListService(UserListService userListService) {
	this.userListService = userListService;
}

public ProductServices getProductservices() {
	return productservices;
}

public void setProductservices(ProductServices productservices) {
	this.productservices = productservices;
}

public LoginService getLoginService() {
	return loginService;
}

public void setLoginService(LoginService loginService) {
	this.loginService = loginService;
}
@GetMapping(value="/getListofProducts")
public ModelAndView getListofProducts() {

	
	List<Products> products=productservices.getListofProducts();	
			return new ModelAndView("productList", "products", products);

}
@GetMapping(value="/getPurchaseList")
public ModelAndView getPurchaseList() throws ParseException {
	
		/*
		 * Date sqlDate1=conversion("2022-03-20 00:00:00"); List<Purchased_List>
		 * list=purchaseService.getPurchaseList(sqlDate1, "running");
		 * List<Purchased_List> list1=purchaseService.getPurchaseList(sqlDate1,
		 * "walking"); List<Purchased_List>
		 * list2=purchaseService.getPurchaseList(sqlDate1, "training");
		 * list.addAll(list1); list.addAll(list2); return new
		 * ModelAndView("purchaseList", "list", list);
		 */
	return new ModelAndView("purchaseForm");

}
@GetMapping(value="/getPurchaseList1")
public ModelAndView getPurchaseList1() throws ParseException {
	
		
		  Date sqlDate1=conversion("2022-03-20 00:00:00"); List<Purchased_List>
		  list=purchaseService.getPurchaseList(sqlDate1, "running");
		  List<Purchased_List> list1=purchaseService.getPurchaseList(sqlDate1,
		  "walking"); List<Purchased_List>
		  list2=purchaseService.getPurchaseList(sqlDate1, "training");
		  list.addAll(list1); list.addAll(list2); 
		  ModelAndView m1=new ModelAndView("purchaseList", "list", list);
		  m1.addObject("date", "2022-03-20");
		  return m1;
		 


}
@GetMapping(value="/getPurchaseList2")
public ModelAndView getPurchaseList2() throws ParseException {
	
		
		  Date sqlDate1=conversion("2022-02-20 00:00:00"); List<Purchased_List>
		  list=purchaseService.getPurchaseList(sqlDate1, "running");
		  List<Purchased_List> list1=purchaseService.getPurchaseList(sqlDate1,
		  "walking"); List<Purchased_List>
		  list2=purchaseService.getPurchaseList(sqlDate1, "training");
		  list.addAll(list1); list.addAll(list2); 
		  ModelAndView m1=new ModelAndView("purchaseList", "list", list);
		  m1.addObject("date", "2022-02-20");
		  return m1;
}
@GetMapping(value="/getPurchaseList3")
public ModelAndView getPurchaseList3() throws ParseException {
	
		
		  Date sqlDate1=conversion("2022-05-21 00:00:00"); List<Purchased_List>
		  list=purchaseService.getPurchaseList(sqlDate1, "running");
		  List<Purchased_List> list1=purchaseService.getPurchaseList(sqlDate1,
		  "walking"); List<Purchased_List>
		  list2=purchaseService.getPurchaseList(sqlDate1, "training");
		  list.addAll(list1); list.addAll(list2); 
		  ModelAndView m1=new ModelAndView("purchaseList", "list", list);
		  m1.addObject("date", "2022-05-21");
		  return m1;
}
@GetMapping(value="/getPurchaseList4")
public ModelAndView getPurchaseList4() throws ParseException {
	
		
		  Date sqlDate1=conversion("2022-04-21 00:00:00"); List<Purchased_List>
		  list=purchaseService.getPurchaseList(sqlDate1, "running");
		  List<Purchased_List> list1=purchaseService.getPurchaseList(sqlDate1,
		  "walking"); List<Purchased_List>
		  list2=purchaseService.getPurchaseList(sqlDate1, "training");
		  list.addAll(list1); list.addAll(list2); 
		  ModelAndView m1=new ModelAndView("purchaseList", "list", list);
		  m1.addObject("date", "2022-04-21");
		  return m1;

}
@GetMapping(value="/getUsersList")
public ModelAndView getUsersList() {

	
	List<UserList> users=userListService.getUsersList();	
			return new ModelAndView("userList", "users", users);

}
	/*
	 * @PostMapping("/addproduct") public ModelAndView
	 * addStudent(@ModelAttribute("product") Products product) {
	 * 
	 * 
	 * productservices.addProduct(product); ModelAndView m=new
	 * ModelAndView("success"); m.addObject("productid",product.getProductid());
	 * return m; }
	 */

@RequestMapping(value = "/addproduct")
public ModelAndView addproduct() {
	
	return new ModelAndView("addproduct");
}

@PostMapping("addproduct/addproductview")
public ModelAndView addproduct(@ModelAttribute(value = "product") Products product) {
	productservices.addProduct(product);
	ModelAndView m2=new ModelAndView("success");
	m2.addObject("message", "Product has been added successfully");
	return m2;
}

@RequestMapping(value = "/changepassword")
public ModelAndView changepassword() {
	
	return new ModelAndView("changepassword");
}

@PostMapping("changepassword/changepasswordview")
public ModelAndView changepasswors(@ModelAttribute(value = "password") PasswordChange password) {
	loginService.changepassword(password);
	ModelAndView m2=new ModelAndView("success");
	m2.addObject("message", "password has been changed successfully");
	return m2;
}

@RequestMapping("/sportyshoes/delete/{productId}")
public ModelAndView deleteProduct(@PathVariable(value = "productId") String productId) {


	productservices.deleteProduct(productId);
	ModelAndView m2=new ModelAndView("success");
	m2.addObject("message", "Product has been deleted successfully");
	
	 return m2;
}
@RequestMapping(value = "/sportyshoes/edit/{productId}")
public ModelAndView editProduct(@PathVariable(value = "productId") String productId) {
	Products product = productservices.getProductById(productId).get();
	return new ModelAndView("editproduct", "editProductObj", product);
}

@PostMapping("/editproduct")
public ModelAndView editProduct(@ModelAttribute(value = "product") Products product) {
	productservices.editProduct(product);
	ModelAndView m2=new ModelAndView("success");
	m2.addObject("message", "product has been edited successfully");
	return m2;
}

@GetMapping(value="/login")
public ModelAndView login(@RequestParam String username,@RequestParam String password) {
	ModelAndView mv;
	AdminLogin adminLogin=new AdminLogin();
	adminLogin.setUsername(username);
	adminLogin.setPassword(password);
	String result=loginService.loginService(adminLogin);	
	if(result.equals("Sucess")){
		 mv=new ModelAndView("dashboard");
		 mv.addObject("username",username);
	}
	else {
		mv=new ModelAndView("error");
		
	}
	return mv;
}
	
@GetMapping(value="/logout")
public ModelAndView login() {
	
	
		ModelAndView mv=new ModelAndView("logout");
		
	
	return mv;
}
	
public Date conversion(String strDate) throws ParseException {
	
	 
	
	 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	 java.util.Date date = sdf.parse(strDate);
	 
	 java.sql.Date sqlDate = new Date(date.getTime());
	return sqlDate;
}
	
}
