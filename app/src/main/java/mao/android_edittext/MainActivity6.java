package mao.android_edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import com.google.android.material.internal.TextWatcherAdapter;

public class MainActivity6 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        EditText editText_phone = findViewById(R.id.phone_n2);
        EditText editText_password = findViewById(R.id.password2);

        //可以使用对应的接口适配器模式，可以提取并重用代码
        editText_phone.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {

            }

            @Override
            public void afterTextChanged(Editable s)
            {
                String phone = editText_phone.getText().toString();
                if (phone.length() == 11)
                {
                    closeInput(MainActivity6.this, editText_phone);
                }
            }
        });

        editText_password.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {

            }

            @Override
            public void afterTextChanged(Editable s)
            {
                String password = editText_password.getText().toString();
                if (password.length() == 6)
                {
                    closeInput(MainActivity6.this, editText_password);
                }
            }
        });


    }

    /**
     * 关闭(隐藏)输入法
     *
     * @param activity 活动
     * @param view     视图
     */
    public void closeInput(Activity activity, View view)
    {
        //从系统服务中获取输入法管理器
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
        //关闭屏幕上的输入法软键盘
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}