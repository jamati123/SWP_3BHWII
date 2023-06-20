package com.example.abschlusssachen;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class HelloController {


    @FXML

    private AnchorPane Anker;
    @FXML

    private TextField spielerAusgabe;

    @FXML

    private TextField aktionAusgabe;

    @FXML

    private TextArea anzahlSpieler;

    @FXML

    private TextArea anzahlAktion;


    @FXML

    protected void onClickAusloßen() {
        Random rand = new Random();
        if (anzahlSpieler.getText().equals("")) {
            anzahlSpieler.setText("1");
        }
            int spieler = rand.nextInt(Integer.parseInt(anzahlSpieler.getText()));
        if (anzahlAktion.getText().equals("")) {
            anzahlAktion.setText("1");
        }
            int aktion = rand.nextInt(Integer.parseInt(anzahlAktion.getText()));


        try {
            FileReader fileReader = new FileReader("src/main/java/com/example/abschlusssachen/spieler.txt");
            int i;
            String s = "";
            while ((i = fileReader.read()) != -1) {
                s += (char) i;
            }
            String[] spielerArray = s.split("\n");      // An jedem Zeilenumbruch ein neuer Eintrag im Array
            spielerAusgabe.setText(spielerArray[spieler]);   // Ausgabe des Spielers
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader fileLaser = new FileReader("src/main/java/com/example/abschlusssachen/aktion.txt");
            int i;
            String s = "";
            while ((i = fileLaser.read()) != -1) {
                s += (char) i;
            }
            String[] aktionArray = s.split("\n");        // An jedem Zeilenumbruch ein neuer Eintrag im Array
            aktionAusgabe.setText(aktionArray[aktion]);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}