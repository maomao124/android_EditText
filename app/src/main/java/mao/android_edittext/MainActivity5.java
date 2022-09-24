package mao.android_edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        EditText editText_phone = findViewById(R.id.phone_n1);
        EditText editText_password = findViewById(R.id.password1);

        editText_phone.setOnFocusChangeListener(new View.OnFocusChangeListener()
        {
            @Override
            public void onFocusChange(View v, boolean hasFocus)
            {
                if (v.getId() == R.id.phone_n1 && !hasFocus)
                {
                    String phone = editText_phone.getText().toString();
                    if (phone.length() < 11)
                    {
                        //editText_phone.requestFocus();
                        Toast.makeText(MainActivity5.this, "手机号码长度不足11位", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        editText_password.setOnFocusChangeListener(new View.OnFocusChangeListener()
        {
            @Override
            public void onFocusChange(View v, boolean hasFocus)
            {
                if (v.getId() == R.id.password1 && !hasFocus)
                {
                    String password = editText_password.getText().toString();
                    if (password.length() < 6)
                    {
                        //editText_password.requestFocus();
                        Toast.makeText(MainActivity5.this, "密码长度不足6位", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}