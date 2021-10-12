package com.krishana.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class newslistAdapter(val items : ArrayList<String>,  private  val listener : newsitemclicked ) : RecyclerView.Adapter<newsviewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): newsviewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemnews,parent,false);
        val viewHolder = newsviewHolder(view)
        view.setOnClickListener{
            listener.onitemclicked(items[viewHolder.absoluteAdapterPosition])
        }
       return viewHolder;
    }

    override fun onBindViewHolder(holder: newsviewHolder, position: Int) {
        val currentitem = items[position]
        holder.title.text = currentitem

    }

    override fun getItemCount(): Int {
        return items.size;
    }


}
class newsviewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val title : TextView = itemView.findViewById(R.id.title);

}
interface  newsitemclicked{
    fun onitemclicked(item : String)
}