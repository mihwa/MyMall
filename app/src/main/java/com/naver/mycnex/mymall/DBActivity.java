package com.naver.mycnex.mymall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class DBActivity extends AppCompatActivity {
    ArrayList<Integer> items = new ArrayList<>();
    DBManager dbManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_up1 = findViewById(R.id.btn_up1);
        btn_up2 = findViewById(R.id.btn_up2);
        btn_down = findViewById(R.id.btn_down);
        btn_up3 = findViewById(R.id.btn_up3);

        dbManager =new DBManager(DBActivity.this,"sub.db",null,1);

        //items = dbManager.getDataList();
    }
}
