package com.ethanco.jetpacktest

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.ethanco.jetpacktest.introduction.StartActivity
import com.ethanco.jetpacktest.library.utils.PreferencesUtil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //初始化
        PreferencesUtil.init(this)

        btn_write_sp.setOnClickListener {
            var msg by PreferencesUtil<String>("test","")
            msg = "hello"
            Toast.makeText(LoginActivity@this,"写入成功", Toast.LENGTH_SHORT).show()
        }

        btn_get_sp.setOnClickListener {
            val msg by PreferencesUtil<String>("test","")
            Toast.makeText(LoginActivity@this,msg, Toast.LENGTH_SHORT).show()
        }

        btn_introduction.setOnClickListener {
            val intent = Intent(MainActivity@this,StartActivity::class.java)
            startActivity(intent)
        }
    }
}
