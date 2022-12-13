package ru.philimonov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music music = context.getBean("classicalMusic", Music.class);
        MusicPlayer player = new MusicPlayer(music);
        player.playMusic();

        Music music1 = context.getBean("rockMusic", RockMusic.class);
        MusicPlayer player1 = new MusicPlayer(music1);
        player1.playMusic();
        context.close();
    }
}
