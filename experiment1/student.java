public class student {
    String name;
    double uid;
    double classNo;

    student(){
        this.name = null;
        this.classNo = 0;
        this.uid = 0;
    }
    student(String name, double uid,double classNo){
        this.name = name;
        this.classNo = classNo;
        this.uid = uid;
    }
    public void show(){
        System.out.println(this.name);
        System.out.println(this.classNo);
        System.out.println(this.uid);
    }
    public static void main(String[] args) {
        student s = new student("suraj", 101, 616);
        s.show();
    }
}
