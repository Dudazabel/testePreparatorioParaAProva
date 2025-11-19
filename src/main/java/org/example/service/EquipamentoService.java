package org.example.service;

import org.example.model.Equipamento;
import org.example.repository.EquipamentoDAO;

import java.sql.SQLException;

public class EquipamentoService {

    public static void criarEquipamento(Equipamento equipamento)throws SQLException {

        var dao = new EquipamentoDAO();

        try{
            if(dao.equipamentoExiste() == true){
               throw new RuntimeException("Equipamento já existe.");
            }else{
                dao.criarEquipamento(equipamento);
            }
        }catch(SQLException erro){

        }
    }
}
