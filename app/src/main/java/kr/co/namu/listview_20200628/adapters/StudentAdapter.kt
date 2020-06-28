package kr.co.namu.listview_20200628.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kr.co.namu.listview_20200628.R
import kr.co.namu.listview_20200628.datas.Student

class StudentAdapter(val mContext:Context, val resId:Int, val mList:ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList) {

    val inf = LayoutInflater.from(mContext)

//    한줄씩 직접 그려주는 함수
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.student_list_item, null)
        }
        val row = tempRow!!

        return row
    }

}