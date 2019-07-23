package mvp.whatrocks.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main7Activity extends AppCompatActivity {

    EditText et_firstname;
    Button btn_showdata;
    TextView tv_data;
    String str_firstname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        et_firstname= (EditText)findViewById(R.id.et_firstname);
        btn_showdata= (Button)findViewById(R.id.btn_showdata);
        tv_data=(TextView)findViewById(R.id.tv_data);
        btn_showdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int viewId=v.getId();
                if(viewId==R.id.btn_showdata){
                    str_firstname=et_firstname.getText().toString().trim();


                    String hex = str_firstname;

                    if(hex.length()%2!=0){


                        tv_data.setText("Invalid hex");
                        return;
                    }

                    StringBuilder builder = new StringBuilder();

                    for (int i = 0; i < hex.length(); i = i + 2) {
                        // Step-1 Split the hex string into two character group
                        String s = hex.substring(i, i + 2);
                        // Step-2 Convert the each character group into integer using valueOf method
                        int n = Integer.valueOf(s, 16);
                        // Step-3 Cast the integer value to char
                        builder.append((char)n);
                    }
               //68 65 6c 6c 6f





                    tv_data.setText(builder.toString());
                }
            }
        });
    }
}
