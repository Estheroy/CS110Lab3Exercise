package com.android.cs110lab3exercise.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.cs110lab3exercise.MainActivity;

/**
 * Created by XuanpeiEstherOuyang on 4/17/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;
    public JUnit_test(){

        super(MainActivity.class);
    }

    public void test_add(){

        mainActivity = getActivity();

        /*
        EditText e1 = (EditText)mainActivity.findViewById(com.android.cs110lab3exercise.R.id.ed1);
        EditText e2 = (EditText)mainActivity.findViewById(com.android.cs110lab3exercise.R.id.ed2);

        Button bu = (Button)mainActivity.findViewById(com.android.cs110lab3exercise.R.id.button);

        e1.setText("1");
        e2.setText("1");

        bu.performClick();

        TextView result = (TextView)mainActivity.findViewById(com.android.cs110lab3exercise.R.id.res);
        int res = Integer.parseInt(result.getText().toString());
        */
        assertEquals(mainActivity.sum(1,1), 2);
    }

}
