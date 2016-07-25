package com.example.sam.ch05_ex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class ch05_ex01 extends AppCompatActivity {
    private CheckBox chAnd,chC,chJ;
    private TextView textshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch05_ex01);

        chAnd=(CheckBox)findViewById(R.id.checkBox);
        chC=(CheckBox)findViewById(R.id.checkBox2);
        chJ=(CheckBox)findViewById(R.id.checkBox3);
        textshow=(TextView)findViewById(R.id.textView);

        chAnd.setOnCheckedChangeListener(checkListener);
        chC.setOnCheckedChangeListener(checkListener);
        chJ.setOnCheckedChangeListener(checkListener);

    }

    private CheckBox.OnCheckedChangeListener checkListener=new CheckBox.OnCheckedChangeListener(){
        @Override
        public void onCheckedChanged(CompoundButton buttonView,boolean isCheck){
            String st="最喜歡的程式語言有:";
            int n=0;
            if(chAnd.isChecked()){
                st=st+" Android";
                n++;
            }
            if(chC.isChecked()){
                st=st+" C++";
                n++;
            }
            if(chJ.isChecked()){
                st=st+" Java";
                n++;
            }
            textshow.setText(st+" 共 "+n+" 種");
        }
    };
}
