package com.example.finalproject


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class ThirdFragment : Fragment(){
    override fun onCreate(savedInstanceState:Bundle ?){
        super.onCreate(savedInstanceState)
        Log.e("ThirdFragment","onCreate")
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle ?): View?{
        Log.e("ThirdFragment","onCreate")
        return inflater.inflate(R.layout.third_fragment, container ,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle ?){
        super.onActivityCreated(savedInstanceState)
        Log.e("ThirdFragment","onActivityCreated")

        val btn_choice2 = getView()?.findViewById<Button>(R.id.btn_choice2)?.setOnClickListener{
            val intent = Intent (getActivity(),Phone::class.java)
            getActivity()?.startActivity(intent)
        }
    }
    override fun onStart(){
        super.onStart()
        Log.e("ThirdFragment","onStart")
    }

    override fun onResume(){
        super.onResume()
        Log.e("ThirdFragment","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("ThirdFragment","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("ThirdFragment","onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("ThirdFragment","onDstroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("ThirdFragment","onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("ThirdFragment","onDetach")
    }
}