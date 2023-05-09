package com.selflearning.ikm;

public class InvoiceTest {
    public static void main(String[] args) {
        SalesInvoice s = new SalesInvoice();
        System.out.println(Invoice.formatId("1234")); //invoice

        Invoice i = new SalesInvoice();
        System.out.println(i.formatId("1235")); //invoice

        Invoice i2 = new Invoice();
        //System.out.println((SalesInvoice)Invoice.formatId("1236")); //error

        SalesInvoice s1 = new SalesInvoice();
        System.out.println(s1.formatId("1237")); //sales invoice

        Invoice i3 = new Invoice();
        System.out.println(i3.formatId("1238")); //invoice
    }
}
class Invoice{
    public static String formatId(String oldId){
        return oldId+"_Invoice";
    }
}


class SalesInvoice extends Invoice{
    public static String formatId(String oldId){
        return oldId+"_SalesInvoice";
    }
}
