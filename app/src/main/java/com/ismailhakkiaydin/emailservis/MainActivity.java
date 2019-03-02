package com.ismailhakkiaydin.emailservis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MailHelper mail = new MailHelper(this);
        mail.Send("ihaydin7@gmail.com", " Merhaba","Bu bir test mailidir. Emülatörden yollanmıştır...");

    }
}
