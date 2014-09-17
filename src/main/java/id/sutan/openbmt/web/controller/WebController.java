package id.sutan.openbmt.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/* 
 * Sep 15, 2014 8:13:21 PM created by : sutan
 */

@Controller
public class WebController {

	@RequestMapping("/")
	public String index() {
		return "web/content/home";
	}

	@RequestMapping("/home")
	public String getHome() {
		return "web/content/home";
	}

	@RequestMapping("/login")
	public String getLogin() {
		return "web/content/login";
	}

	@RequestMapping("/faq")
	public String getFaq() {
		return "web/content/faq";
	}

	@RequestMapping("/produk")
	public String getProduk() {
		return "web/content/produk";
	}

	@RequestMapping("/signup")
	public String getSignup() {
		return "web/content/signup";
	}

	@RequestMapping("/contact")
	public String getContact() {
		return "web/content/contact";
	}

	@RequestMapping("/about")
	public String getAbout() {
		return "web/content/about";
	}

}
