package com.example.ecommerceapp.activities;

import static android.app.PendingIntent.getActivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import com.example.ecommerceapp.R;
import com.example.ecommerceapp.adapters.ShowAllAdapter;
import com.example.ecommerceapp.models.NewProductsModel;
import com.example.ecommerceapp.models.ShowAllModel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class ShowAllActivity extends AppCompatActivity {
RecyclerView recyclerView;
ShowAllAdapter showAllAdapter;
List<ShowAllModel> showAllModelList;

FirebaseFirestore firestore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_all);

        String type=getIntent().getStringExtra("type");
        firestore=FirebaseFirestore.getInstance();

        recyclerView=findViewById(R.id.show_all_rec);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        showAllModelList=new ArrayList<>();
        showAllAdapter=new ShowAllAdapter(this,showAllModelList);
        recyclerView.setAdapter(showAllAdapter);


        if(type ==null || type.isEmpty()){
            firestore.collection("AllProducts")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {
                            if (task.isSuccessful()) {
                                for (QueryDocumentSnapshot document : task.getResult()) {
                                    ShowAllModel newProductsModel=document.toObject(ShowAllModel.class);
                                    showAllModelList.add(newProductsModel);
                                    showAllAdapter.notifyDataSetChanged();
                                }
                            }

                        }



                    });

        }
        if(type !=null && type.equalsIgnoreCase("HG")){
            firestore.collection("AllProducts").whereEqualTo("type","HG")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {
                            if (task.isSuccessful()) {
                                for (QueryDocumentSnapshot document : task.getResult()) {
                                    ShowAllModel newProductsModel=document.toObject(ShowAllModel.class);
                                    showAllModelList.add(newProductsModel);
                                    showAllAdapter.notifyDataSetChanged();
                                }
                            }

                        }



                    });

        }  if(type !=null && type.equalsIgnoreCase("HG")){
            firestore.collection("AllProducts").whereEqualTo("type","HG")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {
                            if (task.isSuccessful()) {
                                for (QueryDocumentSnapshot document : task.getResult()) {
                                    ShowAllModel newProductsModel=document.toObject(ShowAllModel.class);
                                    showAllModelList.add(newProductsModel);
                                    showAllAdapter.notifyDataSetChanged();
                                }
                            }

                        }



                    });

        }  if(type !=null && type.equalsIgnoreCase("HG")){
            firestore.collection("AllProducts").whereEqualTo("type","HG")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {
                            if (task.isSuccessful()) {
                                for (QueryDocumentSnapshot document : task.getResult()) {
                                    ShowAllModel newProductsModel=document.toObject(ShowAllModel.class);
                                    showAllModelList.add(newProductsModel);
                                    showAllAdapter.notifyDataSetChanged();
                                }
                            }

                        }



                    });

        }  if(type !=null && type.equalsIgnoreCase("MG")){
            firestore.collection("AllProducts").whereEqualTo("type","MG")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {
                            if (task.isSuccessful()) {
                                for (QueryDocumentSnapshot document : task.getResult()) {
                                    ShowAllModel newProductsModel=document.toObject(ShowAllModel.class);
                                    showAllModelList.add(newProductsModel);
                                    showAllAdapter.notifyDataSetChanged();
                                }
                            }

                        }



                    });

        }  if(type !=null && type.equalsIgnoreCase("MG")){
            firestore.collection("AllProducts").whereEqualTo("type","MG")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {
                            if (task.isSuccessful()) {
                                for (QueryDocumentSnapshot document : task.getResult()) {
                                    ShowAllModel newProductsModel=document.toObject(ShowAllModel.class);
                                    showAllModelList.add(newProductsModel);
                                    showAllAdapter.notifyDataSetChanged();
                                }
                            }

                        }



                    });

        }
        if(type !=null && type.equalsIgnoreCase("HG")){
            firestore.collection("AllProducts").whereEqualTo("type","HG")
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {
                            if (task.isSuccessful()) {
                                for (QueryDocumentSnapshot document : task.getResult()) {
                                    ShowAllModel newProductsModel=document.toObject(ShowAllModel.class);
                                    showAllModelList.add(newProductsModel);
                                    showAllAdapter.notifyDataSetChanged();
                                }
                            }

                        }



                    });

        }
    }
}