package com.faces.textfaces.data

enum class SadFaces(val face: String) {
    Face1("ಥ_ಥ"),
    Face2("┐(‘～`；)┌"),
    Face3("●︿●"),
    Face4("v(ಥ ̯ ಥ)v"),
    Face5("(◕︵◕)"),
    Face6("o(╥﹏╥)o"),
    Face7("(✖╭╮✖)"),
    Face8("(∩︵∩)"),
    Face9("(◕﹏◕✿)");

    companion object {

        fun getAll(): List<String> {
            val textFace = mutableListOf<String>()
            values().forEach { face -> textFace.add(face.face) }
            return textFace.toList()
        }
    }
}