package jp.techacademy.yuichi.otsuka.javalog2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human0 = new Human("あおきかずや", 25, "サイクリング");
        human0.say();
        human0.think();

        Human human1 = new Human("さいとうさだお", 55, "温泉巡り");
        human1.say();
        human1.think();

        Human human2 = new Human("ふじもとよしえ", 31, "野生のリスの写真を撮ること");
        human2.say();
        human2.think();

        Human human3 = new Human("かわいえり", 11, "みんなとダンスすること");
        human3.say();
        human3.think();
    }
}
