package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //추가 메인 엑티비티 xml 아이디
        //봉사
     /*   ListView lv=findViewById(R.id.wow);
        stonelist flAdapter=new stonelist();

        lv.setAdapter(flAdapter);

        flAdapter.addstone(ContextCompat.getDrawable(this,R.drawable.green),"그린액션","맛있어");
        flAdapter.addstone(ContextCompat.getDrawable(this,R.drawable.dang),"당나귀","맛있어");
        flAdapter.addstone(ContextCompat.getDrawable(this,R.drawable.big),"큰언니회","맛있어");
        flAdapter.addstone(ContextCompat.getDrawable(this,R.drawable.blue),"푸른야학","맛있어");
        flAdapter.addstone(ContextCompat.getDrawable(this,R.drawable.animal),"애니멀 애니몰","맛있어");
        flAdapter.addstone(ContextCompat.getDrawable(this,R.drawable.dodo),"두드림","맛있어");

*/
    //다 각각 필요한 부분에 어뎁터 해줘야함

        //문예

/*
       ListView lv1=findViewById(R.id.wow);
        monlist flAdapter=new monlist();

        lv1.setAdapter(flAdapter);

        flAdapter.addmon(ContextCompat.getDrawable(this,R.drawable.movie),"영화영상동아리 전영","맛있어");
        flAdapter.addmon(ContextCompat.getDrawable(this,R.drawable.free),"Free$t.","맛있어");
        flAdapter.addmon(ContextCompat.getDrawable(this,R.drawable.ucdc),"UCDC","맛있어");
        flAdapter.addmon(ContextCompat.getDrawable(this,R.drawable.photo),"PHOTO-Y","맛있어");
        flAdapter.addmon(ContextCompat.getDrawable(this,R.drawable.pan),"PAN’s PM","맛있어");
        flAdapter.addmon(ContextCompat.getDrawable(this,R.drawable.hamonic),"하모닉스","맛있어");
        flAdapter.addmon(ContextCompat.getDrawable(this,R.drawable.pong),"조선대학교 풍물패","맛있어");
        flAdapter.addmon(ContextCompat.getDrawable(this,R.drawable.mok),"묵연회","맛있어");
        flAdapter.addmon(ContextCompat.getDrawable(this,R.drawable.gwan),"조대관현악반","맛있어");
        flAdapter.addmon(ContextCompat.getDrawable(this,R.drawable.sosbak),"소박한기쁨","맛있어");
        flAdapter.addmon(ContextCompat.getDrawable(this,R.drawable.muze),"뮤즈","맛있어");
        flAdapter.addmon(ContextCompat.getDrawable(this,R.drawable.band),"CARAVAN(캐라반)","맛있어");
        flAdapter.addmon(ContextCompat.getDrawable(this,R.drawable.nala),"나라얀","맛있어");
        flAdapter.addmon(ContextCompat.getDrawable(this,R.drawable.drama),"조대극회","맛있어");
        flAdapter.addmon(ContextCompat.getDrawable(this,R.drawable.sori),"소리터 관현악단","맛있어");
        flAdapter.addmon(ContextCompat.getDrawable(this,R.drawable.paint),"그림촌","맛있어");
        flAdapter.addmon(ContextCompat.getDrawable(this,R.drawable.emm),"음률","맛있어");
        flAdapter.addmon(ContextCompat.getDrawable(this,R.drawable.magic),"일루젼","맛있어");
        flAdapter.addmon(ContextCompat.getDrawable(this,R.drawable.shock),"Shock driveR","맛있어");
        flAdapter.addmon(ContextCompat.getDrawable(this,R.drawable.silver),"은가비","맛있어");
*/

        //수련분과
        /*
        ListView lv2=findViewById(R.id.wow);
        sulist flAdapter=new sulist();

        lv2.setAdapter(flAdapter);

        flAdapter.addsu(ContextCompat.getDrawable(this,R.drawable.ultimite),"얼쑤얼티밋","맛있어");
        flAdapter.addsu(ContextCompat.getDrawable(this,R.drawable.custa),"CUSTA","맛있어");
        flAdapter.addsu(ContextCompat.getDrawable(this,R.drawable.extreme),"익스트림","맛있어");
        flAdapter.addsu(ContextCompat.getDrawable(this,R.drawable.tae),"태백회","맛있어");
        flAdapter.addsu(ContextCompat.getDrawable(this,R.drawable.jujitsu),"테이크다운","맛있어");
        flAdapter.addsu(ContextCompat.getDrawable(this,R.drawable.cycle),"바이커스","맛있어");
        flAdapter.addsu(ContextCompat.getDrawable(this,R.drawable.bolling),"굴리세","맛있어");
        flAdapter.addsu(ContextCompat.getDrawable(this,R.drawable.baseball),"풀카운트","맛있어");
        flAdapter.addsu(ContextCompat.getDrawable(this,R.drawable.pingpong),"꽃보다 핑퐁","맛있어");
        flAdapter.addsu(ContextCompat.getDrawable(this,R.drawable.basketball),"클러치","맛있어");
        flAdapter.addsu(ContextCompat.getDrawable(this,R.drawable.glof),"나이스샷","맛있어");


         */



        //종교
