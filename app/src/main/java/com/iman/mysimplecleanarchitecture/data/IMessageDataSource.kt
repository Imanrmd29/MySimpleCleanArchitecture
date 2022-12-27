package com.iman.mysimplecleanarchitecture.data

import com.iman.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}