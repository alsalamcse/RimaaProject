package agha.rimaa.rimaaproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LogInActivity extends AppCompatActivity
{
    private EditText etEmail;
    private EditText etPassw;
    private Button btnSignUp;
    private Button btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        etEmail= (EditText) findViewById(R.id.etEmail);
        etPassw= (EditText) findViewById(R.id.etPassw);
        btnSignIn= (Button) findViewById(R.id.btnSignIn);
        btnSignUp= (Button) findViewById(R.id.btnSignUp);
    }
}
