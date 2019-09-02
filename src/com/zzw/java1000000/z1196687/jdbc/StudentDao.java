package com.zzw.java1000000.z1196687.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhengzewang on 2019/7/20.
 */
public class StudentDao {

    public List<Student> list() throws SQLException, ClassNotFoundException {
        Connection conn = Conn.getConnection();

        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM student");

        List<Student> students = new ArrayList<>();
        while (rs.next()) {
            Student student = new Student();
            student.setId(rs.getString(Student.ID));
            student.setCode(rs.getString(Student.CODE));
            student.setName(rs.getString(Student.NAME));
            students.add(student);
        }

        conn.close();
        return students;
    }

    public Student get(String id) throws SQLException, ClassNotFoundException {
        Student student = null;
        Connection conn = Conn.getConnection();

        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM student WHERE id = ?");
        preparedStatement.setString(1, id);

        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            student = new Student();
            student.setId(rs.getString(Student.ID));
            student.setCode(rs.getString(Student.CODE));
            student.setName(rs.getString(Student.NAME));
        }

        conn.close();
        return student;
    }

    public boolean insert(Student student) throws SQLException, ClassNotFoundException {
        Connection conn = Conn.getConnection();

        PreparedStatement preparedStatement = conn.prepareStatement("insert into student(id, code,`name` ) values (?, ?, ?)");
        preparedStatement.setString(1, student.getId());
        preparedStatement.setString(2, student.getCode());
        preparedStatement.setString(3, student.getName());

        int i = preparedStatement.executeUpdate();
        boolean b = i > 0 ? true : false;

        conn.close();
        return b;
    }

    public int[] batchInsert(List<Student> students) throws SQLException, ClassNotFoundException {
        if (students == null || students.size() == 0) {
            return new int[0];
        }
        Connection conn = Conn.getConnection();

        PreparedStatement preparedStatement = conn.prepareStatement("insert into student(id, code,`name` ) values (?, ?, ?)");
        for (Student student : students) {
            preparedStatement.setString(1, student.getId());
            preparedStatement.setString(2, student.getCode());
            preparedStatement.setString(3, student.getName());
            preparedStatement.addBatch();
        }
        int[] ints = preparedStatement.executeBatch();

        conn.close();
        return ints;
    }

    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        Connection conn = Conn.getConnection();

        PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM student WHERE id = ?");
        preparedStatement.setString(1, id);

        int i = preparedStatement.executeUpdate();
        boolean b = i > 0 ? true : false;

        conn.close();
        return b;
    }

}
