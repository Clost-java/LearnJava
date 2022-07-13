import java.util.ArrayList;

/**
 * @author:clost
 * @date:2022/7/13
 */
public class ListExam {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Book("三国演义",89.5,"xx"));
        list.add(new Book("红楼梦",76.1,"xx"));
        list.add(new Book("聊斋",99.3,"sss"));

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < i; j++){
                Book book1 = (Book)list.get(i);
                Book book2 = (Book)list.get(j);
                if(book1.getPrice() < book2.getPrice()){

                }
            }
        }


    }
}
class Book{
    private String name;
    private double price;
    private String author;

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
