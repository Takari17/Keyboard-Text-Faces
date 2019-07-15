package com.example.textfaces.data.faces


class TextFaceFactory {
    companion object {
        fun getInstance(tabIndex: Int): List<String> {
            return when (tabIndex) {
                0 -> HappyTextFaces.getAll()
                1 -> SadTextFaces.getAll()
                2 -> MadTextFaces.getAll()
                3 -> WeirdTextFaces.getAll()
                else -> throw IndexOutOfBoundsException()
            }
        }
    }
}