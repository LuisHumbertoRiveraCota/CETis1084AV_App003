package mx.edu.cetis108.cetis1084av_app003;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText etxt1,etxt2;
    Button btnAcep;
    TextView tvres;
    Integer num1,num2,operacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxt1=(EditText) findViewById(R.id.Edtxt1);
        etxt2=(EditText) findViewById(R.id.edtxt2);
        btnAcep=(Button) findViewById(R.id.btnAceptar);
        tvres=(TextView) findViewById(R.id.txtvResultado);

        btnAcep.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        num1=Integer.valueOf((etxt1.getText().toString()));
        num2=Integer.valueOf((etxt2.getText().toString()));
        if(num1>num2){
            operacion=num1-num2;
            tvres.setText(operacion.toString());
            Toast.makeText(getApplicationContext(),"El mayor es " + num1,Toast.LENGTH_LONG).show();


        }
        else if(num1<num2){
            operacion=num1+num2;
            tvres.setText(operacion.toString());
            Toast.makeText(getApplicationContext(),"El mayor es "+num2,Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(getApplicationContext(),"Los numeros son inguales",Toast.LENGTH_SHORT).show();
        }


    }
}
