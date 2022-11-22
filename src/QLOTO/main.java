package QLOTO;

import java.util.Scanner;


public class main {

    private static Oto[] Listoto;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }
    private static void menu() {
        while (true) {
            System.out.println("1.Thêm xe vào hệ thống quản lý: ");
            System.out.println("2.Tìm kiếm tên xe: ");
            System.out.println("3.Tìm kiếm thương hiệu xe: ");
            System.out.println("4.Sắp xếp xe theo giá bán-mã lực-năm sản xuất: ");
            System.out.println("5.Tìm tất cả các xe có mầu đen và sản xuất trước năm 2018");
            int so = Integer.parseInt(sc.nextLine());
            switch (so) {
                case 1:
                    Nhapvao();
                    break;
                case 2:
                    Timkiemten();
                    break;
                case 3:
                    Timkiemthuonghieu();
                    break;
                case 4:
                    Sapxep();
                    break;
//                case 5:
//                    Timkiemmau();
//                    break;

            }

        }
    }

    private static void Nhapvao() {
        while (true) {
            System.out.println("mời bạn nhập số lượng muốn thêm xe: ");
            int so = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < so; i++) {
                System.out.println("nhap tên xe: " + (i + 1));
                String nameOto = sc.nextLine();
                System.out.println("nhạp mầu : " + (i + 1));
                String color = sc.nextLine();
                System.out.println("nhập năm sản xuất: " + (i + 1));
                int year = Integer.parseInt(sc.nextLine());
                System.out.println("Thương hiệu: " + (i + 1));
                String Trademark = sc.nextLine();
                System.out.println("Mã Lực: " + (i + 1));
                int Horsepower = Integer.parseInt(sc.nextLine());
                System.out.println("Giá tiền: " + (i + 1));
                float price = Integer.parseInt(sc.nextLine());
                System.out.println("Ngày xuất kho: " + (i + 1));
                int day = Integer.parseInt(sc.nextLine());
                Oto car = new Oto(nameOto, color, year, Trademark, Horsepower, price, day);
                Listoto[i] = car;
            }
        }
    }
    private static void Timkiemten() {
        System.out.println("nhap hang can tim kiem: ");
        String name = sc.nextLine();
        System.out.println("ket qua");
        for (int i = 0; i < Listoto.length; i++) {
            if (Listoto[i].getNameÔTo().equals(name)) {
                Listoto[i].inttoto();
            }
        }
    }
    private static void Timkiemthuonghieu() {
        System.out.println("nhap hang can tim kiem: ");
        String name = sc.nextLine();
        System.out.println("ket qua");
        for (int i = 0; i < Listoto.length; i++) {
            if (Listoto[i].getTrademark().equals(name)) {
                Listoto[i].inttoto();
            }

        }
    }
    private static void Sapxep(){

    }
}
