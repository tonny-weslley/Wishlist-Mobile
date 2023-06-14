package com.example.wishlist.Models

import java.net.URL

class Wish {
    //atributes
    private var name: String
    private var description: String
    private var price: Double
    private var url: URL
    private var priority: Int

    //construtor
    constructor(name: String, description: String, price: Double, url: URL, priority: Int){
        this.name = name
        this.description = description
        this.price = price
        this.url = url
        this.priority = priority
    }

    //getters
    public fun getName(): String{
        return this.name
    }

    public fun getDescription(): String{
        return this.description
    }

    public fun getPrice(): Double{
        return this.price
    }

    public fun getUrl(): URL{
        return this.url
    }

    public fun getPriority(): Int{
        return this.priority
    }



}