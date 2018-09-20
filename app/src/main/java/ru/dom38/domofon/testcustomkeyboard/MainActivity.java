package ru.dom38.domofon.testcustomkeyboard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private HexadecimalKeyboard keyboard;
    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText)findViewById(R.id.editText);

        if(et != null){
            keyboard = new HexadecimalKeyboard(this);
            keyboard.registerEditText(et);
        } else {
            Toast.makeText(this, "No edit field!", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onBackPressed()
    {
        if(keyboard.isKeyboardVisible()){
            keyboard.hideKeyboard();
            return;
        }

        super.onBackPressed();
    }
}
