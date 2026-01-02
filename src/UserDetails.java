public class UserDetails {
    private String name;
    private String gender;
    private String[] habit;
    private int age;
    private String zodiacSign;

    public UserDetails(String name, String gender, String[] habit, int age, String zodiacSign) {
        this.name = name;
        this.gender = gender;
        this.habit = habit;
        this.age = age;
        this.zodiacSign = zodiacSign;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getHabit() {
        return habit;
    }

    public void setHabit(String[] habit) {
        this.habit = habit;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getZodiacSign() {
        return zodiacSign;
    }

    public void setZodiacSign(String zodiacSign) {
        this.zodiacSign = zodiacSign;
    }
}
