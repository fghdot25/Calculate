package projects.talga.kz.calculate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToMidterm(View view) {
        Intent goMidtermActivity = new Intent(MainActivity.this, MidtermActivity.class);
        startActivity(goMidtermActivity);
    }
}
