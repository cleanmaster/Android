package com.example.yogita.mobilecontact;

import android.content.ContentResolver;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.database.*;
import android.net.Uri;
/**
 * Created by Yogita on 11-04-2016.
 */
public class SecondActivity extends AppCompatActivity{
    ListView view;
    private static final int REQ=1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.listitem);
        view=(ListView)findViewById(R.id.listView);
        Intent i1=new Intent(Intent.ACTION_PICK, ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
        startActivityForResult(i1,REQ);
    }

        @Override
    protected void onActivityResult(int requestCode, int resultCode ,Intent data )
        {
            super.onActivityResult(requestCode,resultCode,data);
            int[] to=new int[]{R.id.textView,R.id.textView2};
            String[] from =new String[]{ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME,ContactsContract.CommonDataKinds.Phone.NUMBER};
            if(requestCode==REQ && resultCode==RESULT_OK)
            {
                Uri contactData= data.getData();
                ContentResolver resolver=getContentResolver();
                Cursor cursor=resolver.query(contactData, new String[]{
                                ContactsContract.CommonDataKinds.Phone._ID, ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME, ContactsContract.CommonDataKinds.Phone.NUMBER}, null, null, null);
                SimpleCursorAdapter adapter =new SimpleCursorAdapter(this,R.layout.secondactivity,cursor,from,to);
                view.setAdapter(adapter);
            }
        }
}
