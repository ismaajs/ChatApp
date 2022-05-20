package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btnCamara;
    ImageView visor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    private void camara(){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if(intent.resolveActivity(getPackageManager())!=null){
           startActivityForResult(intent, 1);
        }
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data );
        if (requestCode ==1 && resultCode==RESULT_OK){
            Bundle extras = data.getExtras();
            Bitmap imgBitmap = (Bitmap) extras.get("data");
            visor.setImageBitmap(imgBitmap);
        }
    }

    //metodos para reemplazar fragments
    public void mostrarFA(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.FrameLayout, new FragmentA()).commit();
    }
    public void mostrarFB(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.FrameLayout, new FragmentB()).commit();
    }
    public void mostrarFC(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.FrameLayout, new FragmentC()).commit();
    }
    public void mostrarFD(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.FrameLayout, new FragmentD()).commit();
    }
    public void mostrarFE(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.FrameLayout, new FragmentE()).commit();
    }
    public void mostrarh1(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.FrameLayout, new historia()).commit();
    }
    public void mostrarh2(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.FrameLayout, new historia2()).commit();
    }
    public void mostrarh3(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.FrameLayout, new historia3()).commit();
    }
    public void mostrarh4(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.FrameLayout, new historia4()).commit();
    }
}