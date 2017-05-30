package androiddeveloper.eder.padilla.myfirstkotlinapp

/**
 * Created by ederpadilla on 30/05/17.
 */
object TalksDataSource {

    fun getTalks() : MutableList<Talk>{
        val talks =  mutableListOf<Talk>()
        for (i in 1..10){
            val speaker = Speaker(name = "Juanito$i",job ="Jijitl io")
            val talk = Talk(title = "Talk $i",spreaker = speaker)
            talks.add(talk)
        }
        return talks
    }
}