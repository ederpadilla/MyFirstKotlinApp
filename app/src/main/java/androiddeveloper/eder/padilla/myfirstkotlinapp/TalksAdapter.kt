package androiddeveloper.eder.padilla.myfirstkotlinapp

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_talk.view.*

/**
 * Created by ederpadilla on 30/05/17.
 */
class TalksAdapter (val talks: MutableList<Talk>) : RecyclerView.Adapter<TalksAdapter.TalkViewHolder>() {


    override fun getItemCount(): Int {
        return talks.size
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: TalkViewHolder?, position: Int) {
        val talk = talks[position]
        holder?.bidTalk(talk)
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): TalkViewHolder {
        val itemView = parent?.inflate(R.layout.item_talk)
        return TalkViewHolder(itemView)
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    class TalkViewHolder(itemView : View?):RecyclerView.ViewHolder(itemView){
        fun bidTalk(talk : Talk){
            itemView?.let {
                with(itemView){
                    labelDate?.text=talk.date
                    labelTitle?.text=talk.title
                    labelName?.text = talk.spreaker.name
                    labelJob?.text =talk.spreaker.job
                }
            }
        }
    }
}