package com.biglietti.biglietteria.models.repository;

import com.biglietti.biglietteria.constants.DBConfig;
import com.biglietti.biglietteria.models.Biglietteria;
import com.biglietti.biglietteria.models.relations.BiglietteriaVendeBiglietto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BiglietteriaRepository
{
    public static List<Biglietteria> selezionaBiglietterie()
    {
        List<Biglietteria> biglietteriaList = new ArrayList<>();
        try
        {
            Connection connection = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "SELECT * FROM BIGLIETTERIA";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            while (rs.next())
            {
                Biglietteria b = new Biglietteria(
                        rs.getLong("ID_BIGLIETTERIA"),
                        rs.getString("NOME_BIGLIETTERIA"),
                        rs.getString("INDIRIZZO")
                );
                biglietteriaList.add(b);
            }
            statement.close();
            connection.close();
        }
        catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
        return biglietteriaList;
    }

    public static List<Biglietteria> selezionaBigliettiVendutiByBiglietteria(Long idBiglietteria)
    {
        List<Biglietteria> bigliettoList = new ArrayList<>();
        try
        {
            Connection connection = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PPW);
            String query = "SELECT BVB.ID_BIGLIETTERIA, BVB.ID_BIGLIETTO, BVB.QUANTITA, B.NOME_BIGLIETTERIA,\n" +
                    "B.INDIRIZZO, T.DATA_EVENTO, T.CATEGORIA, T.COSTO FROM biglietteria_vende_biglietti AS BVB\n" +
                    "JOIN BIGLIETTERIA AS B ON BVB.ID_BIGLIETTERIA = B.ID_BIGLIETTERIA\n" +
                    "JOIN BIGLIETTO AS T ON T.ID_BIGLIETTO = BVB.ID_BIGLIETTO WHERE BVB.id_biglietteria = ?";
            PreparedStatement statement = connection.prepareCall(query);
            statement.setLong(1, idBiglietteria);
            ResultSet rs = statement.executeQuery();
            while (rs.next())
            {
                Biglietteria b = new Biglietteria(
                        rs.getLong("ID_BIGLIETTERIA"),
                        rs.getString("NOME_BIGLIETTERIA"),
                        rs.getString("INDIRIZZO"),
                        rs.getLong("ID_BIGLIETTO"),
                        rs.getInt("QUANTITA"),
                        rs.getString("DATA_EVENTO"),
                        rs.getString("CATEGORIA"),
                        rs.getDouble("COSTO")
                );
                bigliettoList.add(b);
            }
            statement.close();
            connection.close();
        }
        catch (SQLException ex)
        {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return  bigliettoList;
    }
}
