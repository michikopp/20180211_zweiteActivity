package sabel.com.a20180211_zweiteactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Kopp on 11.01.2018.
 */

public class AnzeigeActivity extends Activity{

    private TextView tv_anzeigeEingabe;
    private String eingabe;
    private Button btn_zurueck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anzeige);
        btn_zurueck = findViewById(R.id.btn_zurueck);

        tv_anzeigeEingabe = findViewById(R.id.tv_anzeigeEingabe);
        eingabe = getIntent().getExtras().getString("text");
        tv_anzeigeEingabe.setText(eingabe);

        btn_zurueck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}