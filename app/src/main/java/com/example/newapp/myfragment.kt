package com.example.newapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView



/**
 * A simple [Fragment] subclass.
 * Use the [myfragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class myfragment : Fragment() {
    private lateinit var textView: TextView
//    public lateinit var textview1 : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_myfragment, container, false)
        textView = view.findViewById<View>(R.id.fragmentText) as TextView
//        textview1 = view.findViewById<View>(R.id.fragmentText1) as TextView
        val bundle = arguments
        val message = bundle!!.getString("email")
//        val name = bundle.getString("password")
        textView.text = message
//        textview1.text = name
        return view

    }
}