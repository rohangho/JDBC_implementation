package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {

        Connection connect= DriverManager.getConnection("jdbc:sqlite:E:\\JAVA\\Database\\test.db");
        Statement statement=connect.createStatement();
        statement.execute("create table if not exists contacts (name TEXT, phone INTEGER,email TEXT)");
     /*   statement.execute("insert into contacts (name,phone,email) values('Ghosh',580236,'ghosh@mail.in')");
        statement.execute("insert into contacts (name,phone,email) values('Sam',987345,'sam@gmail.com')");
        statement.execute("insert into contacts(name) values('Simran')");
        */
    //    statement.execute("update contacts set phone=58944 where phone is null");
    //    statement.execute("delete from contacts where name='Ghosh'");
        statement.execute("select * from contacts");
        ResultSet result=statement.getResultSet();
        while(result.next())
            System.out.println(result.getString("name")+" "+ result.getInt("phone")+" "+result.getString("email"));
        statement.close();
        connect.close();
    }


}
