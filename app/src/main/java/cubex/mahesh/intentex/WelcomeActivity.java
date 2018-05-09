package cubex.mahesh.intentex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        TextView tv = findViewById(R.id.tv1);
        tv.setText("Welcome 2 NareshIT,"+
            getIntent().getStringExtra("name")+
             getIntent().getStringExtra("qual")   );
    }
}
