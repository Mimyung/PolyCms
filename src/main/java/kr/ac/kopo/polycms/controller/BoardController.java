package kr.ac.kopo.polycms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.kopo.polycms.model.Board;
import kr.ac.kopo.polycms.service.BoardService;

@Controller
@RequestMapping("/board")

public class BoardController {
	final String path = "board/";
			
	@Autowired
	BoardService service;
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<Board> list = service.list();
		
		model.addAttribute("list", list);
		
		return path + "list";
	}
	
	
	@GetMapping("/add")
	public String add() {
		return path + "add";
	}
	
	@PostMapping("/add")
	public String add(Board item) { 
		service.add(item);
		
		return "redirect:list";
	}
	
	@GetMapping("/update/{boardid}")
	public String update(@PathVariable Long boardid, Model model) {
		Board item = service.item(boardid);
	
		model.addAttribute("item", item);
		
		return path + "update";
	}
	
	@PostMapping("/update/{boardid}")
	public String update(@PathVariable Long boardid, Board item) {
		item.setBoardid(boardid);
		
		service.update(item);
		
		return "redirect:../list";
	}
	
	@GetMapping("/delete/{boardid}")
	public String delete(@PathVariable Long boardid, Model model) {
		service.delete(boardid);
		
		return "redirect:../list";
	}
}
