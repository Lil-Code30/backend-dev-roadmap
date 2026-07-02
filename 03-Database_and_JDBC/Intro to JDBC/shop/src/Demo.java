import java.sql.*;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String url = "jdbc:postgresql://localhost:5432/shop";
        String username = "postgres";
        String password = "azerty123";

        Connection conn = null;

        try{
             conn = DriverManager.getConnection(url, username, password);
        }catch(SQLException e){
            e.printStackTrace();
        }

        System.out.println("======= CRUD Action for Customers ======");
        System.out.println("Select the action choice to operate:");
        System.out.println("1. Add Customer");
        System.out.println("2. Update Customer");
        System.out.println("3. Delete Customer");
        System.out.println("4. Show All Customers");
        System.out.println("5. Batch Updates");

        String choice = input.nextLine();

        switch(choice){
            case "1":
                // customer fields : first_name, last_name , points -> default value 0
                System.out.println("===== Creating Customer ====");
                System.out.println("Enter First Name:");
                String firstName = input.nextLine();

                System.out.println("Enter Last Name:");
                String lastName = input.nextLine();

                String sql = "INSERT INTO customer (first_name, last_name) VALUES (?, ?)";

                try{
                    assert conn != null;

                    try(PreparedStatement ps = conn.prepareStatement(sql)){
                        ps.setString(1, firstName);
                        ps.setString(2, lastName);

                        ps.executeUpdate();
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case "2":
                System.out.println("===== Updating Customer ====");
                System.out.println("Enter the customer ID to be updated:");
                int id = input.nextInt();
                System.out.println("Enter First Name:");
                String firstname = input.nextLine();
                System.out.println("Enter Last Name:");
                String lastname = input.nextLine();

                String sql1 = "UPDATE customer SET first_name = ?, last_name = ? WHERE id = ?";

                try {
                    assert conn != null;
                    try(PreparedStatement st = conn.prepareStatement(sql1)){
                        st.setString(1, firstname);
                        st.setString(2, lastname);
                        st.setInt(3, id);

                        st.executeUpdate();
                    }
                } catch(SQLException e){
                    e.printStackTrace();
                }
                break;
            case "4":
                System.out.println("===== All Customers ====");
                String sql3 = "SELECT * FROM customer";

                try{
                    assert conn != null;
                    try(PreparedStatement ps = conn.prepareStatement(sql3)){
                        ResultSet rs = ps.executeQuery();

                        while(rs.next()){
                            System.out.println(rs.getString("first_name") + " " + rs.getString("last_name") + " " + rs.getInt("points"));
                        }
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case "5":
                System.out.println("===== PreparedStatement Batch Updates ====");

                String sql4 = "UPDATE customer SET first_name = ?, last_name = ? WHERE customerId = ?";
                try{
                    assert conn != null;

                    try(PreparedStatement ps = conn.prepareStatement(sql4)){

                        // first data set for the batch execution
                        ps.setString(1, "John");
                        ps.setString(2, "Doe");
                        ps.setInt(3, 1);

                        ps.addBatch();

                        // second dataset for the batch execution
                        ps.setString(1, "Will");
                        ps.setString(2, "Smith");
                        ps.setInt(3, 2);

                        ps.addBatch();

                        // Third dataset for the batch execution
                        ps.setString(1, "Holy");
                        ps.setString(2, "Ghost");
                        ps.setInt(3, 3);
                        ps.addBatch();


                        int[] affectedRecords = ps.executeBatch();

                        for(int i = 0; i < affectedRecords.length; i++){
                            System.out.println(affectedRecords[i]);
                        }

                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
                break;
                default:
                    System.out.println("Invalid choice");

        }

    }
}
