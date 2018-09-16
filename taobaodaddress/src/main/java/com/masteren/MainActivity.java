package com.masteren;

import android.content.Intent;
import android.location.Address;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn =(Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View .OnClickListener() {
            @Override
            public void onClick(View v) {
                String a1=((EditText)findViewById(R.id.et_a1)).getText().toString();
                String b1=((EditText)findViewById(R.id.et_b1)).getText().toString();
                String c1=((EditText)findViewById(R.id.et_c1)).getText().toString();
                String d1=((EditText)findViewById(R.id.et_d1)).getText().toString();
                if(!"".equals(a1)&&!"".equals(b1)&&!"".equals(c1)&&!"".equals(d1)){
                    Intent intent =new Intent(MainActivity.this, AddressActivity.class);
                    Bundle bundle =new Bundle();
                    bundle.putCharSequence("a2",a1);
                    bundle.putCharSequence("b2",b1);
                    bundle.putCharSequence("c2",c1);
                    bundle.putCharSequence("d2",d1);
                    intent.putExtras(bundle);
                    startActivity(intent);

                }
                else{
                    Toast.makeText(MainActivity.this, "输入完整请", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


}
