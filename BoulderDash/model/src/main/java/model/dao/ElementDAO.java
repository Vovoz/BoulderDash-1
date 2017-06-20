package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * <h1>The Class ElementDAO.</h1>
 * 
 * @author Hugo Routy
 * @version 1.0
 */
public abstract class ElementDAO extends AbstractDAO {
	/**
	 * Gets the elements of a row in map of lv1
	 */
	private static String sqlMapElementLv1 = "{call findMapElementLv1(?) ";
	/**
	 * Gets the elements of a row in map of lv2
	 */
	private static String sqlMapElementLv2 = "{call findMapElementLv2(?) ";
	/**
	 * Gets the elements of a row in map of lv3
	 */
	private static String sqlMapElementLv3 = "{call findMapElementLv3(?) ";
	/**
	 * Gets the elements of a row in map of lv4
	 */
	private static String sqlMapElementLv4 = "{call findMapElementLv4(?) ";
	/**
	 * Gets the elements of a row in map of lv5
	 */
	private static String sqlMapElementLv5 = "{call findMapElementLv5(?) ";
	
	/**
	 * Gets the elements of a row in map of lv1
	 * @param column the name
	 * @return  the elements of a row 
	 * @throws SQLException the SQL exception
	 */
	public static ArrayList<String> getMapElementLv1(int row) throws java.sql.SQLException {
		final ArrayList<String> elementsList = new ArrayList<String>(); 
		final java.sql.CallableStatement callStatement = prepareCall(sqlMapElementLv1);
		callStatement.setInt(1, row);
		if (callStatement.execute()){
			final ResultSet result = callStatement.getResultSet();
			for (int i = 0; i < 10; i++) {
				elementsList.add(result.getString(i));
			}
			result.close();
		}
		return elementsList;
	}
	
	/**
	 * Gets the elements of a row in map of lv2
	 * @param column the name
	 * @return  the elements of a row 
	 * @throws SQLException the SQL exception
	 */
	public static ArrayList<String> getMapElementLv2(int row) throws java.sql.SQLException {
		final ArrayList<String> elementsList = new ArrayList<String>(); 
		final java.sql.CallableStatement callStatement = prepareCall(sqlMapElementLv2);
		callStatement.setInt(1, row);
		if (callStatement.execute()){
			final ResultSet result = callStatement.getResultSet();
			for (int i = 0; i < 15; i++) {
				elementsList.add(result.getString(i));
			}
		}
		return elementsList;
	}
	
	/**
	 * Gets the elements of a row in map of lv3
	 * @param column the name
	 * @return  the elements of a row 
	 * @throws SQLException the SQL exception
	 */
	public static ArrayList<String> getMapElementLv3(int row) throws java.sql.SQLException {
		final ArrayList<String> elementsList = new ArrayList<String>(); 
		final java.sql.CallableStatement callStatement = prepareCall(sqlMapElementLv3);
		callStatement.setInt(1, row);
		if (callStatement.execute()){
			final ResultSet result = callStatement.getResultSet();
			for (int i = 0; i < 20; i++) {
				elementsList.add(result.getString(i));
			}
		}
		return elementsList;
	}
	
	/**
	 * Gets the elements of a row in map of lv4
	 * @param column the name
	 * @return  the elements of a row 
	 * @throws SQLException the SQL exception
	 */
	public static ArrayList<String> getMapElementLv4(int row) throws java.sql.SQLException {
		final ArrayList<String> elementsList = new ArrayList<String>(); 
		final java.sql.CallableStatement callStatement = prepareCall(sqlMapElementLv4);
		callStatement.setInt(1, row);
		if (callStatement.execute()){
			final ResultSet result = callStatement.getResultSet();
			for (int i = 0; i < 30; i++) {
				elementsList.add(result.getString(i));
			}
		}
		return elementsList;
	}
	
	/**
	 * Gets the elements of a row in map of lv5
	 * @param column the name
	 * @return  the elements of a row 
	 * @throws SQLException the SQL exception
	 */
	private static ArrayList<String> getMapElementLv5(int row) throws java.sql.SQLException {
		final ArrayList<String> elementsList = new ArrayList<String>(); 
		final java.sql.CallableStatement callStatement = prepareCall(sqlMapElementLv5);
		callStatement.setInt(1, row);
		if (callStatement.execute()){
			final ResultSet result = callStatement.getResultSet();
			for (int i = 0; i < 40; i++) {
				elementsList.add(result.getString(i));
			}
		}
		return elementsList;
	}
	
	/**
	 * Gets the list of elements of a row and return the element of a column of the row
	 * @param idLevel,row index, column index
	 * @return  the elements of a row 
	 * @throws SQLException the SQL exception
	 */
	public String getElement (int idLevel, int row, int column) throws SQLException{
		String element = "";
		ArrayList<String> elementsRow = new ArrayList<String>(); 
		switch (idLevel){
			case 1 : 
				elementsRow = getMapElementLv1(row);
				break;
			case 2 :
				elementsRow = getMapElementLv2(row);
				break;
			case 3 :
				elementsRow = getMapElementLv3(row);
				break;
			case 4 :
				elementsRow = getMapElementLv4(row);
				break;
			case 5 : 
				elementsRow = getMapElementLv5(row);
				break;
		}
		
		element = elementsRow.get(column);
		return element;
	}
	
}