package th.ac.su.cp.homework2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //a.randomValue();
        //Log.i("MainActivity", "ค่าของ answer ที่สุ่มได้คือ "+a.getValue());
        Button scoreButton = findViewById(R.id.next_button);
        scoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, NumberText.class);
                //i.putExtra(" ", " ");
                startActivity(i);
            }
        });
    }
}