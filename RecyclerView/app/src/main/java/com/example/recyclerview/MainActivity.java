package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFruits();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        //LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        //第一个参数指定布局的列数，第二个参数指定布局的排列方向
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }

    //创造一个1-20的随机数，然后将参数中传入的字符串重复随机遍
    private String getRandomLengthName(String name){
        Random random = new Random();
        int length = random.nextInt(20) + 1;
        StringBuilder builder = new StringBuilder();
        for(int i = 0;i < length; i++){
            builder.append(name);
        }
        return builder.toString();
    }

    private  void initFruits(){
        for(int i = 0 ; i < 2 ; i++){
            Fruit apple = new Fruit(getRandomLengthName("Apple"),R.drawable.apple);
            fruitList.add(apple);
            Fruit banana = new Fruit(getRandomLengthName("Babnana"),R.drawable.banana);
            fruitList.add(banana);
            Fruit orange = new Fruit(getRandomLengthName("Orange"),R.drawable.orange);
            fruitList.add(orange);
            Fruit watermelon = new Fruit(getRandomLengthName("Watermelon"),R.drawable.watermelon);
            fruitList.add(watermelon);
            Fruit pear = new Fruit(getRandomLengthName("Pear"),R.drawable.pear);
            fruitList.add(pear);
            Fruit grape = new Fruit(getRandomLengthName("Grape"),R.drawable.grape);
            fruitList.add(grape);
            Fruit pineapple = new Fruit(getRandomLengthName("Pineapple"),R.drawable.pineapple);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit(getRandomLengthName("Strawberry"),R.drawable.strawberry);
            fruitList.add(strawberry);
            Fruit cherry = new Fruit(getRandomLengthName("Cherry"),R.drawable.cherry);
            fruitList.add(cherry);
            Fruit mango = new Fruit(getRandomLengthName("Mango"),R.drawable.mango);
            fruitList.add(mango);
        }
    }
}
