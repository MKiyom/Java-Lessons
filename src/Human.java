public class Human {
    String name;
    String sex;
    int age;
    String status;

    public void run(){
        System.out.println("The Guy is Running...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "-= HUMAN SECTION =- " +
                "\nNAME - " + name +
                "\nSEX - " + sex  +
                "\nAGE - " + age +
                "\nSTATUS - " + status;
    }

    public void go(){
        System.out.println("Kijo Raftestai???");
    }
}