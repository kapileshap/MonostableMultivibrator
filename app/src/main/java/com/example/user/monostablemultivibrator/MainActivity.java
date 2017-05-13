package com.example.user.monostablemultivibrator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText Vcc,Ic,F,Vbb;
    TextView R0,Rc,C,C1,R1,R2;
    Button generate;



    double vol,cur,f,r0,ca,rc,b,vbb,r1,r2,c1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.user.monostablemultivibrator.R.layout.activity_main);
        Vcc=(EditText)findViewById(com.example.user.monostablemultivibrator.R.id.editText2);
        Ic=(EditText)findViewById(com.example.user.monostablemultivibrator.R.id.editText3);
        F=(EditText)findViewById(com.example.user.monostablemultivibrator.R.id.editText4);
        Vbb=(EditText)findViewById(com.example.user.monostablemultivibrator.R.id.editText5);
        R0=(TextView)findViewById(R.id.editR);
        Rc=(TextView)findViewById(R.id.editRc);
        C=(TextView)findViewById(R.id.editC);
        C1=(TextView)findViewById(R.id.editC1);
        R1=(TextView)findViewById(R.id.editR1);
        R2=(TextView)findViewById(R.id.editR2);
        generate=(Button)findViewById(R.id.buttonPanel);
        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vol= Double.parseDouble(Vcc.getText().toString());
                cur=Double.parseDouble(Ic.getText().toString());
                f=Double.parseDouble(F.getText().toString());
                vbb=Double.parseDouble(Vbb.getText().toString());
                rc=(vol-0.2)/(cur*0.001);
                b=(cur*0.001)/200;
                r0=(vol-0.7)/b;
                ca=1/(0.69*r0*f);
                r1=10000;
                c1=25*10^-12;
                r2=(vbb*r1)/0.2;
                Rc.setText(Double.toString(rc));
                R0.setText(Double.toString(r0));
                C.setText(Double.toString(ca));
                C1.setText(Double.toString(c1));
                R1.setText(Double.toString(r1));
                R2.setText(Double.toString(r2));



            }
        });
    }


}
