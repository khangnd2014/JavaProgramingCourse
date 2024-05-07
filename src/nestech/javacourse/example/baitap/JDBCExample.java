package nestech.javacourse.example.baitap;

import nestech.javacourse.example.condition.Student;

import java.sql.*;

public class JDBCExample {

    private static final String hostName = "jdbc:mysql://localhost:3306/booksdb?useSSL=false";
    private static final String userName = "root";
    private static final String password = "password";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Buoc 1: Download and attachment my connection lib
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Buoc 2 : Tao doi tuong connection
        Connection connection = DriverManager.getConnection(hostName, userName, password);
        connection.setAutoCommit(false);
        // Buoc 3: Try van
        System.out.println("Query cac cau lenh truy van");

//        // Buoc 3: Tao doi tuong Statement
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        try {
            String sql = "INSERT INTO books(title, author) values('Lap Trinh 3', 'AAAA')";
            statement.executeUpdate(sql);

            String sql2 = "INSERT INTO books(title, author) values('Lap Trinh 4', 1234)";
            statement.executeUpdate(sql2);

            connection.commit();
        } catch (Exception exception) {
            connection.rollback();
        } finally {
            connection.close();
        }

//        // Buoc 4: Thuc thi truy van
//        ResultSet resultSet = statement.executeQuery("Select * from books");
//       ResultSetMetaData resultSetMetaData =  resultSet.getMetaData();
//        System.out.println("ID: " + resultSetMetaData.isAutoIncrement(1));
//        System.out.println("Title: " + resultSetMetaData.isAutoIncrement(2));
//
//        while (resultSet.next()) {
//            System.out.println(resultSet.getInt(1)
//                    + " , Title: " + resultSet.getString(2)
//                    + " , Author: " + resultSet.getString(3));
//        }
//
//        // Update a book
//        String sql = "INSERT INTO books(title,author) values(?,?)";
//        PreparedStatement preparedStatement;
//        preparedStatement = connection.prepareStatement(sql);
//        // add book 1
//        preparedStatement.setString(1, "Lap Trinh C#");
//        preparedStatement.setString(2, "Nguyen Van A");
//
//        // add book 1
//        preparedStatement.setString(1, "Lap Trinh Python");
//        preparedStatement.setString(2, "Nguyen Van B");
//
//        connection.setAutoCommit(false);

        // Close connection


    }

}
