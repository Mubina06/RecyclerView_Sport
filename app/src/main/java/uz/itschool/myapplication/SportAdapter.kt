package uz.itschool.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SportAdapter(var list : MutableList<Sport>): RecyclerView.Adapter<SportAdapter.MyHolder>() {


    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var img = itemView.findViewById<ImageView>(R.id.img)
        var tv1 = itemView.findViewById<TextView>(R.id.tv1)
        var tv2 = itemView.findViewById<TextView>(R.id.tv2)
        var tv3 = itemView.findViewById<TextView>(R.id.tv3)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        var itemView = MyHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false))
        return itemView
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        var sport = list.get(position)
        holder.img.setImageResource(sport.img)
        holder.tv1.setText(sport.tv1)
        holder.tv2.setText(sport.tv2)
        holder.tv3.setText(sport.tv3)
    }

    override fun getItemCount(): Int {
        return list.size
    }

}