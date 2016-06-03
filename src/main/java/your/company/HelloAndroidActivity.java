package your.company;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HelloAndroidActivity extends AppCompatActivity {

    @BindView(R.id.button)
    Button button;

    @BindView(R.id.textView)
    TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @OnClick(R.id.button)
    public void onClick(){
        textView.setText(textView.getText() + "OnClick");
        Toast.makeText(this, "onClick", Toast.LENGTH_LONG).show();
    }
}

