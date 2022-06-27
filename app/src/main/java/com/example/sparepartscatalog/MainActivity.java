package com.example.sparepartscatalog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText et_find;
    Button bt_Search;
    Button btView, btAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btView = findViewById(R.id.bt_view);
        btView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent find = new Intent(getBaseContext(), Products.class);
                startActivity(find);
            }
        });
        btAdd = (Button) findViewById(R.id.add);
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent form = new Intent(getBaseContext(), form.class);
                startActivity(form);
            }
        });
        findViewById(R.id.my).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent my = new Intent(getBaseContext(), myparts.class);
                startActivity(my);
            }
        });
        findViewById(R.id.bt_Search).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent search=new Intent(getBaseContext(), search.class);
                startActivity(search);
            }
        });
    }
}
