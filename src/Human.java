public class Human {
    String name;
    String sex;
    int age;
    String status;

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
        return "Human{" +
                "NAME = '" + name + '\'' +
                ", SEX = '" + sex + '\'' +
                ", AGE  = " + age +
                ", STATUS = '" + status + '\'' +
                '}';
    }
}
