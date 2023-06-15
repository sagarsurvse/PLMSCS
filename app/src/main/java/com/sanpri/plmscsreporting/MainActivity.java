package com.sanpri.plmscsreporting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {
    String[] branchName = {"Head Office","Main Branch","Yedshi Branch","Bembali Branch","Kajala Branch","Wagholi Branch","Kallamb Branch","Khamaswadi Branch","Murud Branch","Ter Branch",
            "Dahiphal Branch",
            "Anandnagar Branch",
            "Washi Branch",
            "Bhoom Branch",
            "Tuljapur Branch",
            "Paranda Branch",
            "Ujani Branch",
            "Ausa Branch",
            "Latur branch",
            "Udgir Branch",
            "Yermala Branch",
            "Matola Branch",
            "Shiradhon Branch",
            "Lohara Branch",
            "UMARGA BRANCH",
            "BRANCH TERKHEDA"};

    String[] postion = {"CEO",
            "GENRAL MANGAER",
            "GOLD LOAN HOD",
            "HR DEPARTMENT HOD",
            "IT DEPARTMENT HOD,",
            "FUND DEPARTMENT HOD,",
            "ACCOUNT DEPARTMENT HOD",
            "LOAN DEPARTMENT HOD",
            "AUDIT DEPARTMENT HOD",
            "GOLD LOAN BUSINESS HEAD",
            "GOLD LOAN AUDITOR ",
            "GOLD LOAN AREA MANAGER",
            "HOD ASSISTANT",
            "REGIONAL MANAGER",
            "BRANCH MANGAER",
            "GOLD LOAN MANAGER / INCHARGE",
            "GOLD LOAN EXECUTIVE",
            "CREDIT MANAGER",
            "ASSISTANT BRANCH MANAGER",
            "CLEARK ",
            "CASHIER",
            "TELECALLER",
            "PEON"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spin = (Spinner) findViewById(R.id.spinBrach);
        spin.setOnItemSelectedListener(this);

        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,branchName);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);

        Spinner spin1 = (Spinner) findViewById(R.id.spinPos);
        spin1.setOnItemSelectedListener(this);

        ArrayAdapter aa1 = new ArrayAdapter(this,android.R.layout.simple_spinner_item,postion);
        aa1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(aa1);

    }

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
    }
}