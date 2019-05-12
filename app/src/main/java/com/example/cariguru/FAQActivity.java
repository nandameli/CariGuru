package com.example.cariguru;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class FAQActivity extends AppCompatActivity {

    public RecyclerView recyclerView;

    public ArrayList<FAQData> arrayList;

    public FirebaseRecyclerOptions<FAQData> options;
    public FirebaseRecyclerAdapter<FAQData,FAQViewHolder> adapter;

    public DatabaseReference databaseReference;

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrayList = new ArrayList<FAQData>();
        databaseReference = FirebaseDatabase.getInstance().getReference().child("FAQ");
        databaseReference.keepSynced(true);

        options = new FirebaseRecyclerOptions.Builder<FAQData>().setQuery(databaseReference,FAQData.class).build();

        adapter = new FirebaseRecyclerAdapter<FAQData, FAQViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull FAQViewHolder holder, int position, @NonNull final FAQData model) {

                holder.question.setText(model.getQuestion());
                holder.answer.setText(model.getAnswer());
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
            }

            @NonNull
            @Override
            public FAQViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
                return new FAQViewHolder(LayoutInflater.from(FAQActivity.this).inflate(R.layout.list_faq,viewGroup,false));
            }
        };

        recyclerView.setAdapter(adapter);



    }
}
