package com.example.scrollingtext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private boolean edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit = false;
    }

    public void comment(View view){
        EditText et = (EditText) findViewById(R.id.editText);
        Button b = (Button) view;

        if (edit == false){
            b.setText("Stop adding comments");
            et.setText(et.getText()+ "\n\n*");
            et.setSelection(et.length());
            et.setEnabled(true);
            et.requestFocus();
        }else{
            et.clearFocus();
            b.setText("Add comment");
            et.setEnabled(false);
        }
        edit ^= true;
    }
}
