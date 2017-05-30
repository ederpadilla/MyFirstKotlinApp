package androiddeveloper.eder.padilla.myfirstkotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import okhttp3.internal.Internal.logger

data class Ejemplo(val nombre : String , val url : String)


class MainActivity : AppCompatActivity() {

    var react = Ejemplo("me cae mal el perro","guarrumo")

    val test2 = Ejemplo("Dafawq","estoy haciendo")

    val haywey = Ejemplo(react.nombre,test2.url)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txt = findViewById(R.id.text) as TextView

        val btn = findViewById(R.id.button) as Button
        Log.e("tag ","hola kotlin")
        btn.setText("Hola kotlin  ${react.nombre} se contatena ${react.url} dafaq ")
        log("se tiene ${haywey.nombre} y tambien esta ${haywey.url}")
        val copia = haywey.copy()
        log("se copia ${copia}")
        btn.setOnClickListener {
            view -> switchClase(react)
        }
    }

    fun log(message : String){
        Log.e("::DEBUG::",message)
    }

    fun switchClase(ejemplo : Ejemplo){
        react = ejemplo.copy()
        when(ejemplo.nombre){
            "Dafawq"-> react = test2.copy()
            "me cae mal el perro" -> react = react.copy()
            else -> print("Asi se imprime en consola")
        }
        val txt = findViewById(R.id.text) as TextView
        txt.setText(react.toString())
    }

}
