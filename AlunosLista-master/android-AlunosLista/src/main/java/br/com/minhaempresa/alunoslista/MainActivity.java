package br.com.minhaempresa.alunoslista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, View.OnClickListener{
    List<String> lista = new ArrayList<String>();
    ListView listView;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista .add("joao");
        lista .add("maria");

        Button botao = findViewById(R.id.adicionarButton);
        botao.setOnClickListener(this);

        listView = (ListView) findViewById(R.id.alunosListView);
        adapter = new ArrayAdapter<String>(
        this, android.R.layout.simple_list_item_1,lista);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onClick(View v) {
        EditText text = findViewById(R.id.EditText);
        String name = text .getText().toString();

        lista .add(name);
        adapter.notifyDataSetChanged();

    }
}
