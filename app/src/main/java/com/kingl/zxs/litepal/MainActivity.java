package com.kingl.zxs.litepal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import org.litepal.LitePal;
import org.litepal.crud.DataSupport;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button createDatabase=(Button)findViewById(R.id.create_database);
        createDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LitePal.getDatabase();
            }
        });
        Button addData=
                (Button)findViewById(R.id.insert_table);
        addData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Book book=new Book();
                book.setAuthor("朱雪松");
                book.setName("生与死");
                book.setPages(9999);
                book.setPrice(9999.00);
                book.setPress("NULL");
                book.save();
            }
        });
        Button queryBtn=(Button)findViewById(R.id.query_data);
        queryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Book> books= DataSupport.findAll(Book.class);
                for (Book book:
                     books) {
                    Log.d(TAG, "书名: "+book.getName());
                    Log.d(TAG, "作者: "+book.getAuthor());
                    Log.d(TAG, "页数: "+book.getPages());
                    Log.d(TAG, "价格: "+book.getPrice());
                    Log.d(TAG, "介绍: "+book.getPress());
                    Log.d(TAG, "ID: "+book.getId());
                }
            }
        });
        Button updateBtn=(Button)findViewById(R.id.update_data);
        updateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Book book=new Book();
//                book.setToDefault("pages");
//                book.updateAll();

                Book book=new Book();
                book.setPrice(999991);
                book.setPress("Anchor");
                book.updateAll("id=?","1");
            }
        });
        Button deleteBtn=(Button)findViewById(R.id.delete_data);
        deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataSupport.deleteAll(Book.class,"id=?","2");
            }
        });
    }
}
