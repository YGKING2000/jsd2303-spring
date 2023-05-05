package cn.tedu.homework.di;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className Order2
 * @date 2023/05/05 09:13
 */
public class Order2 {
    private Integer id;
    private String title;
    private Integer num;
    private Integer sales;
    private String comment;

    public Order2() {
    }

    public Order2(Integer id, String title, Integer num, Integer sales, String comment) {
        this.id = id;
        this.title = title;
        this.num = num;
        this.sales = sales;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Order2{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", num=" + num +
                ", sales=" + sales +
                ", comment='" + comment + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