/*
        ListView lv3=findViewById(R.id.wow);
        rellist flAdapter=new rellist();

        lv3.setAdapter(flAdapter);

        flAdapter.addrel(ContextCompat.getDrawable(this,R.drawable.one),"원불교 학생회","맛있어");
        flAdapter.addrel(ContextCompat.getDrawable(this,R.drawable.ccc),"CCC","맛있어");
        flAdapter.addrel(ContextCompat.getDrawable(this,R.drawable.dfc),"DFC","맛있어");
        flAdapter.addrel(ContextCompat.getDrawable(this,R.drawable.jdm),"JDM","맛있어");
        flAdapter.addrel(ContextCompat.getDrawable(this,R.drawable.sce),"SCE","맛있어");
        flAdapter.addrel(ContextCompat.getDrawable(this,R.drawable.ivf),"IVF","맛있어");
        flAdapter.addrel(ContextCompat.getDrawable(this,R.drawable.dsm),"DSM","맛있어");
        flAdapter.addrel(ContextCompat.getDrawable(this,R.drawable.sfc),"SFC","맛있어");
        flAdapter.addrel(ContextCompat.getDrawable(this,R.drawable.esf),"ESF","맛있어");
        flAdapter.addrel(ContextCompat.getDrawable(this,R.drawable.ubf),"UBF","맛있어");
        flAdapter.addrel(ContextCompat.getDrawable(this,R.drawable.navi),"네비게이토 선교회","맛있어");
        flAdapter.addrel(ContextCompat.getDrawable(this,R.drawable.gatol),"가톨릭 학생회","맛있어");
        flAdapter.addrel(ContextCompat.getDrawable(this,R.drawable.inter),"인터콥 학생회","맛있어");
        flAdapter.addrel(ContextCompat.getDrawable(this,R.drawable.christ),"예수전도단","맛있어");


 */

        ListView lv4=findViewById(R.id.wow);
        studylist flAdapter=new studylist();

        lv4.setAdapter(flAdapter);

        flAdapter.addstudy(ContextCompat.getDrawable(this,R.drawable.isa),"I.S.A.","맛있어");
        flAdapter.addstudy(ContextCompat.getDrawable(this,R.drawable.hong),"흥사단 아카데미","맛있어");
        flAdapter.addstudy(ContextCompat.getDrawable(this,R.drawable.option),"Option","맛있어");
        flAdapter.addstudy(ContextCompat.getDrawable(this,R.drawable.sky),"하늘사랑","맛있어");
        flAdapter.addstudy(ContextCompat.getDrawable(this,R.drawable.abc),"ABC마케팅","맛있어");
        flAdapter.addstudy(ContextCompat.getDrawable(this,R.drawable.ptc),"P.T.C","맛있어");
        flAdapter.addstudy(ContextCompat.getDrawable(this,R.drawable.hp),"H.P","맛있어");
        flAdapter.addstudy(ContextCompat.getDrawable(this,R.drawable.gmp),"백악GMP","맛있어");
        flAdapter.addstudy(ContextCompat.getDrawable(this,R.drawable.chinese),"청람","맛있어");
        flAdapter.addstudy(ContextCompat.getDrawable(this,R.drawable.car),"대자연","맛있어");


    }
}