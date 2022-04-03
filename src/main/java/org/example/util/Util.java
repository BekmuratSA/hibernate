package org.example.util;

import org.example.dao.City;
import org.example.dao.Country;
import org.example.dao.Mayor;
import org.example.dataBase.Db;

import java.sql.*;
import java.util.ArrayList;


public class Util {

    public static void createTableCity() {
        String SQL = "Create table if not exists City" +
                "(id integer primary key not null," +
                "name varchar(50) not null)";
        try {
            Connection connection = Db.connection();
            Statement statement = connection.createStatement();
            statement.executeUpdate(SQL);
            System.out.println("created table City");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addedCity(int id, String name) {
        String SQL = "insert into City(id,name) values(" + City.id + ",'" + City.name + "')";
        try {
            PreparedStatement statement = Db.connection().prepareStatement("INSERT Into City VALUES (?,?)");
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<String> getAllCity() {
        ArrayList<String> cities = new ArrayList<>();
        String sql = "Select * From City";
        try {
            Connection connection = Db.connection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            {
                while (resultSet.next()) {
                    cities.add(String.valueOf(resultSet.getInt("id")));
                    cities.add(resultSet.getString("name"));
                    System.out.println(resultSet.getInt("id") + " "
                            + resultSet.getString("name"));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return cities;
    }

    public static void createTableCountry() {
        String SQL = "Create table if not exists Country" +
                "(id integer primary key not null," +
                "name varchar(50) not null)";
        try {
            Connection connection = Db.connection();
            Statement statement = connection.createStatement();
            statement.executeUpdate(SQL);
            System.out.println("created table Country");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addedCountry(int id, String name) {
       String SQL = "insert into Country(id,name) values(" + Country.id + ",'" + Country.name + "')";
        try {
            PreparedStatement statement = Db.connection().prepareStatement("INSERT Into Country VALUES (?,?)");
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<String> getAllCountry() {
        ArrayList<String> country = new ArrayList<>();
        String sql = "Select * From Country";
        try {
            Connection connection = Db.connection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            {
                while (resultSet.next()) {
                    country.add(String.valueOf(resultSet.getInt("id")));
                    country.add(resultSet.getString("name"));
                    System.out.println(resultSet.getInt("id") + " "
                            + resultSet.getString("name"));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return country;
    }


    public static void createTableMayor() {
        String SQL = "Create table if not exists Mayor" +
                "(id integer primary key not null," +
                "name varchar(50) not null)";
        try {
            Connection connection = Db.connection();
            Statement statement = connection.createStatement();
            statement.executeUpdate(SQL);
            System.out.println("created table Mayor");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addedMayor(int id, String name) {

        String SQL = "insert into Mayor(id,name) values(" + Mayor.id + ",'" + name + "')";
        try {
            PreparedStatement statement = Db.connection().prepareStatement("INSERT Into Mayor VALUES (?,?)");
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<String> getAllMayor() {
        ArrayList<String> mayor = new ArrayList<>();
        String sql = "Select * From Mayor";
        try {
            Connection connection = Db.connection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            {
                while (resultSet.next()) {
                    mayor.add(String.valueOf(resultSet.getInt("id")));
                    mayor.add(resultSet.getString("name"));
                    System.out.println(resultSet.getInt("id") + " "
                            + resultSet.getString("name"));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return mayor;

    }

}
