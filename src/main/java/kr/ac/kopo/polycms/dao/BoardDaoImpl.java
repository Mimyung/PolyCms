package kr.ac.kopo.polycms.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.polycms.model.Board;

@Repository
public class BoardDaoImpl implements BoardDao {
	
	@Autowired
	SqlSession sql;
	
	@Override
	public List<Board> list() {
		return sql.selectList("board.list");
	}

	@Override
	public void add(Board item) {
		sql.insert("board.add", item);
	}

	@Override
	public Board item(Long boardId) {
		return sql.selectOne("board.item", boardId);
	}

	@Override
	public void update(Board item) {
		sql.update("board.update", item);
	}

	@Override
	public void delete(Long boardId) {
		sql.delete("board.delete", boardId);

	}

	@Override
	public void createTable(Long boardid) {
		sql.update("board.create_board", boardid);
	}

	@Override
	public void deleteTable(Long boardid) {
		sql.update("board.delete_board", boardid);
		
	}

	@Override
	public void createSeq(Long boardid) {
		sql.update("board.create_board_seq", boardid);
		
	}

	@Override
	public void deleteSeq(Long boardid) {
		sql.update("board.delete_board_seq", boardid);
		
	}

}
