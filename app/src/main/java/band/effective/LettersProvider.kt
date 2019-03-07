package band.effective

class LettersProvider {

    fun letterForPage(layoutResID: Int): Triple<String, String, String> {
        return when (layoutResID) {
            R.layout.layout_8 -> Triple("0JA=", "0JI=", "0JM=")
            R.layout.layout_m -> Triple("0Jo=", "0J4=", "0KI=")
            R.layout.layout_a -> Triple("0JE=", "0JQ=", "0JU=")
            R.layout.layout_r -> Triple("0JA=", "0JI=", "0JU=")
            R.layout.layout_t -> Triple("0JE=", "0JM=", "0JQ=")
            else -> throw IllegalArgumentException("Серик заказчик")
        }
    }
}
