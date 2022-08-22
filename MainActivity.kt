package com.example.helloworld


import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


//where we are going to be handling interaction.
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //show layout file: activity_main
        setContentView(R.layout.activity_main)
        //customized to display hello from (Naomy).done
        //add button to layount.done
        //set up logic to know when user taps
        //get reference to button
        findViewById<Button>(R.id.button).setOnClickListener{
            Log.i ("Naomy","Tapped on button")
            //Get a reference to text view
            //Set color of the text view
         findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
            findViewById<Button>(R.id.button2).setOnClickListener{
             Log.i("Naomy","Tapped on button 2")
                findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor( getResources().getColor(R.color.teal_200))


                val editText :EditText= findViewById(R.id.editText)
                val button3: Button =findViewById(R.id.button3)

                button3.setOnClickListener{
                    val message = editText.text.toString()
                    Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
                }
                }




            }


        }

        //change color of text
    }
