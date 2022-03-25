package kr.ac.kopo.polycms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.polycms.dao.ArticleDao;
import kr.ac.kopo.polycms.model.Article;

@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	ArticleDao dao;

	@Override
	public List<Article> list(Long boardid) {
		return dao.list(boardid);
	}

	@Override
	public void add(Article item) {
		dao.add(item);

	}

	@Override
	public Article item(Long boardid, Long articleid) {
		return dao.item(boardid, articleid);
	}

	@Override
	public void update(Article item) {
		dao.update(item);

	}

	@Override
	public void delete(Long boardid, Long articleid) {
		dao.delete(boardid,articleid);

	}

}
