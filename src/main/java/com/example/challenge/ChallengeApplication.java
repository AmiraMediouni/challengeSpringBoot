package com.example.challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.sql.*;


//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
@EnableJpaRepositories
public class ChallengeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChallengeApplication.class, args);
       /* try{
            Connection connexion = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/myDatabase",
                    "root",
                    "database2023");
            Statement statement=connexion.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from customers");
            while(resultSet.next()){
                System.out.println(resultSet.getString("firstName"));
                System.out.println(resultSet.getString("lastName"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }*/


         }

}
