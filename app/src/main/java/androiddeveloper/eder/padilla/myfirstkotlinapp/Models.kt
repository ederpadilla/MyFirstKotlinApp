package androiddeveloper.eder.padilla.myfirstkotlinapp

/**
 * Created by ederpadilla on 30/05/17.
 */
data class Speaker(val name : String, val job: String ="Android developer")

data class Talk(val date : String="fecha no asignada jijitl", val title : String, val spreaker : Speaker)