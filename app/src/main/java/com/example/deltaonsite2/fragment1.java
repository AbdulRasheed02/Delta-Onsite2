package com.example.deltaonsite2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.text.DecimalFormat;

public class fragment1 extends Fragment {

    SharedViewModel viewModel;
    TextView inputText;
    Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0,btn_add,btn_sub,btn_div,btn_mul,btn_plusMin,btn_AC,btn_percent,btn_equal,btn_decimal;
    FloatingActionButton btn_backSpace;
    Boolean secondTerm=false;
    Boolean noOperator=true;
    Boolean noDecimal1=true,noDecimal2=true;

    Double result;

    Double inputValue,inputValue2;
    String input, input2;
    String operator;

    DecimalFormat numberFormat,format;
    String result1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_fragment1, container, false);
        viewModel = ViewModelProviders.of(getActivity()).get(SharedViewModel.class);

        inputText = v.findViewById(R.id.inputText);

        numberFormat = new DecimalFormat("#.00000000");
        format = new DecimalFormat("0.########");

        btn_1 = v.findViewById(R.id.bu1);
        btn_2 = v.findViewById(R.id.bu2);
        btn_3 = v.findViewById(R.id.bu3);
        btn_4 = v.findViewById(R.id.bu4);
        btn_5 = v.findViewById(R.id.bu5);
        btn_6 = v.findViewById(R.id.bu6);
        btn_7 = v.findViewById(R.id.bu7);
        btn_8 = v.findViewById(R.id.bu8);
        btn_9 = v.findViewById(R.id.bu9);
        btn_0 = v.findViewById(R.id.bu0);
        btn_add = v.findViewById(R.id.buPlus);
        btn_sub = v.findViewById(R.id.buMinus);
        btn_div = v.findViewById(R.id.buDivide);
        btn_mul = v.findViewById(R.id.buMultiply);
        btn_plusMin = v.findViewById(R.id.buPlusMinus);
        btn_AC = v.findViewById(R.id.buAC);
        btn_percent = v.findViewById(R.id.buPercent);
        btn_equal = v.findViewById(R.id.buEqual);
        btn_decimal = v.findViewById(R.id.buDot);
        btn_backSpace=v.findViewById(R.id.buBackSpace);

        result=0.0;
        inputValue=0.0;
        inputValue2=0.0;

        input="";
        input2 ="";

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberEvent(btn_1);
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberEvent(btn_2);
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberEvent(btn_3);
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberEvent(btn_4);
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberEvent(btn_5);
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberEvent(btn_6);
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberEvent(btn_7);
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberEvent(btn_8);
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberEvent(btn_9);
            }
        });

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberEvent(btn_0);
            }
        });

        btn_decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberEvent(btn_decimal);
            }
        });

        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equalEvent(btn_equal);
            }
        });

        btn_plusMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberEvent(btn_plusMin);
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorEvent(btn_div);
            }
        });

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorEvent(btn_add);
            }
        });

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorEvent(btn_sub);
            }
        });

        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorEvent(btn_mul);
            }
        });

        btn_AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acEvent(btn_AC);
            }
        });

        btn_percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                percentEvent(btn_percent);
            }
        });

        btn_backSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backSpaceEvent();
            }
        });
        return v;
    }

    public void numberEvent(View view) {
        switch (view.getId()){
            case R.id.bu1:
                input += "1";
                if(secondTerm){
                    input2 +="1";
                }
                break;
            case R.id.bu2:
                input += "2";
                if(secondTerm){
                    input2 +="2";
                }
                break;
            case R.id.bu3:
                input += "3";
                if(secondTerm){
                    input2 +="3";
                }
                break;
            case R.id.bu4:
                input += "4";
                if(secondTerm){
                    input2 +="4";
                }
                break;
            case R.id.bu5:
                input += "5";
                if(secondTerm){
                    input2 +="5";
                }
                break;
            case R.id.bu6:
                input += "6";
                if(secondTerm){
                    input2 +="6";
                }
                break;
            case R.id.bu7:
                input += "7";
                if(secondTerm){
                    input2 +="7";
                }
                break;
            case R.id.bu8:
                input += "8";
                if(secondTerm){
                    input2 +="8";
                }
                break;
            case R.id.bu9:
                input += "9";
                if(secondTerm){
                    input2 +="9";
                }
                break;
            case R.id.bu0:
                input += "0";
                if(secondTerm){
                    input2 +="0";
                }
                break;
            case R.id.buDot:
                if(noDecimal1){
                    input += ".";
                    noDecimal1=false;
                }
                if(secondTerm && noDecimal2){
                    input2 +=".";
                    input += ".";
                    noDecimal2=false;
                }
                break;
            case R.id.buPlusMinus:
                if(noOperator && !input.isEmpty() && input.charAt(0)=='-') {
                    input=input.substring(1);
                }
                else if(noOperator && input.length()>0){
                    input="-"+input;
                }
                break;

        }
        inputText.setText(input);
    }

    public void operatorEvent(View view) {
        if(noOperator && !input.isEmpty() && !(input.equals(".")) && !(input.charAt(input.length() - 1) == '.')){
            inputValue = Double.parseDouble(inputText.getText().toString());
            noDecimal1=false;
            switch (view.getId()) {
                case R.id.buDivide:
                    input += "/";
                    operator ="/";
                    break;
                case R.id.buMultiply:
                    input += "*";
                    operator ="*";
                    break;
                case R.id.buPlus:
                    input += "+";
                    operator ="+";
                    break;
                case R.id.buMinus:
                    input += "-";
                    operator ="-";
                    break;
            }
            inputText.setText(input);
            noOperator =false;
            secondTerm=true;
        }
    }

    public void equalEvent(View view) {
        result = 0.0;
        if(noOperator==false && !input2.isEmpty() && !(input2.equals(".")) && !(input2.charAt(input2.length() - 1) == '.')) {
            if (secondTerm) {
                inputValue2 = Double.parseDouble(input2);
            }

            switch (operator) {
                case "+":
                    result = inputValue + inputValue2;
                    result1=numberFormat.format(result);
                    updateViewModel(format.format(Double.parseDouble(result1)));
                    inputText.setText("");
                    noDecimal1=true;
                    noDecimal2=true;
                    noOperator = true;
                    secondTerm = false;
                    operator = "";
                    break;

                case "-":
                    result = inputValue - inputValue2;
                    result1=numberFormat.format(result);
                    updateViewModel(format.format(Double.parseDouble(result1)));
                    inputText.setText("");
                    noOperator = true;
                    noDecimal1=true;
                    noDecimal2=true;
                    secondTerm = false;
                    operator = "";
                    break;

                case "*":
                    result = inputValue * inputValue2;
                    result1=numberFormat.format(result);
                    updateViewModel(format.format(Double.parseDouble(result1)));
                    inputText.setText("");
                    noOperator = true;
                    noDecimal1=true;
                    noDecimal2=true;
                    secondTerm = false;
                    operator = "";
                    break;

                case "/":
                    if(inputValue2!=0) {
                        result = inputValue / inputValue2;
                        result1=numberFormat.format(result);
                        updateViewModel(format.format(Double.parseDouble(result1)));
                    }
                    else{
                        updateViewModel("Not Defined");
                    }
                    inputText.setText("");
                    noOperator = true;
                    noDecimal1=true;
                    noDecimal2=true;
                    secondTerm = false;
                    operator = "";
                    break;
            }
            result = 0.0;
            inputValue = 0.0;
            inputValue2 = 0.0;

            input = "";
            input2 = "";
        }
    }

    public void acEvent(View view) {
        result=0.0;
        inputValue=0.0;
        inputValue2=0.0;

        input="";
        inputText.setText("0");
        input2 ="";

        noOperator =true;
        secondTerm=false;
        operator ="";
        noDecimal1=true;
        noDecimal2=true;

        updateViewModel("");
    }

    public void percentEvent(View view) {
        if(noOperator && !input.isEmpty()) {
            double no = Double.parseDouble(inputText.getText().toString()) / 100;
            updateViewModel(String.valueOf(no));
        }
    }

    private void backSpaceEvent() {
        if(input!= null && input.length() > 0 && input.charAt(input.length() - 1) == '+') {
            input = input.substring(0, input.length() - 1);
            inputText.setText(input);
            secondTerm=false;
            noOperator=true;
        }
        else if(input!= null && input.length() > 0 && input.charAt(input.length() - 1) == '-') {
            input = input.substring(0, input.length() - 1);
            inputText.setText(input);
            noOperator=true;
            secondTerm=false;
        }
        else if(input!= null && input.length() > 0 && input.charAt(input.length() - 1) == '*') {
            input = input.substring(0, input.length() - 1);
            inputText.setText(input);
            noOperator=true;
            secondTerm=false;
        }
        else if(input!= null && input.length() > 0 && input.charAt(input.length() - 1) == '/') {
            input = input.substring(0, input.length() - 1);
            inputText.setText(input);
            secondTerm=false;
            noOperator=true;
        }
        else if(input2!= null && input2.length() > 0 && secondTerm && input2.charAt(input2.length() - 1) == '.') {
            noDecimal2=true;
            input2 = input2.substring(0, input2.length() - 1);
            input = input.substring(0, input.length() - 1);
            inputText.setText(input);
        }
        else if(input2!= null && input2.length() > 0 && secondTerm) {
            input2 = input2.substring(0, input2.length() - 1);
            input = input.substring(0, input.length() - 1);
            inputText.setText(input);
        }
        else if(input!= null && input.length() > 0 && input.charAt(input.length() - 1) == '.'){
            noDecimal1=true;
            input = input.substring(0, input.length() - 1);
            inputText.setText(input);
        }
        else if(input!= null && input.length() > 0){
            input = input.substring(0, input.length() - 1);
            inputText.setText(input);
        }

    }

    private void updateViewModel(String yourItem){
        viewModel.setItem(yourItem);
    }

}