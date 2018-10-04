package com.example.admin.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.shashank.sony.fancytoastlib.FancyToast;

class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolderClass> {
    String[] arr;
    String[] arr1;
    int[] image;
    Context context;
    String[] arr2;
    String[] arr3;

    public RecycleAdapter(MainActivity mainActivity, int[] image, String[] arr, String[] arr1,String[] arr2,String[] arr3) {
        context = mainActivity;
        this.arr = arr;
        this.arr1 = arr1;
        this.image = image;
        this.arr2=arr2;
        this.arr3=arr3;
    }

    @NonNull
    @Override
    public RecycleAdapter.ViewHolderClass onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_recycler_view, viewGroup, false);
        ViewHolderClass viewHolderClass = new ViewHolderClass(view);
        return viewHolderClass;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderClass viewHolderClass, final int i) {
        viewHolderClass.txt1.setText(arr[i]);
        viewHolderClass.txt2.setText(arr1[i]);
        viewHolderClass.image1.setImageResource(image[i]);
         viewHolderClass.txt1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 FancyToast.makeText(context, arr2[i], FancyToast.LENGTH_LONG,FancyToast.INFO,true).show();
             }
         });
         viewHolderClass.image1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 FancyToast.makeText(context,arr3[i],FancyToast.LENGTH_SHORT,FancyToast.SUCCESS,image[i]).show();
             }
         });

    }

    // @Override
    //public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    //}

    @Override
    public int getItemCount() {
        return arr.length;
    }

    public class ViewHolderClass extends RecyclerView.ViewHolder {
        TextView txt1;
        TextView txt2;
        ImageView image1;

        public ViewHolderClass(@NonNull View itemView) {
            super(itemView);
            txt1=itemView.findViewById(R.id.txt1);
            txt2=itemView.findViewById(R.id.txt2);
            image1=itemView.findViewById(R.id.image1);
        }
    }


}

