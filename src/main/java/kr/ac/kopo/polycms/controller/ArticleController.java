package kr.ac.kopo.polycms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.kopo.polycms.model.Article;
import kr.ac.kopo.polycms.service.ArticleService;

@Controller
@RequestMapping("/board/{boardid}/article")
public class ArticleController {
	final String path = "article/";

	@Autowired
	ArticleService service;

	@GetMapping("/view/{articleid}")
	public String view(@PathVariable Long boardid, @PathVariable Long articleid, Model model) {
		Article item = service.item(boardid, articleid);

		model.addAttribute("item", item);

		return path + "view";
	}

	@GetMapping("/list")
	public String list(@PathVariable Long boardid, Model model) {
		List<Article> list = service.list(boardid);

		model.addAttribute("list", list);

		return path + "list";
	}

	@GetMapping("/add")
	public String add() {
		return path + "add";
	}

	@PostMapping("/add")
	public String add(@PathVariable Long boardid, Article item) {
		service.add(item);

		return "redirect:list";
	}

	@GetMapping("/update/{articleid}")
	public String update(@PathVariable Long boardid, @PathVariable Long articleid, Model model) {
		Article item = service.item(boardid, articleid);

		model.addAttribute("item", item);

		return path + "update";
	}

	@PostMapping("/update/{articleid}")
	public String update(@PathVariable Long boardid, @PathVariable Long articleid, Article item) {
		item.setBoardid(boardid);
		item.setArticleid(articleid);

		service.update(item);

		return "redirect:../list";
	}

	@GetMapping("delete/{articleid}")
	public String delete(@PathVariable Long boardid, @PathVariable Long articleid) {
		service.delete(boardid, articleid);

		return "redirect:../list";
	}
}
