abstract class Product{
    int id;
    Product(int id){this.id=id;}
    abstract void show();
}
class Book extends Product{
    Book(int id){super(id);}
    void show(){System.out.println("Book ID:"+id);}
}
class CD extends Product{
    CD(int id){super(id);}
    void show(){System.out.println("CD ID:"+id);}
}
class Main{
    public static void main(String[] a){
        Product p=new Book(1); p.show();
        p=new CD(2); p.show();
    }
}
