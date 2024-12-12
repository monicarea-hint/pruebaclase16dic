package app.example.pruebagit.appBanco

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import app.example.pruebagit.R
import app.example.pruebagit.appBanco.data.Data
import app.example.pruebagit.appBanco.data.Usuario
import app.example.pruebagit.databinding.ActivityRegistrarUsuarioBinding

class RegistrarUsuario : AppCompatActivity() {
    /*
    me permite enlazar las vistas directamente
     */
    var id =0
   private lateinit var binding: ActivityRegistrarUsuarioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityRegistrarUsuarioBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
       binding.btnRegistrar.setOnClickListener {
           registarUsuario()
       }
    }

    private  fun registarUsuario(){
        val nombre=binding.nombreUsuario.text.toString().trim()
        val pass=binding.passwordUsuario.text.toString().trim()

        val usuario= Usuario(id++,"",nombre,0f,"",pass,"")
        Data.data.add(usuario)
        Toast.makeText(this, "usuario registrado", Toast.LENGTH_SHORT).show()
        println("usuario registardo ${usuario.nombre} ${usuario.id} ")
    }
}