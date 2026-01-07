package com;

import com.fileExplorer.FileExplorer;
import com.playMusic.PlayMusic;

import javax.swing.*;
import java.util.Scanner;

public class main {
    void main(){
        FileExplorer fileExplorer = new FileExplorer();
        PlayMusic playMusic;
        Scanner sc = new Scanner(System.in);

        System.out.println("Type 1 for chosen a music");
        int x = sc.nextInt();
        if(x==1){
            playMusic = new PlayMusic(fileExplorer.getFile());
            JOptionPane.showMessageDialog(null,"press x for exit");
        }
    }
}
