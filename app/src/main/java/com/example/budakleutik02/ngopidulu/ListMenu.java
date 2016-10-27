package com.example.budakleutik02.ngopidulu;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.budakleutik02.ngopidulu.adapter.Product;
import com.example.budakleutik02.ngopidulu.adapter.ProductListAdapter;
import com.example.budakleutik02.ngopidulu.utils.SharedPreference;

import java.util.ArrayList;
import java.util.List;


public class ListMenu extends AppCompatActivity{

    public static final String ARG_ITEM_ID = "product_list";

    ListView productListView;
    List<Product> products, favorite;
    ProductListAdapter productListAdapter;

    SharedPreference sharedPreference;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_produk);

        setProducts();
        sharedPreference = new SharedPreference();
        productListAdapter = new ProductListAdapter(getApplicationContext(), products);

        productListView = (ListView) findViewById(R.id.list_product);
        productListView.setAdapter(productListAdapter);

    }

    private void setProducts() {

        Product product1 = new Product(1, "Cappuccino",
                "merupakan kopi dengan penambahan susu, krim, dan serpihan cokelat", 10000);
        Product product2 = new Product(2, "Dry cappuccino",
                "merupakan cappuccino dengan sedikit krim dan tanpa susu.", 10000);
        Product product3 = new Product(3, "Frappé",
                "merupakan espresso yang disajikan dingin.", 8000);
        Product product4 = new Product(4, "Kopi Irlandia (irish coffee)",
                "merupakan kopi yang dicampur dengan wiski.", 12000);
        Product product5 = new Product(5, "Melya",
                "sejenis kopi dengan penambahan bubuk cokelat dan madu.", 15000);
        Product product6 = new Product(6, "Kopi tubruk",
                "kopi asli Indonesia yang dibuat dengan memasak biji kopi bersama dengan gula.", 10000);
        Product product7 = new Product(7, "Café au lait",
                "serupa dengan caffe latte tetapi menggunakan campuran kopi hitam.", 12000);
        Product product8 = new Product(8, "Latte (coffee latte)",
                "merupakan sejenis kopi espresso yang ditambahkan susu dengan rasio antara susu dan kopi 3:1", 12000);
        Product product9 = new Product(9, "Espresso",
                "merupakan kopi yang dibuat dengan mengekstraksi biji kopi menggunakan uap panas pada tekanan tinggi.", 8000);
        Product product10 = new Product(10, "Café au lait",
                "serupa dengan caffe latte tetapi menggunakan campuran kopi hitam.", 12000);

        products = new ArrayList<Product>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);
        products.add(product10);
    }
}
