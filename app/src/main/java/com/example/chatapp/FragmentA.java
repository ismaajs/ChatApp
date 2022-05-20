package com.example.chatapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

import com.example.chatapp.Adaptadores.AdapterPersona;
import com.example.chatapp.Entidades.Persona;


public class FragmentA extends Fragment {
    AdapterPersona adapterPersona;
    RecyclerView RecyclerView;
    ArrayList<Persona> listaPersona;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_a,container,false);
        RecyclerView = view.findViewById(R.id.RecyclerView);
        listaPersona = new ArrayList<>();
        //cargar lista
        cargarLista();


        //mostrar datos
        mostrarData();
        return view;
    }
    public void cargarLista(){
        listaPersona.add(new Persona("Mi amorcito","hola bebe","7:30 p. m.",R.drawable.amorcito2));
        listaPersona.add(new Persona("felilongo","hola bro","5:50 p. m.",R.drawable.felilongo2));
        listaPersona.add(new Persona("tortas","que tranza nigga ","4:01 p. m.",R.drawable.tortas2));
        listaPersona.add(new Persona("mary","hola amix","12:00 p. m.",R.drawable.maryjane2));
        listaPersona.add(new Persona("amix","hola hola hola","11:20 a. m.",R.drawable.amix2));
        listaPersona.add(new Persona("bro","que haces bro?","9:56 a. m.",R.drawable.yo));
        listaPersona.add(new Persona("rocha","hey","8:09 a. m.",R.drawable.mocoso2));
        listaPersona.add(new Persona("bebote","what r u doing man?","5:29 a. m.",R.drawable.bebota2));

    }
    public void mostrarData(){
        RecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
       adapterPersona = new AdapterPersona(getContext(),listaPersona);
       RecyclerView.setAdapter(adapterPersona);
       adapterPersona.setOnCLickLister(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String nombre = listaPersona.get(RecyclerView.getChildAdapterPosition(view)).getNombre();

           }
       });
    }

}