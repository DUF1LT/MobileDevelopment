package narkevich.fit.bstu.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import narkevich.fit.bstu.lab1.text.TextFunction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int count = 0; count < 10; count++) {
            Log.d("MainActivity", "counter = " + count);
        }

        displayText();
    }

    private void displayText() {
        var textFunction = new TextFunction();

        TextView nt = findViewById(R.id.main_view);
        nt.setText(textFunction.getValue());
    }
}