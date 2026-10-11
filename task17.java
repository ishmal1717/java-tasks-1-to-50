class Student {
    String name;
    double[] marks;

    // Constructor
    public Student(String name, double[] marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method to calculate average marks
    public double average() {
        if (marks.length == 0) return 0.0;
        double sum = 0;
        for (double m : marks) {
            sum += m;
        }
        return sum / marks.length;
    }

    // Method to determine grade based on average
    public char grade() {
        double avg = average();
        if (avg >= 90) return 'A';
        else if (avg >= 80) return 'B';
        else if (avg >= 70) return 'C';
        else if (avg >= 60) return 'D';
        else return 'F';
    }
}

public class task17 {
    public static void main(String[] args) {
        // Store 3 students in an array
        Student[] students = {
                new Student("Alice", new double[]{85.5, 90.0, 92.0}),
                new Student("Bob", new double[]{72.0, 68.5, 75.0}),
                new Student("Charlie", new double[]{95.0, 96.5, 94.0})
        };

        Student topper = students[0];
        for (Student s : students) {
            System.out.println("Student: " + s.name + " | Average: " + s.average() + " | Grade: " + s.grade());
            if (s.average() > topper.average()) {
                topper = s;
            }
        }

        System.out.println("\nTopper: " + topper.name + " with an average of " + topper.average());
    }
}