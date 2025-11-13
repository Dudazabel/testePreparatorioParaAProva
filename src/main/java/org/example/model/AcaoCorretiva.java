package org.example.model;

import java.time.LocalDateTime;

public class AcaoCorretiva {

    private int id;
    private int falhaId;
    private LocalDateTime dataHoraInicio;
    private LocalDateTime dataHoraFim;
    private String responsável;
    private String descricao;

    public AcaoCorretiva(int id, int falhaId, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim, String responsável, String descricao) {
        this.id = id;
        this.falhaId = falhaId;
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
        this.responsável = responsável;
        this.descricao = descricao;
    }

    public AcaoCorretiva(int falhaId, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim, String responsável, String descricao) {
        this.falhaId = falhaId;
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
        this.responsável = responsável;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFalhaId() {
        return falhaId;
    }

    public void setFalhaId(int falhaId) {
        this.falhaId = falhaId;
    }

    public LocalDateTime getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public LocalDateTime getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraFim(LocalDateTime dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }

    public String getResponsável() {
        return responsável;
    }

    public void setResponsável(String responsável) {
        this.responsável = responsável;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
