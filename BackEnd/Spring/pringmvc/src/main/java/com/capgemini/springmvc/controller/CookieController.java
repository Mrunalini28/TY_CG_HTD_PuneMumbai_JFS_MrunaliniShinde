package com.capgemini.springmvc.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CookieController {

	@GetMapping(path = "/cookiePage")
	public String displayCookiePage() {
		return "cookiePage";

	}// End of displayCookiePage()

	@GetMapping("/createCookie")
	public String createCookie(HttpServletResponse resp, ModelMap modelMap) {
		Cookie cookie = new Cookie("name", "Mrunalini");
		resp.addCookie(cookie);
		modelMap.addAttribute("msg", "cookie created successfully...");

		return "cookiePage";
	}// End of CreateCookie()
     
	@GetMapping("/readCookie")
	public String readCookie(@CookieValue(name = "name") String name, ModelMap modelMap) {

		modelMap.addAttribute("msg", "Cookie value is " + name);
		return "cookiePage";
	}
}// End of class