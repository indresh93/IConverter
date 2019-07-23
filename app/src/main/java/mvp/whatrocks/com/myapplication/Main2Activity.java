package mvp.whatrocks.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    EditText et_firstname;
    Button btn_showdata;
    TextView tv_data;
    String str_firstname;
    String inny="yes";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        et_firstname= (EditText)findViewById(R.id.et_firstname);
        btn_showdata= (Button)findViewById(R.id.btn_showdata);
        tv_data=(TextView)findViewById(R.id.tv_data);
        btn_showdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int viewId=v.getId();
                if(viewId==R.id.btn_showdata){
                    str_firstname=et_firstname.getText().toString().trim();
                           inny=str_firstname;
                    String str = inny;
                    String result = "";
                    char[] messChar = str.toCharArray();

                    for (int i = 0; i < messChar.length; i++) {
                        result += Integer.toBinaryString(messChar[i]) + " ";

                    }

                    tv_data.setText(result);



                }

            }

        });


    }

}
