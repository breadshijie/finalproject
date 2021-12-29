package com.example.finalproject

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class FourthFragment : Fragment(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        Log.e("FourthFragment","onCreate")
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View?{
        Log.e("FourthFragment","onCreate")
        return inflater.inflate(R.layout.fourth_fragment, container ,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?){
        super.onActivityCreated(savedInstanceState)
        Log.e("FourthFragment","onActivityCreated")

        val btn_choice3 = getView()?.findViewById<Button>(R.id.btn_choice3)?.setOnClickListener{
            val intent = Intent (getActivity(),listen_Mouse::class.java)
            getActivity()?.startActivity(intent)
        }
    }
    override fun onStart(){
        super.onStart()
        Log.e("FourthFragment","onStart")
    }

    override fun onResume(){
        super.onResume()
        Log.e("FourthFragment","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("FourthFragment","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("FourthFragment","onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("FourthFragment","onDstroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("FourthFragment","onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("FourthFragment","onDetach")
    }
}