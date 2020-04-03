
expect fun appTitle(): String

fun getImc(weight: Int, height: Float): Float {
    return weight/(height*height)
}

fun getImcResult(imc: Float): String {
    return when {
        imc <= 18.5 -> {
            "Abaixo do peso"
        }
        imc in 18.6 .. 24.9 -> {
            "Peso normal"
        }
        imc in 25.0 .. 29.9 -> {
            "Sobrepeso"
        }
        imc in 30.0 .. 34.9 -> {
            "Obesidade grau 1"
        }
        imc in 35.0 .. 39.9 -> {
            "Obesidade grau 2"
        }
        imc >= 40 -> {
            "Obesidade grau 3"
        }
        else -> {
            "Alien"
        }
    }
}