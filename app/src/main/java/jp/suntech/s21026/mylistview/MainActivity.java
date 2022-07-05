package jp.suntech.s21026.mylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvMenu = findViewById(R.id.lvMenu);
        lvMenu.setOnItemClickListener(new ListItemCliskListerner());
    }

    private class ListItemCliskListerner implements AdapterView.OnItemClickListener{

        @Override
        public void onItemClick(AdapterView<?>parent, View view, int position, long id){

//            String item =(String)parent.getItemAtPosition(position);
            TextView tvText=(TextView)view;
            String item = tvText.getText().toString();
            String show ="選んだ国："+item;

            TextView output =findViewById(R.id.text1);

            output.setText(show);
        }

    }
}