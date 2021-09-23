class Stu
{
    static int rollno;
    static int arr[];

    public static void Stu(int rollno1, int[] arr1) {
        rollno = rollno1;
        arr = arr1;
    }
    public static void display(){
        System.out.println(rollno);
        for (int res:arr){
            System.out.println(res);
        }
    }
}
public class First {
    public static void main(String[] args) {
        Stu.Stu(23,new int[]{12,56,98});
        Stu.display();
    }
}
