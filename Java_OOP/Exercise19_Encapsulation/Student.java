package Java_OOP.Exercise19_Encapsulation;

public class Student {
    private String name, placeOfBirth, nationality;
    private char sex;
    private int age;

    Student(String name, char sex, int age, String placeOfBirth, String nationality) {
        if (name != "") {
            this.name = name;
        } else {
            System.out.println("invalid");
        }
        if (sex == 'F' || sex == 'M') {
            this.sex = sex;
        } else {
            System.out.println("invalid");
        }
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("invalid");
        }
        this.placeOfBirth = placeOfBirth;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public Character getSex() {
        return sex;
    }

    public Integer getAge() {
        return age;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public Student setName(String name) {
        if (name != "") {
            this.name = name;
        } else {
            System.out.println("invalid");
        }
        return this;
    }

    public Student setSex(char sex) {
        if (sex == 'F' || sex == 'M') {
            this.sex = sex;
        } else {
            System.out.println("invalid");
        }
        return this;
    }

    public Student setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("invalid");

        }
        return this;
    }

    public Student setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
        return this;
    }

    public Student setNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    @Override
    public String toString() {
        if (age > 0) {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", placeOfBirth='" + placeOfBirth + '\'' +
                    ", nationality='" + nationality + '\'' +
                    ", sex=" + sex +
                    ", age=" + age +
                    '}';
        } else if (sex == 'F' || sex == 'M') {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", placeOfBirth='" + placeOfBirth + '\'' +
                    ", nationality='" + nationality + '\'' +
                    ", sex=" + sex +
                    ", age=" + age +
                    '}';
        } else if (name != "") {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", placeOfBirth='" + placeOfBirth + '\'' +
                    ", nationality='" + nationality + '\'' +
                    ", sex=" + sex +
                    ", age=" + age +
                    '}';
        } else {
            return "invalid";

        }

    }
}

