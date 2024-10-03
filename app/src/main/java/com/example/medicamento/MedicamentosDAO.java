package com.example.medicamento;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface MedicamentosDAO {

    @Insert
    public void inserir (Medicamento... medicamento);

    @Update
    public void atualizar (Medicamento... medicamento);

    @Delete
    public void deletar (Medicamento... medicamento);

    @Query("SELECT * FROM medicamento WHERE id_medicamento = :idMedicamento ")
    public Medicamento getMedicamento(int idMedicamento);

    @Query("SELECT * FROM medicamento")
    public List<Medicamento> getMedicamentos();

    @Query("DELETE FROM medicamento")
    public void apagarTodos();

}
