
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    @Override
    public boolean equals(Object compared) {

        if (this==compared) {
            return true;
        }
        if (!(compared instanceof Song)) {
            return false;
        }

        Song comparedTo = (Song) compared;

        if (this.artist.equals(comparedTo.artist) && this.name.equals(comparedTo.name) && this.durationInSeconds == comparedTo.durationInSeconds) {
            return true;
        }

        return false;
    }

}
