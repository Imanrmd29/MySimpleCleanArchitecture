package com.iman.mysimplecleanarchitecture.di

import com.iman.mysimplecleanarchitecture.data.IMessageDataSource
import com.iman.mysimplecleanarchitecture.data.MessageDataSource
import com.iman.mysimplecleanarchitecture.data.MessageRepository
import com.iman.mysimplecleanarchitecture.domain.IMessageRepository
import com.iman.mysimplecleanarchitecture.domain.MessageInteractor
import com.iman.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}