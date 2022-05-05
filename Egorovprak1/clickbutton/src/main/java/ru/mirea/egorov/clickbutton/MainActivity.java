package ru.mirea.egorov.clickbutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button btnOk;
    private Button btnCancel;
    private TextView textView;

    View.OnClickListener ocBtnOk = new View.OnClickListener(){
        @Override
        public void onClick(View w){
            textView.setText("Нажата кнопка OK");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnOk = (Button) findViewById(R.id.btnOK);
        btnCancel = (Button) findViewById(R.id.btnCancel);
        textView = (TextView) findViewById(R.id.tvOut);

        btnOk.setOnClickListener(ocBtnOk);
    }

    public void ClickCancel(View view)
    {
        // выводим сообщение
        Toast.makeText(this, "Ещё один способ!", Toast.LENGTH_SHORT).show();
        textView.setText("Нажата кнопка Cancel");
    }
}