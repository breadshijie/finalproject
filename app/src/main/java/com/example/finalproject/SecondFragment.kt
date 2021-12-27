package com.example.finalproject


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class SecondFragment : Fragment(){
    override fun onCreate(savedInstanceState:Bundle ?){
        super.onCreate(savedInstanceState)
        Log.e("SecondFragment","onCreate")
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle ?): View?{
        Log.e("SecondFragment","onCreate")
        return inflater.inflate(R.layout.second_fragment, container ,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle ?){
        super.onActivityCreated(savedInstanceState)
        Log.e("SecondFragment","onActivityCreated")

        val btn_choice2 = getView()?.findViewById<Button>(R.id.btn_choice2)?.setOnClickListener{
            val intent = Intent (getActivity(),listen_Keyboard::class.java)
            getActivity()?.startActivity(intent)
        }
    }
    override fun onStart(){
        super.onStart()
        Log.e("SecondFragment","onStart")
    }

    override fun onResume(){
        super.onResume()
        Log.e("SecondFragment","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("SecondFragment","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("SecondFragment","onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("SecondFragment","onDstroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("SecondFragment","onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("SecondFragment","onDetach")
    }
}