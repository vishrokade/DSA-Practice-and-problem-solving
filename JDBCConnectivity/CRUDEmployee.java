package JDBCConnectivity;

import java.sql.*;
import java.util.Scanner;

public class CRUDEmployee {
    public static String url = "jdbc:mysql://localhost:3306/demodb";
    public static String  username = "root";
    public static String password = "root";

    public static void main(String[] args) throws SQLException {
        Connection con = null;
        Scanner sc = new Scanner(System.in);
        PreparedStatement preparedStatement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            System.out.println("connection successful");


            int choice;

            while (true) {
                System.out.println("create table Employee 1");
                System.out.println("insert into employee 2");
                System.out.println("update employee details 3");
                System.out.println("delete employee record 4");
                System.out.println("retrieve employee details 5");
                System.out.println("Exit 6");

                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        createTableEmployee(con);
                        break;

                    case 2:
                        insertEmployee(con,sc);
                        break;

                    case 3:
                        updateEmployee(con, sc);
                        break;

                    case 4:
                        deleteEmployee(con, sc);
                        break;
                    case 5:
                        retrieveEmployee(con);
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

    static void createTableEmployee(Connection con) throws SQLException{
        Statement st = con.createStatement();
        String query = "create table employee(id int auto_increment primary key,name varchar(20),email varchar(20), contact varchar(20), deptid int,salary int)";
        try{
            st.executeUpdate(query);
            System.out.println("table created successfully");
        }catch (SQLException e){
            System.out.println(e.toString());
        }

    }

    static void insertEmployee(Connection con,Scanner sc) throws SQLException{
        System.out.println("insert name");
        String name= sc.next();
        System.out.println("enter email");
        String email = sc.next();
        System.out.println("enter mobile number");
        String mobile = sc.next();
        System.out.println("enter department id");
        int deptid = sc.nextInt();
        System.out.println("enter salary");
        int salary = sc.nextInt();

        String query = "insert into employee (name,email,contact,deptid,salary) values(?,?,?,?,?)";

        PreparedStatement insertStatement = con.prepareStatement(query);
        insertStatement.setString(1,name);
        insertStatement.setString(2,email);
        insertStatement.setString(3,mobile);
        insertStatement.setInt(4,deptid);
        insertStatement.setInt(5,salary);
        int updatedrows = insertStatement.executeUpdate();
        if (updatedrows > 0){
            System.out.println("inserted successfully");
        }
    }
    static void updateEmployee(Connection con , Scanner sc) throws SQLException{
        System.out.println("enter employee id");
        int id = sc.nextInt();
        System.out.println("insert name");
        String name= sc.next();
        System.out.println("enter email");
        String email = sc.next();
        System.out.println("enter mobile number");
        String mobile = sc.next();
        System.out.println("enter department id");
        int deptid = sc.nextInt();
        System.out.println("enter salary");
        int salary = sc.nextInt();

        String query = "update employee set name=?,email=?,contact=?,deptid=?,salary=? where id = ?";
        PreparedStatement updateStatement = con.prepareStatement(query);
        updateStatement.setString(1,name);
        updateStatement.setString(2,email);
        updateStatement.setString(3,mobile);
        updateStatement.setInt(4,deptid);
        updateStatement.setInt(5,salary);
        updateStatement.setInt(6,id);
        int updatedRows = updateStatement.executeUpdate();
        if (updatedRows > 0){
            System.out.println("employee table updated successfully");
        }else {
            System.out.println("no employee found for the given id");
        }
    }

    static void deleteEmployee(Connection con,Scanner sc) throws SQLException {
        System.out.println("enter id");
        int id = sc.nextInt();

        String query = "delete from employee where id = ?";
        PreparedStatement deleteEmployee = con.prepareStatement(query);
        deleteEmployee.setInt(1,id);
        int updatedR0ws = deleteEmployee.executeUpdate();
        if (updatedR0ws > 0){
            System.out.println("employee deleted successfully");
        }
        else {
            System.out.println("no employee found with given id");
        }
    }

    static void retrieveEmployee(Connection con) throws SQLException{
        String queryread = "select *from employee";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(queryread);

        while (rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getInt(6));
        }
    }
}
