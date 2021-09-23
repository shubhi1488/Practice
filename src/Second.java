class Emp
{
    private int id;
    private int Sal;
    //getter and setter methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSal() {
        return Sal;
    }

    public void setSal(int sal) {
        Sal = sal;
    }
}
public class Second {
    public static void main(String[] args) {
        //display the values of id and sal
        Emp obj=new Emp();
        obj.setId(12);
        obj.setSal(12000);
        System.out.println(obj.getId());
        System.out.println(obj.getSal());

    }
}
