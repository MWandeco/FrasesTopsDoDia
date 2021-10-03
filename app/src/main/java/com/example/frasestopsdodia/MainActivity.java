package com.example.frasestopsdodia;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void novaFraseBotao (View view){
        String[] frases = {
                "Que o dia comece bem e termine ainda melhor.",
                "Pra hoje: sorrisos bobos, uma mente tranquila e um coração cheio de paz.",
                "Às vezes as coisas demoram, mas acontecem. O importante é saber esperar e não perder a fé!",
                "Imagine uma nova história para a sua vida e acredite nela.",
                "Nem todos os dias são bons, mas há algo bom em cada dia.",
                "Treine sua mente para ver o lado bom de qualquer situação.",
                "E tudo que atrasa, deixa a maré levar!",
                "Está proibido abandonar seus sonhos, não importa quantas vezes caia, levante-se.",
                "As montanhas da vida não existem apenas para que você chegue no topo, mas para que você aprenda o valor da escalada.",
                "A vida pode até te derrubar, mas é você quem escolhe a hora de se levantar.",
                "É melhor ser verdadeiro e solitário do que viver em falsidade e estar sempre acompanhado.",
                "Ser feliz não é ter uma vida perfeita, mas sim reconhecer que vale a pena viver apesar de todos os desafios e perdas.",
                "Aprendi que não devo me importar com comentários que não vão mudar minha vida.",
                "A vida tem sons, que pra gente ouvir precisa aprender a começar de novo. É como tocar o mesmo violão e nele compor uma nova canção.",
                "Na vida irás encontrar três tipos de pessoas: aquelas que irão mudar a tua vida, aquelas que irão prejudicar a tua vida, aquelas que serão a tua vida.",
                "O mundo está nas mãos daqueles que têm a coragem de sonhar e de correr o risco de viver seus sonhos.",


        };

        int x = new Random().nextInt(frases.length);

        TextView fraseDodia = findViewById(R.id.textFraseDoDia);

        fraseDodia.setText(frases[x]);

    }
}