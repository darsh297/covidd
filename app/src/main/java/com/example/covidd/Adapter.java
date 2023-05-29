package com.example.covidd;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
public class Adapter extends ArrayAdapter<Model> {
    private Context context;
    private final List<Model> modelList;

    public Adapter(Context context, List<Model> modelList) {
        super(context, R.layout.testing, modelList);

        this.context = context;
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.testing, null,true);

        // In this step we connect the XML with Java File
        TextView state = view.findViewById(R.id.state);
        TextView active = view.findViewById(R.id.active);
        TextView cured = view.findViewById(R.id.cured);
        TextView death = view.findViewById(R.id.death);
        TextView total = view.findViewById(R.id.total);
        TextView incactive = view.findViewById(R.id.incactive);
        TextView incurred = view.findViewById(R.id.incurred);
        TextView incdeath = view.findViewById(R.id.incdeath);

        // Adding Data to modellist
        state.setText(modelList.get(position).getName());
        active.setText(modelList.get(position).getActive());
        cured.setText(modelList.get(position).getCured());
        death.setText(modelList.get(position).getDeath());
        total.setText(modelList.get(position).getTotal());
        incactive.setText(modelList.get(position).getIncAct());
        incurred.setText(modelList.get(position).getIncRec());
        incdeath.setText(modelList.get(position).getIncDec());

        return view;
    }
}