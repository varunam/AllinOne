package listview.mytextview.com.allinone;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = (ListView) findViewById(R.id.listView);

        final String[] Values = new String[]{
                "Temperature Controller - All",
                "Check My Blogging Website",
                "Follow me on Facebook",
                "Follow me on Twitter",
                "Follow me on Instagram",
                "Follow me on Slideshare",
                "Take a look at my Skydiving!",
                "Check my Linked in Profile",
                "Subscribe to my Youtube Channel",
                "Coming Soon",
                "Coming Soon",
                "Coming Soon",
                "Coming Soon",
                "Coming Soon",
                "Coming Soon",
                "Coming Soon",
                "Coming Soon",
                "Coming Soon",
                "Coming Soon",
                "Coming Soon",
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,android.R.id.text1,Values);

        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int intposition = position;
                switch(position)
                {
                    case 0:
                        Intent firstIntent = new Intent(MainActivity.this, TempControlAll.class);
                        startActivity(firstIntent);
                        break;
                    case 1:
                        Intent secondIntent = new Intent(Intent.ACTION_VIEW);
                        secondIntent.setData(Uri.parse("http://varunvgnc.wixsite.com/storyteller"));
                        startActivity(secondIntent);
                        break;
                    case 2:
                        Intent thirdIntent = new Intent(Intent.ACTION_VIEW);
                        thirdIntent.setData(Uri.parse("https://www.facebook.com/varun.gupta.148"));
                        startActivity(thirdIntent);
                        break;
                    default:
                        //String text = listview.getItemAtPosition(intposition).toString();
                        //the above line of code displays the string given to item
                        Toast.makeText(getApplicationContext(),"Coming soon! Keep watching me!!",Toast.LENGTH_LONG).show();
                }
            }
        });

        }
    }
