package kr.co.namu.listview_20200628.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
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

//        row -> student_list_item XML에서 어댑터kt파일로 뷰를 가져오자.
        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)
        val ageTxt = row.findViewById<TextView>(R.id.ageTxt)
        val addressTxt = row.findViewById<TextView>(R.id.addressTxt)

//        상황에 맞는 (=> postion에 들어있는 값에 맞는) 데이터를 출력

//        목록중 위치에 맞는 데이터를 뽑아서 변수에 저장
        val studentData = mList[position]

//        뽑은 데이터를 텍스트뷰에 반영
        nameTxt.text = studentData.name

//        생년을 가지고 => 2020년 현재의 나이를 구해서 출력 => 1988 => 33세
//        02년생 => 2020년에 몇살 ? 19살

//        현재년도 - 생년 + 1

        ageTxt.text = "${2020-studentData.birthYear+1}세"

//        거주지 정보 표기
        addressTxt.text = studentData.address

        return row
    }

}