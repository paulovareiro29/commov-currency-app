package ipvc.paulovareiro.currencyconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import ipvc.paulovareiro.currencyconverter.utils.Converter
import java.text.NumberFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var convertButton: Button
    private lateinit var input: EditText
    private lateinit var textView: TextView

    fun loadComponents() {
        convertButton = findViewById(R.id.convert_button)
        input = findViewById(R.id.dollarText)
        textView = findViewById(R.id.textView)
    }

    fun handleOnButtonClick() {
        val dollars = input.text.toString()

        if(dollars.isBlank()) {
            textView.text = getString(R.string.no_value_string)
            return
        }

        textView.text = String.format(Locale.ENGLISH, "%.2f", Converter.dollarsToEuros(dollars.toFloat()))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadComponents()

        convertButton.setOnClickListener { handleOnButtonClick() }
    }
}