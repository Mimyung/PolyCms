package kr.ac.kopo.polycms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.polycms.dao.BoardDao;
import kr.ac.kopo.polycms.model.Board;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	BoardDao dao;
	
	@Override
	public List<Board> list() {
		
		return dao.list();
	}

	@Override
	public void add(Board item) {
		dao.add(item);
		
		dao.createTable(item.getBoardid());
		
		dao.createSeq(item.getBoardid());
	}

	@Override
	public Board item(Long boardid) {
		return dao.item(boardid);
	}

	@Override
	public void update(Board item) {
		dao.update(item);

	}

	@Override
	public void delete(Long boardid) {
		dao.delete(boardid);
		
		dao.deleteTable(boardid);
		
		dao.deleteSeq(boardid);
	}

}
