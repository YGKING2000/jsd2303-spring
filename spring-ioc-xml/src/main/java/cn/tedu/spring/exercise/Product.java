package cn.tedu.spring.exercise;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className Product
 * @date 2023/05/04 16:57
 */
public class Product {
    private String title;
    private Integer num;
    private Integer sales;
    private String comment;

    public Product() {
    }

    public Product(String title, Integer num, Integer sales, String comment) {
        this.title = title;
        this.num = num;
        this.sales = sales;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", num=" + num +
                ", sales=" + sales +
                ", comment='" + comment + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
