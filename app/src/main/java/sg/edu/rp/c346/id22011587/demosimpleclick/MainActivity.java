package sg.edu.rp.c346.id22011587.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button btnDisplay; //Step 1: Declare the field variables
    TextView tvDisplay;
    EditText etInput;
    ToggleButton tbtn;
    RadioGroup rgGender;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Step 2: Link the field variables to UI components in layout
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tbtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.rd);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Code for the action
                Toast.makeText(MainActivity.this, "button is clicked", Toast.LENGTH_LONG).show();
                String stringResponse = etInput.getText().toString();
                int checkedRadioID = rgGender.getCheckedRadioButtonId();
                if (checkedRadioID == R.id.radioButton) {
                    Toast.makeText(MainActivity.this, "he says", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "she says", Toast.LENGTH_LONG).show();
                }
                tvDisplay.setText(stringResponse);
            }
        });tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action
                boolean isChecked = tbtn.isChecked();
                if (isChecked) {
                    etInput.setEnabled(true);
                } else {
                    etInput.setEnabled(false);
                }

            }
        });

    }
}