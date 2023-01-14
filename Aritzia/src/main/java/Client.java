public class Client {
    private String name;
    private String age;
    private String industry;


    public Client(String n) {
        name = n;
    }

    public void setAge(String a) {
        age = a;
    }

    public void setIndustry(String i) {
        industry = i;
    }


    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getIndustry() {
        return industry;
    }
}
