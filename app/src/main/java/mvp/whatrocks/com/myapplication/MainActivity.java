package mvp.whatrocks.com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


           private Button be;
           private Button bd;
           private Button ae;
           private Button ad;
           private Button he;
           private Button hd;
           private Button sha1;
           private Button s2;
           private Button s3;
           private Button s4;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        be = (Button)findViewById(R.id.BinaryEncode);
        be.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });


        ae=(Button)findViewById(R.id.ASCIIEncode);
        ae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main4Activity.class);
                startActivity(intent);
            }
        });
         ad=(Button)findViewById(R.id.ASCIIDecode);
         ad.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this,Main5Activity.class);
                 startActivity(intent);
             }
         });
         he=(Button)findViewById(R.id.HexaEncode);
         he.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this,Main6Activity.class);
                 startActivity(intent);
             }
         });
         hd=(Button)findViewById(R.id.HexaDecode);
         hd.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this,Main7Activity.class);
                 startActivity(intent);
             }
         });
         sha1=(Button)findViewById(R.id.Sha1);
         sha1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this,Main8Activity.class);
                 startActivity(intent);
             }
         });
         s2=(Button)findViewById(R.id.SHA256);
         s2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this,Main9Activity.class);
                 startActivity(intent);

             }
         });
         s3=(Button)findViewById(R.id.SHA512);
         s3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this,Main10Activity.class);
                 startActivity(intent);
             }
         });


    }


}
