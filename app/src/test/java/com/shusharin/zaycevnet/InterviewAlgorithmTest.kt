package com.shusharin.zaycevnet

import com.shusharin.zaycevnet.algorithms.InterviewAlgorithm
import org.junit.Assert
import org.junit.Test
import kotlin.random.Random

class InterviewAlgorithmTest {

    @Test
    fun null_array() {
        val ar = arrayListOf<Int>(0, 0, 0, 0, 0, 0, 0)
        val actual = InterviewAlgorithm().calculate(ar)
        val expected = 0
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun empty_array() {
        val ar = arrayListOf<Int>()
        val actual = InterviewAlgorithm().calculate(ar)
        val expected = 0
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun array_from_task() {
        val ar = arrayListOf<Int>(1, 3, 4, 2, 6, 5)
        val actual = InterviewAlgorithm().calculate(ar)
        val expected = 14
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun sorted_array_up() {
        val ar = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val actual = InterviewAlgorithm().calculate(ar)
        val expected = 44
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun sorted_array_down() {
        val ar = arrayListOf<Int>(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
        val actual = InterviewAlgorithm().calculate(ar)
        val expected = 44
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun one_number_array() {
        val ar = arrayListOf<Int>(2, 2, 2, 2, 2, 2, 2, 2, 2)
        val actual = InterviewAlgorithm().calculate(ar)
        val expected = 0
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun wrong_number_first() {
        val ar = arrayListOf<Int>(2, 2, 2, 3, 4, 2)
        val actual = InterviewAlgorithm().calculate(ar)
        val expected = 3
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun another_one_number_array() {
        val ar = arrayListOf<Int>(2, 3, 2, 1, 3, 5, 4, 2)
        val actual = InterviewAlgorithm().calculate(ar)
        val expected = 16
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun wrong_number_end() {
        val ar = arrayListOf<Int>(3, 5, 4, 2, 2, 2)
        val actual = InterviewAlgorithm().calculate(ar)
        val expected = 7
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun number_to_delete_in_start() {
        val ar = arrayListOf<Int>(1, 1, 1, 1, 10, 10, 4, 5)
        val actual = InterviewAlgorithm().calculate(ar)
        val expected = 9
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun two_number() {
        val ar = arrayListOf<Int>(0, 1, 1, 1, 0, 0, 0, 1, 0)
        val actual = InterviewAlgorithm().calculate(ar)
        val expected = 0
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun number_to_delete_at_end() {
        val ar = arrayListOf<Int>(0, 1, 1, 1, 0, 0, 0, 1, 10, -1)
        val actual = InterviewAlgorithm().calculate(ar)
        val expected = 4
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun another_number_at() {
        val ar = arrayListOf<Int>(10, 10, 10, 10, 20, 20, 20, 20, 12, 13)
        val actual = InterviewAlgorithm().calculate(ar)
        val expected = 25
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun wrong_number_start_end() {
        val ar = arrayListOf<Int>(-50, 0, 1, 2, 3, 50)
        val actual = InterviewAlgorithm().calculate(ar)
        val expected = 6
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun another_number_at3() {
        val ar = arrayListOf<Int>(1, 1, 1, 50, 2, 3)
        val actual = InterviewAlgorithm().calculate(ar)
        val expected = 5
        Assert.assertEquals(expected, actual)
    }

}