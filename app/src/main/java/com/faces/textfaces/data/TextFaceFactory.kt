package com.faces.textfaces.data


class TextFaceFactory {
    companion object {
        fun getInstance(tabIndex: Int): List<String> {
            return when (tabIndex) {
                0 -> HappyFaces.getAll()
                1 -> SadFaces.getAll()
                2 -> MadFaces.getAll()
                3 -> WeirdFaces.getAll()
                else -> throw IndexOutOfBoundsException()
            }
        }
    }
}