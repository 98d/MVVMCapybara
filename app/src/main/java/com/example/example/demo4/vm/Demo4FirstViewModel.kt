package com.example.example.demo4.vm

import android.app.Application
import android.view.View
import androidx.lifecycle.MutableLiveData
import com.capybara.mvvm.action.ActivityActions
import com.capybara.mvvm.action.FragmentActions
import com.capybara.mvvm.model.BaseModel
import com.capybara.mvvm.vm.base.BaseFragmentViewModel
import com.example.example.demo4.fragment.Demo4RootFragment

class Demo4FirstViewModel(application: Application) :
    BaseFragmentViewModel<BaseModel>(application) {
    override fun getModel(): Class<BaseModel>? = null

    /** 创建自己的业务的Demo1Actions ，并转达给父类 ，若无需Actions，传NUll即可*/
    override fun onCreateActions(): FragmentActions? =null

    var position = MutableLiveData(1)

    fun onClickTxt(view: View) {
        start(Demo4RootFragment(),true)
    }

}