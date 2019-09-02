package com.zzw.java1000000.z1196687.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhengzewang on 2019/7/18.
 */
public class Conn {

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test" +
                "?useSSL=false&characterEncoding=utf8", "zzw", "123456");
        return connection;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        StudentDao studentDao = new StudentDao();

        Student student1 = new Student();
        student1.setId("201900010101");
        student1.setCode("zhengzewang");
        student1.setName("郑泽旺");
        Student student2 = new Student();
        student2.setId("201900010102");
        student2.setCode("wujiaoyu");
        student2.setName("吴娇钰");

        System.out.println(studentDao.delete(student1.getId()));
        System.out.println(studentDao.insert(student1));
        System.out.println(studentDao.delete(student2.getId()));
        System.out.println(studentDao.insert(student2));

        System.out.println(studentDao.list());

        //
        System.out.println(studentDao.delete(student1.getId()));
        System.out.println(studentDao.delete(student2.getId()));
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        System.out.println(studentDao.batchInsert(students));
        System.out.println(studentDao.list());
    }

}
