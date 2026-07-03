import Models.Database;
import Models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        // creating a new user object
        // User u1 = new User("John Doe", "johndoe@gmail.com");

        // url format: jdbc:<subprotocol>://<host>:<port>/<database>
        try(Connection conn = Database.getDataSource().getConnection()){

            String sql = "SELECT id, full_name, email, created_at FROM users WHERE email = ?";

            try(PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, "johndoe@gmail.com");

                try(ResultSet rs = st.executeQuery()){
                    rs.next();

                    // NOTE: What is done here?
                    // I fetch the user data from the db and then create a user object to store the data
                    User foundUser = new User(rs.getString("full_name"), rs.getString("email"));
                    foundUser.setId(rs.getLong("id"));


                    System.out.println(foundUser);
                }
            }

            String sql2 = "INSERT INTO users (full_name, email) VALUES (?, ?)";

            System.out.println("Please enter your full name: ");
            String fullName = input.nextLine();
            System.out.println("Please enter your email: ");
            String email = input.nextLine();

            try(PreparedStatement st = conn.prepareStatement(sql2)){
                st.setString(1, fullName);
                st.setString(2, email);

                if(st.executeUpdate() == 1){
                    System.out.println("The user has been created");
                }else {
                    System.out.println("The user has already been created");
                }
            }

            // Batch with preparedStatement

            ArrayList<User> users = new ArrayList<>();

            users.add(new User("John Doe", "john.doe@email.com"));
            users.add(new User("Jane Smith", "jane.smith@email.com"));
            users.add(new User("Michael Johnson", "michael.johnson@email.com"));
            users.add(new User("Emily Brown", "emily.brown@email.com"));
            users.add(new User("David Wilson", "david.wilson@email.com"));
            users.add(new User("Sarah Davis", "sarah.davis@email.com"));
            users.add(new User("James Miller", "james.miller@email.com"));
            users.add(new User("Olivia Garcia", "olivia.garcia@email.com"));
            users.add(new User("Daniel Martinez", "daniel.martinez@email.com"));
            users.add(new User("Sophia Anderson", "sophia.anderson@email.com"));

            System.out.println("processing batch insertion in the db...");

            try(PreparedStatement st2 = conn.prepareStatement(sql2)){
                for(User user : users){
                    st2.setString(1, user.getFullName());
                    st2.setString(2, user.getEmail());

                    st2.addBatch();
                }

                st2.executeBatch();
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
