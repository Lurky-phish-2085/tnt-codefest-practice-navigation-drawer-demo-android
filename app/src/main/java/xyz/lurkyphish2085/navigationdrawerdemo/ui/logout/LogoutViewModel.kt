package xyz.lurkyphish2085.navigationdrawerdemo.ui.logout

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LogoutViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    private val _text = MutableLiveData<String>().apply {
       value = "This is logout fragment"
    }

    val text: LiveData<String> = _text
}