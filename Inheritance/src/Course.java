public class Course {
    String courseName;
    int duration;

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    int discount;

    PaidOnlineCourse(String courseName, int duration, String platform,
                     boolean isRecorded, double fee, int discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    void display() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + isRecorded);
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
        double finalPrice = fee - (fee * discount / 100);
        System.out.println("Final Price: " + finalPrice);
    }
}

class Main1 {
    public static void main(String[] args) {
        PaidOnlineCourse paid = new PaidOnlineCourse(
                "Java Programming",
                60,
                "Udemy",
                true,
                49.99,
                10
        );
        paid.display();
    }
}