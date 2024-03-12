package ipvc.paulovareiro.currencyconverter.utils

class Converter {
    companion object {
        fun dollarsToEuros(dollars: Float): Float {
            return dollars * 0.85F;
        }
    }
}