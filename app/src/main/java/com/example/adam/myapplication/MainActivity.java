package com.example.adam.myapplication;


import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;





import com.marothiatechs.fragments.Chats;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView myfirsttextview = (TextView) findViewById(R.id.myFirstTextView);
        final Button button = (Button) findViewById(R.id.myfirstButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                myfirsttextview.setText(button.getText());
            }
        });

        final Button button2 = (Button) findViewById(R.id.mySecondButton);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                myfirsttextview.setText(button2.getText());
            }
        });


        final Button buttonMainMenuToChat = (Button) findViewById(R.id.mainMenuToChatActivity);
        buttonMainMenuToChat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                               startActivity(new Intent(getApplicationContext(), Chat.class));

            }
        final class SectionsPagerAdapter extends FragmentPagerAdapter {public SectionsPagerAdapter(FragmentManager fm) {super(fm);}@Override
            public Fragment getItem(int position) {
                if (position == 1) {
                    return new Chats();
                } else
                    return Chat.PlaceholderFragment.newInstance(position + 1);
            }@Override
            public int getCount() {
// Show 3 total pages.
                return 3;
            }@Override
            public CharSequence getPageTitle(int position) {
                Locale l = Locale.getDefault();
                switch (position) {
                    case 0:
                        return getString(R.string.title_section1).toUpperCase(l);
                    case 1:
                        return getString(R.string.title_section2).toUpperCase(l);
                    case 2:
                        return getString(R.string.title_section3).toUpperCase(l);
                }
                return null;
            }
            }


        });

}}
