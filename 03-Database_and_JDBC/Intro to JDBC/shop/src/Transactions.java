import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transactions {

    public static void main(String args[]) {
        // A transaction is a set of actions to be carried out as a single, atomic action.
        // Either all of the actions are carried out, or none of them are.
        String url = "jdbc:postgresql://localhost:5432/shop";
        String username = "postgres";
        String password = "azerty123";

        Connection conn = null;

        try{
            conn = DriverManager.getConnection(url, username, password);
            conn.setAutoCommit(false);



            // first prepared statement in the connection
            try{
                assert conn != null;
                String sql = "update customer SET first_name = ? WHERE customerId = ?";
                try(PreparedStatement st = conn.prepareStatement(sql)){

                    st.setString(1, "John Terry");
                    st.setInt(2, 4);

                    st.executeUpdate();

                }
            }catch (Exception e){
                e.printStackTrace();
            }


            // second prepared statement
            try{
                assert conn != null;

                String sql2 = "UPDATE customer SET first_name = ? last_name = ? WHERE customerId = ?";

                try(PreparedStatement ps = conn.prepareStatement(sql2)){
                    ps.setString(1, "Yoland");
                    ps.setString(2, "Johnson");
                    ps.setInt(2, 4);

                    ps.executeUpdate();
                }
            }catch (Exception e){
                e.printStackTrace();
            }

            // committing all the transactions
            try{
                conn.commit();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }catch (SQLException e){
           try{
               assert conn != null;
               conn.rollback();
           }catch (Exception ex){
               ex.printStackTrace();
           }
            e.printStackTrace();
        }finally {
            if(conn != null){
                try{
                    conn.close();
                }catch (SQLException ex){
                    ex.printStackTrace();
                }
            }
        }
    }
}
