package ru.philimonov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer1.playMusic();
//        System.out.println("musicPlayer1.getVolume -> " + musicPlayer1.getVolume());
//        System.out.println("musicPlayer2.getVolume -> " + musicPlayer2.getVolume());
//        System.out.println("musicPlayer1 = musicPlayer2 -> " + (musicPlayer1 == musicPlayer2));
//        System.out.println("musicPlayer1 = " + musicPlayer1);
//        System.out.println("musicPlayer2 = " + musicPlayer2);
//        musicPlayer1.setVolume(400);
//        System.out.println("musicPlayer1.getVolume -> " + musicPlayer1.getVolume());
//        System.out.println("musicPlayer2.getVolume -> " + musicPlayer2.getVolume());

        context.close();
    }
}
