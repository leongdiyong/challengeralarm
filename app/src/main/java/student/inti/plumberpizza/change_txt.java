package student.inti.plumberpizza;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class change_txt extends AppCompatActivity {

    Button btn_chgdone;
    EditText txt_chgtxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_txt);
        btn_chgdone=(Button)findViewById(R.id.btn_chgdone);
        txt_chgtxt=(EditText)findViewById(R.id.txt_chgtxt);

        //change challenging text
        btn_chgdone.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                TextView txt_dismiss=(TextView)findViewById(R.id.txt_dismiss);
                txt_dismiss.setText(txt_chgtxt.getText());

                Intent signUp=new Intent(change_txt.this,activity_dismiss.class);
                startActivity(signUp);
            }
        });
    }


}
