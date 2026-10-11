public class task47 {

    // Generic Pair class nested statically to prevent project-wide conflicts
    public static class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() { return key; }
        public V getValue() { return value; }
    }

    // Custom Student class nested statically implementing Comparable
    public static class Student implements Comparable<Student> {
        private String name;
        private int marks;

        public Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        @Override
        public int compareTo(Student other) {
            return Integer.compare(this.marks, other.marks);
        }

        @Override
        public String toString() {
            return name + " (Marks: " + marks + ")";
        }
    }

    // Generic method max() that works on any array of Comparable objects
    public static <T extends Comparable<T>> T max(T[] arr) {
        if (arr == null || arr.length == 0) return null;
        T maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(maxVal) > 0) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
        // 1. Test with Integer array
        Integer[] numbers = {10, 45, 23, 89, 12};
        System.out.println("Max Integer: " + max(numbers));

        // 2. Test with String array
        String[] words = {"apple", "orange", "banana", "grape"};
        System.out.println("Max String: " + max(words));

        // 3. Test with custom Student array implementing Comparable
        Student[] students = {
                new Student("Alice", 85),
                new Student("Bob", 92),
                new Student("Charlie", 78)
        };
        System.out.println("Top Student: " + max(students));

        // 4. Test Pair generic class
        Pair<String, Integer> pair = new Pair<>("Rank", 1);
        System.out.println("Pair -> Key: " + pair.getKey() + ", Value: " + pair.getValue());
    }
}