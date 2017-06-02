package scut.carson_ho.fragment_2_activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        text = (TextView)findViewById(R.id.text);

        // 步骤1：获取FragmentManager
        FragmentManager fragmentManager = getFragmentManager();

        // 步骤2：获取FragmentTransaction
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // 步骤3：创建需要添加的Fragment ：ExampleFragment
        final mFragment fragment = new mFragment();

        // 步骤4：动态添加fragment
        // 即将创建的fragment添加到Activity布局文件中定义的占位符中（FrameLayout）
        fragmentTransaction.add(R.id.fragment_container, fragment);
        fragmentTransaction.commit();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 通过接口回调将消息从fragment发送到Activity
                fragment.sendMessage(new ICallBack() {
                    @Override
                    public void get_message_from_Fragment(String string) {
                            text.setText(string);
                    }
                });

            }
        });
    }


}
