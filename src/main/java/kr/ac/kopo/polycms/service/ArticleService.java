package kr.ac.kopo.polycms.service;

import java.util.List;

import kr.ac.kopo.polycms.model.Article;

public interface ArticleService {

	List<Article> list(Long boardid);

	void add(Article item);

	Article item(Long boardid, Long articleid);
	
	void update(Article item);

	void delete(Long boardid, Long articleid);

}
