package 设计原则.开闭原则;

import java.util.ArrayList;

/**
 * @author zheng
 * @description TODO
 * @date 2021/1/26
 */
public class BookStore {
    private final static ArrayList<IBook> bookList = new ArrayList<>();

    static {
        bookList.add(new NovelBook("天龙八部", 3200, "金庸"));
        bookList.add(new NovelBook("天龙八部", 3200, "金庸"));
        bookList.add(new NovelBook("天龙八部", 3200, "金庸"));
    }

    public static void main(String[] args) {
        bookList.forEach(System.out::println);
    }
}
