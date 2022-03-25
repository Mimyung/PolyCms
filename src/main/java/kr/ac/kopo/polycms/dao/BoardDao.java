package kr.ac.kopo.polycms.dao;

import java.util.List;

import kr.ac.kopo.polycms.model.Board;

public interface BoardDao {

	List<Board> list();

	void add(Board item);
	
	Board item(Long boardid);

	void update(Board item);

	void delete(Long boardid);

	void createTable(Long boardid);

	void deleteTable(Long boardid);

	void createSeq(Long boardid);

	void deleteSeq(Long boardid);

}
