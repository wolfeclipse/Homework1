package homework2;

public class Human {
    protected String hair;
    protected String sex;
    protected int heigth;
    protected int age;

    public Human(String hair, String sex, int heigth, int age) {
        this.hair = hair;
        this.sex = sex;
        this.heigth = heigth;
        this.age = age;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
