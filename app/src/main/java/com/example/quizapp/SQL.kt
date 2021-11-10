package com.example.quizapp

import android.os.StrictMode
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


 class MysqlCon  {
    private  var  con: Connection? = null

    fun init() {
        try {
            val str =  "jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11449163";
            Class.forName("com.mysql.jdbc.Driver")
            val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
            StrictMode.setThreadPolicy(policy)
             con = DriverManager.getConnection(
                str, "sql11449163", "1ANq8zHZHY")
            println("all right,connected")

        } catch (e: Exception) {
            println(e)
        }
    }
      fun login(username :String,password:String) :String{
         val stmt:Statement = con!!.createStatement()
         val rs : ResultSet = stmt.executeQuery("SELECT * FROM Users Where username = '$username' and `password` = '$password'")
          var data =""

          if(rs.next() == false){
              return  data
          }else{
              println(rs.getInt(1).toString() + " " + rs.getString(2)+ " " + rs.getString(3)+ " " + rs.getString(4))
              data = rs.getString(2)
              return data

          }

     }
    fun getquestions(variantname : String) : ArrayList<Questions>{

        val stmt: Statement = con!!.createStatement()
        val rs: ResultSet = stmt.executeQuery("select * from Questions where variant_id in (select id from Variants where names = '$variantname')")
        val questionsList = ArrayList<Questions>()
        while (rs.next()){
            val imgurl = rs.getString(3)
            var question = Questions(rs.getInt(1),rs.getString(2),imgurl,rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getInt(8))
            questionsList.add(question)

            println(rs.getInt(1).toString() +" " +rs.getString(2)    + "  " + rs.getString(4)+ " "+ rs.getString(5) + " " + rs.getString(6) + " " +rs.getString(7) + " " +rs.getInt(8))
        }
        return questionsList
    }
    fun getvariants(username: String) :ArrayList<String>{
        val stmt: Statement = con!!.createStatement()
        val rs: ResultSet = stmt.executeQuery("select names from Variants inner join User_variants on Variants.id = User_variants.variant_id where user_id = (Select id FROM Users Where username = '$username')")
        val variantsList = ArrayList<String>()
        while (rs.next()){
            var variant = rs.getString(1)
            variantsList.add(variant)
            println(variant)
        }
        return variantsList
        con!!.close()

    }


}