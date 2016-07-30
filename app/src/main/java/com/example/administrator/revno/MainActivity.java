package com.example.administrator.revno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 EditText e1,e2;
    Button b;
    int n,rev=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        showp();
    }

    public void showp()
    {
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        b=(Button)findViewById(R.id.button);;
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n=Integer.parseInt(String.valueOf(e1.getText()));
                if(e1.getText().length()==0)
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                while(n!=0)
                {
                    rev=rev*10;
                    rev=rev+n%10;
                    n=n/10;
                }
                e2.setText(Integer.toString(rev));
            }
        });
    }
}
