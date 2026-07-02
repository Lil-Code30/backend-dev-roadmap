import java.sql.*;

public class Main {

    public static void main(String[] args){

        // pgAdmin with js/ts
        // postgresql://postgres:azerty123@localhost:5432/shop
        String sql1 = "select * from product";

        String url = "jdbc:postgresql://localhost:5432/shop";
        String username = "postgres";
        String password = "azerty123";

        // NOTE: Try-with-Resources will be the choice if you want to automatically close the connection
        try(Connection con = DriverManager.getConnection(url, username, password);

            // for prepared statement
            // PreparedStatement st = con.prepareStatement()
            Statement st = con.createStatement();
            ResultSet resultSet =  st.executeQuery(sql1)){

            // The ResultSet.next() method moves to the next row in the ResultSet, if there are anymore rows.
            // If there are anymore rows, it returns true.
            // If there were no more rows, it will return false.
            while(resultSet.next()){
                int colIndex = resultSet.findColumn("productId");

               // String product = resultSet.getString("productId");
               // String productName = resultSet.getString("productName");

                System.out.println(resultSet.getString(1) + " : " + resultSet.getString(2));

            }

            // update
            String sql2 = "update product set productName='Mac Keyboard' WHERE productId=40";

            int rowsAffected = st.executeUpdate(sql2);

            System.out.println("=========================");
            System.out.println(  "rows affected after the updates: " + rowsAffected);
            System.out.println("=========================");

            System.out.println("After updates");

            String sql = "select * from product where productId=40";

            ResultSet rs1 = st.executeQuery(sql);

            rs1.next();

            System.out.println(rs1.getString(1) + " : " + rs1.getString(2));

            // Accessing column values
            /*
            * result.getArray("columnName");
                result.getAsciiStream("columnName");
                result.getBigDecimal("columnName");
                result.getBinaryStream("columnName");
                result.getBlob("columnName");
                result.getBoolean("columnName");
                result.getBlob("columnName");
                result.getBoolean("columnName");
                result.getByte("columnName");
                result.getBytes("columnName");
                result.getCharacterStream("columnName");
                result.getClob("columnName");
                result.getDate("columnName");
                result.getDouble("columnName");
                result.getFloat("columnName");
                result.getInt("columnName");
                result.getLong("columnName");
                result.getNCharacterStream("columnName");
                result.getObject("columnName");
                result.getRef("columnName");
                result.getRowId("columnName");
                result.getShort("columnName");
                result.getSQLXML("columnName");
                result.getString("columnName");
                result.getTime("columnName");
                result.getTimestamp("columnName");
                result.getUnicodeStream("columnName");
                result.getURL("columnName");
            * */

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
