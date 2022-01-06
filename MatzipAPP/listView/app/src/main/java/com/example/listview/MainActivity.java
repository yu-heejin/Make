package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listview = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListViewAdapter adapter;

        // Adapter 생성
        adapter = new ListViewAdapter();

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.listview1);
        listview.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.dish),
                "오붕집", "직화낙지&보쌈 푸짐하고 맛있음");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.dish),
                "스시현", "포장할정도로 푸짐했던 스시현");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.dish),
                "애프터글로우", "월곡역 최고의 칵테일 맛집");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.dish),
                "백소정", "두툼한 돈가스에 소바가 맛있는 백소정");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.dish),
                "남매부대찌개", "월곡역 부대찌개 맛집");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.dish),
                "청년고기장수", "월곡역 무한리필 고기집");

        EditText editTextFilter = (EditText) findViewById(R.id.editTextFilter);
        editTextFilter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            public void afterTextChanged(Editable edit) {
                String filterText = edit.toString();
                if (filterText.length() > 0) {
                    listview.setFilterText(filterText) ;
                } else {
                    listview.clearTextFilter();
                }
            }
        });
    }
}