package com.example.pheptinh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListPhepTinh extends AppCompatActivity {
    ListView lvPhepTinh;
    Button bntThem;
    EditText edtMonHoc;
    Button bntCapNhap;
    ArrayList<String> arrayCourse;
    int vitri=-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_phep_tinh);
        lvPhepTinh = (ListView) findViewById(R.id.listviewPhepTinh);
        arrayCourse = new ArrayList<>();
        arrayCourse.add("Phép Cộng");
        arrayCourse.add("Phép Trừ");
        arrayCourse.add("Phép Nhân  ");
        arrayCourse.add("Phép Chia");
        arrayCourse.add("Logrit");
        ArrayAdapter adapter = new ArrayAdapter(ListPhepTinh.this, android.R.layout.simple_list_item_1, arrayCourse);
        lvPhepTinh.setAdapter(adapter);
        lvPhepTinh.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent myItent = new Intent(ListPhepTinh.this, HieuLayout.class);
                    startActivity(myItent);
                }else if (i==1){
                    Toast.makeText(ListPhepTinh.this, "Phép Cộng ", Toast.LENGTH_SHORT).show();

                }else if (i==2){
                    Toast.makeText(ListPhepTinh.this, "Phép Trừ",Toast.LENGTH_SHORT).show();

                }else if(i==3){
                    Toast.makeText(ListPhepTinh.this, "Phép Nhân",Toast.LENGTH_SHORT).show();

                }else if(i==4){
                    Toast.makeText(ListPhepTinh.this, "Phép Chia",Toast.LENGTH_SHORT).show();

                }else
                    Toast.makeText(ListPhepTinh.this, "Logarit",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(ListPhepTinh.this, HieuLayout.class);
                startActivity(intent);
            }
        });
    }
}