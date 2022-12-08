package com.example.newapp

import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.graphics.PointF.length
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.view.View
import android.widget.*
import android.widget.Toast.LENGTH_LONG
import android.widget.Toast.makeText
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_toast.*
import java.time.Duration

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val songsObjects :MutableList<Songs> = mutableListOf<Songs>()
//        songsObjects.add(Songs("hello","this is the best songs "))
//        songsObjects.add(Songs("tere bib","arijit isngs  "))
//        songsObjects.add(Songs("naina","shreya hgosal "))
//        songsObjects.add(Songs("bib","asdf "))
//        songsObjects.add(Songs("hello","this is the best songs "))
//        songsObjects.add(Songs("hello","this is the best songs "))
//        songsObjects.add(Songs("hello","this is the best songs "))
//        songsObjects.add(Songs("hello","this is the best songs "))
//        songsObjects.add(Songs("hello","this is the best songs "))
//        songsObjects.add(Songs("hello","this is the best songs "))
//
////        val songs = listOf("hello","abcd","aaa","bb","ccc","coderlfe","quaterlife","hello","abcd","aaa","bb","ccc","coderlfe","quaterlife")
//        songList.adapter = MyAdapter(songsObjects)
//        songList.layoutManager = LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)
    }

    fun startService(view: android.view.View) {
        val intent = Intent(applicationContext,MyService::class.java)
        startService(intent)
    }
    fun stopService(view: android.view.View) {
        val intent = Intent(applicationContext,MyService::class.java)
        stopService(intent)

    }
}






//        imageView4.setOnClickListener({
//            val intent = Intent(this,Second::class.java)
//           intent.putExtra("res",R.drawable.img)
//            startActivity(intent)
//
//        })


//        val viewmodel = ViewModelProvider(this).get(mainActivityViewModel::class.java)
////
////        button2.setOnClickListener {
////            viewmodel.add()
////            textView2.text = viewmodel.num.toString()
//
//
//        }
//
//    fun show(view: android.view.View) {
//        val intent = Intent(this,Second::class.java)
//        startActivity(intent)
//
//    }
//}

//        val ed1 = findViewById<EditText>(R.id.ed1)
////        val ed2 = findViewById<EditText>(R.id.ed2)
//        val fragmentManager : FragmentManager = supportFragmentManager
//        val fragmenttransaction  : FragmentTransaction = fragmentManager.beginTransaction()
//        val mFragment = Fragment()
//
//        button.setOnClickListener {
//            val mBundle = Bundle()
//            mBundle.putString("email", ed1.text.toString())
////            bundle.putString("password", ed2.text.toString())
//            mFragment.arguments= mBundle
//            fragmenttransaction.add(R.id.frame123,mFragment).commit()
//        }
//
//
//    }
//        button2.setOnClickListener({
//            val builder = AlertDialog.Builder(this)
//            builder.setTitle("Exit")
//            builder.setMessage("do you want to exit")
//            builder.setPositiveButton("Yes"){dialogInterface,which ->
//                makeText(this, "clicked Yes", Toast.LENGTH_SHORT).show()
//            }
//            builder.setNegativeButton("No"){
//                dialogInterface,which ->
//                Toast.makeText(this,"clicked no",Toast. LENGTH_LONG).show()
//            }
//            builder.setNeutralButton("Cancel"){
//                dialogInterFace,which ->
//                Toast.makeText(this,"click cancel",Toast.LENGTH_SHORT).show()
//            }
//            val alert: AlertDialog = builder.create()
//            alert.show()
//        }
//        )
////}
//
//        button1.setOnClickListener {
//            val builder = AlertDialog.Builder(this)
//            builder.setTitle("addcontact")
//            builder.setMessage("do u want to add mr pop in contactlist")
//            builder.setIcon(R.drawable.ic_add_contact)
//            builder.setPositiveButton("yes") { dilogInterface, which ->
//                Toast.makeText(this, "clicked YEs ", Toast.LENGTH_SHORT).show()
//            }
//            builder.setNegativeButton("No") { dilogInterface, which ->
//                Toast.makeText(this, "clicked NO ", Toast.LENGTH_SHORT).show()
//            }
//            builder.setNeutralButton("cancel") { dilogInterface, which ->
//                Toast.makeText(this, "Cancel ", Toast.LENGTH_SHORT).show()
//            }
//            val alertDialog: AlertDialog = builder.create()
//            alertDialog.setCancelable(false)
//            alertDialog.show()
//
//        }


