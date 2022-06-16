package dev.tanya.calculatorapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var tilNumber:TextInputLayout
    lateinit var tilNumber2:TextInputLayout
    lateinit var etNumber:TextInputEditText
    lateinit var etNumber2:TextInputEditText
    lateinit var btnAdd:Button
    lateinit var btnSubtraction:Button
    lateinit var btnDivision:Button
    lateinit var btnModulus:Button
    lateinit var tvAnswer:TextView
    lateinit var Number:Number
    lateinit var Number2: Number


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd=findViewById(R.id.btnAdd)
        btnDivision=findViewById(R.id.btnDivision)
        btnModulus=findViewById(R.id.btnModulus)
        btnSubtraction=findViewById(R.id.btnSubtraction)
        tvAnswer=findViewById(R.id.tvAnswer)

        btnAdd.setOnClickListener {

            val inputs = obtainInput()

            addition(inputs!!.Number, inputs!!.Number2)

        }

        btnSubtraction.setOnClickListener {

            val inputs = obtainInput()

            subtraction(inputs!!.Number, inputs!!.Number2)



        }

        btnDivision.setOnClickListener {

            val inputs = obtainInput()


        }


        btnModulus.setOnClickListener {

            val inputs = obtainInput()

            modulus(inputs!!.Number, inputs!!.Number2)

        }


    }

    data class Input(var Number: Int, var Number2: Int)


    fun obtainInput(): Input?{

        val Number = etNumber.text.toString()

        val Number2 = etNumber2.text.toString()


        if (Number.isBlank()) {

            etNumber.error="Number is required"

            return null

        }

        if (Number2.isBlank()) {

            etNumber2.error="Number Decimal is required"

            return null

        }

        return Input(Number.toInt(), Number2.toInt())

    }

    fun addition(Number: Int, Number2: Int) {

        val add = Number + Number2

        tvAnswer.text = add.toString()

    }


    fun subtraction(Number: Int, Number2: Int) {

        val subtract = Number - Number2

        tvAnswer.text = subtract.toString()

    }


    fun modulus(Number: Int, Number2: Int) {

        val remainder = Number % Number2

        tvAnswer.text = remainder.toString()

    }





}
