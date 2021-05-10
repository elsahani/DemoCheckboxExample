package sg.edu.rp.c346.id20023841.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

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
                if(cb.isChecked()){
                    tv.setText("You have your discount!");
                }
                else{
                    tv.setText("No discount for you!");
                }
            }
        });
    }
}