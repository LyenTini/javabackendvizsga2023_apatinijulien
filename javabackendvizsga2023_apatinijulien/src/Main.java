import java.util.*;
public class Main {
//1. Feladat -------------------------------------------------------------------------
        public static void priceWithVAT(){

            Scanner sc = new Scanner(System.in);
            boolean done = false;
            while (!done) {
                System.out.println("Adja meg a könyv szerzőjét: ");
                String szerzo = sc.nextLine();

                System.out.println("Adja meg a könyv címét: ");
                String cim = sc.nextLine();

                System.out.println("Adja meg az áfakulcsot: ");
                int afakulcs = sc.nextInt();

                System.out.println("Adja meg a termék áfa nélküli árát: ");
                int termekAr = sc.nextInt();

                switch (afakulcs) {
                    case 5 :
                        System.out.println(szerzo+" - "+cim+" Áfával: "+termekAr * 1.05+" Ft, Áfa nélkül: "+termekAr+"\n\n");
                        done = true;
                        break;
                    case 18 :
                        System.out.println(szerzo+" - "+cim+" Áfával: "+termekAr * 1.18+" Ft, Áfa nélkül: "+termekAr+"\n\n");
                        done = true;
                        break;
                    case 27 :
                        System.out.println(szerzo+" - "+cim+" Áfával: "+termekAr * 1.27+" Ft, Áfa nélkül: "+termekAr+"\n\n");
                        done = true;
                        break;
                    default :
                        System.out.println("Érvénytelen áfakulcs!");
                }
            }
        }
        public static void priceWithoutVAT(){

            Scanner sc = new Scanner(System.in);
            boolean done = false;
            while (!done) {
                System.out.println("Adja meg a könyv szerzőjét: ");
                String szerzo = sc.nextLine();

                System.out.println("Adja meg a könyv címét: ");
                String cim = sc.nextLine();

                System.out.println("Adja meg az áfakulcsot: ");
                int afakulcs = sc.nextInt();

                System.out.println("Adja meg áfával a termék árát: ");
                int termekAr = sc.nextInt();

                switch (afakulcs) {
                    case 5 :
                        System.out.println("Az áfakulcs 5");
                        System.out.println(szerzo+" - "+cim+" Áfával: "+termekAr+" Ft, Áfa nélkül: "+(termekAr/105) * 100+"\n\n");
                        done = true;
                        break;
                    case 18 :
                        System.out.println("Az áfakulcs 18");
                        System.out.println(szerzo+" - "+cim+" Áfával: "+termekAr+" Ft, Áfa nélkül: "+(termekAr/118) * 100+"\n\n");
                        done = true;
                        break;
                    case 27 :
                        System.out.println("Az áfakulcs 27");
                        System.out.println(szerzo+" - "+cim+" Áfával: "+termekAr+" Ft, Áfa nélkül: "+(termekAr/127) * 100+"\n\n");
                        done = true;
                        break;
                    default :
                        System.out.println("Érvénytelen áfakulcs!");
                }
            }
        }

        public static void displayBook() {
            priceWithVAT();
            priceWithoutVAT();
        }


//2. Feladat -------------------------------------------------------------------------
        public static class Book{
            private int id;
            private String author;
            private String title;
            private int price;
            private boolean onSale;

            public Book(int id, String author, String title, int price, boolean onSale) {
                this.id = id;
                this.author = author;
                this.title = title;
                this.price = price;
                this.onSale = onSale;
            }

            public int getId() {
                return id;
            }
            public void setId(int newId) {
                this.id = newId;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String newAuthor) {
                this.author = newAuthor;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String newTitle) {
                this.title = newTitle;
            }
            public int getPrice() {
                return price;
            }
            public void setPrice(int newPrice) {
                this.price = newPrice;
            }
            public boolean isOnSale() {
                return onSale;
            }

            public void setOnSale(boolean onSale) {
                this.onSale = onSale;
            }
        }
        public static void getCurrentPrice(){
            List<Book> list = new ArrayList<Book>();

            Book a = new Book(1,"Kazinczy Ferenc","A nagy titok",1850,true);
            Book b = new Book(1,"Kölcsey Ferenc","Himnusz",7500,false);
            Book c = new Book(1,"Madách Imre","Az ember tragédiája",3600,true);
            Book d = new Book(1,"Móricz Zsigmond","Légy jó mindhalálig",5400,false);

            list.add(a);
            list.add(b);
            list.add(c);
            list.add(d);

            for (var book: list) {
                if(book.isOnSale()== true){
                    System.out.println(book.getAuthor()+" - "+book.getTitle()+": "+(book.getPrice()*0.85)+" Ft");
                } else if (book.isOnSale()== false) {
                    System.out.println(book.getAuthor()+" - "+book.getTitle()+": "+book.getPrice()+" Ft");
                }
            }

        }
    public static void main(String[] args) {
        //1. Feladat
        displayBook();
        //2. Feladat
        getCurrentPrice();

    }
}