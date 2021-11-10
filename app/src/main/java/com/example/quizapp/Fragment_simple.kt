package com.example.quizapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.*
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.SurfaceControl.Transaction
import kotlinx.android.synthetic.main.fragment_simple.*
import android.widget.AdapterView.OnItemClickListener
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.content.Intent.getIntent
import android.widget.*
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Fragment_simple.newInstance] factory method to
 * create an instance of this fragment.
 *//*
class Fragment_simple : Fragment() {
    // TODO: Rename and change types of parameters
    private var mFlParent : FrameLayout? = null
    private var mcontext : Context? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val v =  inflater.inflate(R.layout.fragment_simple, container, false)
        val rec = v.findViewById<RecyclerView>(R.id.testlist)
        val SQL = MysqlCon()
        var getname = requireArguments().getString("name")
        SQL.init()
        var variants = SQL.getvariants()
        println(mcontext)
        GridLayoutManager(
            activity, // context
            2, // span count
            RecyclerView.VERTICAL, // orientation
            false // reverse layout
        ).apply {
            // specify the layout manager for recycler view
            rec.layoutManager = this}
        var adapter = Adapter(SQL.getvariants())
        rec.adapter = adapter
        adapter.setOnItemClickListener(object : Adapter.onItemClickListener{
            override fun onItemClick(position: Int) {
                var getquestions = SQL.getquestions(variants[position])
                if(getquestions.size == 0){
                    Toast.makeText(getActivity(),"no Questions found",Toast.LENGTH_SHORT).show()
                }else{
                    val intent = Intent(activity,QuestionActivity::class.java)
                    intent.putExtra("questions",getquestions)
                    intent.putExtra("name",getname)
                    startActivity(intent)
                }
            }
        })
        return v

    }

}

    */