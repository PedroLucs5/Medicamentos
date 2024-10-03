package com.example.medicamento;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.medicamento.Medicamento;
import com.example.medicamento.MedicamentosActivity;
import com.example.medicamento.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNome, editTextDosagem, editTextHorario;
    private Spinner spinnerTipo;
    private Button buttonAdicionar;
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
        getSupportActionBar().hide();

        listaMedicamentos = new ArrayList<>();

        AppDatabase instance = AppDatabase.getInstance(getApplicationContext());
        buttonAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = editTextNome.getText().toString();
                String tipo = spinnerTipo.getSelectedItem().toString();
                String dosagem = editTextDosagem.getText().toString();
                String horario = editTextHorario.getText().toString();

                if (!nome.equals("") && !tipo.equals("") && !dosagem.equals("") && !horario.equals("")){
                    Medicamento medicamento = new Medicamento(nome, tipo, dosagem, horario);
                    listaMedicamentos.add(medicamento);
                    instance.getMedicamentoDAO().inserir(medicamento);
                    editTextNome.setText("");
                    editTextDosagem.setText("");
                    editTextHorario.setText("");

                    Intent intent = new Intent(getApplicationContext(), MedicamentosActivity.class);
                    intent.putExtra("listaMedicamentos", listaMedicamentos);
                    startActivity(intent);
                }

            }
        });
    }
}
