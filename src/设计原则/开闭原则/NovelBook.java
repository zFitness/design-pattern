package 设计原则.开闭原则;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/26
 */
public class NovelBook implements IBook{
    private String name;
    private int price;
    private String author;

    public NovelBook(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public String getAuthor() {
        return null;
    }

    @Override
    public String toString() {
        return "NovelBook{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
