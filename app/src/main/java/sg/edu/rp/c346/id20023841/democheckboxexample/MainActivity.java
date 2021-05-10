package sg.edu.rp.c346.id20023841.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cb;
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb = findViewById(R.id.checkBoxDiscount);
        btn = findViewById(R.id.buttonCheck);
        tv = findViewById(R.id.TextViewShow);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("MainActivity", "Inside onClick");
                if(cb.isChecked()){
                    double pay = calcPay(100,20);
                    tv.setText("Discount given, pay " + pay);
                }
                else{
                    double pay = calcPay(100, 0);
                    tv.setText("No discount, pay " + pay);
                }
                Toast.makeText(MainActivity.this, "Are you happy?", Toast.LENGTH_LONG).show();
            }
        });

    }
    private double calcPay(double price, double discount){
        return price * (1 - discount/100);
    }
}