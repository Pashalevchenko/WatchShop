package service;

import view.Display;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class InputHandler {
    private final BufferedReader reader;
    private final Display display;

    public InputHandler(){
        this.reader = new BufferedReader(new InputStreamReader(System.in));
        this.display = new Display();
    }

    public String readString(String message){
        display.displayMessage(message);
        try {
            return reader.readLine();
        } catch (IOException e){
            return "";
        }
    }

    public int readInt(String message){
        return Integer.parseInt(readString(message));
    }

    public BigDecimal readBigDecimal(String message){
        return new BigDecimal(readString(message));
    }
}
