package com.example.medicamento;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MedicamentosActivity extends AppCompatActivity {
    private RecyclerView recyclerViewMedicamentos;
    private ArrayList<Medicamento> listaMedicamentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicamentos);

        recyclerViewMedicamentos = findViewById(R.id.recyclerViewMedicamentos);

        listaMedicamentos = (ArrayList<Medicamento>) getIntent().getSerializableExtra("listaMedicamentos");

        MedicamentoAdapter adapter = new MedicamentoAdapter(listaMedicamentos);
        recyclerViewMedicamentos.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewMedicamentos.setAdapter(adapter);
    }
}
