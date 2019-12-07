package student.inti.plumberpizza;

import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class activity_dismiss extends AppCompatActivity {

    EditText txt_done,txt_chgtxt;
    Button btn_done,btn_chgtxt,btn_chgdone;
    AudioManager am;
    TextView txt_dismiss;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dismiss);
        Button btn_done;
        btn_done=(Button)findViewById(R.id.btn_done);
        txt_done=(EditText)findViewById(R.id.txt_done);
        txt_dismiss=(TextView)findViewById(R.id.txt_dismiss);
        btn_chgtxt=(Button)findViewById(R.id.btn_chgtxt);
        btn_chgdone=(Button)findViewById(R.id.btn_chgdone);

        btn_done.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (txt_done.getText().toString().equals(txt_dismiss.getText()))
                {
                    am.setRingerMode(0);
                }
            }
        });

        btn_chgtxt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent signUp=new Intent(activity_dismiss.this,change_txt.class);
                startActivity(signUp);
            }
        });


    }



}
