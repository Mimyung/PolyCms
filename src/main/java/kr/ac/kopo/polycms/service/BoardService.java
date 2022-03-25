package kr.ac.kopo.polycms.service;

import java.util.List;

import kr.ac.kopo.polycms.model.Board;

public interface BoardService {

	List<Board> list();

	void add(Board item);

	Board item(Long boardid);

	void update(Board item);

	void delete(Long boardid);

}
