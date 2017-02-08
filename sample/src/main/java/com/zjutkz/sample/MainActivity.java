package com.zjutkz.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.zjutkz.bottomdialog.BottomSheet;
import com.zjutkz.bottomdialog.listener.OnMenuItemClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show(View view){
        final BottomSheet bottomSheet = BottomSheet
                .Builder
                .newBuilder(this)
                .setItem(new BottomSheet.MenuItem("edit", R.drawable.menu_edit,"edit"))
                .setItem(new BottomSheet.MenuItem("del", R.drawable.menu_del,"del"))
                .setItem(new BottomSheet.MenuItem("activity", R.drawable.menu_activity,"activity"))
                .setItem(new BottomSheet.MenuItem("edit", R.drawable.menu_edit,"edit"))
                .setItem(new BottomSheet.MenuItem("del", R.drawable.menu_del,"del"))
                .setItem(new BottomSheet.MenuItem("activity", R.drawable.menu_activity,"activity"))
                .build();
        bottomSheet.setOnMenuItemClickListener(new OnMenuItemClickListener() {
            @Override
            public void onItemClick(BottomSheet.MenuItem item) {
                bottomSheet.dismiss();
                Toast.makeText(MainActivity.this,item.name,Toast.LENGTH_SHORT).show();
            }
        });
        bottomSheet.show();
    }
}
