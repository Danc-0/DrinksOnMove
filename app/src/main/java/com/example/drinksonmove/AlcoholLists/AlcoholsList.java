package com.example.drinksonmove.AlcoholLists;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.example.drinksonmove.R;
import com.firebase.ui.database.FirebaseListAdapter;
import com.firebase.ui.database.FirebaseListOptions;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class AlcoholsList extends AppCompatActivity {

    ListView lv;
    FirebaseListAdapter adapter;
    Query query = FirebaseDatabase.getInstance().getReference().child("Alcohol List");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alcohols_list);

        lv = findViewById(R.id.alcoholList);
        FirebaseListOptions<Alcohols> options = new FirebaseListOptions.Builder<Alcohols>()
                .setLayout(R.layout.alcohols)
                .setQuery(query, Alcohols.class)
                .build();

        adapter = new FirebaseListAdapter(options) {
            @Override
            protected void populateView(@NonNull View v, @NonNull Object model, int position) {
                TextView Type = v.findViewById(R.id.Type);
                TextView Brand = v.findViewById(R.id.Brand);
                TextView Origin = v.findViewById(R.id.Origin);
                TextView Quantity = v.findViewById(R.id.Quantity);

                Alcohols alcohols = (Alcohols) model;
                Type.setText(alcohols.getType());
                Brand.setText(alcohols.getBrand());
                Origin.setText(alcohols.getOrigin());
                Quantity.setText(alcohols.getQuantity());

            }
        };
    }
}
