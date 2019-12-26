package com.faces.textfaces.data


enum class HappyFaces(val face: String) {
    Face1("(✿◠‿◠)"),
    Face2("(▰˘◡˘▰)"),
    Face3("(ﾉ◕ヮ◕)ﾉ*:･ﾟ✧"),
    Face4("ヽ(^◇^*)/"),
    Face5("≧◡≦"),
    Face6("(●´ω｀●)"),
    Face7("ヾ(＠⌒▽⌒＠)ﾉ"),
    Face8("(づ｡◕‿‿◕｡)づ"),
    Face9("｡◕ ‿ ◕｡");

    companion object {

        fun getAll(): List<String> {
            val textFace = mutableListOf<String>()
            values().forEach { face -> textFace.add(face.face) }
            return textFace.toList()
        }
    }
}