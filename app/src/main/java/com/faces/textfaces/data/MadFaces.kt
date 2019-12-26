package com.faces.textfaces.data


enum class MadFaces(val face: String) {
    Face1("ಠ益ಠ"),
    Face2("〴⋋_⋌〵"),
    Face3("(-＿- )ノ"),
    Face4("(ง'̀-'́)ง"),
    Face5("( ﾟдﾟ)"),
    Face6("ಠ▃ಠ"),
    Face7("(ò.ó)┛彡┻━┻"),
    Face8("(≖︿≖✿)"),
    Face9("ಠ_ಠ");

    companion object {

        fun getAll(): List<String> {
            val textFace = mutableListOf<String>()

            values().forEach { face -> textFace.add(face.face) }

            return textFace.toList()
        }
    }
}