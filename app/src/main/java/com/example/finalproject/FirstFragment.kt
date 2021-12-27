package com.example.finalproject


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment


class FirstFragment : Fragment(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        Log.e("FirstFragment","onCreate")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View?{
        Log.e("FirstFragment","onCreateView")
        return inflater.inflate(R.layout.first_fragment, container ,false)


    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e("FirstFragment", "onActivityCreated")

        val btn_choice1 = getView()?.findViewById<Button>(R.id.btn_choice1)?.setOnClickListener{
            val intent = Intent (getActivity(),listen_mic::class.java)
            getActivity()?.startActivity(intent)
        }
    }

    override fun onStart(){
        super.onStart()
        Log.e("FirstFragment","onStart")
    }

    override fun onResume(){
        super.onResume()
        Log.e("FirstFragment","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("FirstFragment","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("FirstFragment","onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("FirstFragment","onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("FirstFragment","onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("FirstFragment","onDetach")
    }
}



