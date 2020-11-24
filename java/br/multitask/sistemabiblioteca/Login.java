package br.multitask.sistemabiblioteca;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Login extends MainActivity {

    Spinner sp = findViewById(R.id.comb);
    EditText cod = findViewById(R.id.cod);
    EditText password = findViewById(R.id.pwd);
    Button btnLogin = findViewById(R.id.btnLogin);

    final List<String> option = new ArrayList<String>();
    option.add("Bibliotecário(a)");
    option.add("Aluno(a)");

    ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, option);

    sp.

    sp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            if (option.get(position) == "Bibliotecário(a)"){
                Toast.makeText(this, "Bible", Toast.LENGTH_LONG);
            } else {
                if (option.get(position) == "Aluno(a)"){
                    Toast.makeText(this, "Anjo", Toast.LENGTH_LONG);
                }
            }
        }
    });
}
