package mvp.whatrocks.com.myapplication;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static java.nio.charset.StandardCharsets.*;

public class Main5Activity extends AppCompatActivity {
    EditText et_firstname;
    Button btn_showdata;
    TextView tv_data;
    String str_firstname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        et_firstname= (EditText)findViewById(R.id.et_firstname);
        btn_showdata= (Button)findViewById(R.id.btn_showdata);
        tv_data=(TextView)findViewById(R.id.tv_data);

        btn_showdata.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {


                int viewId=v.getId();
                if(viewId==R.id.btn_showdata){
                    str_firstname=et_firstname.getText().toString().trim();



                    byte[] ascii = str_firstname.getBytes(US_ASCII);
                    String asciiString = Arrays.toString(ascii);




                    tv_data.setText(asciiString);
                }
            }
        });
    }
}
