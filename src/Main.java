public class Main {
    public static void main(String[] args) {
        // Skapa instanser av bok, sten, arbetare och datordel
        Book myBook = new Book("Java Basics", 120);
        Rock myRock = new Rock(15.5);
        Worker myWorker = new BlueCollar("John", 30);
        ComputerPart myPart = new ComputerPart("GPU", 299.99, "Graphics Card");

        // Anropa metoder för att visa information om skapade objekt
        System.out.println("Book Name: " + myBook.getName());
        System.out.println("Book Pages: " + myBook.getPages());
        System.out.println("Rock Weight: " + myRock.getWeight());
        System.out.println("Worker Name: " + myWorker.getName());
        System.out.println("Worker Age: " + myWorker.getAge());
        System.out.println("Computer Part Type: " + myPart.getType());
        System.out.println("Computer Part Price: " + myPart.getPrice());
    }
}

// Klassdefinition för Book
class Book {
    private String name;
    private int pages;
    private int currentPage;

    // Konstruktor för Book
    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
        this.currentPage = 0;
    }

    // Metod för att få den nuvarande sidan i boken
    public int getCurrentPage() {
        return currentPage;
    }

    // Metod för att få namnet på boken
    public String getName() {
        return name;
    }

    // Metod för att få antalet sidor i boken
    public int getPages() {
        return pages;
    }
}

// Klassdefinition för Rock
class Rock {
    private double weight;

    // Konstruktor för Rock
    public Rock(double weight) {
        this.weight = weight;
    }

    // Metod för att få vikten av stenen
    public double getWeight() {
        return weight;
    }
}

// Bas klassdefinition för Worker
class Worker {
    protected String name;
    protected int age;

    // Konstruktor för Worker
    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Metod för att få arbetarens namn
    public String getName() {
        return name;
    }

    // Metod för att få arbetarens ålder
    public int getAge() {
        return age;
    }
}

// Subklass för BlueCollar som ärver från Worker
class BlueCollar extends Worker {
    public BlueCollar(String name, int age) {
        super(name, age);
    }

    // Metod som simulerar fysiskt arbete
    public void work() {
        System.out.println(name + " is working hard");
    }
}

// Subklass för WhiteCollar som ärver från Worker
class WhiteCollar extends Worker {
    public WhiteCollar(String name, int age) {
        super(name, age);
    }

    // Metod som simulerar kontorsarbete
    public void work() {
        System.out.println(name + " is working in an office");
    }
}

// Bas klassdefinition för Hardware
class Hardware {
    private String name;
    private double price;

    // Konstruktor för Hardware
    public Hardware(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Metod för att få namnet på hårdvarudelen
    public String getName() {
        return name;
    }

    // Metod för att få priset på hårdvarudelen
    public double getPrice() {
        return price;
    }
}

// Subklass för ComputerPart som ärver från Hardware
class ComputerPart extends Hardware {
    private String type;

    // Konstruktor för ComputerPart
    public ComputerPart(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }

    // Metod för att få typen av datordel
    public String getType() {
        return type;
    }
}
