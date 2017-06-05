package com.example.zoneker.mydemo.InternetRequest

import android.content.Context
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.VolleyError
import com.android.volley.toolbox.Volley

/**
 * Created by Zoneker on 2017/6/5.
 */
 class  SimpleRequest private constructor(var ctx: Context){
    private var requestQueue : RequestQueue? = null
    init {
        requestQueue = getRequestQueue()
    }
   private fun getRequestQueue() : RequestQueue? {
       if (requestQueue==null){
           requestQueue = Volley.newRequestQueue(ctx)
       }
       return requestQueue
   }
    //同步的代码块
    companion object{
        private var simpleRequest : SimpleRequest? = null
        @Synchronized  fun getInstance(ctx : Context) : SimpleRequest {
            if (simpleRequest == null){
                simpleRequest = SimpleRequest(ctx)
            }
            return simpleRequest as SimpleRequest
        }
    }
    //添加到请求队列
    fun <T> addToRequestQueue(request : Request<T>) {
        getRequestQueue()!!.add(request)

    }


}