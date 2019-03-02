package com.ismailhakkiaydin.emailservis;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class MailHelper {

    private Context context;

    public MailHelper(Context context) {
        this.context = context;
    }

    public void Send(String to[], String[] cc, String[] bcc, String subject, String message ){
        Intent i = new Intent(Intent.ACTION_SEND);

        i.setData(Uri.parse("mailto:"));
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL,to);
        i.putExtra(Intent.EXTRA_CC,cc);
        i.putExtra(Intent.EXTRA_BCC,bcc);
        i.putExtra(Intent.EXTRA_SUBJECT,subject);
        i.putExtra(Intent.EXTRA_TEXT, message);
        Intent secim = Intent.createChooser(i,"E-POSTA");
        context.startActivity(secim);

    }

    public void Send(String to[],String[] cc, String subject, String message){
        Send(to,cc,null,subject,message);
    }

    public void Send(String to[], String subject, String message){
        Send(to,null,subject,message);
    }

    public void Send(String to, String subject, String message){
        Send(new String[] {to},null,subject,message);
    }

}
