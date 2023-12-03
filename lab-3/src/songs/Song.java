package songs;

import java.util.ArrayList;

public class Song {
    protected String name;
    protected ArrayList<String> words = new ArrayList<String>();

    public Song(String name, String lyricsFilename) {
        this.name = name;
        loadLyrics(lyricsFilename);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getWords() {
        return words;
    }

    public void loadLyrics(String lyricsFilename) {
        LyricsReader lyricsReader = new LyricsReader();
        try {
            this.words = lyricsReader.readLyrics(lyricsFilename);
        } catch (Exception e) {
            System.err.println("Не удалось прочитать файл с текстом песни");
            System.exit(1);
        }
    }

    @Override
    public String toString() {
        return "Song [name=" + name + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof Song))
            return false;
        Song other = (Song) obj;
        return name == other.name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
