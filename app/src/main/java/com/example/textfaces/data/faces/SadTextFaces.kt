package com.example.textfaces.data.faces

enum class SadTextFaces(val text: String) {
    Face1("ಥ_ಥ"),
    Face2("┐(‘～`；)┌"),
    Face3("●︿●"),
    Face4("●︿●"),
    Face5("(◕︵◕)"),
    Face6("o(╥﹏╥)o"),
    Face7("●︿●"),
    Face8("(∩︵∩)"),
    Face9("ਉ_ਉ");

    companion object {

        fun getAll(): List<String> {
            val textFace = mutableListOf<String>()

            values().forEach { face -> textFace.add(face.text) }

            return textFace.toList()
        }
    }
}