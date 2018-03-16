package com.bijaysharma.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    public static final String TAG = FunFactsActivity.class.getSimpleName();
    //Declare our view variables
    private ColorWheel colorWheel = new ColorWheel();
    private FactBook factBook = new FactBook();
    private TextView factTextView;
    private Button showFactButton;
    private RelativeLayout funFactLayout;
    private int color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        factTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.showFactButton);
        funFactLayout = findViewById(R.id.funFactLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                color = Color.parseColor(colorWheel.getColor());
                funFactLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
                factTextView.setText(factBook.getFacts());
            }
        };
        showFactButton.setOnClickListener(listener);
       // Toast.makeText(this, "Yay ! our activity was created",Toast.LENGTH_SHORT).show();
        Log.w(TAG,"We're logging from funFacts activity");
    }
}
