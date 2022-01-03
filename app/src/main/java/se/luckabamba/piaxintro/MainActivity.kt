package se.luckabamba.piaxintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var thenumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val thetext = findViewById<TextView>(R.id.fancyHeaderText)

        thetext.text = "Hurra! Ändrad text"

        findViewById<Button>(R.id.fancyClickButton).setOnClickListener{

            thenumber = thenumber + 1
            //thenumber++
            //thenumber += 1

            thetext.text = "Klickat knapp " + thenumber.toString()
        }

    }
}