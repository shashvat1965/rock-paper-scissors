package com.example.rpsuiattempt;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String user_choice;
    int a;
    int computer = 0;
    int user = 0;
    Random random = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        Typeface customFont = Typeface.createFromAsset(getAssets(),"fonts/KGHAPPYSolid.otf");
        TextView scoreboard = (TextView) findViewById(R.id.textView4);
        scoreboard.setTypeface(customFont);
        TextView uc = (TextView) findViewById(R.id.textView);
        TextView cc = (TextView) findViewById(R.id.textView2);
        cc.setTypeface(customFont);
        uc.setTypeface(customFont);
        Button ro= (Button) findViewById(R.id.button1);
        Button pa= (Button) findViewById(R.id.button2);
        Button sc= (Button) findViewById(R.id.button3);
        Button re= (Button) findViewById(R.id.button4);
        Button ex= (Button) findViewById(R.id.button5);
        ro.setTypeface(customFont);
        pa.setTypeface(customFont);
        sc.setTypeface(customFont);
        re.setTypeface(customFont);
        ex.setTypeface(customFont);
    }
    public void rock(View view){
        a= random.nextInt(3)+1;
        if(a==2){
            TextView lol = findViewById(R.id.textView4);
            computer++;
            lol.setText("computer wins"+ "\n" +  "Computer: " + computer + " User: " + user);
            ImageView user_choice = (ImageView) findViewById(R.id.imageView4);
            ImageView computer_choice = (ImageView) findViewById(R.id.imageView5);
            user_choice.setImageResource(R.drawable.rock);
            computer_choice.setImageResource(R.drawable.paper);
        }
        else if(a==1){
            TextView lol = findViewById(R.id.textView4);
            lol.setText("draw" + "\n" +  "Computer: " + computer + " User: " + user);
            ImageView user_choice = (ImageView) findViewById(R.id.imageView4);
            ImageView computer_choice = (ImageView) findViewById(R.id.imageView5);
            user_choice.setImageResource(R.drawable.rock);
            computer_choice.setImageResource(R.drawable.rock);
        }
        else if(a==3){
            TextView lol = findViewById(R.id.textView4);
            user++;
            lol.setText("you win"+"\n" +  "Computer: " + computer + " User: " + user);
            ImageView user_choice = (ImageView) findViewById(R.id.imageView4);
            ImageView computer_choice = (ImageView) findViewById(R.id.imageView5);
            user_choice.setImageResource(R.drawable.rock);
            computer_choice.setImageResource(R.drawable.scissors);
        }
        if(computer==5 | user==5) {
            TextView game_over = findViewById(R.id.textView4);
            Button visible = findViewById(R.id.button4);
            visible.setVisibility(View.VISIBLE);
            Button bruh= findViewById(R.id.button5);
            bruh.setVisibility(View.VISIBLE);
            Button rock = findViewById(R.id.button1);
            Button paper = findViewById(R.id.button3);
            Button scissor = findViewById(R.id.button2);
            rock.setVisibility(View.INVISIBLE);
            paper.setVisibility(View.INVISIBLE);
            scissor.setVisibility(View.INVISIBLE);
            if(user==5){
                game_over.setText("Game Over! You Won!"+"\n"+"User: "+user+" Computer: "+computer);
            }
            else{
                game_over.setText("Game Over! You Lost, Try Again!"+"\n"+"User: "+user+" Computer: "+computer);
            }
        }
    }
    public void paper(View view){
        a= random.nextInt(3)+1;
        if(a==3){
            TextView lol = findViewById(R.id.textView4);
            computer++;
            lol.setText("computer wins"+ "\n" +  "Computer: " + computer + " User: " + user);
            ImageView user_choice = (ImageView) findViewById(R.id.imageView4);
            ImageView computer_choice = (ImageView) findViewById(R.id.imageView5);
            user_choice.setImageResource(R.drawable.paper);
            computer_choice.setImageResource(R.drawable.scissors);
        }
        else if(a==2){
            TextView lol = findViewById(R.id.textView4);
            lol.setText("draw"+"\n" +  "Computer: " + computer + " User: " + user);
            ImageView user_choice = (ImageView) findViewById(R.id.imageView4);
            ImageView computer_choice = (ImageView) findViewById(R.id.imageView5);
            user_choice.setImageResource(R.drawable.paper);
            computer_choice.setImageResource(R.drawable.paper);
        }
        else if(a==1){
            TextView lol = findViewById(R.id.textView4);
            user++;
            lol.setText("you win"+ "\n" +  "Computer: " + computer + " User: " + user);
            ImageView user_choice = (ImageView) findViewById(R.id.imageView4);
            ImageView computer_choice = (ImageView) findViewById(R.id.imageView5);
            user_choice.setImageResource(R.drawable.paper);
            computer_choice.setImageResource(R.drawable.rock);
        }
        if(computer==5 | user==5) {
            TextView game_over = findViewById(R.id.textView4);
            Button visible = findViewById(R.id.button4);
            visible.setVisibility(View.VISIBLE);
            Button bruh= findViewById(R.id.button5);
            bruh.setVisibility(View.VISIBLE);
            Button rock = findViewById(R.id.button1);
            Button paper = findViewById(R.id.button3);
            Button scissor = findViewById(R.id.button2);
            rock.setVisibility(View.INVISIBLE);
            paper.setVisibility(View.INVISIBLE);
            scissor.setVisibility(View.INVISIBLE);
            if(user==5){
                game_over.setText("Game Over! You Won!"+"\n"+"User: "+user+" Computer: "+computer);
            }
            else{
                game_over.setText("Game Over! You Lost, Try Again!"+"\n"+"User: "+user+" Computer: "+computer);
            }
        }
    }
    public void scissor(View view){
        a= random.nextInt(3)+1;
        if(a==1){
            TextView lol = findViewById(R.id.textView4);
            computer++;
            lol.setText("computer wins"+ "\n" +  "Computer: " + computer + " User: " + user);
            ImageView user_choice = (ImageView) findViewById(R.id.imageView4);
            ImageView computer_choice = (ImageView) findViewById(R.id.imageView5);
            user_choice.setImageResource(R.drawable.scissors);
            computer_choice.setImageResource(R.drawable.rock);
        }
        else if(a==3){
            TextView lol = findViewById(R.id.textView4);
            lol.setText("draw"+ "\n" +  "Computer: " + computer + " User: " + user);
            ImageView user_choice = (ImageView) findViewById(R.id.imageView4);
            ImageView computer_choice = (ImageView) findViewById(R.id.imageView5);
            user_choice.setImageResource(R.drawable.scissors);
            computer_choice.setImageResource(R.drawable.scissors);
        }
        else if(a==2){
            TextView lol = findViewById(R.id.textView4);
            user++;
            lol.setText("you win"+ "\n" +  "Computer: " + computer + " User: " + user);
            ImageView user_choice = (ImageView) findViewById(R.id.imageView4);
            ImageView computer_choice = (ImageView) findViewById(R.id.imageView5);
            user_choice.setImageResource(R.drawable.scissors);
            computer_choice.setImageResource(R.drawable.paper);
        }
        if(computer==5 | user==5) {
            TextView game_over = findViewById(R.id.textView4);
            Button visible = findViewById(R.id.button4);
            Button bruh= findViewById(R.id.button5);
            bruh.setVisibility(View.VISIBLE);
            visible.setVisibility(View.VISIBLE);
            Button rock = findViewById(R.id.button1);
            Button paper = findViewById(R.id.button3);
            Button scissor = findViewById(R.id.button2);
            rock.setVisibility(View.INVISIBLE);
            paper.setVisibility(View.INVISIBLE);
            scissor.setVisibility(View.INVISIBLE);
            if(user==5){
                game_over.setText("Game Over! You Won!"+"\n"+"User: "+user+" Computer: "+computer);
            }
            else{
                game_over.setText("Game Over! You Lost, Try Again!"+"\n"+"User: "+user+" Computer: "+computer);
            }
        }
    }
    public void restart(View view){
        computer = 0;
        user = 0;
        Button rock = findViewById(R.id.button1);
        Button paper = findViewById(R.id.button3);
        Button scissor = findViewById(R.id.button2);
        rock.setVisibility(View.VISIBLE);
        paper.setVisibility(View.VISIBLE);
        scissor.setVisibility(View.VISIBLE);
        Button visible = findViewById(R.id.button4);
        visible.setVisibility(View.INVISIBLE);
        Button bruh= findViewById(R.id.button5);
        bruh.setVisibility(View.INVISIBLE);
    }
    public void exit(View view){
        finish();
        System.exit(0);
    }

}