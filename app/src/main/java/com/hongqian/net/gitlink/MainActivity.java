package com.hongqian.net.gitlink;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("feature/mycoin","第一次修改");
        Log.e("feature/mycoin","第二次修改");
        Log.e("issue/issue1","第一次修改");
    }
}
