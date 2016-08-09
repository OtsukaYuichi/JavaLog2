package jp.techacademy.yuichi.otsuka.javalog2;

/**
 * Created by OtsukaYuichi on 2016/08/09.
 */

import android.util.Log;

class Human extends Animal implements Thinkable {

    String hobby;

    //コンストラクタ
    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }


    public void say() {
        Log.d("javatestsay", "「私の名前は" + this.name + "です。年は" + this.age + "歳です。」");
    }

    @Override
    public void think() {
        Log.d("javatestthink", "「私は" + this.hobby + "について考える」");
    }
}