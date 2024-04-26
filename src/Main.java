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



        }
    }

    
}