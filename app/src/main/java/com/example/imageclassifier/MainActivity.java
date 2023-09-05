package com.example.imageclassifier;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.imageclassifier.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'imageclassifier' library on application startup.
    static {
        System.loadLibrary("imageclassifier");
    }

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Example of a call to a native method
        TextView tv = binding.sampleText;
        tv.setText(stringFromJNI());
    }

    /**
     * A native method that is implemented by the 'imageclassifier' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}