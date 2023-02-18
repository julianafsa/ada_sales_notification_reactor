package org.example.bd;

import org.example.model.Sale;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private List<Sale> sales = new ArrayList<>();

    public List<Sale> getSales() {
        return sales;
    }

    public void setSales(List<Sale> sales) {
        this.sales = sales;
    }

    public void addSale(Sale sale) {
        this.sales.add(sale);
    }
}
