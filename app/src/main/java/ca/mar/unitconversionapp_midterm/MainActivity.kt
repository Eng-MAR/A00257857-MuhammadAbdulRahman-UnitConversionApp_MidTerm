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
        val For = findViewById<TextView>(R.id.tvFor)
        val Con = findViewById<Button>(R.id.button)

        /*
        From Line No. 37 to Line No. 90 I have written codes for the following:
            1. Setting OnClickListeners on Radio Buttons.
            2. Whenever user clicks on any measurement unit Conversion Formula of that unit is displayed,
               as well as empty fields of Input and Output fields.
            3. Button 'CONVERT' is set on OnClickListener.
            4. Created a variable which takes user input then converting string value (which user inserts in the Input field)
               to Float value using (Inp.text.toString().toFloat()).
            5. And then converting the Float output back into the string using (toString()) and displayed it in the Output field.
         */
        KM.setOnClickListener {
            Inp.setText("")
            Out.setText("")
            For.setText("Formula: divide the LENGTH value by 1.609")
            Con.setOnClickListener {
                var a = Inp.text.toString().toFloat() * 0.621
                Out.setText("" + a.toString() + " Miles (mi)")
            }
        }
        MK.setOnClickListener {
            Inp.setText("")
            Out.setText("")
            For.setText("Formula: multiply the LENGTH value by 1.609")
            Con.setOnClickListener {
                var a = Inp.text.toString().toFloat() * 1.609
                Out.setText("" + a.toString() + " Kilometers (km)")
            }
        }
        IC.setOnClickListener {
            Inp.setText("")
            Out.setText("")
            For.setText("Formula: multiply the LENGTH value by 2.54")
            Con.setOnClickListener {
                var b = Inp.text.toString().toFloat() * 2.54
                Out.setText("" + b.toString() + " Centimeters (cm)")
            }
        }
        CI.setOnClickListener {
            Inp.setText("")
            Out.setText("")
            For.setText("Formula: divide the LENGTH value by 2.54")
            Con.setOnClickListener {
                var c = Inp.text.toString().toFloat() * 0.393
                Out.setText("" + c.toString() + " Inches (in)")
            }
        }
        KG.setOnClickListener {
            Inp.setText("")
            Out.setText("")
            For.setText("Formula: multiply the WEIGHT value by 1000")
            Con.setOnClickListener {
                var d = Inp.text.toString().toFloat() * 1000
                Out.setText("" + d.toString() + " Grams (gm)")
            }
        }
        GK.setOnClickListener {
            Inp.setText("")
            Out.setText("")
            For.setText("Formula: divide the WEIGHT value by 1000")
            Con.setOnClickListener {
                var e = Inp.text.toString().toFloat() * 0.001
                Out.setText("" + e.toString() + " Kilograms (kg)")
            }
        }
    }
}