package test01.board;

public class BoardDTO {
private String title,content , writer;
private int boardNo;
public BoardDTO(int boardNo, String content, String writer, String title) {
	super();
	this.title = title;
	this.content = content;
	this.writer = writer;
	this.boardNo = boardNo;
	
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public String getWriter() {
	return writer;
}
public void setWriter(String writer) {
	this.writer = writer;
}
public int getBoardNo() {
	return boardNo;
}
public void setBoardNo(int boardNo) {
	this.boardNo = boardNo;
}





}