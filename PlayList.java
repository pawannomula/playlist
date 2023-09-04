import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PlayList {
    // static class
    public static class sizeLimitedQue extends LinkedList {
        private int sizeofQ;

        public sizeLimitedQue(int sizeofQ) {
            this.sizeofQ = sizeofQ;
        }

        @Override
        public boolean add(Object o) {
            while (this.size() == sizeofQ) {
                super.remove();
            }
            return super.add(o);
        }
    }

    public static void main(String[] args) {

        //change songs and expcected values to verify outcome
        // songs of nth index is the new song playing
        String[] songs = {"song1", "song2", "song3", "song4"};
        String[] expected = {"song2", "song3", "song4"};

        Queue songsQ = new sizeLimitedQue(3);
        for (String song : songs) {
            songsQ.add(song);
        }
        Queue expectedQ = new sizeLimitedQue(3);
        for (String s : expected) {
            expectedQ.add(s);
        }

        System.out.println(songsQ.equals(expectedQ) + " " + songsQ);
    }


}
