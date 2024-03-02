package extra;

class Student {
    String[] students;
    int[] ranks;
    Student(String [] students, int[] ranks){
        this.students = students;
        this.ranks = ranks;
    }
    public String highestRank(){
        int high = 0;
        for(int i = 1; i < ranks.length;i++) {
            if (ranks[high] > ranks[i]) {
                high = i;
            }
        }
        return students[high];
    }
    public String lowestRank(){
        int low = 0;
        for(int i = 1; i < ranks.length;i++) {
            if (ranks[low] < ranks[i]) {
                low = i;
            }
        }
        return students[low];
    }
}
public class StudentRank{
//    public static void main(String[] args){
//        int[] ranks = new int[]{3,2,1};
//        String[] students = new String[]{"A","B","C"};
//        Student s = new Student(students,ranks);
//        System.out.println(s.highestRank());
//        System.out.println(s.lowestRank());
//
//    }
public final static void main(String[] args) {
    double d = 10.0/ -0;
    if(d == Double.POSITIVE_INFINITY)
        System.out.println("positive infinity");
    else

    System.out.println("Negative infinity");

}
}