public class Human {

    String name;
    String surName;
    int year;
    int iq;
    Pet pet;
    Human father;
    Human mother;
    String[][] schedule;

    public Human() {
    }

    public Human(String name, String surName, int year) {
        this.name = name;
        this.surName = surName;
        this.year = year;
    }
    public Human(String name, String surName, int year,Human father,Human mother) {
        this.name = name;
        this.surName = surName;
        this.year = year;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name,String surName,int year,int iq,Pet pet,Human father,Human mother,String[][] schedule){
        this.name = name;
        this.surName = surName;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.father = father;
        this.mother = mother;
        this.schedule = schedule;

    }

    public  void greetPet(){
        System.out.println("Hello " + pet.nickName);
    }
    public void describePet(){
        String sly=" ";
        if (pet.trickLevel>50){
            sly = "very sly";
        }else{
            sly = "almost not sly";
        }
    }
    public String toString(){
        return  "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surName + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", pet=" + pet +
                ", father=" + father.name + " " + father.surName +
                ", mother=" + mother.name + " " + mother.surName +
                '}';
    }

}
