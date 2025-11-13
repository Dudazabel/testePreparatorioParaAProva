package org.example.repository;

import org.example.infraestrutura.ConexaoBanco;
import org.example.model.Equipamento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EquipamentoDAO {

    public static void criarEquipamento(Equipamento equipamento) throws SQLException{
        String query = "INSERT INTO Equipamento(nome, numeroDeSerie, areaSetor, statusOperacional) VALUES (?,?,?, 'OPERACIONAL')";

        try(Connection conn = ConexaoBanco.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, equipamento.getNome());
            stmt.setString(2, equipamento.getNumeroDeSerie());
            stmt.setString(3, equipamento.getAreaSetor());
            stmt.executeUpdate();
        }
    }

    public static boolean equipamentoExiste(Equipamento equipamento) throws SQLException{
        String query = "SELECT nome FROM Equipamento WHERE id = ?";

        try(Connection conn = ConexaoBanco.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)){

            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                return true;
            }
        }

        return false;
    }
}
