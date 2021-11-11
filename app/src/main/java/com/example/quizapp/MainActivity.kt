package com.example.quizapp

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.annotation.NonNull
import androidx.fragment.app.*
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.example.quizapp.ui.profile.ProfileFragment
import com.example.quizapp.ui.setting.SettingFragment
import com.example.quizapp.ui.test.TestsFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_simple.*
import kotlinx.android.synthetic.main.varianttemplate.*
import android.content.Intent








class MainActivity : AppCompatActivity()  {

    private lateinit var navView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getSupportActionBar()!!.setBackgroundDrawable(
            ColorDrawable(Color.parseColor("#0077D3")));

        val SQL = MysqlCon()
        SQL.init()
        val fragment1: Fragment = TestsFragment()
        val fragment2: Fragment = SettingFragment()
        val fragment3: Fragment = ProfileFragment()
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.navbar)


        if (intent.extras != null) {
            val bundle = intent.extras
            val variants = bundle!!.getStringArrayList("test1") as ArrayList<String>
            var getname = bundle!!.getString("name")
            bundle.putString("getname", getname)
            bundle.putStringArrayList("variants", variants)
            fragment1.setArguments(bundle)
        }

        val fragmentManager: FragmentManager = supportFragmentManager

        // define your fragments here
        // handle navigation selection
        bottomNavigationView.setOnItemSelectedListener { item ->
            lateinit var fragment: Fragment
            when (item.itemId) {
                R.id.test -> fragment = fragment1
                R.id.settings -> fragment = fragment2
                R.id.profile -> fragment = fragment3
            }
            fragmentManager.beginTransaction().replace(R.id.navhost, fragment).commit()
            true
        }

        // Set default selection
        bottomNavigationView.selectedItemId = R.id.test

    }



       /* navbar.setOnItemSelectedListener { item ->

        }*/


        }

        /* val getname = inte  nt.getStringExtra("name").toString()
         val argsss = Bundle()
         argsss.putString("name", getname)


        if (savedInstanceState == null) {
             supportFragmentManager.commit {
                 setReorderingAllowed(true)
                 add<HomeFragment>(R.id.fragmentContainerView)
             }
         }*/


        /*      val SQL = MysqlCon()
        SQL.init()
        val getname = intent.getStringExtra("name").toString()

        var getvariants = SQL.getvariants()


        GridLayoutManager(
            this, // context
            2, // span count
            RecyclerView.VERTICAL, // orientation
            false // reverse layout
        ).apply {
            // specify the layout manager for recycler view
            testlist.layoutManager = this}

        var adapter = Adapter(getvariants)
        testlist.adapter = adapter
        adapter.setOnItemClickListener(object : Adapter.onItemClickListener{
            override fun onItemClick(position: Int) {
                var getquestions = SQL.getquestions(getvariants[position])
                if(getquestions.size == 0){
                    Toast.makeText(this@MainActivity,"no Questions found",Toast.LENGTH_SHORT).show()
                }else{
                val intent = Intent(this@MainActivity,QuestionActivity::class.java)
                intent.putExtra("questions",getquestions)
                    intent.putExtra("name",getname)
                startActivity(intent)
                }
            }
        })
       //var getvariants = arrayListOf<String>("1","2")
      // val adapter :ArrayAdapter<String> = ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,getvariants)
        //test_variants.adapter = adapter

     //   val getselected = test_variants.selectedItem.toString()
       // if(getselected == null){
          //  Toast.makeText(this,"Пока у вас нет тестов",Toast.LENGTH_SHORT).show()
     //   }else{
         //   var questions = SQL.getquestions(getselected)
       /* btn_start.setOnClickListener {
var et_name = "name"
            if(et_name.toString().isEmpty()){
                Toast.makeText(this,"Введите никнейм",Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this,QuestionActivity::class.java)
                intent.putExtra(Constants.USER_NAME,et_name.toString())
                //intent.putExtra("spinner",getselected)
          //      intent.putExtra("questions",questions)
                startActivity(intent)
                finish()
    //        }
        }
        }*/

        }*/

