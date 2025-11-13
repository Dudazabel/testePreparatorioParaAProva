package org.example.view;

import org.example.model.Equipamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {

    static Scanner leia = new Scanner(System.in);

    public static void visualizarMenu(){
        System.out.println("---MENU---");
        System.out.println("1 - Criar um equipamento");
        System.out.println("2 - Buscar um Equipamento");
        System.out.println("3 - Registrar nova Falha");
        System.out.println("4 - Buscar Falhas críticas abertas");
        System.out.println("5 - Registrar conclusão de Ação");
        System.out.println("6 - Gerar relatório do tempo de parada");
        System.out.println("7 - Buscar Equipamentos sem Falhas por período");
        System.out.println("8 - Buscar detalhes completos das Falhas");
        System.out.println("9 - Gerar relatório de manutenção preventiva");
        System.out.println("----------------------------------------------");
        System.out.println("0 - Sair");
        System.out.println(">");
    }

    public static int visualizarEscolha(){
        visualizarMenu();
        int opcao = leia.nextInt();
        return opcao;
    }

    public static void gerenciarEscolha(){
        boolean sair = false;
        int opcao = visualizarEscolha();

        switch (opcao){
            case 1 -> {

            }
            case 0 ->{
                sair = true;
            }
        }

        while(!sair){
            gerenciarEscolha();
        }
    }

    public static void criarEquipamento(){
        System.out.println("---CRIAR EQUIPAMENTO---");
        System.out.println("Digite o nome do equipamento:");
        String nome = leia.nextLine();
        System.out.println("Digite o número de série do equipamento:");
        String numeroSerie = leia.nextLine();
        System.out.println("Digite a area setor do equipamento:");
        String areaSetor = leia.nextLine();
        String statusOperacional = "OPERACIONAL";

        var equipamento = new Equipamento(nome, numeroSerie, areaSetor, null);
    }




}
