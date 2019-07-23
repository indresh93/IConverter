package mvp.whatrocks.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class forgetpassword extends AppCompatActivity {



    public static final Pattern PASSWORD_PATTERN = Pattern.compile("^" +
            "(?=.*[0-9])"+
            "(?=.*[A-Z])"+
            "(?=.*[a-z])"+
            "(?=.*[@#$^&+=%])"+
            "(?=\\S+$)"+
            ".{4,}"+
            "$");

    public static final Pattern EMAIL_ADDRESS = Pattern.compile("[a-zA-z0-9\\+\\_\\%\\-\\+]{1,256}"+
            "\\@"+"[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}"+
            "("+"\\."+"[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}"+")+");


    Button LogInButton, RegisterButton , UpdateButton ;
    EditText Email, Password, con;
    String EmailHolder, PasswordHolder,ConfrompassHolder;
    Boolean EditTextEmptyHolder;
    SQLiteDatabase sqLiteDatabaseObj;
    SQLiteHelper sqLiteHelper;
    Cursor cursor;
    String TempPassword = "NOT_FOUND" ;
    public static final String UserEmail = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgetpassword);



        Email = (EditText)findViewById(R.id.Email);
        Password = (EditText)findViewById(R.id.Password);
        con = (EditText)findViewById(R.id.conformpass);




        UpdateButton = (Button)findViewById(R.id.update);

        sqLiteHelper = new SQLiteHelper(this);

        UpdateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Getting value from All EditText and storing into String Variables.
                EmailHolder = Email.getText().toString();
                PasswordHolder = Password.getText().toString();
                ConfrompassHolder = con.getText().toString();

                // Checking EditText is empty or no using TextUtils.
                if( TextUtils.isEmpty(EmailHolder) || TextUtils.isEmpty(PasswordHolder) || TextUtils.isEmpty(PasswordHolder)) {

                    Toast.makeText(forgetpassword.this, "Enter details", Toast.LENGTH_SHORT).show();


                }
                else if(!ConfrompassHolder.equals(PasswordHolder)){

                    Toast.makeText(forgetpassword.this, "Password not match", Toast.LENGTH_SHORT).show();
                    }


                else if(!PASSWORD_PATTERN.matcher(PasswordHolder).matches()){
                    Toast.makeText(forgetpassword.this, "Password too weak", Toast.LENGTH_SHORT).show();

                }

                else if(!EMAIL_ADDRESS.matcher(EmailHolder).matches()){
                    Toast.makeText(forgetpassword.this, "Enter invalid email address", Toast.LENGTH_SHORT).show();

                }
                else {

                    sqLiteHelper.updateRecord(Email.getText().toString(), Password.getText().toString());
                    Toast.makeText(forgetpassword.this, "Updated Successfully", Toast.LENGTH_SHORT).show();

                    // Toast.makeText(forgetpassword.this, "Password not match", Toast.LENGTH_SHORT).show();
                }


            }
        });




    }
}
