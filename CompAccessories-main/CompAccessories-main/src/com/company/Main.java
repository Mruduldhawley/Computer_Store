package com.company;

import org.nocrala.tools.texttablefmt.*;

import java.util.*;
class Products {
    void displayProducts() {
        CellStyle cs = new CellStyle(CellStyle.HorizontalAlign.center);
        Table t = new Table(3, BorderStyle.CLASSIC_WIDE, ShownBorders.ALL);
        t.setColumnWidth(1, 30, 100);
        t.setColumnWidth(2, 10, 40);
        t.addCell("Sr. No.", cs);
        t.addCell("Name of accessory", cs);
        t.addCell("Price", cs);
        t.addCell("1.", cs);
        t.addCell("Mouse", cs);
        t.addCell("₹600", cs);
        t.addCell("2.", cs);
        t.addCell("Keyboard", cs);
        t.addCell("₹1,000", cs);
        t.addCell("3.", cs);
        t.addCell("Pen Drive", cs);
        t.addCell("₹900", cs);
        t.addCell("4.", cs);
        t.addCell("Earphones", cs);
        t.addCell("₹450", cs);
        t.addCell("5.", cs);
        t.addCell("Speakers", cs);
        t.addCell("₹2,500", cs);
        t.addCell("6.", cs);
        t.addCell("Printer", cs);
        t.addCell("₹3,000", cs);
        t.addCell("7.", cs);
        t.addCell("USB Cable", cs);
        t.addCell("₹200", cs);
        t.addCell("8.", cs);
        t.addCell("HDMI Cable", cs);
        t.addCell("₹250", cs);
        t.addCell("9.", cs);
        t.addCell("Hard Disk", cs);
        t.addCell("₹4,800", cs);
        t.addCell("10.", cs);
        t.addCell("Graphics Card", cs);
        t.addCell("₹3,500", cs);
        System.out.println(t.render());
    }
    void chooseProduct() {
        Scanner sc = new Scanner(System.in);
        int totalPrice = 0, qty, price;
        int[] totalQty = {30, 50, 40, 100, 35, 50, 200, 200, 40, 20};
        String choice = "y";

        loop:
        while(choice.equals("y") || choice.equals("Y")) {
            System.out.print("Enter the product you want (Sr.No.): ");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.print("Enter the product quantity: ");
                    qty = sc.nextInt();

                    if(qty > totalQty[0]) {
                        System.out.println("Sorry, not enough availability. Only " + totalQty[0] + " products available :(");
                        continue loop;
                    }
                    else {
                        price = qty * 600;
                        totalQty[0] -= qty;
                        totalPrice += price;
                        System.out.println("Your total price is: ₹" + price);

                    }
                    break;
                case 2:
                    System.out.print("Enter the product quantity: ");
                    qty = sc.nextInt();
                    if(qty > totalQty[1]) {
                        System.out.println("Sorry, not enough availability. Only " + totalQty[1] + " products available :(");
                        continue loop;
                    }
                    else {
                        price = qty * 1000;
                        totalQty[1] -= qty;
                        totalPrice += price;
                        System.out.println("Your total price is: ₹" + price);
                    }
                    break;
                case 3:
                    System.out.print("Enter the product quantity: ");
                    qty = sc.nextInt();
                    if(qty > totalQty[2]) {
                        System.out.println("Sorry, not enough availability. Only " + totalQty[2] + " products available :(");
                        continue loop;
                    }
                    else {
                        price = qty * 900;
                        totalQty[2] -= qty;
                        totalPrice += price;
                        System.out.println("Your total price is: ₹" + price);
                    }
                    break;
                case 4:
                    System.out.print("Enter the product quantity: ");
                    qty = sc.nextInt();
                    if(qty > totalQty[3]) {
                        System.out.println("Sorry, not enough availability. Only " + totalQty[3] + " products available :(");
                        continue loop;
                    }
                    else {
                        price = qty * 450;
                        totalQty[3] -= qty;
                        totalPrice += price;
                        System.out.println("Your total price is: ₹" + price);
                    }
                    break;
                case 5:
                    System.out.print("Enter the product quantity: ");
                    qty = sc.nextInt();
                    if(qty > totalQty[4]) {
                        System.out.println("Sorry, not enough availability. Only " + totalQty[4] + " products available :(");
                        continue loop;
                    }
                    else {
                        price = qty * 2500;
                        totalQty[4] -= qty;
                        totalPrice += price;
                        System.out.println("Your total price is: ₹" + price);
                    }
                    break;
                case 6:
                    System.out.print("Enter the product quantity: ");
                    qty = sc.nextInt();
                    if(qty > totalQty[5]) {
                        System.out.println("Sorry, not enough availability. Only " + totalQty[5] + " products available :(");
                        continue loop;
                    }
                    else {
                        price = qty * 3000;
                        totalQty[5] -= qty;
                        totalPrice += price;
                        System.out.println("Your total price is: ₹" + price);
                    }
                    break;
                case 7:
                    System.out.print("Enter the product quantity: ");
                    qty = sc.nextInt();
                    if(qty > totalQty[6]) {
                        System.out.println("Sorry, not enough availability. Only " + totalQty[6] + " products available :(");
                        continue loop;
                    }
                    else {
                        price = qty * 200;
                        totalQty[6] -= qty;
                        totalPrice += price;
                        System.out.println("Your total price is: ₹" + price);
                    }
                    break;
                case 8:
                    System.out.print("Enter the product quantity: ");
                    qty = sc.nextInt();
                    if(qty > totalQty[7]) {
                        System.out.println("Sorry, not enough availability. Only " + totalQty[7] + " products available :(");
                        continue loop;
                    }
                    else {
                        price = qty * 250;
                        totalQty[7] -= qty;
                        totalPrice += price;
                        System.out.println("Your total price is: ₹" + price);
                    }
                    break;
                case 9:
                    System.out.print("Enter the product quantity: ");
                    qty = sc.nextInt();
                    if(qty > totalQty[8]) {
                        System.out.println("Sorry, not enough availability. Only " + totalQty[8] + " products available :(");
                        continue loop;
                    }
                    else {
                        price = qty * 4800;
                        totalQty[8] -= qty;
                        totalPrice += price;
                        System.out.println("Your total price is: ₹" + price);
                    }
                    break;
                case 10:
                    System.out.print("Enter the product quantity: ");
                    qty = sc.nextInt();
                    if(qty > totalQty[9]) {
                        System.out.println("Sorry, not enough availability. Only " + totalQty[9] + " products available :(");
                        continue loop;
                    }
                    else {
                        price = qty * 3500;
                        totalQty[9] -= qty;
                        totalPrice += price;
                        System.out.println("Your total price is: ₹" + price);
                    }
                    break;
                default:
                    System.out.println("Wrong option. Please enter again");
                    continue loop;
            }
            System.out.print("Do you want to purchase another item? (Y/n): ");
            choice = sc.next();
        }
        System.out.println("\nGrand total = ₹" + totalPrice);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to our Store");
        System.out.println("Here is the list of our products:");
        Products p = new Products();
        p.displayProducts();
        p.chooseProduct();
    }
}