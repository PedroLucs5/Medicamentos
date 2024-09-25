package com.example.medicamento;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;

import com.example.medicamento.Medicamento;
import com.example.medicamento.MedicamentosActivity;
import com.example.medicamento.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNome, editTextDosagem, editTextHorario;
    private Spinner spinnerTipo;
    private ArrayList<Medicamento> listaMedicamentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNome = findViewById(R.id.editTextNome);
        spinnerTipo = findViewById(R.id.spinnerTipo);
        editTextDosagem = findViewById(R.id.editTextDosagem);
        editTextHorario = findViewById(R.id.editTextHorario);
        Button buttonAdicionar = findViewById(R.id.buttonAdicionar);

        listaMedicamentos = new ArrayList<>();

        buttonAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = editTextNome.getText().toString();
                String tipo = spinnerTipo.getSelectedItem().toString();
                String dosagem = editTextDosagem.getText().toString();
                String horario = editTextHorario.getText().toString();

                Medicamento medicamento = new Medicamento(nome, tipo, dosagem, horario);
                listaMedicamentos.add(medicamento);

                Intent intent = new Intent(MainActivity.this, MedicamentosActivity.class);
                intent.putExtra("listaMedicamentos", listaMedicamentos);
                startActivity(intent);
            }
        });
    }
}
