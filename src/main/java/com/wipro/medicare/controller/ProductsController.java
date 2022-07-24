package com.wipro.medicare.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.xml.sax.SAXException;

import com.wipro.medicare.model.Cart;
import com.wipro.medicare.model.Order;
import com.wipro.medicare.model.Product;
import com.wipro.medicare.service.CartService;
import com.wipro.medicare.service.OrderService;
import com.wipro.medicare.service.ProductService;

@CrossOrigin 
@Controller
@RequestMapping(value="")
public class ProductsController {
	@Autowired
	ProductService productservice;
	@Autowired
	CartService cartService;
	@Autowired
	OrderService orderService;
	
	
	@GetMapping(value="/getListofProducts")
	public ModelAndView getListofProducts() {

		
		List<Product> products=productservice.getListofProducts();	
				return new ModelAndView("shop", "products", products);

	}
	@GetMapping(value="/getProduct")
	public ModelAndView getProducts(@RequestParam int id) {

		
		Product product=productservice.getProduct(id).get();	
				return new ModelAndView("shop-single", "productinfo", product);

	}
	@GetMapping(value="/addToCart")
	public ModelAndView addToCart(@RequestParam int id) throws SAXException, JAXBException {

		
		Product product=productservice.getProduct(id).get();
		cartService.addProduct(product);
		cartService.updatetotal();
		List<Cart> products=cartService.getListofProducts();
		if(products.size()!=0) {
		ModelAndView mv=new ModelAndView("cart", "productsCart", products);
		mv.addObject("total",products.get(0).getTotal());
				return mv;

	}
		else {
			return new ModelAndView("error2", "message", "Your Cart is empty, Please add products");
			
		}
	}
	@GetMapping(value="/displaycart")
	public ModelAndView displayCart() {

		
		
		List<Cart> products=cartService.getListofProducts();	
		if(products.size()!=0) {
			ModelAndView mv=new ModelAndView("cart", "productsCart", products);
			mv.addObject("total",products.get(0).getTotal());
					return mv;

		}
			else {
				return new ModelAndView("error2", "message", "Your Cart is empty, Please add products");
				
			}
		}

	
	@GetMapping(value="/updateCart")
	public ModelAndView updateCart(@RequestParam(name="quantity", required = true) Integer[] quanity) throws SAXException, JAXBException {
		
		List<Cart> products=cartService.getListofProducts();	
		for(int i=0;i<products.size();i++) {
			Product product=productservice.getProduct(products.get(i).getProductid()).get();
			cartService.updateProduct(product,quanity[i]);
			
		}
		cartService.updatetotal();
		List<Cart> cart1=cartService.getListofProducts();
		if(cart1.size()!=0) {
			ModelAndView mv=new ModelAndView("cart", "productsCart", cart1);
			mv.addObject("total",products.get(0).getTotal());
					return mv;

		}
			else {
				return new ModelAndView("error2", "message", "Your Cart is empty, Please add products");
				
			}
		}

	
	@GetMapping(value="/deleteFromCart")
	public ModelAndView deleteFromCart(@RequestParam int id) throws SAXException, JAXBException {

		
		Cart product=cartService.getProduct(id).get();
		cartService.deleteProduct(product);
		List<Cart> products=cartService.getListofProducts();	
				return new ModelAndView("cart", "productsCart", products);

	}
	@GetMapping(value="/proceedToCheckout")
	public ModelAndView proceedToCheckout() throws SAXException, JAXBException {

		
		List<Cart> cart1=cartService.getListofProducts();
		ModelAndView mv=new ModelAndView("checkout", "productsCart", cart1);
		mv.addObject("total",cart1.get(0).getTotal());
				return mv;

	}
	@GetMapping(value="/placeOrder")
	public ModelAndView placeOrder() throws SAXException, JAXBException {

		
		Order order=orderService.addToOrders();	
		cartService.deleteproducts();
				return new ModelAndView("thankyou", "orders", order);

	}
	@GetMapping(value="/message")
	public ModelAndView maessage() throws SAXException, JAXBException {

		
	
				return new ModelAndView("success", "message", "Thanks for reaching out to us, We will get back soon");

	}
	@GetMapping(value="/getProducts")
	public ModelAndView getProducts() {

		
		List<Product> products=productservice.getListofProducts();	
				return new ModelAndView("shop1", "products", products);

	}
	@RequestMapping(value="/editProduct")
	public ModelAndView editProduct(@RequestParam int id) throws SAXException, JAXBException {

		
		Product product=productservice.getProduct(id).get();
	
				return new ModelAndView("updateproduct", "product", product);

	}
	
	
	  @PostMapping("/save") 
	  public ModelAndView update(Product p, Model model) {
		  productservice.saveOrUpdateShop(p); 
		  return new ModelAndView("success","message","Product has been added/updated sucesfully");

				  }
	  @GetMapping(value="/deleteProduct")
		public ModelAndView deleteProduct(@RequestParam int id) throws SAXException, JAXBException {
		 
		  
		  Product product=productservice.getProduct(id).get();
			productservice.deleteProduct(product);
			return new ModelAndView("success","message","Product has been deleted sucesfully");
			  
				

		}
	  @RequestMapping(value="/addProduct")
		public ModelAndView addProduct() throws SAXException, JAXBException {

			Product p=new Product();	
					return new ModelAndView("addproduct","product",p);

		}
	  @GetMapping(value="/about")
		public ModelAndView about(){

			
			
					return new ModelAndView("about");

		}
	 
	  @GetMapping(value="/contact")
		public ModelAndView contact(){

			
			
					return new ModelAndView("contact");

		}
	  @GetMapping(value="/aboutadmin")
		public ModelAndView aboutadmin(){

			
			
					return new ModelAndView("about_admin");

		}
	 
	  @GetMapping(value="/contactadmin")
		public ModelAndView admincontact(){

			
			
					return new ModelAndView("contact_admin");

		}
	  @GetMapping(value="/home")
		public ModelAndView home(){

			
			
					return new ModelAndView("home");

		}
	  @GetMapping(value="/homeadmin")
		public ModelAndView homeadmin(){

			
			
					return new ModelAndView("home1");

		}
	  @GetMapping(value="/shop")
		public ModelAndView shop(){

			
			
					return new ModelAndView("shop");

		}
	  @GetMapping(value="/shopadmin")
		public ModelAndView shopadmin(){

			
			
					return new ModelAndView("shop1");

		}
	  @RequestMapping("/search")
	  public String viewHomePage(Model mode,@Param("keyword") String keyword) {
		  List<Product> listproducts=productservice.listAll(keyword);
		  
		  mode.addAttribute("products", listproducts);
		  mode.addAttribute("keyword", keyword);
		  return "shop";
	  }
	 
}
