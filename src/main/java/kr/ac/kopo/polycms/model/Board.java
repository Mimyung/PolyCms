package kr.ac.kopo.polycms.model;

public class Board {
	private Long boardid;
	private String subject;
	private char reply;
	private char attach;
	private char secret;
	private char permission;
	
	public Long getBoardid() {
		return boardid;
	}
	public void setBoardid(Long boardid) {
		this.boardid = boardid;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public char getReply() {
		return reply;
	}
	public void setReply(char reply) {
		this.reply = reply;
	}
	public char getAttach() {
		return attach;
	}
	public void setAttach(char attach) {
		this.attach = attach;
	}
	public char getSecret() {
		return secret;
	}
	public void setSecret(char secret) {
		this.secret = secret;
	}
	public char getPermission() {
		return permission;
	}
	public void setPermission(char permission) {
		this.permission = permission;
	}
	
}
