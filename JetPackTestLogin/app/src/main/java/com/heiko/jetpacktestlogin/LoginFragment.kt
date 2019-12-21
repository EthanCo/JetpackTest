package com.heiko.jetpacktestlogin

import android.app.ProgressDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.heiko.jetpacktestlogin.frame.compat.ImmersiveComapt


class LoginFragment : Fragment(), View.OnClickListener {
    private lateinit var loadingDialog: ProgressDialog
    //private lateinit var viewModel: LoginViewModel
    private lateinit var viewHodler: ViewHolder

    private val viewModel: LoginViewModel by viewModels {
        InjectorUtils.provideLoginViewModelFactory(requireContext())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.login_fragment, container, false)
        viewHodler = ViewHolder(root)
        /*val compatActivity = activity as AppCompatActivity
        compatActivity.setSupportActionBar(mToolbar)
        compatActivity.title = ""*/
        ImmersiveComapt.immersive(activity, viewHodler.toolbar)
        viewHodler.setOnClickListener(this)
        loadingDialog = ProgressDialog(activity)
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        //viewModel = ViewModelProviders.of(this).get(LoginViewModel::class.java)
        viewModel.toastLiveData.observe(this, Observer { message ->
            Toast.makeText(activity, message, Toast.LENGTH_SHORT).show()
        })
        viewModel.loadingDialogLiveData.observe(this, Observer { isShow ->
            if (isShow) {
                loadingDialog.show()
            } else {
                loadingDialog.dismiss()
            }
        })
        viewModel.loginSuccessLiveData.observe(this, Observer {
            Toast.makeText(activity, "登录成功", Toast.LENGTH_SHORT).show()
            viewModel.loginSuccessLiveData = MutableLiveData()
            val direction = LoginFragmentDirections.actionLoginFragmentToHomeFragment()
            findNavController().navigate(direction)
        })
    }

    override fun onClick(view: View) {
        when (view) {
            viewHodler.btnLogin -> {
                val userName = viewHodler.etUserName.text.toString()
                val password = viewHodler.etPassword.text.toString()
                viewModel.login(userName, password)
            }
        }
    }

    inner class ViewHolder {
        var etUserName: EditText
        var etPassword: EditText
        var toolbar : Toolbar

        var btnLogin: Button

        constructor(view: View) {
            etUserName = view.findViewById(R.id.et_user_name)
            etPassword = view.findViewById(R.id.et_password)
            btnLogin = view.findViewById(R.id.btn_login)
            toolbar = view.findViewById(R.id.toolbar)
        }

        fun setOnClickListener(listener: View.OnClickListener) {
            etUserName.setOnClickListener(listener)
            etPassword.setOnClickListener(listener)
            btnLogin.setOnClickListener(listener)
        }

    }
}