//

//    fun click(view: android.view.View) {
//       val intent = Intent(Intent.ACTION_VIEW)
//        intent.setData(Uri.parse("http://www.google.com"))
//        startActivity(Intent.createChooser(intent,"sharewith"))
//    }
//}


//        val button = findViewById<Button>(R.id.button2)
//        val cltoast = findViewById<ConstraintLayout>(R.id.clToast)

//        button.setOnClickListener {
//            Toast(this).apply {
//                duration = Toast.LENGTH_LONG
//                view= layoutInflater.inflate(R.layout.custom_toast,cltoast)
//                show()
//            }
//        }
//    }
//}
//        val btnOrder = findViewById<Button>(R.id.btnOrder)
//        val cbCheese = findViewById<CheckBox>(R.id.cbCheese)
//        val cbOnion = findViewById<CheckBox>(R.id.cbOnion)
//        val cbsalad = findViewById<CheckBox>(R.id.cbSalad)
//        val r = findViewById<RadioGroup>(R.id.rgMeat)
//        val tvOrder = findViewById<TextView>(R.id.tvOrder)
//        btnOrder.setOnClickListener {
//            val checkedMeatRadioButton =r.checkedRadioButtonId
//            val meat = findViewById<RadioButton>(checkedMeatRadioButton)
//            val cheese = cbCheese.isChecked
//            val salad = cbsalad.isChecked
//            val onion = cbOnion.isChecked
//            val orderString = "your order burger with\n"+"${meat.text}"+
//                    (if(cheese) "\ncheese" else "")+
//                    (if(salad) "\nSalad" else "")+
//                    (if (onion) "\nonion" else "")
//            tvOrder.text = orderString
//
//
//        }
//    }
//}
//        val firstFragment = FirstFragment()
//        val secondFramgent = SecondFragment()
//        val button1 = findViewById<Button>(R.id.btnfragment1)
//        val button2 = findViewById<Button>(R.id.btnfragment2)
//        supportFragmentManager.beginTransaction().apply {
//            replace(R.id.flFragment, firstFragment)
//            commit()
//        }
//        button1.setOnClickListener {
//            supportFragmentManager.beginTransaction().apply {
//                replace(R.id.flFragment, firstFragment)
//                addToBackStack("null")
//                commit()
//
//            }
//            button2.setOnClickListener {
//                supportFragmentManager.beginTransaction().apply {
//                    replace(R.id.flFragment, secondFramgent)
//                    addToBackStack("nul")
//                    commit()
//                }
//            }

//     val mytext = findViewById<TextView>(R.id.etName)
//     mytext.text = "this is csreee"
//    }
//        }
//    }
//}
//        val etName = findViewById<EditText>(R.id.etName)
//        val etAge = findViewById<EditText>(R.id.etAge)
//        val button = findViewById<Button>(R.id.button)
//        button.setOnClickListener {
//            val name = etName.text.toString()
//            var age =etAge.text.toString()
//            val intent = Intent(this@MainActivity,Second::class.java)
//            intent.putExtra("Name",name)
//            intent.putExtra("Age",age)
//            startActivity(intent)
//        }
//        }
//    }


//    fun birthday(view: View) {
//        val n = nameInput.editableText
//        Toast.makeText(this, "bithdayda", Toast.LENGTH_LONG).show()
//        val intent = Intent(this, Second::class.java)
//        startActivity(intent)



//    fun birthdaycard(){
//        val intent = Intent(this,Second::class.java)



//        val button : Button = findViewById(R.id.nextButton)
//        button.setOnClickListener(object :View.OnClickListener{
//            override fun onClick(p0: View?) {
//                val intent = Intent(this@MainActivity,Second::class.java)
//                startActivity(intent)
//            }
//        })
//    }
////    fun next(v: View){
////        val intent = Intent(this,Second::class.java)
////        startActivity(intent)
////    }
//}
//        fun show(v:View){
//            Toast.makeText( this,"buttonclicked", Toast.LENGTH_SHORT).show()

//        }

