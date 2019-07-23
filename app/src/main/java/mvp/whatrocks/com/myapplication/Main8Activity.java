package mvp.whatrocks.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Main8Activity extends AppCompatActivity {
    EditText et_firstname;
    Button btn_showdata;
    TextView tv_data;
    String str_firstname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        et_firstname= (EditText)findViewById(R.id.et_firstname);
        btn_showdata= (Button)findViewById(R.id.btn_showdata);
        tv_data=(TextView)findViewById(R.id.tv_data);

        btn_showdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                int viewId=v.getId();
                if(viewId==R.id.btn_showdata){
                    str_firstname=et_firstname.getText().toString().trim();




                    String str = str_firstname;

                    StringBuilder sb = new StringBuilder();

                    for(int i = str.length() - 1; i >= 0; i--)
                    {
                        sb.append(str.charAt(i));
                    }








                    tv_data.setText(sb.toString());
                }

            }
        });
    }
}
