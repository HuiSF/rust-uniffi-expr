package com.example.rustshreadlibrary

import org.junit.Test

import org.junit.Assert.*
import uniffi.shared_lib.add

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testRustFunction() {
        assertEquals(add(40u, 2u), 42u)
    }
}