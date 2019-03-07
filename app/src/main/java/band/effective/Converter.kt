package band.effective

import android.util.Base64

class Converter {

    companion object {
        fun getInstance() = InnerConverter()
    }

    fun convert(letter: String) = String(Base64.decode(letter, Base64.DEFAULT))

    class InnerConverter {
        fun convert(letter: String) = letter.substring(1, 2)
    }
}
