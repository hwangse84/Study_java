package pack04.database;

public class Main {
	public static void main(String[] args) {
		IDataAccessObject dao = new OracleDAO();

		dao.select();
		dao.insert();
		dao.delete();
		dao.update();

		dao = new MssqlDAO();
		dao.select();
		dao.insert();
		dao.delete();
		dao.update();
	}
}
