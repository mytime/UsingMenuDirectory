package com.hello.usingmenudirectory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //使用菜单 getMenuInflater()
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.my_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    //菜单2点击事件
    public void item2Click(MenuItem item) {

        Toast.makeText(MainActivity.this, "菜单2", Toast.LENGTH_SHORT).show();
    }

    //菜单1点击事件
    public void item1Click(MenuItem item) {
        Toast.makeText(MainActivity.this, "菜单1", Toast.LENGTH_SHORT).show();
    }

    //菜单3点击事件
    public void item3Click(MenuItem item) {
        Toast.makeText(MainActivity.this, "菜单3", Toast.LENGTH_SHORT).show();

    }
}
