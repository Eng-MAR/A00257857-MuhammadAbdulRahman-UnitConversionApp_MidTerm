package ca.mar.unitconversionapp_midterm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Instantiating the Radio Buttons, EditText, TextView, and Button
        val KM = findViewById<RadioButton>(R.id.rbKM)
        val MK = findViewById<RadioButton>(R.id.rbMK)
        val IC = findViewById<RadioButton>(R.id.rbIC)
        val CI = findViewById<RadioButton>(R.id.rbCI)
        val KG = findViewById<RadioButton>(R.id.rbKG)
        val GK = findViewById<RadioButton>(R.id.rbGK)
        val Inp = findViewById<EditText>(R.id.etInp)
        val Out = findViewById<TextView>(R.id.tvOut)
        val Con = findViewById<Button>(R.id.button)



    }
}