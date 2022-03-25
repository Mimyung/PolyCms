package kr.ac.kopo.polycms.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.polycms.model.Article;

@Repository
public class ArticleDaoImpl implements ArticleDao {
	@Autowired
	SqlSession sql;

	@Override
	public List<Article> list(Long boardid) {
		return sql.selectList("article.list", boardid);
	}

	@Override
	public void add(Article item) {
		sql.insert("article.add", item);

	}

	@Override
	public Article item(Long boardid, Long articleid) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("boardid", boardid);
		map.put("articleid", articleid);
		
		
		return sql.selectOne("article.item", map);
	}

	@Override
	public void update(Article item) {
		sql.update("article.update", item);

	}

	@Override
	public void delete(Long boardid, Long articleid) {
HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("boardid", boardid);
		map.put("articleid", articleid);
		
		sql.delete("article.delete", map);

	}

}
