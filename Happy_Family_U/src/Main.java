public class Main {
    public static void main(String[] args) {
     Pet pet = new Pet("F","Koukie",2,15,new String[]{"eating","sleeping"});
     Human mother = new Human("Nuray","Doe",1985);
     Human father = new Human("John","Doe",1980);
     Human child = new Human("Zuzu","Doe",2000,80,pet,father,mother,new String[][]{{"monday","watch the film"}});

        System.out.println(child);
    }
}