package com.technoshaft.designpatterns.design_pattern.adapter

interface GetEnglish {
    fun getEnglishData(gujaratiData: FromLanguageData): EnglishData

    fun getItem(position: Int): EnglishData;
}

class EnglishAdapter(val list: List<FromLanguageData>) : GetEnglish {

    init {
        for (fromLanguageData in list) {
            getEnglishData(fromLanguageData)
        }
    }


    override fun getEnglishData(dataToConvert: FromLanguageData): EnglishData {
        val sentence = dataToConvert.sentence
        var convertedSentence = ""

        convertedSentence = if (sentence.contentEquals("kem cho")) {
            "how are you"
        } else if (sentence.contentEquals("jsk")) {
            "good night"
        } else {
            "i am fine"
        }
        return EnglishData(convertedSentence)
    }

    override fun getItem(position: Int): EnglishData {
        return getEnglishData(list.get(position))
    }

}