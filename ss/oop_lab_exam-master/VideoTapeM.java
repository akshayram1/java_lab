package programs;

/*20. "Write a program, to implement the following hierarchy. Displays information of each class the rectangle represents the classes. The classes Movie and MusicVideo inherits all the members of the class VideoTape. */
import java.util.Scanner;

class VideoTape {
    private String title;
    private int length;

    public VideoTape(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "VideoTape: " + title + " (" + length + " minutes)";
    }
}

class Movie extends VideoTape {
    private String rating;

    public Movie(String title, int length, String rating) {
        super(title, length);
        this.rating = rating;
    }

    public String getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie: " + getTitle() + " (" + getLength() + " minutes, rated " + rating + ")";
    }
}

class MusicVideo extends VideoTape {
    private String artist;

    public MusicVideo(String title, int length, String artist) {
        super(title, length);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return "MusicVideo: " + getTitle() + " (" + getLength() + " minutes, by " + artist + ")";
    }
}

public class VideoTapeM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the title of the video tape: ");
        String title = scanner.nextLine();

        System.out.print("Enter the length of the video tape (in minutes): ");
        int length = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the rating of the movie (if applicable): ");
        String rating = scanner.nextLine();

        System.out.print("Enter the artist of the music video (if applicable): ");
        String artist = scanner.nextLine();

        scanner.close();

        VideoTape tape1 = new VideoTape(title, length);
        System.out.println(tape1);

        if (!rating.isEmpty()) {
            Movie movie1 = new Movie(title, length, rating);
            System.out.println(movie1);
        }

        if (!artist.isEmpty()) {
            MusicVideo musicVideo1 = new MusicVideo(title, length, artist);
            System.out.println(musicVideo1);
        }
    }
}
