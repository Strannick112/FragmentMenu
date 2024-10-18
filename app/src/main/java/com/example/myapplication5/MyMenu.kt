package com.example.myapplication5

import android.R
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.myapplication5.databinding.FragmentMenuBinding


class MyMenu : Fragment() {

    lateinit var button1: Button
    lateinit var button2: Button
    lateinit var button3: Button

    lateinit var binding: FragmentMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val linearLayout: LinearLayout = LinearLayout(context)

        binding.root.addView(linearLayout)

        button1 = Button(context)
        button1.text = "Кнопка 1"
        button1.setOnClickListener( fun(view: View){
            if(activity !is MainActivity){
                val intent = android.content.Intent(context, MainActivity::class.java)
                startActivity(intent)
            }
        })

        linearLayout.addView(button1)

        button2 = Button(context)
        button2.text = "Кнопка 2"
        button2.setOnClickListener( fun(view: View){
            if(activity !is MainActivity2){
                val intent = android.content.Intent(context, MainActivity2::class.java)
                startActivity(intent)
            }
        })
        linearLayout.addView(button2)

        button3 = Button(context)
        button3.text = "Кнопка 3"
        button3.setOnClickListener( fun(view: View){
            if(activity !is MainActivity3){
                val intent = android.content.Intent(context, MainActivity3::class.java)
                startActivity(intent)
            }
        })
        linearLayout.addView(button3)

    }

}
