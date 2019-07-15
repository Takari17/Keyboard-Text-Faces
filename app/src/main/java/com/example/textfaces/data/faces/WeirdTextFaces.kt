package com.example.textfaces.data.faces


enum class WeirdTextFaces(val text: String) {
    Face1("ಠ◡ಠ"),
    Face2("⊂•⊃_⊂•⊃"),
    Face3("(″･ิ_･ิ)っ"),
    Face4("( ͡° ͜ʖ ( ͡° ͜ʖ ( ͡° ͜ʖ ( ͡° ͜ʖ ͡°) ͜ʖ ͡°)ʖ ͡°)ʖ ͡°)"),
    Face5("^( '-' )^"),
    Face6("┬┴┬┴┤( ͡° ͜ʖ├┬┴┬┴"),
    Face7("ᕙ(⇀‸↼‶)ᕗ"),
    Face8("（ ´_⊃｀）"),
    Face9("(⊙︿⊙✿)");

    companion object {

        fun getAll(): List<String> {
            val textFace = mutableListOf<String>()

            values().forEach { face -> textFace.add(face.text) }

            return textFace.toList()
        }
    }
}