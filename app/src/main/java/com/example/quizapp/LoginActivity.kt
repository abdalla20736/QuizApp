package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import android.widget.Toast.makeText
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val SQL = MysqlCon()
        SQL.init()

        btn_login.setOnClickListener {
            if(et_username.text.isEmpty() || et_password.text.isEmpty()){
                makeText(this,"Введите Логин и Пароль",LENGTH_SHORT).show()
            }else {
                println(et_username.text.toString() + " " + et_password.text.toString())
                var login =  SQL.login(et_username.text.toString(), et_password.text.toString())

                if(login == "") {
                    makeText(this,"Логин или Пароль неправильный ",LENGTH_SHORT).show()
                }else{


                    val variants = SQL.getvariants(et_username.text.toString())
                    println(variants.toString())
                    val bundle = Bundle()
                    bundle.putStringArrayList("test1",variants)
                    bundle.putString("name",login)
                    val intent = Intent(this, MainActivity::class.java)
                    intent.putExtras(bundle)
                    startActivity(intent)
                }
            }
        }
    }
}