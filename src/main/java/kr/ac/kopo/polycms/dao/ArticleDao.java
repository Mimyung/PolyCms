package kr.ac.kopo.polycms.dao;

import java.util.List;

import kr.ac.kopo.polycms.model.Article;

public interface ArticleDao {

	List<Article> list(Long boardid);

	void add(Article item);

	Article item(Long boardid, Long articleid);

	void update(Article item);

	void delete(Long boardid, Long articleid);

}
