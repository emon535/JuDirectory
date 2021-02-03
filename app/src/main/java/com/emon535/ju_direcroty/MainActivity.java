package com.emon535.ju_direcroty;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate( Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickfindTeacher(View view){
        System.out.println("Clicked on the button to do something inside the function");
        TextView tv_teacherInfo = (TextView) findViewById(R.id.textView_teacher_info);

        Spinner dataCategory = (Spinner) findViewById(R.id.spinner_category);
        String selectedSpinnerValue = String.valueOf(dataCategory.getSelectedItem());
        TeachersDirectory universityTeacherDirectory = new TeachersDirectory();
        List<String> selectedTeachersList = universityTeacherDirectory.getTeachersbyUniversityName(selectedSpinnerValue);

        StringBuilder teachersNameString = new StringBuilder();
        for(String teacherName: selectedTeachersList){
            teachersNameString.append(teacherName).append("\n");
        }
        tv_teacherInfo.setText(teachersNameString);
    }

    public void onSendButtonClick(View view){
        System.out.println("called the on send button clicked");
        Intent intent = new Intent(this, ReceiveMessage.class);
        startActivity(intent);

    }
}
