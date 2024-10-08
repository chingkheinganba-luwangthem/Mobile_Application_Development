package com.chingkhei.date_time_picker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    DatePicker picker;
    Button displayDate;
    TextView textview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        textview1 = (TextView) findViewById(R.id.textView1);
        picker = (DatePicker) findViewById(R.id.datePicker);
        displayDate = (Button) findViewById(R.id.button1);

        textview1.setText("Current Date: " + getCurrentDate());

        displayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview1.setText("Changed Date: " + getCurrentDate());
            }
        });
    }

    public String getCurrentDate() {
        StringBuilder builder = new StringBuilder();
        builder.append((picker.getMonth() + 1) + "/"); // month is 0 based
        builder.append(picker.getDayOfMonth() + "/");
        builder.append(picker.getYear());
        return builder.toString();
    }
}
