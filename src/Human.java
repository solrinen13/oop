public class Human {

    public  int yearOfBirth;
    public String name;
    public String town;
    public String jobTitle;

    Human (int yearOfBirth, String  name, String  town, String jobTitle){
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            System.out.println("Год рождения введен не верно");
        }
        if (name != null && !name.equals("")){
            this.name = name;
        }else {
            this.name = "Информация не указана";
        }
        if (town  != null && !town.equals("")) {
            this.town = town;
        }else {
            this.town = "Информация не указана";}
        if (town  != null && !town.equals("")) {
            this.jobTitle = jobTitle;
        }else {
            this.jobTitle = "Информация не указана";
        }

    }
    void greetings(){
        System.out.println("Привет! Меня зовут " + name + " Я из города " + town + " Я родился в " + yearOfBirth + " году.Будем знакомы!");
        System.out.println(name + " работает " + jobTitle);
    }
}
