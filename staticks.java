public class staticks {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.schoolname="jmv";
        Student s2=new Student();
       System.out.println(s2.schoolname);
    }
}
class Student{
    String name;
    int roll;
    static String schoolname;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}

