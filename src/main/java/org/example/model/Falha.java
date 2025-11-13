package org.example.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Falha {

    private int id;
    private int equipamentoId;
    private LocalDateTime dataHoraOcorrencia;
    private String descricao;
    private String criticidade;
    private float tempoParadaHoras;

    public Falha(int id, int equipamentoId, LocalDateTime dataHoraOcorrencia, String descricao, String criticidade, float tempoParadaHoras) {
        this.id = id;
        this.equipamentoId = equipamentoId;
        this.dataHoraOcorrencia = dataHoraOcorrencia;
        this.descricao = descricao;
        this.criticidade = criticidade;
        this.tempoParadaHoras = tempoParadaHoras;
    }

    public Falha(int equipamentoId, LocalDateTime dataHoraOcorrencia, String descricao, String criticidade, float tempoParadaHoras) {
        this.equipamentoId = equipamentoId;
        this.dataHoraOcorrencia = dataHoraOcorrencia;
        this.descricao = descricao;
        this.criticidade = criticidade;
        this.tempoParadaHoras = tempoParadaHoras;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEquipamentoId() {
        return equipamentoId;
    }

    public void setEquipamentoId(int equipamentoId) {
        this.equipamentoId = equipamentoId;
    }

    public LocalDateTime getDataHoraOcorrencia() {
        return dataHoraOcorrencia;
    }

    public void setDataHoraOcorrencia(LocalDateTime dataHoraOcorrencia) {
        this.dataHoraOcorrencia = dataHoraOcorrencia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCriticidade() {
        return criticidade;
    }

    public void setCriticidade(String criticidade) {
        this.criticidade = criticidade;
    }

    public float getTempoParadaHoras() {
        return tempoParadaHoras;
    }

    public void setTempoParadaHoras(float tempoParadaHoras) {
        this.tempoParadaHoras = tempoParadaHoras;
    }
}
