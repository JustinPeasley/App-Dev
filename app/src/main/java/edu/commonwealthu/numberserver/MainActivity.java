package edu.commonwealthu.numberserver;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;


/**
 * Randomizes the number in a text view when user clicks a button
 *
 * @author Justin Peasley
 */
public class MainActivity extends AppCompatActivity {

    private static final String tag = "CALLBACKS";

    @Override
    /*
     * Initializes text view with a random number and registers event handler with the button.
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        randomizeNumber();
        Button button = findViewById(R.id.button);
        button.setOnClickListener(view -> randomizeNumber());

        //logcat debug test
        Log.d(tag, "Inside onCreate Method");
    }

    /**
     * randomizes the number displayed in the text view
     */
    private void randomizeNumber()
    {
        ThreadLocalRandom rand =  ThreadLocalRandom.current();
        String result = String.format(Locale.US, "%1.8f", rand.nextDouble());
        TextView textView = findViewById(R.id.text_view);
        textView.setText(result);
    }

    /**
     * Called when the activity becomes visible.
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "inside the onStart method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "Inside onDestroy: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag, "inside onRestart: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "inside onPause: ");
    }
}