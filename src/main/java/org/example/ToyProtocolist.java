package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class ToyProtocolist {
    public void protocolToy(Toy currentToy) {
        try(FileWriter writer = new FileWriter("toyProtocol.txt", true))
        {
            String text = currentToy.toString() + LocalDateTime. now() + "\n";
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
