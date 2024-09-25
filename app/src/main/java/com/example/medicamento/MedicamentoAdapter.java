package com.example.medicamento;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.medicamento.Medicamento;

import java.util.List;

public class MedicamentoAdapter extends RecyclerView.Adapter<MedicamentoAdapter.MedicamentoViewHolder> {
    private List<Medicamento> listaMedicamentos;

    public MedicamentoAdapter(List<Medicamento> listaMedicamentos) {
        this.listaMedicamentos = listaMedicamentos;
    }

    @NonNull
    @Override
    public MedicamentoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_medicamentos, parent, false);
        return new MedicamentoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MedicamentoViewHolder holder, int position) {
        Medicamento medicamento = listaMedicamentos.get(position);
        holder.textViewNome.setText(medicamento.getNome());
        holder.textViewTipo.setText(medicamento.getTipo());
        holder.textViewDosagem.setText(medicamento.getDosagem());
        holder.textViewHorario.setText(medicamento.getHorario());
    }

    @Override
    public int getItemCount() {
        return listaMedicamentos.size();
    }

    public static class MedicamentoViewHolder extends RecyclerView.ViewHolder {
        TextView textViewNome, textViewTipo, textViewDosagem, textViewHorario;

        public MedicamentoViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewNome = itemView.findViewById(R.id.textViewNome);
            textViewTipo = itemView.findViewById(R.id.textViewTipo);
            textViewDosagem = itemView.findViewById(R.id.textViewDosagem);
            textViewHorario = itemView.findViewById(R.id.textViewHorario);
        }
    }
}
