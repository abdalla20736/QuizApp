package com.example.quizapp.ui.test

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.Adapter
import com.example.quizapp.MysqlCon
import com.example.quizapp.QuestionActivity
import com.example.quizapp.R

import com.example.quizapp.databinding.FragmentTestsBinding

class TestsFragment : Fragment() {


private var _binding: FragmentTestsBinding? = null
  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    // Inflate the layout for this fragment
    val v =  inflater.inflate(R.layout.fragment_tests, container, false)
    val rec = v.findViewById<RecyclerView>(R.id.testlist)
    val SQL = MysqlCon()
    var getname  = getArguments()?.getString("getname");
    var variants = getArguments()?.getStringArrayList("variants") as? ArrayList<String>

    SQL.init()
    if(variants != null){

    val getactivity = getActivity()
    GridLayoutManager(
      getactivity, // context
      2, // span count
      RecyclerView.VERTICAL, // orientation
      false // reverse layout
    ).apply {
      // specify the layout manager for recycler view
      rec.layoutManager = this}
    var adapter = Adapter(variants!!)
    rec.adapter = adapter
    adapter.setOnItemClickListener(object : Adapter.onItemClickListener{
      override fun onItemClick(position: Int) {
        var getquestions = SQL.getquestions(variants!![position])
        if(getquestions.size == 0){
          Toast.makeText(getactivity,"no Questions found", LENGTH_SHORT).show()
        }else{
          val intent = Intent(activity, QuestionActivity::class.java)
          intent.putExtra("questions",getquestions)
          intent.putExtra("name",getname)
          startActivity(intent)
        }
      }
    })
    }else{
      Toast.makeText(activity,"Can't retrieve data",LENGTH_SHORT)
    }
    return v

  }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}