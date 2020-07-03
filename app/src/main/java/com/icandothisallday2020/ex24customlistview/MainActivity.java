package com.icandothisallday2020.ex24customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //대량의 데이터
    ArrayList<Member> members=new ArrayList<>();
    MyAdapter adapter;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //대량의 데이터추가
        members.add(new Member("전현무","Korea",R.drawable.flag_korea));
        members.add(new Member("기욤패트리","Canada",R.drawable.flag_canada));
        members.add(new Member("장위안","China",R.drawable.flag_china));
        members.add(new Member("샘오취리","Ghana",R.drawable.flag_ghana));
        members.add(new Member("타일러","USA",R.drawable.flag_usa));

        members.add(new Member("전현무","Korea",R.drawable.flag_korea));
        members.add(new Member("기욤패트리","Canada",R.drawable.flag_canada));
        members.add(new Member("장위안","China",R.drawable.flag_china));
        members.add(new Member("샘오취리","Ghana",R.drawable.flag_ghana));
        members.add(new Member("타일러","USA",R.drawable.flag_usa));

        //대량의 데이터->뷰로 만들어주는 객체
        LayoutInflater inflater=getLayoutInflater();
        adapter=new MyAdapter(members,inflater);//parameter: data, LayoutInflater
        listView=findViewById(R.id.listview);
        //Set Adapter on ListView
        listView.setAdapter(adapter);

        //리스트뷰의 아이템 클릭에 반응하는 리스너
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, members.get(position).name, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
