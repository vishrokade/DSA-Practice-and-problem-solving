package JDBCConnectivity;
import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class JDBCConnectivity {
    public static void main(String[] args) throws SQLException {

        Connection con = null;
        PreparedStatement preparedStatement = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/demodb";
            String username = "root";
            String password = "root";
            con = DriverManager.getConnection(url,username,password);
            System.out.println("connection successful");

//            Statement st = con.createStatement();
//            ResultSet rs = st.executeQuery("select *from student");
//            while (rs.next()){
//                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
//            }

//            String query = "insert into student(name,mobile) values(?,?)";
//            preparedStatement = con.prepareStatement(query);
            String query = "update student set name = ? where name = 'ganpat'";
            preparedStatement = con.prepareStatement(query);
            String s = "rana";
            preparedStatement.setString(1,s);
            preparedStatement.executeUpdate();

            String[] names = {"anmol","ganesh"};
            String[] mobiles = {"2132435433","9878675656"};

//            for (int i = 0; i < names.length; i++) {
//                preparedStatement.setString(1,names[i]);
//                preparedStatement.setString(2,mobiles[i]);
//                preparedStatement.executeUpdate();
//            }

            System.out.println("data inserted successfully");

            String queryread = "select *from student";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(queryread);
            while (rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}