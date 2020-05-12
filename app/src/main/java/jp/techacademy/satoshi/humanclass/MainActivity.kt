package jp.techacademy.satoshi.humanclass

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    //大田黒さん
    var Im = Human("大田黒",30, "プログラミング")
    Im.say()
    Im.think()

    //小田黒さん
    var OldMe = Human("小田黒", 20,"将来")
    OldMe.say()
    OldMe.think()
    }
}
