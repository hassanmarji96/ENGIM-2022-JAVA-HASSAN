package com.example.demo.entities.repository;


import com.example.demo.entities.Studente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudenteRepository
{
    private static final String URL = "jdbc:mysql://localhost:3306/scuola";
    private static final String USER = "littleshops";
    private static final String PASSWORD = "littleshops";

    public static List<Studente> selezionaTutti()
    {
        List<Studente> studentiList = new ArrayList<>();
        try
        {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            String query = "{CALL seleziona_studenti()}";
            CallableStatement statement = connection.prepareCall(query);
            ResultSet rs = statement.executeQuery();
            while (rs.next())
            {
                Studente studente = new Studente(
                        rs.getLong("id"),
                        rs.getString("nome"),
                        rs.getString("cognome"),
                        rs.getString("indirizzoStudio")
                );
                studentiList.add(studente);
                connection.close();
                statement.close();
            }
        }
        catch (SQLException ex)
        {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return studentiList;
    }
}
