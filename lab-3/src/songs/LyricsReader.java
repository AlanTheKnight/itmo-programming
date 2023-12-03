package songs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LyricsReader {
    public ArrayList<String> readLyrics(String filename) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        ArrayList<String> lyrics = new ArrayList<String>();

        try {
            String line = br.readLine();
            while (line != null) {
                lyrics.add(line);
                line = br.readLine();
            }
        } finally {
            br.close();
        }

        return lyrics;
    }
}
