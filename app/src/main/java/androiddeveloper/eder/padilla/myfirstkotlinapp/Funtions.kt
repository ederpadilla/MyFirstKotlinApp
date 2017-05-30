package androiddeveloper.eder.padilla.myfirstkotlinapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by ederpadilla on 30/05/17.
 */
fun ViewGroup.inflate(layautId : Int, attachToRoot : Boolean = false) : View {
    val inflater = LayoutInflater.from(context)
    return inflater.inflate(layautId,this,attachToRoot)
}