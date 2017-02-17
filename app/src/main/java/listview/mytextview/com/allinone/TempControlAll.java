package listview.mytextview.com.allinone;

import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class TempControlAll extends AppCompatActivity {

    private RadioButton C;
    private RadioButton F;
    private RadioButton K;
    private EditText enterText;
    private TextView Celcius;
    private TextView Kelvin;
    private TextView Fahrenheit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_control_all);

        C = (RadioButton) findViewById(R.id.celciusButton);
        F = (RadioButton) findViewById(R.id.fahrenheitButton);
        K = (RadioButton) findViewById(R.id.kelvinButton);
        enterText = (EditText) findViewById(R.id.editText);
        Celcius = (TextView) findViewById(R.id.celcius);
        Fahrenheit = (TextView) findViewById(R.id.fahrenheit);
        Kelvin = (TextView) findViewById(R.id.kelvin);

        C.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                if((enterText.getText().toString()).isEmpty())
                    Toast.makeText(getApplicationContext(), "Idiot! Enter some Value to convert!!", Toast.LENGTH_LONG).show();
                else
                {
                    double value;
                    value = Double.valueOf(enterText.getText().toString());
                    Celcius.setText(enterText.getText().toString() + " C");
                    CelciusToFahrenheit(value);
                    CelciusToKelvin(value);
                }
            }
        });

        F.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                if((enterText.getText().toString()).isEmpty())
                    Toast.makeText(getApplicationContext(), "Idiot! Enter some Value to convert!!", Toast.LENGTH_LONG).show();
                else
                {
                    double value;
                    value = Double.valueOf(enterText.getText().toString());
                    Fahrenheit.setText(enterText.getText().toString() + " F");
                    FahrenheitToCelcius(value);
                    FahrenheitToKelvin(value);
                }
            }
        });

        K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ((enterText.getText().toString()).isEmpty())
                    Toast.makeText(getApplicationContext(), "Idiot! Enter some Value to convert!!", Toast.LENGTH_LONG).show();
                else {
                    double value;
                    value = Double.valueOf(enterText.getText().toString());
                    Kelvin.setText(enterText.getText().toString() + " K");
                    KelvinToCelcius(value);
                    KelvinToFahrenheit(value);
                }
            }
        });

    }

    private void CelciusToKelvin (double value){
        Kelvin.setText((value+273.15) + " K");
    }

    private void KelvinToCelcius (double value){
        Celcius.setText((value-273.15) + " C");
    }

    private void CelciusToFahrenheit (double value){
        Fahrenheit.setText(((value*9)/5)+32 + " F");
    }

    private void FahrenheitToCelcius (double value){
        Celcius.setText(((value-32)*5)/9 + " C");
    }

    private void FahrenheitToKelvin (double value){
       // double answer = (5/9)*(value - 32);
        Kelvin.setText(((5*(value - 32)/9)+273.15) + " K");
    }

    private void KelvinToFahrenheit (double value){
        Fahrenheit.setText((9*(value - 273.15)/5 + 32)+ " F");
    }
}
