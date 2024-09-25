package com.example.medicamento;

import java.io.Serializable;

public class Medicamento implements Serializable {
    private String nome;
    private String tipo;
    private String dosagem;
    private String horario;

    public Medicamento(String nome, String tipo, String dosagem, String horario) {
        this.nome = nome;
        this.tipo = tipo;
        this.dosagem = dosagem;
        this.horario = horario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDosagem() {
        return dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
