package com.example.searchapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    SearchView searchView;
    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String > adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.editText);
        //searchView = (SearchView) findViewById(R.id.searchView);
        listView = (ListView) findViewById(R.id.lv1);

        list = new ArrayList<>();
        list.add("Apple");
        list.add("Liam");
        list.add("Noah");
        list.add("William ");
        list.add("James");
        list.add("Oliver");
        list.add("Benjamin");
        list.add("Elijah");
        list.add("Lucas");
        list.add("Mason");
        list.add("Logan");
        list.add("Alexander");
        list.add("Ethan");
        list.add("Jacob");
        list.add("Michael");
        list.add("Daniel ");
        list.add("Henry	");
        list.add("Jackson");
        list.add("Sebastian");
        list.add("Aiden	");
        list.add("Matthew");
        list.add("Samuel");
        list.add("David");
        list.add("Joseph");
        list.add("Carter");
        list.add("Owen");
        list.add("Wyatt");
        list.add("John");
        list.add("Jack");
        list.add("Luke");
        list.add("Jayden");
        list.add("Dylan	");
        list.add("Grayson");
        list.add("Levi");
        list.add("Isaac");
        list.add("Gabriel");
        list.add("Julian");
        list.add("	Mateo");
        list.add("Anthony");
       list.add("Lincoln");
        list.add("Joshua");
        list.add("Christopher");
        list.add("Andrew");
        list.add("Theodore");
        list.add("Caleb");
        list.add("Ryan");
        list.add("Asher");
        list.add("Nathan");
        list.add("Thomas ");
        list.add("Leo");
        list.add("Isaiah");
                                                                                list.add("Charles");
                                                                                list.add("Josiah");
                                                                                list.add("Hudson");
                                                                                list.add("Christian");
                                                                                list.add("Hunter");
                                                                                list.add("Connor");
                                                                                list.add("	Eli");
                                                                                list.add("Ezra");
                                                                                list.add("Aaron");
                                                                                list.add("Landon");
                                                                                list.add("Adrian");
                                                                                list.add("Jonathan");
                                                                                list.add("Nolan");
                                                                                list.add("Jeremiah");
                                                                                list.add("Easton");
                                                                                list.add("	Elias	");
                                                                                        list.add("Ariana");
                                                                                list.add("Cameron");
                                                                                list.add("Carson");
                                                                                list.add("Robert");
                                                                                list.add("	Maverick");
                                                                                list.add("Nicholas");
                                                                                list.add("	Dominic");
                                                                                list.add("Jaxson");
                                                                                list.add("Greyson");
                                                                                list.add("Adam");
                                                                                list.add("Ian");
                                                                                list.add("	Austin");
                                                                                list.add("Santiago");
                                                                                list.add("Jordan");
                                                                                list.add("Cooper");
                                                                                list.add("Brayden");
                                                                                list.add("Roman");
                                                                                list.add("Evan");
                                                                                list.add("Ezekiel");
                                                                                list.add("Xavier");
                                                                                list.add("Jose");
                                                                                list.add("Jace");
                                                                                list.add("Jameson");
                                                                                list.add("Leonardo");
                                                                                list.add("Bryson");
                                                                                list.add("Axel");
                                                                                list.add("Everett");
                                                                                list.add("Parker");
                                                                                list.add("Kayden");
                                                                                list.add("Miles");
        list.add("Sawyer");
        list.add("Jason");
        list.add("Apple");
        list.add("Banana");
        list.add("Pineapple");
        list.add("Orange");
        list.add("Lychee");
        list.add("Gavava");
        list.add("Peech");
        list.add("Melon");
        list.add("Watermelon");
        list.add("Papaya");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);
        editText.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                adapter.getFilter().filter(cs);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
                Toast.makeText(getApplicationContext(),"before text change",Toast.LENGTH_LONG).show();
            }

            @Override
            public void afterTextChanged(Editable arg0) {
                Toast.makeText(getApplicationContext(),"Results",Toast.LENGTH_LONG).show();
            }
        });




    }
}