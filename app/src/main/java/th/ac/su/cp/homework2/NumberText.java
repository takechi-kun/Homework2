package th.ac.su.cp.homework2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import th.ac.su.cp.homework2.next.Number;

public class NumberText extends AppCompatActivity {
    Number n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_text);
        n = new Number();
        Button guessButton = findViewById(R.id.check_button);
        guessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText numberEditText = findViewById(R.id.text_number);
                String text = numberEditText.getText().toString();
                Number.GuessResult result = n.checkAnswer(text);
                AlertDialog.Builder dialog = new AlertDialog.Builder(NumberText.this);
                switch (result) {
                    case y_vote:
                        dialog.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                        dialog.setMessage("คุณเป็นผู้มีสิทธิเลือกตั้ง");
                        dialog.setPositiveButton("OK", null);
                        dialog.show();
                        break;

                    case n_vote:
                        Toast t = Toast.makeText(NumberText.this, "กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก", Toast.LENGTH_LONG);
                        t.show();
                        break;

                    case notequal:
                        dialog.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                        dialog.setMessage("คุณไม่มีสิทธิเลือกตั้ง");
                        dialog.setPositiveButton("OK", null);
                        dialog.show();
                        break;
                }
            }
        });
    }
}