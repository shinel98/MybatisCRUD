package com.clone.burgerking;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.clone.burgerkingDAO.MenuDAO;
import com.clone.burgerkingVO.MenuVO;

@Controller
public class MenuController {
	
	@Autowired
	MenuDAO dao;
	@RequestMapping(value = "/")
	public String menuForm() {	
		return "addHome";
	}
	@RequestMapping(value = "/menuForm")
	public String menuForm(Model model) {
		model.addAttribute("command" ,new MenuVO());
			
		return "menuForm";
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	//public String save(@ModelAttribute MenuVO menu) {
	public String save(@RequestParam("name") String name, @RequestParam("photo") String photo, Model model) {
		//HttpServletRequest request
		System.out.println(name);
		System.out.println(photo);
		//System.out.println(menu.getName());
		//System.out.println(menu.getPhoto());
//		System.out.println(menu.getType());
//		System.out.println(menu.getDes());
		//dao.create(menu);
		
		return "viewMenu";    
	}
	@RequestMapping(value="/viewMenu")
	public String viewMenu(Model model) {
		List<MenuVO> list = dao.getMenus();
		model.addAttribute("list", list);
		return "viewMenu";
	}
	@RequestMapping(value="/editMenu/{id}")
	public String editMenu(@PathVariable int id, Model model) {
		
		MenuVO menu = dao.getMenuById(id);
		model.addAttribute("command", menu);
		return "menuEditForm";
	}
	@RequestMapping(value="/editSave", method=RequestMethod.POST)
	public String editSave(@ModelAttribute MenuVO menu) {
		dao.update(menu);
		return "redirect:/viewMenu";
	}
	@RequestMapping(value="/deleteMenu/{id}", method=RequestMethod.GET)
	public String deleteMenu(@PathVariable int id) {
		dao.delete(id);
		return "redirect:/viewMenu";
	}
}

