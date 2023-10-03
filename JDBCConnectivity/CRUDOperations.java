package JDBCConnectivity;

import java.sql.*;
import java.util.Scanner;

public class CRUDOperations {
    public static String url = "jdbc:mysql://localhost:3306/demodb";
    public static String  username = "root";
    public static String password = "root";

    public static void main(String[] args) {
        Connection con = null;
        Scanner sc = new Scanner(System.in);
        PreparedStatement preparedStatement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            System.out.println("connection successful");


            int choice;

            while (true){
                System.out.println("insert contact 1");
                System.out.println("update contact 3");
                System.out.println("delete contact 3");
                System.out.println("retrieve contact 4");
                System.out.println("create table contact 5");
                System.out.println("Exit 5");

                choice = sc.nextInt();

                switch (choice){
                    case 1:
                        insertContact(sc,con);
                        break;
                    case 2:
                        updateContact(con,sc);
                        break;
                    case 3:
                        deleteContact(con,sc);
                        break;
                    case 4:
                        retrieveContact(con);
                        break;
                    case 5:
                        createTableContact(con);
                        break;
                    case 6:
                        con.close();
                        System.out.println("exiting");
                        return;
                    default:
                        System.out.println("invalid choice");
                }
            }

        }
        catch (SQLException | ClassNotFoundException e){
            throw new RuntimeException(e);
        }


    }
    static void createTableContact(Connection con) throws SQLException{
        Statement st = con.createStatement();
        String query = "create table contact(id int auto_increment primary key,name varchar(20),mobile varchar(20))";
        try{
        st.executeUpdate(query);
        }catch (SQLException e){
            System.out.println(e.toString());
        }
        System.out.println("table created successfully");
    }
    static void insertContact(Scanner sc,Connection con) throws SQLException{

        System.out.println("enter name");
        String name = sc.next();


        System.out.println("enter mobile number");
        String mobile = sc.next();

        String query = "insert into contact (name,mobile) values(?,?)";

        PreparedStatement insertStatement = con.prepareStatement(query);
        insertStatement.setString(1,name);
        insertStatement.setString(2,mobile);
        int updatedrows = insertStatement.executeUpdate();
        if (updatedrows > 0){
            System.out.println("inserted successfully");
        }
    }

    static void updateContact(Connection con, Scanner sc) throws SQLException{
        System.out.println("enter id");
        int id = sc.nextInt();
        System.out.println("enter name to update");
        String name = sc.next();
        System.out.println("enter mobile to update");
        String mobile = sc.next();

        String query = "update contact set name=?,mobile=? where id = ?";
        PreparedStatement updateStatement = con.prepareStatement(query);
        updateStatement.setString(1,name);
        updateStatement.setString(2,mobile);
        updateStatement.setInt(3,id);
        int updatedRows = updateStatement.executeUpdate();
        if (updatedRows > 0){
            System.out.println("contact updated successfully");
        }else {
            System.out.println("no contact found for the given id");
        }
    }
    static void deleteContact(Connection con, Scanner sc) throws SQLException{
        System.out.println("enter id");
        int id = sc.nextInt();

        String query = "delete from contact where id = ?";
        PreparedStatement deletecontact = con.prepareStatement(query);
        deletecontact.setInt(1,id);
        int updatedR0ws = deletecontact.executeUpdate();
        if (updatedR0ws > 0){
            System.out.println("contact deleted successfully");
        }
        else {
            System.out.println("no contact found with given id");
        }
    }

    static void retrieveContact(Connection con) throws SQLException{
        String queryread = "select *from contact";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(queryread);

        while (rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }
    }
}
