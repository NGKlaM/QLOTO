package QLOTO;

public class Oto {
    private String nameÔTo;
    private String color;
    private int year;
    private  String Trademark;
    private int Horsepower;
    private float price;
    private int day;

    public Oto(String nameOto, String color, int year, String trademark, int horsepower, float price, int day) {
        this.nameÔTo = nameÔTo;
        this.color = this.color;
        this.year = this.year;
        Trademark = trademark;
        Horsepower = horsepower;
        this.price = this.price;
        this.day = this.day;
    }

    public String getNameÔTo() {
        return nameÔTo;
    }

    public void setNameÔTo(String nameÔTo) {
        this.nameÔTo = nameÔTo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTrademark() {
        return Trademark;
    }

    public void setTrademark(String trademark) {
        Trademark = trademark;
    }

    public int getHorsepower() {
        return Horsepower;
    }

    public void setHorsepower(int horsepower) {
        Horsepower = horsepower;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void inttoto(){
        System.out.println("nhập thông tin oto: ");
        System.out.println("Tên oto:" + nameÔTo + "mầu xe: " + color + "Năm sản xuất: " + year + "Thương Hiệu: " + Trademark
                + "Mã Lực: " + Horsepower + "Giá tiền: " + price + "Ngày xuất kho: " + day);
    }
}
