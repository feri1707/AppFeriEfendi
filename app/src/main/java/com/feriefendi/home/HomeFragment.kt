package com.feriefendi.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_home.*

class Homefragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun  simulasiDataTeman(){
        listTeman= ArrayList()
        listTeman.add(
            MyFriend("Feri Efendi", "Laki-laki", "ferdiefendi.1707@gmail.com",
            "083857906912", "Sampang Madura")
        )
        listTeman.add(
            MyFriend("Moh. Syamsul Arifin", "Laki-laki", "moh.syamsularifin@gmail.com",
        "081914722463", "Pamekasan Madura")
        )
        listTeman.add(
            MyFriend("Ahmad Faisal", "Laki-laki", "ahmad.faisal@gmail.com",
                "085955432776", "Sumenep Madura")
        )
        listTeman.add(
            MyFriend("Laila", "Perempuan", "ela.laila@gmail.com",
                "088247732661", "Bogor")
        )
        listTeman.add(
            MyFriend("Faiza", "Perempuan", "izza.iza@gmail.com",
                "082776534267", "Surabaya")
        )
        listTeman.add(
            MyFriend("Abdullah Arwani", "Laki-laki", "abdullah.arwani@gmail.com",
                "082776534267", "Malang")
        )
        listTeman.add(
            MyFriend("Idzam", "Laki-laki", "idzam.syahroni@gmail.com",
                "083875876546", "Malang")
        )
    }

    private fun tampilTeman(){
        rv_listMyfriend.layoutManager=LinearLayoutManager(activity)
        rv_listMyfriend.adapter=MyFriendAdapter(requireActivity(),listTeman)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView(){
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}