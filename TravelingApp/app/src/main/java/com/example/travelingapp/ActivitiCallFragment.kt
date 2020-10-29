package com.example.travelingapp

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

fun FragmentManager.doTrasaction(func: FragmentTransaction.()->FragmentTransaction){
    beginTransaction().func().commit()

}
fun AppCompatActivity.addFragment(framId: Int, fragment: Fragment){
    supportFragmentManager.doTrasaction { add(framId,fragment) }

}
fun AppCompatActivity.replaceFragment(framId: Int, fragment: Fragment){
    supportFragmentManager.doTrasaction { replace(framId,fragment) }

}
fun AppCompatActivity.removeFragment(fragment: Fragment){
    supportFragmentManager.doTrasaction { remove(fragment) }

}