package sg.edu.rp.c346.id18054367.demoarrayarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    ArrayList<String> fruits;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("ArrayLists");

        fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add(3,"durian");
        fruits.add(-1, "dragon fruit");
        fruits.remove(0);

        String theFruit = fruits.get(1);

        tv = findViewById(R.id.textView);

        String text = "Fruits\n";
        text += "=====\n";

        for (int i = 0; i < fruits.size(); i++){
            text += fruits.get(i) +"\n";
        }

        tv.setText(text);
    }
}
