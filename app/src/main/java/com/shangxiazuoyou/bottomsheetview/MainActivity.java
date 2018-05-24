package com.shangxiazuoyou.bottomsheetview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import shangxiazuoyou.library.sheetview.ActionSheetDialog;
import shangxiazuoyou.library.sheetview.OnItemClickListener;

public class MainActivity extends AppCompatActivity {

    private TextView tvTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTest = findViewById(R.id.tv_test);
    }

    public void select(View view) {
        final String[] stringItems = {"男", "女"};
        final ActionSheetDialog dialog = new ActionSheetDialog(this, stringItems, null);
        dialog.title("请选择性别")
                .titleTextSize_SP(14.5f)
                .layoutAnimation(null)
                .show();

        dialog.setOnOperItemClickL(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                tvTest.setText(stringItems[position]);
                dialog.dismiss();
            }
        });
    }
}
