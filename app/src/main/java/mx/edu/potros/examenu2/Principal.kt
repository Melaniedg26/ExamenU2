package mx.edu.potros.examenu2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        var btnDetalles: Button = findViewById(R.id.btn_detalles)
        btnDetalles.setOnClickListener {
            var intent: Intent = Intent(this,Regalos::class.java)
            startActivity(intent)
        }
        var btnGlobos: Button = findViewById(R.id.btn_globos)
        btnGlobos.setOnClickListener {
            var intent: Intent = Intent(this,Regalos::class.java)
            startActivity(intent)
        }

        var btnPeluches: Button = findViewById(R.id.btn_peluches)
        btnPeluches.setOnClickListener {
            var intent: Intent = Intent(this,Regalos::class.java)
            startActivity(intent)
        }
        var btnRegalos: Button = findViewById(R.id.btn_regalos)
        btnRegalos.setOnClickListener {
            var intent: Intent = Intent(this,Regalos::class.java)
            startActivity(intent)
        }

        var btnTazas: Button = findViewById(R.id.btn_tazas)
        btnTazas.setOnClickListener {
            var intent: Intent = Intent(this,Regalos::class.java)
            startActivity(intent)
        }

    }
}