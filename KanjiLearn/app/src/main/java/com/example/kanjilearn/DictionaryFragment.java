package com.example.kanjilearn;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
//import android.app.Fragment;



public class DictionaryFragment extends Fragment {

    private String value = "Hello!";
    private FragmentListener listener;

    public DictionaryFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_dictionary, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        Button myButton = (Button)view.findViewById(R.id.myBtn);
//        myButton.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//                if (listener!=null)
//                listener.onItemClick(value);
//            }
//        });

        ListView dictList = view.findViewById(R.id.dictionaryList);

//        CustomAdapter customAdapter = new CustomAdapter();
//        dictList.setAdapter(customAdapter);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, getListOfWords());
        dictList.setAdapter(adapter);

        dictList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                listener.onItemClick(value);
            }
        });
    }

    String[] getListOfWords (){
        String[] source = new String[]{
                "六",
                "日",
                "月",
                "百",
                "歳",
                "角",
                "大",
                "親",
                "第",
                "感",
                "本",
                "木",
                "分",
                "合",
                "週",
                "十",
                "万",
                "千",
                "曜",
                "水",
                "火",
                "数",
                "今",
                "昨",
                "明",
                "望",
                "先",
                "五",
                "来",
                "見",
                "夜",
                "円",
                "秒",
                "一",
                "二",
                "三",
                "四",
                "七",
                "八",
                "九",
                "入",
                "出",
                "半",
                "方",
                "外",
                "父",
                "母",
                "亡",
                "友",
                "切",
                "肉",
                "当",
                "人",
                "気",
                "語",
                "自",
                "国",
                "間",
                "字",
                "金",
                "土",
                "何",
                "生",
                "田",
               "力",
                "回",
                "肉"
        };
        return source;
    }

//    int[] getListOfKanji (){
        int[] images = new int[]
                {
                R.drawable.ic_six,
                R.drawable.ic_day,
                R.drawable.ic_moon
                };
//        return images;
//    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    public void setOnFragmentListener(FragmentListener listener){
        this.listener = listener;
    }
//    class CustomAdapter extends BaseAdapter{
//        @Override
//        public int getCount() {
//            return source.length;
//        }
//
//        @Override
//        public Object getItem(int position){
//            return null;
//        }
//
//        @Override
//        public long getItemId(int position){
//            return  0;
//        }
//
//        @Override
//        public View getView(int position, View convertView, ViewGroup parent){
//
//            View view = getLayoutInflater().inflate(R.layout.customlist, null);
//
//            ImageView mImageView = (ImageView) view.findViewById(R.id.imageView);
//            TextView mTextView = (TextView)view.findViewById(R.id.textView2);
//
//            mImageView.setImageResource(images[position]);
//            mTextView.setText(source[position]);
//
//            return view;
//        }
//    }
}
