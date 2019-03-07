package band.effective

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout)
    }

    override fun setContentView(layoutResID: Int) {
        super.setContentView(layoutResID)
        val letters = LettersProvider.letterForPage(layoutResID)
        val converter = Converter.getInstance()
        findViewById<TextView>(R.id.text1).text = converter.convert(letters.first)
        findViewById<TextView>(R.id.text2).text = converter.convert(letters.second)
        findViewById<TextView>(R.id.text3).text = converter.convert(letters.third)
    }
}
