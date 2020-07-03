package com.icandothisallday2020.ex24customlistview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    ArrayList<Member> members;
    LayoutInflater inflater;
    //constructor : 데이터를 전달받기 위함
    public MyAdapter(ArrayList<Member> members,LayoutInflater inflater){
        this.members=members;
        this.inflater=inflater;
    }
    @Override
    public int getCount() {
        return members.size();//adapter 가 만들 아이템의 총 개수
    }
    @Override
    public Object getItem(int position) {//식별자
        return members.get(position);//해당 position 의 데이터 리턴-거의 프로그래머가 명시X
    }
    @Override
    public long getItemId(int position) {//식별자22
        return position;//포지션에 해당하는 id를 지정하거나 position 과 같은 값 리턴
    }
    @Override //뷰를 만들어 adapterView 에게 리턴하는 method
    public View getView(int position, View convertView, ViewGroup parent) {
        //1. new View(create View)
        //재활용할 뷰가 있는지 여부(효율적메모리 사용) -convertView!=null : 재활용
        if(convertView==null) {
            convertView=inflater.inflate(R.layout.listview_item,null);
        }
        //res/layout/listview_item.xm 문서를 View 객체로 만드는 Inflater 소환
        //View itemView=inflater.inflate(R.layout.listview_item,null);
        //null : 뷰를 만들어 뷰그룹에 붙이지 않음 차피 AdapterView 가 붙임
        //2. Binding(연결-뷰 안에 값 설정)
        //만들어진 뷰 안에 있는 View 를 참조
        ImageView iv=convertView.findViewById(R.id.iv);
        TextView tvName=convertView.findViewById(R.id.tv_name);
        TextView tvNation=convertView.findViewById(R.id.tv_nation);
        Member member=members.get(position);
        tvName.setText(member.name);  tvNation.setText(member.nation); iv.setImageResource(member.id);
        return convertView;//convertView 가 있으면 있는 곳 사용, 없으면 만듬
    }
}
















