package com.biglietti.biglietteria.models.repository;

import static com.biglietti.biglietteria.constants.DBConfig.*;

import com.biglietti.biglietteria.constants.DBConfig;
import com.biglietti.biglietteria.models.Utente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UtenteRepository
{
    public static List<Utente> selezionaUtenti()
    {
        List<Utente> utenteList = new ArrayList<>();
        try
        {
            Connection connection = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "SELECT * FROM UTENTE";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            while(rs.next())
            {
                Utente utente = new Utente(
                        rs.getLong("ID_UTENTE"),
                        rs.getString("NOME_UTENTE"),
                        rs.getString("COGNOME_UTENTE")
                );
                utenteList.add(utente);
            }
            statement.close();
            connection.close();
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
        return utenteList;
    }
}
