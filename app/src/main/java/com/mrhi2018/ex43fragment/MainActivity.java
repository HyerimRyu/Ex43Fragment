package com.mrhi2018.ex43fragment;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    MyFragment fragment;//프레그먼트 참조변수

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv= findViewById(R.id.tv);

        //프레그먼트 참조하기
        //프레그먼트를 담당하는 매니저객체를 통해 제어해야만 함.
        FragmentManager manager= getSupportFragmentManager();
        fragment= (MyFragment)manager.findFragmentById(R.id.frag);
    }

    public void clickBtn(View view) {
        //Fragment안에 있는 TextView의 글씨변경!
        fragment.tv.setText("askdlfjlaskdjfl");
    }

    //프레그먼트의 버튼에 있는 onClick속성을 대신 처리해줄 수있음.
    //권장하지 못함..why?? 프레그먼트안에 다른 뷰들을 참조하는
    //참조변수 없기 때문에 이곳에서 처리하는 것은 부적합함.
    //이 방법은 권장하지 않음!!!
//    public void clickBtn2(View view) {
//    }
}





