package com.example.zeuslegendarydefense.koindi

import org.koin.core.context.startKoin
import org.koin.dsl.module

val viewModelModule= module {

}
val singletonModule= module {

}


fun initKoin() {
    startKoin { modules(viewModelModule, singletonModule) }
}