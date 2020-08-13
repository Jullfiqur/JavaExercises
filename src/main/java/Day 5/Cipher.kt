internal class Atbash {
    fun encode(plaintext: String): String {
        var plaintext = plaintext
        var ciphertext = ""
        plaintext = removeUnwantedChars(plaintext.toLowerCase())
        for (c in plaintext.toCharArray()) {
            ciphertext += if (Character.isLetter(c)) {
                ('a'.toInt() + ('z' - c)).toChar()
            } else {
                c
            }
        }
        return getSubStrings(ciphertext).trim { it <= ' ' }
    }

    fun decode(ciphertext: String): String {
        var ciphertext = ciphertext
        var plaintext = ""
        ciphertext = removeUnwantedChars(ciphertext.toLowerCase())
        for (c in ciphertext.toCharArray()) {
            plaintext += if (Character.isLetter(c)) {
                ('z'.toInt() + ('a' - c)).toChar()
            } else {
                c
            }
        }
        return plaintext
    }

    private fun getSubStrings(input: String): String {
        var out = ""
        var i = 0
        while (i < input.length) {
            if (i + 5 <= input.length) {
                out += input.substring(i, i + 5) + " "
            } else {
                out += input.substring(i) + " "
            }
            i += 5
        }
        return out
    }

    private fun removeUnwantedChars(input: String): String {
        var out = ""
        for (c in input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                out += c
            }
        }
        return out
    }
}