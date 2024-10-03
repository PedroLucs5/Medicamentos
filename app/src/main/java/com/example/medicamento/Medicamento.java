package com.example.medicamento;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.io.Serializable;

@Entity(tableName = "medicamento")
public class Medicamento implements Serializable {

    @ColumnInfo(name = "id_medicamento")
    @PrimaryKey(autoGenerate = true)
    private int idMedicamento;

    @ColumnInfo(name = "nome")
    private String nome;
    @ColumnInfo(name = "tipo")
    private String tipo;
    @ColumnInfo(name = "dosagem")
    private String dosagem;
    @ColumnInfo(name = "horario")
    private String horario;

    // Construtor
    public Medicamento(String nome, String tipo, String dosagem, String horario) {
        this.nome = nome;
        this.tipo = tipo;
        this.dosagem = dosagem;
        this.horario = horario;
    }

    // Getters e Setters


    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
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
