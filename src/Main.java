public class Main {
    public static void main(String[] args) {
        public class Book{
            private String name; //variabel för att hålla bokens namn
            private int pages; // variabel för att hålla antalet sidor i boken
            private int currentPage; // variabel för att hålla nuvarande sida som läsaren är på

            //Konstruktor för att skapa en ny bok med namn och sidantal
            public Book(String name, int pages){
                this.name = name;
                this.pages = pages;
                this.currentPage = 0;//starta från första sidan
            }
            //Metod för att hämta nuvarande sidnummer
            public int getCurrentPage(){
                return currentPage;
            }

            //Metod för att hämta bokens namn
            public String getName(){
                return name;
            }
            //Metod för att hämta det totala antalet sidor i boken
            public int getPages(){
                return pages;
            }
            public class Rock {
                private double weight; // privat variabel för att lagra stenens vikt

                //konstruktor för att skapa en ny sten med en specefik vikt
                public Rock(double weight) {
                    this.weight = weight;
                }
                //Metod för att hämta vikten av stenen

                public double getWeight() {
                    return weight;
                }
            }
            public class Worker {
                protected String name; //namn på arbetaren
                protected int age; //ålder på arbetaren

                //Konstruktor som tar namn och ålder som argument
                public Worker(String name, int age){
                    this.name = name;
                    this.age = age;
                }
                //metod för att hämta namnet på arbetaren

                public String getName() {
                    return name;
                }
                //Metod för att åldern på arbetaren

                public int getAge() {
                    return age;
                }
            }
            public class BlueCollar extends worker {
                public BlueCollar(String name, int age ){
                    super(name, age);
                }
                //Metod som simulerar fysiskt arbete
                public void work(){
                    System.out.println(name + "is working hard");
                }
            }
            public class WhiteCollar extends Worker {
                public class WhiteCollar(String name, int age){
                    super(name, age);
                }
                //Metod som simulerar kontorsarbete
                public void work(){
                    System.out.println(name + "is working in a office");
                }
            }
            public class Hardware {
                private String name; // namn på hårdvarudelen
                private double price; // pris på hårdvarudelen

                // Konstruktor som initialiserar namn och pris
                public Hardware(String name, double price) {
                    this.name = name;
                    this.price = price;
                }

                // Metod för att hämta namnet på hårdvarudelen
                public String getName() {
                    return name;
                }

                // Metod för att hämta priset på hårdvarudelen
                public double getPrice() {
                    return price;
                }
            }

            public class ComputerPart extends Hardware {
                private String type; // typ av datordel, t.ex. processor, grafikkort

                // Konstruktor som även sätter typ av del
                public ComputerPart(String name, double price, String type) {
                    super(name, price);
                    this.type = type;
                }

                // Metod för att hämta typ av datordel
                public String getType() {
                    return type;
                }
            }




        }
    }

    
}