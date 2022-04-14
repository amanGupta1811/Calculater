package com.aman19emccs009.caculatorui;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button but9,but8,but7,but6,but5,but4,but3,but2,but1,but0,butDot,butAdd,butSub,butMul,butDiv,butPer,butEqul,butClear,butAClear,butPow,butFac;
    EditText screenView;
    String lastAction,s1;
    ArrayList <String> num = new ArrayList<>();
    int j=0;
    double firstValue,secondValue;
    float result;
    public void delete(){
        screenView.setText("");
        result = 0;
        lastAction = "";
        firstValue = 0;
        secondValue = 0;
        s1 = "";
        while (!num.isEmpty()){
            num.remove(j-1);
            j--;
        } }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but9 = findViewById(R.id.but9);
        but8 = findViewById(R.id.but8);
        but7 = findViewById(R.id.but7);
        but6 = findViewById(R.id.but6);
        but5 = findViewById(R.id.but5);
        but4 = findViewById(R.id.but4);
        but3 = findViewById(R.id.but3);
        but2 = findViewById(R.id.but2);
        but1 = findViewById(R.id.but1);
        but0 = findViewById(R.id.but0);
        butDot = findViewById(R.id.butDot);
        butAdd= findViewById(R.id.butAdd);
        butSub = findViewById(R.id.butSub);
        butMul = findViewById(R.id.butMul);
        butDiv = findViewById(R.id.butDiv);
        butPer = findViewById(R.id.butPer);
        butEqul = findViewById(R.id.butEqul);
        butClear = findViewById(R.id.butClear);
        butAClear = findViewById(R.id.butAClear);
        butPow = findViewById(R.id.butPow);
        butFac = findViewById(R.id.butFac);
        screenView = findViewById(R.id.screenView);

        but0.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            screenView.setText(screenView.getText()+"0");
            num.add("0");
            j++;
        }
    });
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screenView.setText(screenView.getText()+"1");
                num.add("1");
                j++;
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screenView.setText(screenView.getText()+"2");
                num.add("2");
                j++;
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screenView.setText(screenView.getText()+"3");
              num.add("3");
              j++;
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screenView.setText(screenView.getText()+"4");
               num.add("4");
                j++;
            }
        });
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screenView.setText(screenView.getText()+"5");
               num.add("5");
                j++;
            }
        });
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screenView.setText(screenView.getText()+"6");
                num.add("6");
                j++;
            }
        });
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screenView.setText(screenView.getText()+"7");
                num.add("7");
                j++;
            }
        });
        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screenView.setText(screenView.getText()+"8");
                num.add("8");
                j++;
            }
        });
        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screenView.setText(screenView.getText()+"9");
                num.add("9");
                j++;
            }
        });
        butDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screenView.setText(screenView.getText()+".");
                num.add(".");
                j++;
            }
        });
        butAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    firstValue = Float.parseFloat(screenView.getText() + "");
                   lastAction = "+";
                   screenView.setText(null);
                }
                catch(NumberFormatException e){
                    Toast.makeText(getApplicationContext(), "Syntex Erroe", Toast.LENGTH_SHORT).show();
               } }
        });
        butSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    firstValue = Float.parseFloat(screenView.getText() + "");
                    lastAction = "-";
                    screenView.setText(null);
                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Syntex Error", Toast.LENGTH_SHORT).show();
                } }
        });
        butMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    firstValue = Float.parseFloat(screenView.getText() + "");
                    lastAction = "*";
                    screenView.setText(null);
                }
                catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Syntex Error", Toast.LENGTH_SHORT).show();
                } }
        });
        butDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    firstValue = Float.parseFloat(screenView.getText() + "");
                    lastAction = "/";
                    screenView.setText(null);
                }
                catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Syntex Error", Toast.LENGTH_SHORT).show();
                } }
        });
        butPer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    firstValue = Float.parseFloat(screenView.getText()+"");
                    lastAction = "%";
                    screenView.setText(null);
                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Syntex Error", Toast.LENGTH_SHORT).show();
                } }
        });
        butPow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    firstValue = Float.parseFloat(screenView.getText()+"");
                    lastAction = "^";
                    screenView.setText(null);
                }
                catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Syntex Error", Toast.LENGTH_SHORT).show();
                } }
        });
        butFac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lastAction = "!";
                int x = Integer.parseInt(screenView.getText() + "");
                if(x<65){
                    long y = x;
                    while (x != 1) {
                       y = y * (x - 1);
                        x--; }
                    screenView.setText(y + "");
                }else{
                    Toast.makeText(getApplicationContext(), "Number Is To Long", Toast.LENGTH_SHORT).show();
                } }
        });
        butEqul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    secondValue = Float.parseFloat(screenView.getText() + "");
                    if (lastAction == "+") {
                        result = (float)(firstValue + secondValue);
                        screenView.setText(result + "");
                        num.clear();
                        j=0;
                        s1 = screenView.getText().toString();
                        num.add(s1);
                        j++; }
                    if (lastAction == "-") {
                        result = (float)(firstValue - secondValue);
                        screenView.setText(result + "");
                        num.clear();
                        j=0;
                        s1 = screenView.getText().toString();
                        num.add(s1);
                        j++; }
                    if (lastAction == "*") {
                        result = (float)(firstValue * secondValue);
                        screenView.setText(result + "");
                        num.clear();
                        j=0;
                        s1 = screenView.getText().toString();
                        num.add(s1);
                        j++; }
                    if (lastAction == "/") {
                        result = (float)(firstValue / secondValue);
                        screenView.setText(result + "");
                        num.clear();
                        j=0;
                        s1 = screenView.getText().toString();
                        num.add(s1);
                        j++; }

                    if(lastAction == "%"){
                        result= (float) ((firstValue/secondValue)*100);
                        screenView.setText(result+"%");
                        num.clear();
                        j=0;
                        s1 = screenView.getText().toString();
                        num.add(s1);
                        j++; }

                    if(lastAction == "^"){
                        result = (float) Math.pow(firstValue,secondValue);
                        screenView.setText(result + "");
                        num.clear();
                        j=0;
                        s1 = screenView.getText().toString();
                        num.add(s1);
                        j++; }
                }
                catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Syntex Error", Toast.LENGTH_SHORT).show();
                } }
        });
        butClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    num.remove(j-1);
                        j--;
                        String lastValue[] = new String[j];
                        for (int i = 0; i < j; i++) {
                            lastValue[i] = num.get(i);
                            screenView.setText(null); }
                        for (String k : lastValue) {
                            screenView.setText(screenView.getText() + k); }
                        if(j<=0) {
                            delete(); }
                        if(lastAction=="!"){
                            delete(); }
                }
                catch (Exception e){
                   delete();
                } }
        });
        butAClear.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              delete();
          }
      });
    }}