package replay;

import battle.Battle;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.*;
import com.thoughtworks.xstream.security.AnyTypePermission;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import com.thoughtworks.xstream.io.StreamException;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Replay {
    static List<String> frames;
    public static void saveToFile(){
            XStream xstream = new XStream();
            String dataXml = xstream.toXML(Battle.getFrames());
            System.out.print(dataXml);
            try {
                FileWriter file = new FileWriter("./replay.xml");
                file.write(dataXml);
                file.close();
            } catch (IOException e) {
                System.out.println("Error while saving to file: " + e.getMessage());
            }
        }

    public static void watchReplayFromFile(){
        loadReplayFromFile();
        int i = 0;
        for(String frame:frames){
            i++;
            System.out.println(i + " turn");
            System.out.println(frame);
        };

    }
    public static void loadReplayFromFile(){
        XStream xstream = new XStream();
        xstream.addPermission(AnyTypePermission.ANY);
        String framesXML;
        try {
            Path file = Path.of("./replay.xml");
            framesXML = Files.readString(file);
            frames = (List<String>) xstream.fromXML(framesXML);
        } catch (IOException e){
            System.out.print("Error while opening file");
        }

    }
    }

