package com.example.nanchen.croutondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.nanchen.croutondemo.crouton.Crouton;
import com.example.nanchen.croutondemo.crouton.Style;

public class MainActivity extends AppCompatActivity {

    private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = (LinearLayout) findViewById(R.id.main_ll);
    }

    public void topBtnClick(View view) {
        Crouton.makeText(this,"显示顶部对话框", Style.ALERT).show();
    }

    public void otherBtnClick(View view) {
        Crouton.makeText(this,"显示顶部对话框", Style.ALERT,layout).show();
    }
}
