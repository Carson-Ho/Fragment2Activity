package scut.carson_ho.fragment_2_activity;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Carson_Ho on 17/6/2.
 */
public class mFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.fragment, container, false);
        // 设置布局文件

        return contentView;
    }

    // 设置 接口回调 方法
    public void sendMessage(ICallBack callBack){

        callBack.get_message_from_Fragment("消息:我来自Fragment");

    }
}
