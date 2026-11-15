package CoreJava.Collection.List;


import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafetyList {
       // static List<Integer> list = new ArrayList<>();  // Not thread-safe, can lead to ConcurrentModificationException or data corruption when accessed by multiple threads simultaneously
       // static List<Integer> list = Collections.synchronizedList(new ArrayList<>()); // Thread-safe but can lead to performance issues due to locking
        static List<Integer> list = new CopyOnWriteArrayList<>();  // Thread-safe and provides better performance for concurrent reads, but can be inefficient for writes

        public static void main(String[] args) throws Exception {

            Thread t1 = new Thread(() -> {
                for (int i = 0; i < 1000; i++) {
                    list.add(i);
                }
            });

            Thread t2 = new Thread(() -> {
                for (int i = 1000; i < 2000; i++) {
                    list.add(i);
                }
            });

            t1.start();
            t2.start();

            t1.join();
            t2.join();

            System.out.println(list.size());
        }
}
