package com.groger.customer.model


import java.io.Serializable

class Faq : Serializable {
    lateinit var id: String
    lateinit var question: String
    lateinit var answer: String
    lateinit var status: String
}