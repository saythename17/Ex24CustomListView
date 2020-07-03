package com.icandothisallday2020.ex24customlistview;

public class Member {
    String name; //"전현무"
    String nation; //"대한민국"
    int id; //R.drawable.flag_korea(이미지 주소)

    //constructor -생성(new)할때 자동실행 메소드
    public Member(String name, String nation,int id){
        this.name=name;//(멤버변수에 값대입)
        this.nation=nation;
        this.id=id;
    }
}
