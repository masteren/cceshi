package com.masteren;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class AddressActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        Intent intent = getIntent();//获取Intent对象
        Bundle bundle = intent.getExtras();//获取传递的Bundle信息

        String a3=bundle.getString("a2");
        String b3=bundle.getString("b2");
        String c3=bundle.getString("c2");
        String d3=bundle.getString("d2");
        TextView tv_a=(TextView)findViewById(R.id.a11);
        TextView tv_b=(TextView)findViewById(R.id.b11);
        TextView tv_c=(TextView)findViewById(R.id.c11);
        TextView tv_d=(TextView) findViewById(R.id.d11);
        tv_a.setText(a3);
        tv_b.setText(b3);
        tv_c.setText(c3);
        tv_d.setText(d3);

    }
}
