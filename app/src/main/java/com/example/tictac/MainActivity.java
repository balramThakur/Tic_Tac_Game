package com.example.tictac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private TextView r1c1,r1c2,r1c3,r2c1,r2c2,r2c3,r3c1,r3c2,r3c3;
    private TextView player;
    private boolean gameOver = false;
    private int currentPlayer = 0;
    String checkEmpty = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1c1 = findViewById(R.id.r1c1);
        r1c2 = findViewById(R.id.r1c2);
        r1c3 = findViewById(R.id.r1c3);

        r2c1 = findViewById(R.id.r2c1);
        r2c2 = findViewById(R.id.r2c2);
        r2c3 = findViewById(R.id.r2c3);

        r3c1 = findViewById(R.id.r3c1);
        r3c2 = findViewById(R.id.r3c2);
        r3c3 = findViewById(R.id.r3c3);

        r1c1.setOnClickListener(this);
        r1c2.setOnClickListener(this);
        r1c3.setOnClickListener(this);

        r2c1.setOnClickListener(this);
        r2c2.setOnClickListener(this);
        r2c3.setOnClickListener(this);

        r3c1.setOnClickListener(this);
        r3c2.setOnClickListener(this);
        r3c3.setOnClickListener(this);

        player = findViewById(R.id.player);

        Button resetGame = findViewById(R.id.resetGame);
        resetGame.setOnClickListener(view -> {
            gameOver=false;
            r1c1.setText("");
            r1c2.setText("");
            r1c3.setText("");

            r2c1.setText("");
            r2c2.setText("");
            r2c3.setText("");

            r3c1.setText("");
            r3c2.setText("");
            r3c3.setText("");
        });
    }


    @Override
    public void onClick(View view) {
        if (!gameOver) {
            switch (view.getId()) {
                case R.id.r1c1:
                    if (checkEmpty.equals(r1c1.getText().toString())) {
                        if (player.getText().toString().equals("Turn : O")) {
                            player.setText("Turn : X");
                        } else {
                            player.setText("Turn : O");
                        }
                        if (currentPlayer == 0 && checkEmpty.equals(r1c1.getText().toString())) {
                            currentPlayer = 1;
                            r1c1.setText("O");

                        } else {
                            currentPlayer = 0;
                            r1c1.setText("X");
                        }
                        gameOver = checkForWin();
                    }
                    break;
                case R.id.r1c2:
                    if (checkEmpty.equals(r1c2.getText().toString())) {
                        if (player.getText().toString().equals("Turn : O")) {
                            player.setText("Turn : X");
                        } else {
                            player.setText("Turn : O");
                        }
                        if (currentPlayer == 0 && checkEmpty.equals(r1c2.getText().toString())) {
                            currentPlayer = 1;
                            r1c2.setText("O");
                        } else {
                            currentPlayer = 0;
                            r1c2.setText("X");
                        }
                        gameOver = checkForWin();
                    }
                    break;
                case R.id.r1c3:
                    if (checkEmpty.equals(r1c3.getText().toString())) {
                        if (player.getText().toString().equals("Turn : O")) {
                            player.setText("Turn : X");
                        } else {
                            player.setText("Turn : O");
                        }
                        if (currentPlayer == 0) {
                            currentPlayer = 1;
                            r1c3.setText("O");
                        } else {
                            currentPlayer = 0;
                            r1c3.setText("X");
                        }
                        gameOver = checkForWin();
                    }
                    break;
                case R.id.r2c1:
                    if (checkEmpty.equals(r2c1.getText().toString())) {
                        if (player.getText().toString().equals("Turn : O")) {
                            player.setText("Turn : X");
                        } else {
                            player.setText("Turn : O");
                        }
                        if (currentPlayer == 0) {
                            currentPlayer = 1;
                            r2c1.setText("O");
                        } else {
                            currentPlayer = 0;
                            r2c1.setText("X");
                        }
                        gameOver = checkForWin();
                    }
                    break;
                case R.id.r2c2:
                    if (checkEmpty.equals(r2c2.getText().toString())) {
                        if (player.getText().toString().equals("Turn : O")) {
                            player.setText("Turn : X");
                        } else {
                            player.setText("Turn : O");
                        }
                        if (currentPlayer == 0) {
                            currentPlayer = 1;
                            r2c2.setText("O");
                        } else {
                            currentPlayer = 0;
                            r2c2.setText("X");
                        }
                        gameOver = checkForWin();
                    }
                    break;
                case R.id.r2c3:
                    if (checkEmpty.equals(r2c3.getText().toString())) {
                        if (player.getText().toString().equals("Turn : O")) {
                            player.setText("Turn : X");
                        } else {
                            player.setText("Turn : O");
                        }
                        if (currentPlayer == 0) {
                            currentPlayer = 1;
                            r2c3.setText("O");
                        } else {
                            currentPlayer = 0;
                            r2c3.setText("X");
                        }
                        gameOver = checkForWin();
                    }
                    break;
                case R.id.r3c1:
                    if (checkEmpty.equals(r3c1.getText().toString())) {
                        if (player.getText().toString().equals("Turn : O")) {
                            player.setText("Turn : X");
                        } else {
                            player.setText("Turn : O");
                        }
                        if (currentPlayer == 0) {
                            currentPlayer = 1;
                            r3c1.setText("O");
                        } else {
                            currentPlayer = 0;
                            r3c1.setText("X");
                        }
                        gameOver = checkForWin();
                    }
                    break;
                case R.id.r3c2:
                    if (checkEmpty.equals(r3c2.getText().toString())) {
                        if (player.getText().toString().equals("Turn : O")) {
                            player.setText("Turn : X");
                        } else {
                            player.setText("Turn : O");
                        }
                        if (currentPlayer == 0) {
                            currentPlayer = 1;
                            r3c2.setText("O");
                        } else {
                            currentPlayer = 0;
                            r3c2.setText("X");
                        }
                        gameOver = checkForWin();
                    }
                    break;
                case R.id.r3c3:
                    if (checkEmpty.equals(r3c3.getText().toString())) {
                        if (player.getText().toString().equals("Turn : O")) {
                            player.setText("Turn : X");
                        } else {
                            player.setText("Turn : O");
                        }
                        if (currentPlayer == 0) {
                            currentPlayer = 1;
                            r3c3.setText("O");
                        } else {
                            currentPlayer = 0;
                            r3c3.setText("X");
                        }
                        gameOver = checkForWin();
                    }
                    break;
            }
        }
    }

    private boolean checkForWin(){
    // Check rows for win
        if (r1c1.getText().toString().equals(r1c2.getText().toString()) && r1c2.getText().toString().equals(r1c3.getText().toString()) && !r1c1.getText().toString().isEmpty()){
            if (r1c1.getText().toString().equals("X")){
                Toast.makeText(this, "X won", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this, "O won", Toast.LENGTH_SHORT).show();
            }
            return true;
        }

        else if (r2c1.getText().toString().equals(r2c2.getText().toString()) && r2c2.getText().toString().equals(r2c3.getText().toString()) && !r2c1.getText().toString().isEmpty()){
            if (r2c1.getText().toString().equals("X")){
                Toast.makeText(this, "X won", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this, "O won", Toast.LENGTH_SHORT).show();
            }
            return true;
        }

        else if (r3c1.getText().toString().equals(r3c2.getText().toString()) && r3c2.getText().toString().equals(r3c3.getText().toString()) && !r3c1.getText().toString().isEmpty()){
            if (r3c1.getText().toString().equals("X")){
                Toast.makeText(this, "X won", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this, "O won", Toast.LENGTH_SHORT).show();
            }
            return true;
        }
//     Check columns for win
        if (r1c1.getText().toString().equals(r2c1.getText().toString()) && r2c1.getText().toString().equals(r3c1.getText().toString()) && !r1c1.getText().toString().isEmpty()){
            if (r1c1.getText().toString().equals("X")){
                Toast.makeText(this, "X won", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this, "O won", Toast.LENGTH_SHORT).show();
            }
            return true;
        }
        else if (r1c2.getText().toString().equals(r2c2.getText().toString()) && r2c2.getText().toString().equals(r3c2.getText().toString()) && !r1c2.getText().toString().isEmpty()){
            if (r1c2.getText().toString().equals("X")){
                Toast.makeText(this, "X won", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this, "O won", Toast.LENGTH_SHORT).show();
            }
            return true;
        }
        else if (r1c3.getText().toString().equals(r2c3.getText().toString()) && r2c3.getText().toString().equals(r3c3.getText().toString()) && !r1c3.getText().toString().isEmpty()){
            if (r1c3.getText().toString().equals("X")){
                Toast.makeText(this, "X won", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this, "O won", Toast.LENGTH_SHORT).show();
            }
            return true;
        }
//Diagnose check
        if (r1c1.getText().toString().equals(r2c2.getText().toString()) && r2c2.getText().toString().equals(r3c3.getText().toString()) && !r1c1.getText().toString().isEmpty()){
            if (r1c1.getText().toString().equals("X")){
                Toast.makeText(this, "X won", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this, "O won", Toast.LENGTH_SHORT).show();
            }
            return true;
        }
        else if (r1c3.getText().toString().equals(r2c2.getText().toString()) && r2c2.getText().toString().equals(r3c1.getText().toString()) && !r1c3.getText().toString().isEmpty()){
            if (r1c3.getText().toString().equals("X")){
                Toast.makeText(this, "X won", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this, "O won", Toast.LENGTH_SHORT).show();
            }
            return true;
        }
        return false;
    }
}