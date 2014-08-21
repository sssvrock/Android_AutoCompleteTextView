package view.autocompletetext.com.autocompletetextview;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.AutoCompleteTextView;


public class AutoCompleteTextViewDemo extends Activity {

    AutoCompleteTextView autoCompleteTextView;
    TextView autoCompleteTextViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text_view);

        //Getting the instance of AutoCompleteTextView
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        autoCompleteTextViewResult = (TextView)findViewById(R.id.result);

        // array as a resource for the Autocomplete textview, It will display the list of array details in it.
        String[] arrayColors = {"White", "Grey", "Green", "Gold", "Yellow", "Red", "Blue - light", "Blue - Navy"};


        //Creating the instance of ArrayAdapter containing list of actor names
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,arrayColors);

        autoCompleteTextView.setThreshold(1);//will start working from first character
        autoCompleteTextView.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView
        autoCompleteTextView.setTextColor(Color.MAGENTA);




        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                // Display the selected text in autocomplete textview
               autoCompleteTextViewResult.setText("Oh..... "+autoCompleteTextView.getText() + " .. Nice color ");

            }
        });

    }

}
