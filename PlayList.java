
import java.util.LinkedList;
import java.util.Queue;

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
        Queue songsQ = new sizeLimitedQue(3);
        String[] songs = {"song1", "song2", "song3","song4","song5"};
        for (String song : songs) {
            songsQ.add(song);
        }
        System.out.println(songsQ);
    }
}
