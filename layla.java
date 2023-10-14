public class layla {
    public static void main(String[] args){
        Desk d = new Desk(20, 012011, "layla-focalors");
        d.GetStudentInfo();
        Desk d2 = new Desk(20, 20001, "NOA");
        d2.GetStudentInfo();
    }
}
class Academy {
    static String academy_name = "Teyvat, Sumeru / Academia LLC";
    static String mayjor = "STAR & AI & Bigdata";

    String name;
    int age;
    int student_code;

    void SetStudentCode(int code){
        this.student_code = code;
    }
    void SetAge(int age){
        this.age = age;
    }
    void SetName(String Name){
        this.name = Name;
    }
    int GetStudentcode(){
        return this.student_code;
    }
    String GetName(){
        return this.name;
    }
    int GetAge(){
        return this.age;
    }
}
class Desk{
    Academy u1;
    Desk(int _age, int _student_code, String _Name) {
        this.u1 = new Academy();
        u1.SetAge(_age);
        u1.SetStudentCode(_student_code);
        u1.SetName(_Name);
    }
    void GetStudentInfo(){
        System.out.printf("-----------\n[학생명부] 이름 : %s\n나이 : %d\n학번 : %d\n아카데미 : %s\n전공 : %s\n-----------\n", u1.GetName(), u1.GetAge(), u1.GetStudentcode(), Academy.academy_name, Academy.mayjor);
    }
}
