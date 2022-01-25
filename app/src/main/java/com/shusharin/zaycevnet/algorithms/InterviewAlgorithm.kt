package com.shusharin.zaycevnet.algorithms

class InterviewAlgorithm {

    fun calculate(array: ArrayList<Int>): Int {
        var sum = 0
        if (array.isEmpty() || array.size <= 2) {
            return sum
        }
        var max = array[1]
        var min = array[0]
        var sumOfMaxNumber = 0
        var sumOfMinNumber = 0
        //В случае когда первые элементы являются крайними значениями
        var sumWithQuestion = 0
        var numberWithQuestion = 0
        if (max < min) {
            max = min.also { min = max }
        }
        for (i in 0 until array.size) {
            print("${array[i]},")
            if (max == array[i]) {
                sumOfMaxNumber++
            } else if (array[i] > max) {
                //Если на входе элементы [0] и [1] равны, то необходима доп проверка
                //возможно, это граничное число - проверяю принадлежность к промежутку в конце
                if (array[i - 1] > min) {
                    sum += (max * sumOfMaxNumber)
                } else {
                    sumWithQuestion += (max * sumOfMaxNumber)
                    numberWithQuestion = array[i - 1]
                }
                sumOfMaxNumber = 1
                max = array[i]
            } else if (array[i] < min) {
                sum += (min * sumOfMinNumber)
                sumOfMinNumber = 1
                min = array[i]
            } else if (array[i] == min) {
                sumOfMinNumber++
            } else {
                sum += array[i]
            }
        }

        //проверка на граничное состояние числа numberWithQuestion
        return if (numberWithQuestion in (min + 1) until max) {
            sum + sumWithQuestion
        } else {
            sum
        }

    }
}

